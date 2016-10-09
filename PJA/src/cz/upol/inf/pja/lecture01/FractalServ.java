/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.upol.inf.pja.lecture01;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ja
 */
//@WebServlet(name = "fractal", urlPatterns = {"/fractal"})
public class FractalServ extends HttpServlet {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    
    private static final double SIZE_REDUCTION = 0.8;
    private static final int ANGLE_COEF = 30;
 
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("image/png");
        
        BufferedImage bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = bi.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g.setPaint(Color.black);
        

        String iterations = getServletConfig().getInitParameter("iterations");
        int iters = 10;
        if ((iterations != null) && (!iterations.equals(""))) 
            iters = Integer.parseInt(iterations);
        
        drawTree(g, new Point(WIDTH / 2, HEIGHT), 70, 90, iters);
        ImageIO.write(bi, "PNG", resp.getOutputStream());
    }
    
    private static void drawTree(Graphics2D g, Point startPos, int size, int angle, int iteration) {
        if (iteration == 0) return;
 
        Point endPos = getLocation(startPos, size, angle);
        g.drawLine(startPos.x, startPos.y, endPos.x, endPos.y);
        
        drawTree(g, endPos, (int) (size * SIZE_REDUCTION), angle + ANGLE_COEF, iteration - 1);
        drawTree(g, endPos, (int) (size * SIZE_REDUCTION), angle - ANGLE_COEF, iteration - 1);
    }
    
    /** konverze ze stupnu na radiany */
    private static double deg2rad(double deg) {
        return (Math.PI * deg) / 180;
    }
    
    /** pro dany bod pos v raci souradnici ve vzdalenosti distance
     *  pod uhlem angle
     */
    private static Point getLocation(Point pos, int distance, int angle) {
        double rangle = -deg2rad(angle); // minus, aby se to chovalo jako v prvnim kvadrantu
        int dx = (int) (pos.x + distance * Math.cos(rangle));
        int dy = (int) (pos.y + distance * Math.sin(rangle));
        return new Point(dx, dy);
    }

}

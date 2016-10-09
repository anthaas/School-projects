/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.upol.inf.pja.lecture01;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Antonin Haas
 */
@WebServlet(name = "graph", urlPatterns = {"/graph"})
public class GuessGraphServlet extends HttpServlet {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int POINT_SIZE = 6;
    private static final int MARGIN = 50;

@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("image/png");

        BufferedImage bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = bi.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g.setPaint(Color.black);
        
        GuessNumber game = (GuessNumber) req.getSession().getAttribute("game");

        int correctShift = POINT_SIZE / 2;

        g.drawLine(MARGIN, 0, MARGIN, HEIGHT - MARGIN);
        g.drawLine(MARGIN, HEIGHT - MARGIN, WIDTH + MARGIN, HEIGHT - MARGIN);

        int tryScale = 50;
        int i = 1;
        for (int h : game.getHistory()) {
            int xUnit = i * tryScale + MARGIN;

            // axe x label
            g.drawLine(xUnit, HEIGHT - MARGIN - 5, xUnit, HEIGHT - MARGIN + 5);
            g.drawString(Integer.toString(i), xUnit - correctShift, HEIGHT - MARGIN + tryScale);
            
            // points
            g.drawOval(xUnit - correctShift + 1, HEIGHT - MARGIN - h / 2 - correctShift, POINT_SIZE, POINT_SIZE);
            i++;
        }
        
        // axe y label
        for (int j = 1; j <= 10; j++) {
            int yUnit = HEIGHT - MARGIN - j * 50;
            g.drawLine(MARGIN - 5, yUnit, MARGIN + 5, yUnit);
            g.drawString(Integer.toString(j * 100), 0, yUnit + 5);
        }

        ImageIO.write(bi, "PNG", resp.getOutputStream());
    }
}

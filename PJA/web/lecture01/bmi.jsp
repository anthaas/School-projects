<%-- 
    Document   : bmi
    Created on : 1.10.2016, 22:00:27
    Author     : Antonin Haas
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Body Mass Index</title>
    </head>
    <body>
        <h1>Body Mass Index</h1>
        <form  action="bmi.jsp" method="request">
            Height (m) :<br>
            <input type="text" name="height"><br>
            Weight (kg) :<br>
            <input type="text" name="weight"><br>
            <input type="submit" value="Calculate">
        </form>
        <br>
        <%
            try {
                double weight = Double.parseDouble(request.getParameter("weight"));
                double height = Double.parseDouble(request.getParameter("height"));
                double bmi = weight / (height * height);
                DecimalFormat f = new DecimalFormat("#.##");
                out.println("<p> BMI: " + f.format(bmi) + "</p>");

                if (bmi < 16.5) {
                    out.println("<p>Severely underweight</p>");
                } else if (bmi < 18.5) {
                    out.println("<p>Underweight</p>");
                } else if (bmi < 25) {
                    out.println("<p>Normal (healthy weight)</p>");
                } else if (bmi < 30) {
                    out.println("<p>Overweight</p>");
                } else if (bmi < 35) {
                    out.println("<p>Obese Class I (Moderately obese)</p>");
                } else if (bmi < 40) {
                    out.println("<p>Obese Class II (Severely obese)</p>");
                } else {
                    out.println("<p>Obese Class III (Very severely obese)</p>");
                }
            } catch (Exception e) {
                // Exception
            }
        %> 
    </body>
</html>

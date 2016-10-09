<%@page import="cz.upol.pja.lecture01.Factorial"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- XXX -- slouzi pro ukazkove ucely, takto by se stranky uplne tvorit nemely -->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factorial</title>
    </head>
    <body>
        <%
            int n = -1;
            try {
                if (request.getParameter("n") != null) 
                    n = Integer.parseInt(request.getParameter("n"));
            } catch (Exception e) {
                // pripadne muzeme vypsat chybu
            }
            
            
            if (n < 0) {
                %>
                <form method="GET">
                    <input type="text" name="n" value="5" />
                    <input type="submit" value ="Factorial!" />
                </form>
                <%
            } else {
                out.print("Fact(" + n + ") = " + Factorial.fact(n));
            }
            
        %>
    </body>
</html>

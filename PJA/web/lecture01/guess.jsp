
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cz.upol.inf.pja.lecture01.GuessNumber" %>


<%
    if (session.getAttribute("game") == null) {
        session.setAttribute("game", new GuessNumber());
        
       Integer cnt = (Integer) application.getAttribute("GameCount");
       if (cnt == null) cnt = 0;
       application.setAttribute("GameCount", cnt + 1);
       
       pageContext.setAttribute("newGame", true);
    } else {
       pageContext.setAttribute("newGame", false);
    }
    
    if (request.getParameter("g") != null){
        
        try { 
            int value = Integer.parseInt(request.getParameter("g"));
            int result = ((GuessNumber) session.getAttribute("game")).guess(value);
            pageContext.setAttribute("result", result);
        } catch (Exception e) {
            // ohlasit chybu
        }
    }
    
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guess the Number</title>
    </head>
    <body>
        <h1>Guess the Number</h1>
        
        <c:if test="${!pageScope.newGame and pageScope.result lt 0}">
            Too small!
        </c:if> 
            
        <c:if test="${!pageScope.newGame and pageScope.result gt 0}">
            Too large!
        </c:if> 
        
        <c:choose>
        
            <c:when test="${sessionScope.game.status eq 'WON'}">
                <h1>Congratulations, you found it!</h1>
            </c:when>
        
            <c:when test="${sessionScope.game.status eq 'GAME_OVER'}">
                <h1>Game over, you failed!</h1>
            </c:when>
            <c:otherwise>
                <form method="GET">
                    <input type="number" name="g" min="0" max="1000" />
                    <input type="submit" value="try" />
                </form>
            </c:otherwise>
        </c:choose>
        
        
        <c:if test="${!pageScope.newGame}" >
            <h2>History</h2>
            <div style="float: left; margin-right: 50px;">
            <c:forEach var="item" items="${sessionScope.game.history}">
                <c:out value="${item}" /><br />
            </c:forEach>
            </div>
                <img src="${pageContext.request.contextPath}/graph"/>
        </c:if>
            <br />
            Games played so far: <c:out value="${applicationScope.GameCount} "/>
    </body>
</html>

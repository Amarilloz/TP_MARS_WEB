<%-- 
    Document   : exercice_02
    Created on : 28 mars 2018, 14:42:49
    Author     : Formation
--%>

<%@include file="head.jsp" %>
    <h1>II/ Moyenne</h1>
    <form action="Exercice_02_Servlet" method="POST">
        <label>Saisir un entier : </label>
        <input type="text" name="nbSaisie" />
        <input type="submit" value="Valider" />
    </form>
    <%
        int entier = 0;
        if (session.getAttribute("nbSaisie") != null) {
            entier = (int) session.getAttribute("nbSaisie");
        }
    %>
    <form action="Exercice_02_Servlet_02" method="POST">
        <%
            for (int i = 0; i < entier; i++) {
        %>
        <label>Saisir un nombre : </label>
        <input type="text" name="Val<%=i%>"/><br/>
        <%
            }
        %>
        <input type="submit" value="Valider" />
    </form>
<%@include file="foot.jsp" %>
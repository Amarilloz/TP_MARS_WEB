<%-- 
    Document   : exercice_02_reel
    Created on : 5 avr. 2018, 11:38:22
    Author     : Formation
--%>

<%@include file="../head.jsp" %>
<h1>II/ Moyenne</h1>
<%
    int entier = 0;
    if (session.getAttribute("nbSaisie") != null) {
        entier = (int) session.getAttribute("nbSaisie");
    }
%>
<form action="Exercice_02_reel_Servlet" method="POST">
    <%
        for (int i = 0; i < entier; i++) {
    %>
    <label>Saisir un nombre : </label>
    <input type="text" name="Val<%=i%>" required /><br/>
    <%
        }
    %>
    <input type="submit" value="Valider" />
</form>
<%@include file="../foot.jsp" %>
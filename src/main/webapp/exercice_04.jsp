<%-- 
    Document   : exercice_04
    Created on : 28 mars 2018, 14:43:07
    Author     : Formation
--%>

<%@include file="head.jsp" %>
<h1>IV/ Deviner un nombre</h1>
<%
    int random = 0;
    if (session.getAttribute("nbRandom") != null) {
        random = (int) session.getAttribute("nbRandom");
    }
    out.print(random);
%>
<form action="Exercice_04_Servlet" method="POST">
    <label>Saisir un nombre : </label>
    <input type="text" name="Val" required />
    <input type="submit" value="Valider" />
</form>
<%@include file="foot.jsp" %>

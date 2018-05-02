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
<form action="" method="POST">
    <input type="submit" name="nouvellePartie" value="Nouvelle Partie" />
</form>
<%
    String inf = "";
    if (session.getAttribute("nbInf") != null) {
        inf = (String) session.getAttribute("nbInf");
    }
    if (inf != "") {
        out.println("<br/>" + inf);
    }

    String sup = "";
    if (session.getAttribute("nbSup") != null) {
        sup = (String) session.getAttribute("nbSup");
    }
    if (sup != "") {
        out.println("<br/>" + sup);
    }

    String egal = "";
    if (session.getAttribute("nbEgal") != null) {
        egal = (String) session.getAttribute("nbEgal");
    }
    if (egal != "") {
        out.println("<br/>" + egal);
    }

    if (inf == "" && sup == "" && egal == "") {
        out.println("<br/><br/>");
    }
%>
<%
    if (egal == "") {
%>
<form action="" method="POST">
    <label>Saisir un nombre entre 1 et 100 : </label>
    <input type="text" name="nbSaisi" required />
    <input type="submit" value="Valider" />
</form>
<%
    } else {
        out.println("<br/><br/>");
    }

    int coups = 0;
    if (session.getAttribute("nbCoups") != null) {
        coups = (int) session.getAttribute("nbCoups");
    }
    out.println("<br/>Nombre d' essai(s) : " + coups);
    int meilleurScore = 0;
    if (session.getAttribute("meilleurScore") != null) {
        meilleurScore = (int) session.getAttribute("meilleurScore");
    }
    out.println("<br/>Meilleur Score : " + meilleurScore);
%>
<form action="" method="POST">
    <input type="submit" name="clearScore" value="Réinitialiser le score" />
</form>
<br/>
<%@include file="foot.jsp" %>

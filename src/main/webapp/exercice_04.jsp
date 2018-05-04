<%-- 
    Document   : exercice_04
    Created on : 28 mars 2018, 14:43:07
    Author     : Formation
--%>

<%@include file="head.jsp" %>
<h1>IV/ Deviner un nombre</h1>
<form action="Exercice_04_Randomize_Servlet" method="POST">
    <input type="submit" name="nouvellePartie" value="Nouvelle Partie" />
</form>
<%
    int random = 0;
    if (session.getAttribute("nbRandom") != null) {
        random = (int) session.getAttribute("nbRandom");
    }
    //out.print(random);

    String inf = "";
    if (session.getAttribute("nbInf") != null) {
        inf = (String) session.getAttribute("nbInf");
    }
    if (inf != "") {
%>
<br/>
<%
        out.println(inf);
    }

    String sup = "";
    if (session.getAttribute("nbSup") != null) {
        sup = (String) session.getAttribute("nbSup");
    }
    if (sup != "") {
%>
<br/>
<%
        out.println(sup);
    }

    String egal = "";
    if (session.getAttribute("nbEgal") != null) {
        egal = (String) session.getAttribute("nbEgal");
    }
    if (egal != "") {
%>
<br/><br/>
<%
        out.println(egal);
    }

    if (inf == "" && sup == "" && egal == "") {
%>
<br/><br/>
<%
    }
%>
<%
    if (egal == "") {
%>
<form action="Exercice_04_Randomize_Servlet" method="POST">
    <label>Saisir un nombre entre 1 et 100 : </label>
    <input type="text" name="nbSaisi" required />
    <input type="submit" value="Valider" />
</form>
<%
    } else {
%>
<br/>
<%
    }

    int coups = 0;
    if (session.getAttribute("nbCoups") != null) {
        coups = (int) session.getAttribute("nbCoups");
    }
%>
<br/>
<%
    out.println("Nombre d' essai(s) : " + coups);

    int meilleurScore = 0;
    if (session.getAttribute("meilleurScore") != null) {
        meilleurScore = (int) session.getAttribute("meilleurScore");
    }
%>
<br/>
<%
    out.println("Meilleur Score : " + meilleurScore);
%>
<form action="Exercice_04_Randomize_Servlet" method="POST">
    <input type="submit" name="clear" value="Réinitialiser" />
</form>
<br/>
<%@include file="foot.jsp" %>

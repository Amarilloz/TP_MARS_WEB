<%-- 
    Document   : exercice_02_entier
    Created on : 28 mars 2018, 14:42:49
    Author     : Formation
--%>

<%@include file="../head.jsp" %>
<h1>II/ Moyenne</h1>
<form action="../Exercice_02_entier_Servlet" method="POST">
    <table>
        <tr>
            <td>
                <label>Saisir un entier : </label>
            </td>
            <td>
                <input type="text" name="nbSaisie" required />
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="Valider" />
            </td>
        </tr>
    </table>
</form>
<a href="../index.jsp"><< Retour</a>
</body>
</html>
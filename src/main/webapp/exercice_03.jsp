<%-- 
    Document   : exercice_03
    Created on : 28 mars 2018, 14:42:58
    Author     : Formation
--%>

<%@include file="head.jsp" %>
<h1>III/ Sapins</h1>
<form action="Exercice_03_Servlet" method="POST">
    <table>
        <tr>
            <td>
                <label>Saisir un sapin : </label>
            </td>
            <td>
                <select name="typeSapin" required>
                    <option value="0">Tous</option>
                    <option value="1">Plein</option>
                    <option value="2">Vide</option>
                    <option value="3">Couché</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <label>Saisir une hauteur : </label>
            </td>
            <td>
                <input type="text" name="valHauteur" required />
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
<%@include file="foot.jsp" %>

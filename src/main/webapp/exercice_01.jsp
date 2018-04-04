<%-- 
    Document   : exercice_01
    Created on : 28 mars 2018, 14:36:32
    Author     : Formation
--%>
<%@include file="head.jsp" %>
        <h1>I/ Un kilomètre à pied...</h1>
        <%int i = 0;
            while (i < 15) {
                i++;
                if (i == 1) {
                    out.println(i + " kilomètre à pied, ça use, ça use,");%>
        <br/>
        <%
            out.println(i + " kilomètre à pied, ça use les souliers.");%>
        <br/>
        <br/>
        <%
        } else {
            out.println(i + " kilomètres à pied, ça use, ça use,");%>
        <br/>
        <%
            out.println(i + " kilomètres à pied, ça use les souliers.");%>
        <br/>
        <br/>
        <%
                }
            }%>
<%@include file="foot.jsp" %>

<%-- 
    Document   : exercice_01
    Created on : 28 mars 2018, 14:36:32
    Author     : Formation
--%>
<%@include file="head.jsp" %>
        <h1>I/ Un kilom�tre � pied...</h1>
        <%int i = 0;
            while (i < 15) {
                i++;
                if (i == 1) {
                    out.println(i + " kilom�tre � pied, �a use, �a use,");%>
        <br/>
        <%
            out.println(i + " kilom�tre � pied, �a use les souliers.");%>
        <br/>
        <br/>
        <%
        } else {
            out.println(i + " kilom�tres � pied, �a use, �a use,");%>
        <br/>
        <%
            out.println(i + " kilom�tres � pied, �a use les souliers.");%>
        <br/>
        <br/>
        <%
                }
            }%>
<%@include file="foot.jsp" %>

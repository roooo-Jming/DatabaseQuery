<%--
  Created by IntelliJ IDEA.
  User: jimingrui
  Date: 4/25/21
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="ConnectMysql.TeamDB" %>
<%@ page import="ConnectMysql.ListMember" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request Successfully</title>
    <style type="text/css">
        body{
            background-repeat: no-repeat;
            background-position: center;
        }

    </style>

</head>
<body>
<h2 style="text-align:center;margin-top:120px">
    <div style="text-align:center;margin-top:120px">
        <h2>Result</h2>
    </div>

    <%
        ArrayList<ListMember> l=new ArrayList<>();
        l=(ArrayList<ListMember>) request.getAttribute("list");
        ListMember listMember=new ListMember();
    %>


    <table border="2" align="center" width="90%" cellpadding="2" cellspacing="2">
        <thead>
        <td align="center">id</td>
        <td align="center">name</td>
        <td align="center">birthday</td>
        <td align="center">hobby</td>
        </thead>

        <tbody>
        <%for(ListMember L:l){ %>
        <%--循环显示内容 --%>
        <tr>
            <td align="center"><%=L.getId() %></td>
            <td align="center"><%=L.getName() %></td>
            <td align="center"><%=L.getBirthday() %></td>
            <td align="center"><%=L.getHobby() %></td>

        </tr>
        <%} %>
        </tbody>

    </table>
    <br>
    <a href="Query again">Query again</a>


</body>
</html>

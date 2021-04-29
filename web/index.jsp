<%@ page import="ConnectMysql.ConnectMysql" %>
<%@ page import="ConnectMysql.ListMember" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jimingrui
  Date: 4/24/21
  Time: 1:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome To Know Our Team</title>
    <style type="text/css">
      body{
        background-position: center;
        background-repeat: no-repeat;
      }
    </style>
  </head>
  <body>
    <div style="text-align:center;margin-top:120px">
    <h2>Our Team</h2>

      <form action="GetInfo" method="post">
        <table style="margin-left:40%">
          <marquee width="200" scrolldelay="250">Please Input Hobby</marquee>

          <tr>
            <td>hobby：</td>
            <td><input type="text" size="21" name="hobby"/></td>

          </tr>

        </table>
        <input type="submit" value="request"/>
      </form>

      <br>
    </div>

  </body>
</html>

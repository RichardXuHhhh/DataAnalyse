<%@ page import="api.ReturnStr" %>
<%@ page import="api.StrInfo" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page import="java.net.URL" %>
<%@ page import="api.dataupdate" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/19
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>数据分析</title>
  </head>
  <body>
  <%
    dataupdate test=new dataupdate();
    String str=test.getStr();

  %>
  <pre style="font-size: 20px">
  <%=str%>
  </pre>
  </body>
</html>

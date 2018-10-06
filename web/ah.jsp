<%@ page import="api.dataupdate" %>
<%@ page import="api.dataupah" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/24
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>安徽数据分析</title>
</head>
<body>
<%
    dataupah test=new dataupah();
    String str=test.getStr();

%>
<h1>安徽安徽安徽</h1>
<pre style="font-size: 20px">
  <%=str%>
  </pre>
</body>
</html>

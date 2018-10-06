<%@ page import="api.dataupdate" %>
<%@ page import="api.dataupjx" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/24
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>江西数据分析</title>
</head>
<body>
<%
    dataupjx test=new dataupjx();
    String str=test.getStr();

%>
<h1>江西江西江西</h1>
<pre style="font-size: 20px">
  <%=str%>
  </pre>
</body>
</html>

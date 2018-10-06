<%@ page import="api.dataupsh" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/24
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>江西数据分析</title>
</head>
<body>
<%
    dataupsh test=new dataupsh();
    String str=test.getStr();

%>
<h1>上海上海上海</h1>
<pre style="font-size: 20px">
  <%=str%>
  </pre>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: YangML
  Date: 2019/3/4
  Time: 下午5:11
  version:TODO
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
    <form method="post" action="hello/add">
        <input type="text" name="context">
        <input type="text" name="userId">
        <input type="text" name="type">
        <input type="submit"/>
    </form>
</body>
</html>

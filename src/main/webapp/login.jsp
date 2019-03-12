<%--
  Created by IntelliJ IDEA.
  User: YangML
  Date: 2019/3/6
  Time: 上午9:24
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
<script src="static/jquery-3.3.1.min.js"></script>
    <title>Title</title>
    <script>
        function login(){
            var userName = $("input[name='username']").val();
            var userPwd = $("input[name='userPwd']").val();
            $.ajax({
                url:"user/login.do",
                type:"post",
                contentType:"application/json",
                data:"{'userName':'"+userName+"','userPwd':'"+userPwd+"'}",
                dataType:"json",
                success:function(data){
                    console.log(data);
                }
            })
        }

    </script>
    <input type="text" name="username"/><br/>
    <input type="text" name="userPwd"/><br/>
    <input type="button" value="提交" onclick="login()"/>
</head>
<body>

</body>
</html>

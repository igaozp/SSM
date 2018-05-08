<%--
  User: igaozp
  Date: 2018/4/23
  Time: 20:07
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="../resources/bootstrap/css/bootstrap.min.css">

    <title>Endorphin - 登录</title>
</head>
<body>
<%-- 登录页面 --%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand text-white ml-lg-5" href="/">
        Endorphin
    </a>

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <%-- 导航栏操作项目 --%>
    <div class="collapse navbar-collapse mr-lg-5 justify-content-end" id="navbarNav">
        <ul class="navbar-nav">
            <c:when test="${username == null}">
                <li class="nav-item">
                    <a class="nav-link" href="/userRegister">注册</a>
                </li>
            </c:when>
        </ul>
    </div>
</nav>

<%-- 登录部分 --%>
<div class="container mt-lg-5">
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">
            <form action="/user/userLogin" method="post">
                <div class="form-group">
                    <label for="userName">用户名</label>
                    <input type="text" class="form-control" id="userName" name="userName"
                           aria-describedby="userNameHelp" placeholder="输入用户名">
                </div>
                <div class="form-group">
                    <label for="password">密码</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="输入密码">
                </div>
                <button type="submit" class="btn btn-primary">登录</button>
                <a href="/userRegister" class="btn btn-secondary ml-3">注册</a>
            </form>
        </div>
        <div class="col-3"></div>
    </div>
</div>

<script src="../resources/bootstrap/jquery-3.3.1.min.js" crossorigin="anonymous"></script>
<script src="../resources/bootstrap/popper.min.js" crossorigin="anonymous"></script>
<script src="../resources/bootstrap/js/bootstrap.min.js" crossorigin="anonymous"></script>
</body>
</html>
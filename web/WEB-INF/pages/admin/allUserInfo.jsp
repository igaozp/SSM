<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
    <link rel="stylesheet" href="../../resources/css/material-icons.css">
    <link rel="stylesheet" href="../../resources/css/material.min.css">
    <script type="text/javascript" src="../../resources/js/material.min.js"></script>
    <script type="text/javascript" src="../../resources/js/jquery-3.1.1.min.js"></script>
</head>
<body>
<!-- Uses a header that scrolls with the text, rather than staying
  locked at the top -->
<div class="mdl-layout mdl-js-layout">
    <header class="mdl-layout__header mdl-layout__header--scroll mdl-color--grey-50">
        <div class="mdl-layout__header-row">
            <!-- Title -->
            <a class="mdl-layout-title mdl-navigation__link mdl-color-text--pink-400" href="/admin/manageCenter">Excited</a>
            <!-- Add spacer, to align navigation to the right -->
            <div class="mdl-layout-spacer"></div>
            <!-- Navigation -->
            <nav class="mdl-navigation">
                <a class="mdl-navigation__link mdl-color-text--pink-400"
                   href="/user/listUserInfo?username=${username}">${username}</a>
                <a class="mdl-navigation__link mdl-color-text--black" href="/user/loginOut" name="logout">注销</a>
            </nav>
        </div>
    </header>
    <main class="mdl-layout__content">
        <div class="page-content">
            <!-- Your content goes here -->
            <c:forEach items="${users}" var="user" varStatus="status">
                <div class="mdl-grid">
                    <div class="mdl-cell--3-col"></div>
                    <div class="mdl-cell--6-col">
                        <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp">
                            <thead>
                            <tr>
                                <th class="mdl-data-table__cell--non-numeric">用户名</th>
                                <th>ID</th>
                                <th class="mdl-data-table__cell--non-numeric">邮箱</th>
                                <th>手机</th>
                                <th class="mdl-data-table__cell--non-numeric">性别</th>
                                <th class="mdl-data-table__cell--non-numeric">最后登录IP</th>
                                <th>最后登录时间</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td width="100px">${user.userName}</td>
                                <td width="75px">${user.userId}</td>
                                <td width="150px">${user.userEmail}</td>
                                <td width="100px">${user.userPhone}</td>
                                <td width="75px">${user.userSex}</td>
                                <td width="75px">${user.lastIp}</td>
                                <td width="75px">${user.lastLoginTime}</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="mdl-cell--3-col"></div>
                </div>
            </c:forEach>
        </div>
    </main>
</div>
</body>
</html>

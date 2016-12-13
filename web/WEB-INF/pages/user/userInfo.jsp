<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
    <link rel="stylesheet" href="../../resources/css/material-icons.css">
    <link rel="stylesheet" href="../../resources/css/material.min.css">
    <link rel="stylesheet" href="../../resources/css/style.css">
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
            <a class="mdl-layout-title mdl-navigation__link mdl-color-text--pink-400" href="/main">Excited</a>
            <!-- Add spacer, to align navigation to the right -->
            <div class="mdl-layout-spacer"></div>
            <!-- Navigation -->
            <nav class="mdl-navigation">
                <a class="mdl-navigation__link mdl-color-text--pink-400"
                   href="/user/listUserInfo?username=${username}">${username}</a>
                <a class="mdl-navigation__link mdl-color-text--black" href="/user/loginOut">注销</a>
            </nav>
        </div>
    </header>
    <main class="mdl-layout__content">
        <div class="page-content">
            <!-- Your content goes here -->
            <div class="mdl-grid">
                <div class="mdl-cell mdl-cell--4-col"></div>
                <div class="mdl-cell mdl-cell--4-col">
                    <div class="mdl-card mdl-shadow--2dp center">
                        <div class="mdl-card__title">
                            <h4 class="mdl-color-text--pink-400">个人信息</h4>
                        </div>
                        <div class="mdl-card__subtitle-text">
                            <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp"
                                   align="center">
                                <tr>
                                    <td>用户Id:</td>
                                    <td>${user.userId}</td>
                                </tr>
                                <tr>
                                    <td>用户名:</td>
                                    <td>${user.userName}</td>
                                </tr>
                                <tr>
                                    <td>用户电话:</td>
                                    <td>${user.userPhone}</td>
                                </tr>
                                <tr>
                                    <td>性别:</td>
                                    <td>${user.userSex}</td>
                                </tr>
                                <tr>
                                    <td>邮箱:</td>
                                    <td>${user.userEmail}</td>
                                </tr>
                                <tr>
                                    <td>注册时间:</td>
                                    <td>${user.createTime}</td>
                                </tr>
                                <tr>
                                    <td>用户类型:</td>
                                    <td>
                                        <c:choose>
                                            <c:when test="${user.userType == 1}">
                                                普通用户
                                            </c:when>
                                            <c:when test="${user.userType == 0}">
                                                管理员
                                            </c:when>
                                        </c:choose>
                                    </td>
                                </tr>
                                <tr>
                                    <td>用户状态:</td>
                                    <td>
                                        <c:choose>
                                            <c:when test="${user.userState == 0}">
                                                正常
                                            </c:when>
                                            <c:when test="${user.userState == 1}">
                                                <p class="mdl-color-text--red-400">冻结</p>
                                            </c:when>
                                        </c:choose>
                                    </td>
                                </tr>
                                <tr>
                                    <td>个人积分:</td>
                                    <td>${user.credit}</td>
                                </tr>
                                <tr>
                                    <td>最后登录时间:</td>
                                    <td>${user.lastLoginTime}</td>
                                </tr>
                                <tr>
                                    <td>最后登录IP:</td>
                                    <td>${user.lastIp}</td>
                                </tr>
                                <tr>
                                    <td align="center">
                                        <a class="mdl-button mdl-js-button mdl-button--raised mdl-color-text--white mdl-color--pink-400"
                                           href="/user/userUpdateInfo?username=${user.userName}">
                                            修改个人信息
                                        </a>
                                    </td>
                                    <td align="center">
                                        <a href="/main" class="mdl-button mdl-js-button mdl-button--raised">
                                            返回
                                        </a>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
                <div class="mdl-cell mdl-cell--4-col"></div>
            </div>
        </div>
    </main>
</div>
</body>
</html>
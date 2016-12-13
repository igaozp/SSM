<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改个人信息</title>
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
                <a class="mdl-navigation__link mdl-color-text--pink-400" href="/user/listUserInfo?username=${username}">${username}</a>
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
                            <h4 class="mdl-color-text--pink-400">修改个人信息</h4>
                        </div>
                        <div class="mdl-card__subtitle-text">
                            <form name="updateUserInfo" action="/user/updateUserInfo" method="post">
                                <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp">
                                    <tr>
                                        <td class="mdl-data-table__cell--non-numeric">用户ID：</td>
                                        <td>
                                            <div class="mdl-textfield mdl-js-textfield">
                                                <input class="mdl-textfield__input" type="text" name="userId" value="${user.userId}"
                                                       readonly>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="mdl-data-table__cell--non-numeric">用户名：</td>
                                        <td>
                                            <div class="mdl-textfield mdl-js-textfield">
                                                <input class="mdl-textfield__input" type="text" name="userName"
                                                       value="${user.userName}">
                                                <label class="mdl-textfield__label" for="userName"></label>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="mdl-data-table__cell--non-numeric">用户电话：</td>
                                        <td>
                                            <div class="mdl-textfield mdl-js-textfield">
                                                <input class="mdl-textfield__input" type="text" pattern="-?[0-9]*(\.[0-9]+)?"
                                                       name="userPhone"
                                                       value="${user.userPhone}">
                                                <label class="mdl-textfield__label" for="userPhone"></label>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="mdl-data-table__cell--non-numeric">性别：</td>
                                        <td>
                                            <c:choose>
                                            <c:when test="${user.userSex == '男'}">
                                            <div align="left">
                                                <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="sex-1">
                                                    <input type="radio" id="sex-1" class="mdl-radio__button" name="userSex"
                                                           value="男"
                                                           checked>
                                                    <span class="mdl-radio__label">男</span>
                                                </label>
                                                <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="sex-2">
                                                    <input type="radio" id="sex-2" class="mdl-radio__button" name="userSex"
                                                           value="女">
                                                    <span class="mdl-radio__label">女</span>
                                                </label>
                                            </div>
                                            </c:when>
                                            <c:when test="${user.userSex == '女'}">
                                            <div align="left">
                                                <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="sex-3">
                                                    <input type="radio" id="sex-3" class="mdl-radio__button" name="userSex"
                                                           value="男">
                                                    <span class="mdl-radio__label">男</span>
                                                </label>
                                                <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="sex-4">
                                                    <input type="radio" id="sex-4" class="mdl-radio__button" name="userSex"
                                                           value="女"
                                                           checked>
                                                    <span class="mdl-radio__label">女</span>
                                                </label>
                                            </div>
                                            </c:when>
                                            </c:choose>
                                    </tr>
                                    <tr>
                                        <td class="mdl-data-table__cell--non-numeric">邮箱：</td>
                                        <td>
                                            <div class="mdl-textfield mdl-js-textfield">
                                                <input class="mdl-textfield__input" type="text" name="userEmail"
                                                       value="${user.userEmail}">
                                                <label class="mdl-textfield__label" for="userEmail"></label>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="mdl-data-table__cell--non-numeric">注册时间：</td>
                                        <td>
                                            <div class="mdl-textfield mdl-js-textfield">
                                                <input class="mdl-textfield__input" type="text" name="createTime"
                                                       value="${user.createTime}" readonly>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="mdl-data-table__cell--non-numeric">用户类型：</td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${user.userType == 1}">
                                                    <input class="mdl-textfield__input" type="text" value="普通用户" readonly>
                                                </c:when>
                                                <c:when test="${user.userType == 0}">
                                                    <input class="mdl-textfield__input" type="text" value="管理员" readonly>
                                                </c:when>
                                            </c:choose>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="mdl-data-table__cell--non-numeric">用户状态：</td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${user.userState == 0}">
                                                    <input class="mdl-textfield__input" type="text" value="正常" readonly>
                                                </c:when>
                                                <c:when test="${user.userState == 1}">
                                                    <input class="mdl-textfield__input" type="text" value="冻结" readonly>
                                                </c:when>
                                            </c:choose>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="mdl-data-table__cell--non-numeric">个人积分：</td>
                                        <td><input class="mdl-textfield__input" type="text" name="credit" value="${user.credit}"
                                                   readonly>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="mdl-data-table__cell--non-numeric">最后登录时间：</td>
                                        <td>
                                            <input class="mdl-textfield__input" type="text" name="lastLoginTime"
                                                   value="${user.lastLoginTime}" readonly>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="mdl-data-table__cell--non-numeric">最后登录IP：</td>
                                        <td>
                                            <input class="mdl-textfield__input" type="text" name="lastIp" value="${user.lastIp}"
                                                   readonly>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <button class="mdl-button mdl-js-button mdl-button--raised mdl-color--pink-400 mdl-color-text--white"
                                                    type="submit" value="保存修改" name="submit">
                                                保存修改
                                            </button>
                                        </td>
                                        <td>
                                            <div align="left">
                                                <a href="/" class="mdl-button mdl-js-button mdl-button--raised">返回首页</a>
                                            </div>
                                        </td>
                                    </tr>
                                </table>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="mdl-cell mdl-cell--4-col"></div>
            </div>
        </div>
    </main>
</div>
</body>
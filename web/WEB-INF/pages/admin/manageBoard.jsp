<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>版块管理</title>
    <link rel="stylesheet" href="../../resources/css/material-icons.css">
    <link rel="stylesheet" href="../../resources/css/material.min.css">
    <script type="text/javascript" src="../../resources/js/material.min.js"></script>
    <script type="text/javascript" src="../../resources/js/jquery-3.1.1.min.js"></script>
    <style>
        .center {
            margin-left: auto;
            margin-right: auto;
        }
        .card-width {
            width: 500px;
        }
    </style>
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
                <a class="mdl-navigation__link mdl-color-text--black" href="/user/loginOut">注销</a>
                <a class="mdl-navigation__link mdl-color-text--black" href="/addBoard">添加板块</a>
            </nav>
        </div>
    </header>
    <main class="mdl-layout__content">
        <div class="page-content">
            <!-- Your content goes here -->
            <c:forEach items="${boards}" var="boards" varStatus="status">
                <div class="mdl-grid">
                    <div class="mdl-cell--4-col"></div>
                    <div class="mdl-cell--4-col">
                        <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp center card-width"
                               align="center">
                            <tr>
                                <td>版块ID:</td>
                                <td>${boards.boardId}</td>
                            </tr>
                            <tr>
                                <td>版块名称:</td>
                                <td>${boards.boardName}</td>
                            </tr>
                            <tr>
                                <td>版块总帖数:</td>
                                <td>${boards.boardPostNum}</td>
                            </tr>
                            <tr>
                                <td class="mdl-data-table__cell--non-numeric">
                                    <div align="right">
                                        <a href="/updateBoardPage?boardId=${boards.boardId}"
                                           class="mdl-button mdl-js-button mdl-color-text--pink-400">修改</a>
                                    </div>
                                </td>
                                <td class="mdl-data-table__cell--non-numeric">
                                    <div align="right">
                                        <a href="/admin/deleteBoard?boardId=${boards.boardId}"
                                           class="mdl-button mdl-js-button mdl-color-text--pink-400">删除</a>
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </div>
                    <div class="mdl-cell--4-col"></div>
                </div>
            </c:forEach>
        </div>
    </main>
</div>
</body>
</html>

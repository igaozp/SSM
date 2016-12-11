<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>板块</title>
    <link rel="stylesheet" href="../resources/css/material-icons.css">
    <link rel="stylesheet" href="../resources/css/material.min.css">
    <script type="text/javascript" src="../resources/js/material.min.js"></script>
    <script type="text/javascript" src="../resources/js/jquery-3.1.1.min.js"></script>
    <style>
        .card-width {
            width: 600px;
        }
        .center {
            margin-left: auto;
            margin-right: auto;
        }
        .mdl-card {
            min-height: auto;
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
            <a class="mdl-layout-title mdl-navigation__link mdl-color-text--pink-400" href="/">Excited</a>
            <!-- Add spacer, to align navigation to the right -->
            <div class="mdl-layout-spacer"></div>
            <!-- Navigation -->
            <nav class="mdl-navigation">
                <c:choose>
                    <c:when test="${username !=null}">
                        <a class="mdl-navigation__link mdl-color-text--pink-400"
                           href="/user/listUserInfo?username=${username}">${username}</a>
                        <c:if test="${username == 'admin'}">
                            <a class="mdl-navigation__link mdl-color-text--black" href="/admin/manageCenter">登入管理后台</a>
                        </c:if>
                        <a class="mdl-navigation__link mdl-color-text--black" href="/user/loginOut">注销</a>
                    </c:when>
                    <c:when test="${username == null}">
                        <a class="mdl-navigation__link mdl-color-text--pink-400" href="/userLogin">登录</a>
                        <a class="mdl-navigation__link mdl-color-text--pink-400" href="/userRegister">注册</a>
                    </c:when>
                </c:choose>
            </nav>
        </div>
    </header>
    <main class="mdl-layout__content">
        <div class="page-content">
            <!-- Your content goes here -->
            <c:forEach items="${board}" var="board" varStatus="status">
                <div class="mdl-grid">
                    <div class="mdl-cell mdl-cell--3-col"></div>
                    <div class="mdl-cell mdl-cell--6-col">
                        <div class="card-width center mdl-card mdl-shadow--2dp">
                            <div class="mdl-card__title">
                                <h2 class="mdl-card__title-text">
                                    <a class="mdl-color--text--pink-400" href="/board/listPosts-${board.boardId}">
                                        ${board.boardName}
                                    </a>
                                </h2>
                            </div>
                            <div class="mdl-card__supporting-text">
                                ${board.boardDesc}
                            </div>
                            <div class="mdl-card__actions mdl-card--border">
                                <p class="mdl-navigation__link" align="right">帖子:${board.boardPostNum}</p>
                            </div>
                        </div>
                    </div>
                    <div class="mdl-cell mdl-cell--3-col"></div>
                </div>
            </c:forEach>
        </div>
    </main>
</div>
</body>
</html>

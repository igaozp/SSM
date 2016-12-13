<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>帖子内容</title>
    <link rel="stylesheet" href="../../resources/css/material-icons.css">
    <link rel="stylesheet" href="../../resources/css/material.min.css">
    <script type="text/javascript" src="../../resources/js/material.min.js"></script>
    <script type="text/javascript" src="../../resources/js/jquery-3.1.1.min.js"></script>
    <style>
        .card-width {
            width: 600px;
        }

        .center {
            margin-right: auto;
            margin-left: auto;
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
            <a class="mdl-layout-title mdl-navigation__link mdl-color-text--pink-400"
               href="/board/listPosts-${post.postBoardId}">Excited</a>
            <!-- Add spacer, to align navigation to the right -->
            <div class="mdl-layout-spacer"></div>
            <!-- Navigation -->
            <nav class="mdl-navigation">
                <c:choose>
                    <c:when test="${username != null}">
                        <a class="mdl-navigation__link mdl-color-text--pink-400"
                           href="/user/listUserInfo?username=${username}">${username}</a>
                        <c:if test="${username == 'admin'}">
                            <a class="mdl-navigation__link mdl-color-text--black" href="/admin/manageCenter">登入管理后台</a>
                        </c:if>
                        <a class="mdl-navigation__link mdl-color-text--black" href="/user/loginOut">注销</a>
                    </c:when>
                    <c:when test="${username == null}">
                        <a href="/userLogin" class="mdl-navigation__link mdl-color-text--pink-400">登录</a>
                        <a href="/userRegister" class="mdl-navigation__link mdl-color-text--pink-400">注册</a>
                    </c:when>
                </c:choose>
            </nav>
        </div>
    </header>
    <main class="mdl-layout__content">
        <div class="page-content">
            <!-- Your content goes here -->
            <div class="mdl-grid">
                <div class="mdl-cell--3-col"></div>
                <div class="mdl-cell--6-col">
                    <div class="card-width mdl-card mdl-shadow--2dp center">
                        <div class="mdl-card__title">
                            <h4 class="mdl-color-text--pink-400">${post.postTitle}</h4>
                        </div>
                        <div class="mdl-card__supporting-text">
                            ${post.postContent}
                        </div>
                        <div class="mdl-card__actions mdl-color-text--grey-400" align="right">
                            --- ${post.postUserName}
                        </div>
                    </div>
                </div>
                <div class="mdl-cell--3-col"></div>
            </div>

            <c:choose>
                <c:when test="${replies != null}">
                    <div class="mdl-grid">
                        <div class="mdl-cell--3-col"></div>
                        <div class="mdl-cell--6-col">

                            <c:forEach items="${replies}" var="reply">
                                <div class="card-width mdl-card mdl-shadow--2dp center">
                                    <div class="mdl-card__title">
                                            ${reply.replyUserName}
                                    </div>
                                    <div class="mdl-card__supporting-text">
                                            ${reply.replyContent}
                                    </div>
                                    <c:if test="${username == reply.replyUserName or username == 'admin'}">
                                        <div class="mdl-card__actions" align="right">
                                            <a class="mdl-button mdl-js-button mdl-color-text--pink-400"
                                               href="/admin/deleteReply?replyId=${reply.replyId}&replyPostId=${reply.replyPostId}">
                                                删除
                                            </a>
                                        </div>
                                    </c:if>
                                </div>
                            </c:forEach>

                        </div>
                        <div class="mdl-cell--3-col"></div>
                    </div>
                </c:when>
            </c:choose>

            <div class="mdl-grid">
                <div class="mdl-cell--3-col"></div>
                <div class="mdl-cell--6-col">
                    <c:choose>
                        <c:when test="${username != null}">
                            <div align="right" class="center card-width">
                                <a class="mdl-button mdl-js-button mdl-color--pink-400 mdl-color-text--white"
                                   href="/addReply?replyPostId=${post.postId}&replyUserName=${username}">
                                    立即回复
                                </a>
                            </div>
                        </c:when>
                    </c:choose>
                </div>
                <div class="mdl-cell--3-col"></div>
            </div>
        </div>
    </main>
</div>
</body>
</html>
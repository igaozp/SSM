<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>回复</title>
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
            min-width: 500px;
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
               href="/post/postContent-<%=request.getParameter("replyPostId")%>">Excited</a>
            <!-- Add spacer, to align navigation to the right -->
            <div class="mdl-layout-spacer"></div>
            <!-- Navigation -->
            <nav class="mdl-navigation">
                <c:choose>
                    <c:when test="${username != null}">
                        <a href="/user/listUserInfo?username=${username}" class="mdl-navigation__link mdl-color-text--pink-400">
                                ${username}
                        </a>
                        <c:if test="${username == 'admin'}">
                            <a href="/admin/manageCenter" class="mdl-navigation__link mdl-color-text--black">登入管理后台</a>
                        </c:if>
                        <a href="/user/loginOut" class="mdl-navigation__link mdl-color-text--black">注销</a>
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
                <div class="mdl-cell--4-col"></div>
                <div class="mdl-cell--4-col">
                    <div class="mdl-card mdl-shadow--2dp center card-width">
                        <div class="mdl-card__title">
                            <h4 class="mdl-color-text--pink-400">主题回复</h4>
                        </div>
                        <div class="mdl-card__subtitle-text">
                            <form action="/reply/addReply" method="post">
                                <table class="mdl-data-table mdl-js-data-table center card-width">
                                    <tr>
                                        <td>回复主题ID:</td>
                                        <td>
                                            <div class="mdl-textfield mdl-js-textfield">
                                                <input class="mdl-textfield__input" type="text" name="replyPostId"
                                                       readonly
                                                       value="<%=request.getParameter("replyPostId")%>">
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>你的名字:</td>
                                        <td>
                                            <div class="mdl-textfield mdl-js-textfield">
                                                <input class="mdl-textfield__input"
                                                       type="text" name="replyUserName" readonly
                                                       value="<%=request.getParameter("replyUserName")%>">
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>回复内容:</td>
                                        <td>
                                            <div class="mdl-textfield mdl-js-textfield">
                                                <textarea class="mdl-textfield__input" type="text" name="replyContent"
                                                          id="replyContent" rows="3" maxrows="3"></textarea>
                                                <label class="mdl-textfield__label" for="replyContent"></label>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input class="mdl-button mdl-button--raised mdl-js-button mdl-color--pink-400 mdl-color-text--white"
                                                   type="submit" value="提交">
                                        </td>
                                        <td>
                                            <a class="mdl-button mdl-js-button mdl-button--raised"
                                               href="/post/postContent-<%=request.getParameter("replyPostId")%>">
                                                取消
                                            </a>
                                        </td>
                                    </tr>
                                </table>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="mdl-cell--4-col"></div>
            </div>
        </div>
    </main>
</div>
</body>
</html>
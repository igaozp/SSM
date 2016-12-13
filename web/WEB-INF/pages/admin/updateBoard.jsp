<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改板块</title>
    <link rel="stylesheet" href="../../resources/css/material-icons.css">
    <link rel="stylesheet" href="../../resources/css/material.min.css">
    <script type="text/javascript" src="../../resources/js/material.min.js"></script>
    <script type="text/javascript" src="../../resources/js/jquery-3.1.1.min.js"></script>
    <style>
        .center {
            margin-left: auto;
            margin-right: auto;
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
            <a class="mdl-layout-title mdl-navigation__link mdl-color-text--pink-400" href="/admin/manageBoard">Excited</a>
            <!-- Add spacer, to align navigation to the right -->
            <div class="mdl-layout-spacer"></div>
            <!-- Navigation -->
            <nav class="mdl-navigation">
                <c:choose>
                    <c:when test="${username != null}">
                        <a class="mdl-navigation__link mdl-color-text--pink-400"
                           href="/user/listUserInfo?username=${username}">${username}</a>
                        <a class="mdl-navigation__link mdl-color-text--black" href="/user/loginOut">注销</a>
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
                    <form action="/admin/updateBoard" method="post">
                        <table class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp center"
                               width="500">
                            <tr>
                                <td colspan="2">
                                    <h4 class="mdl-color-text--pink-400" align="center">修改板块版块信息</h4>
                                </td>
                            </tr>
                            <tr>
                                <td>板块ID:</td>
                                <td>
                                    <div class="mdl-textfield mdl-js-textfield">
                                        <input class="mdl-textfield__input" type="text" name="boardId"
                                               value="${boardId}"
                                               id="boardId" readonly="readonly" name="boardId">
                                        <label class="mdl-textfield__label" for="boardId"></label>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>板块帖子数量:</td>
                                <td>
                                    <div class="mdl-textfield mdl-js-textfield">
                                        <input class="mdl-textfield__input" type="text" name="boardPostNum"
                                               value="${boardPostNum}" id="boardPostNum" readonly="readonly"
                                               name="boardPostNum">
                                        <label class="mdl-textfield__label" for="boardPostNum"></label>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>版块名:</td>
                                <td>
                                    <div class="mdl-textfield mdl-js-textfield">
                                        <input class="mdl-textfield__input" type="text" name="boardName" id="boardName"
                                               value="${boardName}"/>
                                        <label class="mdl-textfield__label" for="boardName"></label>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>版块描述:</td>
                                <td>
                                    <div class="mdl-textfield mdl-js-textfield">
                                        <textarea class="mdl-textfield__input" type="text" name="boardDesc"
                                                  id="boardDesc"
                                                  rows="3" value="${boardDesc}"></textarea>
                                        <label class="mdl-textfield__label" for="boardDesc">${boardDesc}</label>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <a class="mdl-button mdl-js-button mdl-button--raised mdl-color--pink-400 mdl-color-text--white"
                                       href="/admin/updateBoard" type="submit" name="submit">修改</a>
                                </td>
                                <td>
                                    <a class="mdl-button mdl-js-button mdl-button--raised"
                                       href="/admin/manageBoard">返回</a>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div class="mdl-cell--4-col"></div>
            </div>
        </div>
    </main>
</div>
</body>
</html>

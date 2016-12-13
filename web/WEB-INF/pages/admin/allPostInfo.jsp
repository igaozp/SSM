<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主题信息</title>
    <link rel="stylesheet" href="../../resources/css/material-icons.css">
    <link rel="stylesheet" href="../../resources/css/material.min.css">
    <script type="text/javascript" src="../../resources/js/material.min.js"></script>
    <script type="text/javascript" src="../../resources/js/jquery-3.1.1.min.js"></script>
    <style>
        table{
            table-layout: fixed;
            min-width: 1024px;
        }
        td{
            text-overflow: ellipsis;
            overflow: hidden;
            white-space: nowrap;
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
            <c:forEach items="${posts}" varStatus="status" var="post">
                <div class="mdl-grid">
                    <%--<div class="mdl-cell--2-col"></div>--%>
                    <div class="center mdl-cell--12-col">
                        <table class="center mdl-data-table mdl-js-data-table mdl-shadow--2dp" align="center">
                            <thead>
                            <tr>
                                <th>主题名称</th>
                                <th>用户</th>
                                <th>主题ID</th>
                                <th>回复数量</th>
                                <th>浏览数量</th>
                                <th>创建时间</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td width="400px">${post.postTitle}</td>
                                <td width="100px">${post.postUserName}</td>
                                <td>${post.postId}</td>
                                <td>${post.postReplyCount}</td>
                                <td>${post.postViewCount}</td>
                                <td>${post.postCreateTime}</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <%--<div class="mdl-cell--2-col"></div>--%>
                </div>
            </c:forEach>
        </div>
    </main>
</div>
</body>
</html>

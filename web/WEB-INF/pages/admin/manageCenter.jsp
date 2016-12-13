<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>论坛管理</title>
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
<!-- 导航栏 -->
<!-- Always shows a header, even in smaller screens. -->
<div class="mdl-layout mdl-js-layout">
    <header class="mdl-layout__header mdl-layout__header--scroll mdl-color--grey-50">
        <div class="mdl-layout__header-row">
            <!-- Title -->
            <a class="mdl-layout-title mdl-navigation__link mdl-color-text--pink-400" href="/main">Excited</a>
            <!-- Add spacer, to align navigation to the right -->
            <div class="mdl-layout-spacer"></div>
            <!-- Navigation. We hide it in small screens. -->
            <nav class="mdl-navigation">
                <a class="mdl-navigation__link mdl-color-text--pink-400"
                   href="/user/listUserInfo?username=${username}">${username}</a>
                <a class="mdl-navigation__link mdl-color-text--black" href="/user/loginOut" name="logout">注销</a>
            </nav>
        </div>
    </header>
    <!-- 页面主体 -->
    <main class="mdl-layout__content">
        <div class="page-content">
            <!-- Your content goes here -->
            <!-- 页面主体内容 -->
            <div class="mdl-grid">
                <div class="mdl-cell mdl-cell--4-col">
                    <div class="mdl-card mdl-shadow--2dp mdl-color--amber-400 center">
                        <div class="mdl-card__title mdl-card--expand">
                            <h4 class="mdl-color-text--white center">板块管理</h4>
                        </div>
                        <div class="mdl-card__actions mdl-card--border" align="center">
                            <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect mdl-color-text--white"
                               href="/admin/manageBoard">查看</a>
                            <div class="mdl-layout-spacer"></div>
                        </div>
                    </div>
                </div>
                <div class="mdl-cell mdl-cell--4-col">
                    <!-- 板块管理卡片 -->
                    <div class="mdl-card mdl-shadow--2dp center mdl-color--blue-400">
                        <div class="mdl-card__title mdl-card--expand">
                            <h4 class="mdl-color-text--white center">用户管理</h4>
                        </div>
                        <div class="mdl-card__actions mdl-card--border" align="center">
                            <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect mdl-color-text--white"
                               href="/admin/manageUser">查看</a>
                            <div class="mdl-layout-spacer"></div>
                        </div>
                    </div>
                </div>
                <div class="mdl-cell mdl-cell--4-col">
                    <div class="mdl-card mdl-shadow--2dp center mdl-color--cyan-400">
                        <div class="mdl-card__title mdl-card--expand">
                            <h4 class="mdl-color-text--white center">主题管理</h4>
                        </div>
                        <div class="mdl-card__actions mdl-card--border" align="center">
                            <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect mdl-color-text--white"
                               href="/admin/managePost">查看</a>
                            <div class="mdl-layout-spacer"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</div>
</main>
</div>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
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
            <a class="mdl-layout-title mdl-navigation__link mdl-color-text--pink-400" hre="/">Excited</a>
            <!-- Add spacer, to align navigation to the right -->
            <div class="mdl-layout-spacer"></div>
            <!-- Navigation -->
            <nav class="mdl-navigation">
            </nav>
        </div>
    </header>
    <main class="mdl-layout__content">
        <div class="page-content">
            <!-- Your content goes here -->
            <div class="mdl-grid">
                <div class="mdl-cell mdl-cell--4"></div>
                <div class="mdl-cell mdl-cell--4">
                    <form name="form" action="/user/register" method="post">
                        <div class="mdl-card mdl-shadow--2dp center" align="center">
                            <div class="mdl-card__title">
                                <h5 class="mdl-color-text--pink-400">欢迎注册</h5>
                            </div>
                            <div class="mdl-card__subtitle-text">
                                <div class="mdl-textfield mdl-js-textfield">
                                    <input class="mdl-textfield__input" type="text" id="userName" name="userName">
                                    <label class="mdl-textfield__label" for="userName">用户名</label>
                                </div>
                                <div class="mdl-textfield mdl-js-textfield">
                                    <input class="mdl-textfield__input" type="password" id="password" name="password">
                                    <label class="mdl-textfield__label" for="password">密码</label>
                                </div>
                                <div class="mdl-textfield mdl-js-textfield">
                                    <input class="mdl-textfield__input" type="email" id="userEmail" name="userEmail">
                                    <label class="mdl-textfield__label" for="userEmail">邮箱</label>
                                </div>
                                <div class="mdl-textfield mdl-js-textfield">
                                    <input class="mdl-textfield__input" type="text" id="userPhone" name="userPhone">
                                    <label class="mdl-textfield__label" for="userPhone">手机</label>
                                </div>
                                <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="sex-1">
                                    <input type="radio" id="sex-1" class="mdl-radio__button" name="userSex"
                                           value="男" checked>
                                    <span class="mdl-radio__label">男</span>
                                </label>
                                <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="sex-2">
                                    <input type="radio" id="sex-2" class="mdl-radio__button" name="userSex"
                                           value="女">
                                    <span class="mdl-radio__label">女</span>
                                </label>
                            </div>
                            <div class="mdl-card__actions">
                                <input class="mdl-button mdl-button--raised mdl-js-button mdl-color-text--white mdl-color--pink-400 mdl-color-text--white"
                                       type="submit" value="注册" name="submit">

                                <a class="mdl-button mdl-js-button mdl-button--raised" href="/">返回</a>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="mdl-cell mdl-cell--4"></div>
            </div>
        </div>
    </main>
</div>
</body>
</html>
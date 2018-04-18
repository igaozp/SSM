<%--
  User: igaozp
  Date: 2018/4/14
  Time: 18:34
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="../resources/bootstrap/css/bootstrap.min.css">

    <title>板块</title>
</head>
<body>
<%-- 论坛版块页面 --%>
<div>
    <%-- 导航栏 --%>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand text-white ml-lg-5" href="/">
            Endorphin
        </a>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <%-- 导航栏操作项目 --%>
        <div class="collapse navbar-collapse mr-lg-5 justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                <c:choose>
                    <c:when test="${username != null}">
                        <c:if test="${username == 'admin'}">
                            <li class="nav-item">
                                <a class="nav-link" href="/admin/manageCenter">管理后台</a>
                            </li>
                        </c:if>
                        <li class="nav-item">
                            <a class="nav-link" href="/user/loginOut">注销</a>
                        </li>
                    </c:when>
                    <c:when test="${username == null}">
                        <li class="nav-item">
                            <a class="nav-link" href="/userLogin">登录</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/userRegister">注册</a>
                        </li>
                    </c:when>
                </c:choose>
            </ul>
        </div>
    </nav>

    <%-- 板块列表 --%>
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">
            <div class="board-list mt-lg-3">
                <c:forEach items="${board}" var="board" varStatus="status">
                    <div class="card text-secondary bg-light mb-3 w-auto">
                        <div class="card-header">🙃</div>
                        <div class="card-body">
                            <h5 class="card-title">${board.boardName}</h5>
                            <p class="card-text">${board.boardDesc}</p>
                        </div>
                        <div class="card-footer">
                            <a href="/board/listPosts-${board.boardId}" class="btn btn-primary">Go
                                to ${board.boardName}</a>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <div class="col-3"></div>
    </div>
</div>

<script src="../resources/bootstrap/jquery-3.3.1.min.js" crossorigin="anonymous"></script>
<script src="../resources/bootstrap/popper.min.js" crossorigin="anonymous"></script>
<script src="../resources/bootstrap/js/bootstrap.min.js" crossorigin="anonymous"></script>
</body>
</html>

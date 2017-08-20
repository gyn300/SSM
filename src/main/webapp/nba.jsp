
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link href="nba.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="jquery-3.2.1.js"></script>
    <title>nba</title>
</head>
<body>
<!--整体div-->
<div id="container">
    <!--头部-->
    <div id="top">
        <div id="logo" style="float: left">
        <img width="150px" src="${tieBa.logo}"/>
        </div>
        <div style="float: left">
        <span style="font-size: 15px">${tieBa.name}吧</span><br/>
        <span style="color: red">关注:${tieBa.followers}&nbsp;帖子数:${tieBa.postCount}</span><br/>
        <span>${tieBa.intro}</span>
        </div>
    </div><br/><br/>
    <!--内容-->
    <div id="post" style="float: left;clear: left">

        <c:forEach items="${postList}" var="post">
            <table>
            <tr>
                <td id="clicks" width="50px">${post.clicks}</td>
                <td id="content" width="400px" ><span style="color: blue">${post.title}</span><br/>${post.content}</td>
                <td id="user" width="150px">${post.postUser}<br/>${post.replyUser}</td>
                <td id="createTime" width="150px">${post.createTime}</td>
            </tr>
            </table>
            <hr style="height:1px;border:none;border-top:1px dashed gray" />
        </c:forEach>


    </div>
</div>
</body>
</html>

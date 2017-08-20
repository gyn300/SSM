<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>


<head>

<meta charset="UTF-8">
<script type="text/javascript" src="jquery-3.2.1.js"></script>
<script type="text/javascript">
    $(function () {

        $("#login").click(function () {

            $.post("getUser.action",
                {"user_name":$("#user_name").val(),
                    "user_pwd":$("#password").val()

                },function (data,status) {
                    $("#message").html(data);

                }
            );


        });

        $("#register").click(function () {

            $.post("insertUser.action",
                {"user_name":$("#user_name").val(),
                    "user_pwd":$("#password").val()
                },function (data,status) {
                    $("#message").html(data);
                }
            );


        });

    });

</script>
</head>
<body>
<form  method="post">
    <font style="margin-left: 4px">请输入用户名：</font><input id="user_name" name="user_name" type="text"/><br/><br/>
    <font style="margin-left: 55px">密码：</font><input id="password" name="password" type="password"/><br/><br/>
    <input id="login" style="margin-left: 95px" type="button"  value="登录"/><input id="register" style="margin-left: 95px" type="button" value="注册"/>  <br/>
    <div id="message" style="margin-left: 95px;color: red"></div>
</form>
</body>
</html>

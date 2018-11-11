<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<link href="./css/bootstrap.min.css" rel = "stylesheet" type="text/css"></link>
<link href="./css/app.css" rel = "stylesheet" type="text/css"></link>
<script src="./js/jquery.min.js"></script>
<script src="./js/bootstrap.min.js"></script>
</head>
<body class = "indexbg">
    <div class="container">
		<form action = "${pageContext.request.contextPath }/login" method='post'>
			  <div class="form row">
	            <div class="form-horizontal col-md-offset-3" id="login_form">
	                <h3 class="form-title">请登录</h3>
	                <div class="col-md-9">
	                    <div class="form-group">
	                        <i class="fa fa-user fa-lg"></i>
	                        <input class="form-control required" type="text" placeholder="Username" id="username" name="username" autofocus="autofocus" maxlength="20" autocomplete="off"/>
	                    </div>
	                    <div class="form-group">
	                            <i class="fa fa-lock fa-lg"></i>
	                            <input class="form-control required" type="password" placeholder="Password" id="password" name="password" maxlength="8"/>
	                    </div>
	                    <div class="form-group">
	                        <label class="checkbox">
	                            <input type="checkbox" name="remember" value="1"/>记住我
	                        </label>
	                    </div>
	                    <div class="form-group col-md-offset-9">
	                        <input type="submit" class="btn btn-success pull-right" name="submit"></input>
	                    </div>
	                </div>
	            </div>
	        </div>
		</form>
    </div>
    
	<script>
		$(document).ready(function(){
			
			
		});
		
		function login(){
			
			var name = $('#username').val();
			var pwd = $('#password').val();
			
			if(name ==''){
				alert('请输入用户名！');
				return;
			}
			if(pwd ==''){
				alert('请输入密码！');
				return;
			}
			
//            $.ajax({
//                type: 'POST',
 //               url: '${pageContext.request.contextPath }/login.html' ,
 //               dataType:'json',
 //               async: true, 
 //               data:{
  //                  userName:name,password:pwd
 //               },
 //               success: function(data){
  //                   alert(200);  
 //                },
 //                error:function(data) { 
 //               	 alert(500); 
 //               	 console.log(data);
 //               	 } 
 //            });
			
			
		}
		
	</script>    
    
</body>


</html>
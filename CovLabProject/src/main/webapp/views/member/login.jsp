<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <link href="/semi/resources/css/lib/font-awesome.min.css" rel="stylesheet">
    <link href="/semi/resources/css/lib/themify-icons.css" rel="stylesheet">
    <link href="/semi/resources/css/lib/bootstrap.min.css" rel="stylesheet">
    <link href="/semi/resources/css/lib/helper.css" rel="stylesheet">
    <link href="/semi/resources/css/style.css" rel="stylesheet">
<title>Insert title here</title>

<script>
function validate(){
	var userid = documentgetElementById("userid").value;
	var userpw = documentgetElementById("userpw").value;
	
	var re = /^[a-z0-9_]{4,20}$/;
	if(!re.test(userpw)){
		alert("영어, 숫자만 사용 최소 4글자 최대 20글자");
		return false;
	}
	
}
</script>
</head>
<body class="bg-primary">

    <div class="unix-login">
        <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <div class="login-content">
                        <div class="login-logo">
                            <a href="index.html"><span>Covlab</span></a>
                        </div>
                        <div class="login-form">
                            <h4>로그인</h4>
                            <form action="/semi/login" method="post" onsubmit="return validate();">
                              <div class="checkbox">
                                    <label> 
										<input type="checkbox" checked> 회원용
									</label>
									&nbsp; &nbsp;
									 <label>
										<input type="checkbox"> 관리자용
									</label>
                                </div>
                                <div class="form-group">
                                    <label>아이디</label>	
                                    <input type="text" class="form-control" name="userid" id="userid"placeholder="아이디" required>
                                </div>
                                <div class="form-group">
                                    <label>비밀번호</label>
                                    <input type="password" class="form-control" name="userpw" id="userpw"placeholder="비밀번호" required>
                                </div>
                                
                                <div class="checkbox">
                                    <label>
										<input type="checkbox"> 저장하기
									</label>
                                </div>
                                <button type="submit" class="btn btn-primary btn-flat m-b-30 m-t-30">로그인</button>
                                </form>
                                <div>
                                <label class="pull-left">
										<a href="#">아이디 찾기</a>
									</label>
									<br><br>
									
                                <label class="pull-left">
										<a href="#">비밀번호 찾기</a>
									</label>
									<br>
									</div>
                                <div class="register-link m-t-20 text-center">
                                    <p>회원이 아니신가요? <Br><a href="/semi/views/member/register.html"> 가입하기</a></p>
                                </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
 
</body>

</html>
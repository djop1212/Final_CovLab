<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
 
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
    <title>회원 확인</title>
<script type="text/javascript" src="/semi/resources/js/jquery-3.6.0.min.js"></script>
 <script type="text/javascript">
 function validate(){
	 var username = document.getElementById("username").value;
	 if( username == ""){
		 alert("이름을 적어주세요.");
		 
		 username = "";
		 username.select();
		 return false;
		 
	}
	 var re =/^[ㄱ-ㅎ|ㅏ-ㅣ|가-힝]{2,4}$/;
	 if(!re.test(username)){
		 alert("2글자 이상 4글자 이하로 작성해주세요.")
		 username="";
		 username.focus();
		 return false;
		}
	 var userrn = document.getElementById("userrn").value;
	 if(userrn == ""){
		 alert("주민 번호를 입력해주세요.");
		 userrn="";
		 userrn.select();
		 return false;
	 }
	 
	 if(userrn.length != 14){
		 alert("(-)포함 14자리 입력해주세요.");
		 userrn="";
		 userrn.select();
		 return false;
	 }
	 var re2 =/\d{6}\-[1-4]\d{6}/;
	 if(!re2.test(userrn)){
		 alert("형식이 맞지 않거나 잘못 입력하였습니다.")
		 userrn="";
		 userrn.focus();
		 return false;
	 }
	 

 }
 function IDCheck(){
        var username = document.getElementById("username").value;
        var userrn = document.getElementById("userrn").value;
	 if(username != null && userrn != null){
		 alert("이미 등록되어있습니다.");
		 
	 }else{
		 alert("등록된 정보가 없습니다.");
		 
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
                            <a href="index.html"><span>Focus</span></a>
                        </div>
                        <div class="login-form">
                            <h4>회원 확인</h4>
                            <form action="/semi/mcheck" method="post" onsubmit="return validate();">
                                <div class="form-group">
                                    <label>이름</label>
                                    <input type="text" class="form-control" name="username" id="username" placeholder="이름">
                                </div>
                                <div class="form-group">
                                     <label>주민번호</label>
                                      <br>
                                  <input type="text"class="form-control" name="userrn" id="userrn" placeholder="주민번호">
									
									
                                </div>
                              
                                <button  onclick="IDCheck();" id="mbutton" type="submit" value="sumbit"class="btn btn-primary btn-flat m-b-15">제출하기</button>
                              
                                <div class="register-link text-center">
                                    <p>돌아가기 <a href="/semi/"> 홈페이지</a></p>
                                </div>
                              </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>

</html>
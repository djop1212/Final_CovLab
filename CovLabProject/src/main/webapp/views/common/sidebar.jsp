<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

	<div
		class="sidebar sidebar-hide-to-small sidebar-shrink sidebar-gestures">
		<div class="nano">
			<div class="nano-content">
				<ul>
					<div class="logo">
						<a href="index1.html"> <!-- <img src="assets/images/logo.png" alt="" /> -->
							<span>CovLab</span></a>
					</div>
					<li class="label">Menu</li>
					<ul>
						<li><a href="/semi/index.jsp">백신 예약</a></li>
						<li><a href="/semi/views/information/information.jsp">뉴스/백신 정보</a></li>
						<% if(true){ //관리자 %>
							<li><a href="/semi/blistadmin">접종 후기 관리</a></li>
						<% } else { %>
							<li><a href="/semi/blist">접종 후기</a></li>
						<% } %>
						<li><a href="/semi/index.jsp">MY PAGE</a></li>
					</ul>




					<li><a class="sidebar-sub-toggle"><i class="ti-target"></i>
							Pages <span class="sidebar-collapse-icon ti-angle-down"></span></a>
						<ul>
							<li><a href="page-login.html">Login</a></li>
							<li><a href="page-register.html">Register</a></li>
							<li><a href="page-reset-password.html">Forgot password</a></li>
						</ul></li>
					<li><a href="../documentation/index.html"><i
							class="ti-file"></i> Documentation</a></li>
					<li><a><i class="ti-close"></i> Logout</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- /# sidebar -->


</body>
</html>
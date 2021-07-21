<%@page import="reservation.vo.Vaccine"%>
<%@page import="reservation.vo.Members"%>
<%@page import="reservation.vo.Hospital"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Hospital hp = (Hospital)request.getAttribute("hp");
Members mb = (Members)request.getAttribute("mb");
Vaccine vac = (Vaccine)request.getAttribute("vac");
%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="row">

		<div class="col-lg-3 p-0 ">
			<div class="card h-100 m-0">
				<div class="card_header"></div>
				<div class="card-body">
					<h5>접종 정보</h5>
					<h5 class="card-title text-center" id="hp_name"><%=hp.getHp_name() %></h5>

					<form action="/semi/insertres" method="post">
						<div class="form-group">
							<label for="hp_address">이름 : </label>
							<label for="hp_phone">주민번호 : </label><input type="text"
								name="user_name" value="<%=mb.getUserName() %>" readonly
								id="inputBox">
						</div>
						<div class="form-group">
							<label for="hp_phone">주민번호 : </label><input type="text"
								name="user_rn" value="<%= mb.getUserRn() %>" readonly
								id="inputBox">
						</div>
						<div class="form-group">
							<label for="user_address">주소 : </label><input type="text"
								name="user_address" value="<%= mb.getUserAddress() %>>" readonly
								id="inputBox">
						</div>
						<div class="form-group">
							<label for="">기관명 : </label> <input type="text" name="vac_name"
								value="<%= hp.getHp_name() %>" readonly id="inputBox">
						</div>
						<div class="form-group">
							<label for="">백신 : </label> <input type="text" name="vac_name"
								value="<%=vac.getVac_name() %>" readonly id="inputBox">
						</div>
<!-- 						<div class="form-group">
							<label for="">예약일시 : </label> <input type="text" name="rev_date"
								value="2021-06-29 09:30:00" readonly id="inputBox"> <br>
							<a href="javascript:void(0)" target="_blank"
								onclick="reservationDatePopup()">날짜 선택</a>
						</div> -->
						<input type="hidden" name="reg_bus_no"
							value=<%= hp.getReg_bus_no() %> id="inputBox">
					</form>

				</div>
			</div>
		</div>
	</div>
</body>
</html>
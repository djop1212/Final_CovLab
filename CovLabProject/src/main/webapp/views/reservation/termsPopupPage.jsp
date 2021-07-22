<%@page import="reservation.model.vo.Vaccine"%>
<%@page import="reservation.model.vo.Members"%>
<%@page import="reservation.model.vo.Hospital"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Hospital hp = (Hospital) request.getAttribute("hp");
Members mb = (Members) request.getAttribute("mb");
Vaccine vac = (Vaccine) request.getAttribute("vac");

%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.inputBox {
	border: none;
}

input:focus {
	outline: none;
}
</style>
<script type="text/javascript">
	function agree(serial, rn, reg, rev){
		
	 	if (document.getElementById("agreeCheck").checked != true){
	 		alert("약관에 동의하십시오.");
		}else{
			var url="/semi/insertres";
			var fnm = document.info;
			var serial_num = fnm.serial_num.value;
			var user_rn =fnm.user_rn.value;
			var reg_bus_no = fnm.reg_bus_no.value;
			var rev_date = fnm.rev_date.value
			
	        fnm.method = "get";
	        fnm.action = url;

	        alert("실행");
	        
	        fnm.submit();
		}
	}
</script>
</head>
<body>
	<div class="row">

		<div class="col-lg-3 p-0 ">
			<div class="card h-100 m-0">
				<div class="card_header"></div>
				<div class="card-body">
					<h5 class="card-title text-center">접종 정보</h5>

					<form action="/semi/insertres" method="post" name="info">
						<div class="form-group">
							<label for="user_name">이름 : </label> <input type="text"
								name="user_name" value="<%=mb.getUserName()%>" readonly
								class="inputBox">
						</div>
						<div class="form-group">
							<label for="hp_phone">주민번호 : </label><input type="text"
								name="user_rn" value="<%=mb.getUserRn()%>" readonly
								class="inputBox" id="rn">
						</div>
						<div class="form-group">
							<label for="user_address">주소 : </label><input type="text"
								name="user_address" value="<%=mb.getUserAddress()%>" readonly
								class="inputBox">
						</div>
						<div class="form-group">
							<label for="">기관명 : </label> <input type="text" name="hp_name"
								value="<%=hp.getHp_name()%>" readonly class="inputBox">
						</div>
						<div class="form-group">
							<label>백신 : </label> <input type="text" name="vac_name"
								value="<%=vac.getVac_name()%>" readonly class="inputBox">
						</div>
						<div class="form-group">
							<label>예약 날짜 : </label> <input type="text" name="rev_date"
								value="<%= request.getAttribute("rev_date") %>" readonly class="inputBox" id="rev">
						</div>
						<input type="hidden" name="serial_num" value=<%= vac.getSerial_num() %> class="inputBox" id="serial">
						<input type="hidden" name="reg_bus_no" value=<%= hp.getReg_bus_no() %> class="inputBox" id="reg">
						<!-- 						<div class="form-group">
							<label for="">예약일시 : </label> <input type="text" name="rev_date"
								value="2021-06-29 09:30:00" readonly id="inputBox"> <br>
							<a href="javascript:void(0)" target="_blank"
								onclick="reservationDatePopup()">날짜 선택</a>
						</div> -->
						<input type="hidden" name="reg_bus_no"
							value=<%=hp.getReg_bus_no()%> class="inputBox">

						<textarea class="form-control h-25" rows="10">
						제1조(목적) 이 법은 사업자가 그 거래상의 지위를 남용하여 불공정한 내용의 약관(約款)을 작성하여 거래에 사용하는 것을 방지하고 불공정한 내용의 약관을 규제함으로써 건전한 거래질서를 확립하고, 이를 통하여 소비자를 보호하고 국민생활을 균형 있게 향상시키는 것을 목적으로 한다.
						제2조(정의) 이 법에서 사용하는 용어의 정의는 다음과 같다.

						1. “약관”이란 그 명칭이나 형태 또는 범위에 상관없이 계약의 한쪽 당사자가 여러 명의 상대방과 계약을 체결하기 위하여 일정한 형식으로 미리 마련한 계약의 내용을 말한다.

						2. “사업자”란 계약의 한쪽 당사자로서 상대 당사자에게 약관을 계약의 내용으로 할 것을 제안하는 자를 말한다.

						3. “고객”이란 계약의 한쪽 당사자로서 사업자로부터 약관을 계약의 내용으로 할 것을 제안받은 자를 말한다.
						</textarea>
						<div class="text-center">
							<input type="checkbox" id="agreeCheck" ><span>약관에 동의합니다.</span>
						</div>
						<input type="button" onclick="agree('serial', 'rn', 'reg', 'rev')" value="예약확인">

					</form>

				</div>
			</div>
		</div>
	</div>
</body>
</html>
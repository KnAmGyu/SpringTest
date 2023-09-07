<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>통나무 펜션</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<link href="/ajax/booking/css/style.css" rel="stylesheet" type="text/css">

</head>
<body>
	<div id="wrap">
		<jsp:include page="header.jsp"/>
		<div class="contentWrap">
			<div class="container">
				<h2 class="text-center mt-3 mb-3">예약 목록 보기</h2>
				
					<label>이름</label>
					<input class="form-control" id="nameInput" type="text">
					<label class="mt-3">예약날짜</label>
					<input class="form-control" id="dateInput" type="text">
					<label class="mt-3">숙박일수</label>
					<input class="form-control" id="dayInput" type="text">
					<label class="mt-3">숙박인원</label>
					<input class="form-control" id="headCountInput" type="text">
					<label class="mt-3">전화번호</label>
					<input class="form-control" id="phoneNumberInput" type="text">
					<button type="button" class="btn btn-warning btn-block mt-3" id="addBtn">예약하기</button>
			</div>
		</div>
   		<jsp:include page="footer.jsp"/>
	</div>

<script>
	$("#dateInput").datepicker({
		dateFormat:"yy년 mm월 dd일"
	});
	$(document).ready(function(){
		$("#addBtn").on("click", function(){
			let name = $("#nameInput").val();
			let date = $("#dateInput").val();
			let day = $("#dayInput").val();
			let headCount = $("#headCountInput").val();
			let phoneNumber = $("#phoneNumberInput").val();
			
			if(name == ""){
				alert("이름을 입력하세요");
				return;
			}
			if(date == ""){
				alert("예약날짜을 입력하세요");
				return;
			}	
			if(day == ""){
				alert("숙박일수를 입력하세요");
				return;
			}
			if(headCount == ""){
				alert("인원수를 입력하세요");
				return;
			}
			if(phoneNumber == ""){
				alert("전화번호를 입력하세요");
				return;
			}
			
			$.ajax({
				type:"get"
				, url:"/ajax/booking/create"
				, data:{"name":name,"date":date,"day":day,"headCount":headCount,"phoneNumber":phoneNumber}
				, success:function(data){
					if(data.result == "success"){
						location.href = "/ajax/booking/list";
					}else{
						alert("예약에 실패했습니다");
					}
				}
				, error:function(){
					alert("예약 과정 실행 실패");
				}
			});
			
		});
	});
</script>
</body>
</html>
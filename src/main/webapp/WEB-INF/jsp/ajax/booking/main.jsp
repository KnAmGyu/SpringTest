<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>통나무 펜션</title>
<link href="/ajax/booking/css/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div id="wrap">
		<jsp:include page="header.jsp"/>
		<div class="contentWrap">
	            <div class="visualImage">
	                <ul class="imageWrap">
	                    <li class="mainVisual">
	                        <img src="/ajax/booking/images/test06_banner1.jpg" alt="" id="imgBox">
	                    </li>
	                </ul>
	            </div>
	            <div class="contents d-flex">
	                <div class="leftSection">
	                    <p>실시간 <br>예약하기</p>
	                </div>
	                <div class="reserveConfirm">
	                    <div class="tit d-flex">
	                        <h2>예약 확인</h2>
	                    </div>
	                    <div class="con" id="memberCon">
	                        <div class="inputWrap">
	                            <label>아이디 : </label><input type="text" id="nameInput">
	                        </div>
	                        <div class="inputWrap">
	                            <label>전화번호 : </label><input type="text" id="phoneNumberInput">
	                        </div>
	                        <div class="btnWrap">
	                            <button id="findBtn" class="checkBtn" type="button">조회 하기</button>
	                        </div>
	                    </div>
	                </div>
	                <div class="rightSection">
	                    <p>예약문의 : <br>
	                        010- <br>
	                        000-1111
	                    </p>
	                </div>
	            </div>
	        </div>
	   <jsp:include page="footer.jsp"/>
	</div>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script>

	
	
	$(document).ready(function(){
		$("#findBtn").on("click",function(){
			let name = $("#nameInput").val();
			let phoneNumber = $("#phoneNumberInput").val();
			
			if(name == ""){
				alert("이름을 입력하세요");
				return;
			}
			if(phoneNumber == ""){
				alert("전화번호를 입력하세요");
				return;
			}
			
			$.ajax({
				type:"get"
				, url:"/ajax/booking/find"
				, data:{"name":name, "phoneNumber":phoneNumber}
				, success:function(data){
					if(data == ""){
						alert("조회결과가 없습니다.");						
					}else{
						alert("이름 : " + data.name + "\n"
								+ "날짜 : " + data.date.substring(0, 10) + "\n"
								+ "숙박일수 : " + data.day + "\n"
								+ "인원 : " + data.headCount + "\n"
								+ "상태 : " + data.state);
					}
				}	
				, error:function(){
					alert("처리실패");
				}
			});
			
			
		});
	});
	
</script>
</body>
</html>
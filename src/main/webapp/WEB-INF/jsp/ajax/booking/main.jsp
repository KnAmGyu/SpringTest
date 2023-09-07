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
	                        <div class="inputWrap">
	                            <label for="member">회원<input type="radio" checked id="member" name="membership" value="member"></label>
	                            <label for="nonMember">비회원<input type="radio" id="nonMember" name="membership" value="nonMember"></label>
	                        </div>
	                    </div>
	                    <div class="con" id="memberCon">
	                        <div class="inputWrap">
	                            <label for="userId">아이디 : </label><input type="text" id="userId">
	                        </div>
	                        <div class="inputWrap">
	                            <label for="password">비밀번호 : </label><input type="password" id="password">
	                        </div>
	                        <div class="btnWrap">
	                            <button id="btnCheck1" class="checkBtn" type="button">조회 하기</button>
	                        </div>
	                    </div>
	                    <div class="con hide" id="nonMemberCon">
	                        <div class="inputWrap">
	                            <label for="userName">이름 : </label><input type="text" id="userName">
	                        </div>
	                        <div class="inputWrap">
	                            <label for="phoneNumber">전화번호 : </label><input type="text" id="phoneNumber">
	                        </div>
	                        <div class="inputWrap">
	                            <label for="date">날짜 : </label><input type="text" id="date">
	                        </div>
	                        <div class="btnWrap">
	                            <button id="btnCheck2" class="checkBtn" type="button">조회 하기</button>
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
	var count = 1;
	
	var imgchange = document.getElementById('imgBox');
	
	setInterval(function(){
	
	    count++;
	
	    imgchange.src = '/ajax/booking/images/test06_banner'+count+'.jpg';
	
	    if(count >= 4){
	        count = 1
	    }
	
	},3000)
</script>
</body>
</html>
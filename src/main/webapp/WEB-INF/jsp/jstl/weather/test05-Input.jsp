<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기상청</title>
<link href="/jstl/css/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="wrap">
		<div class="content-wrap d-flex">
		
			<jsp:include page="left-side.jsp"/>
			
			<div class="content">
				<h2>날씨 입력</h2>
				<div class="info"> 
					<div class="info-con d-flex justify-content-between">
						<div class="form-wrap">
							<label>날짜</label>
							<input type="text" class="w260" >
						    
						</div> 
						<div class="form-wrap">   
							<label>날씨</label>
							<select class="">
								<option value="">맑음</option>
								<option value="">구름조금</option>
								<option value="">흐림</option>
								<option value="">비</option>
							</select>
						</div>	
						<div class="form-wrap">	
							<label>미세먼지</label>
							<select class="">
								<option value="">좋음</option>
								<option value="">보통</option>
								<option value="">나쁨</option>
								<option value="">최악</option>
							</select>
						</div>
					</div>
					<div class="info-con d-flex justify-content-between">
						<div class="form-wrap type-2">
							<label>기온</label>  
							<input type="text" class="" >
							<div class="">
						    	<span class="input-text" >℃</span>
						  	</div>
						</div>	 
						<div class="form-wrap type-2"> 
							  <label>강수량  </label>
							  <input type="text" class="">
							  <div class="">
							    <span class="input-text">mm</span>
							  </div>
						</div>	  
						<div class="form-wrap type-2">	  
							  <label>풍속  </label>
							  <input type="text" class="">
							  <div class="">
							    <span class="input-text">km/h</span>
							  </div>
						</div>
					</div>
					<div class="btn-wrap d-flex justify-content-end"> 
						<button class="btn btn-success" type="button">저장</button>
					</div>
				</div>
			</div>
		</div>
		
		<jsp:include page="footer.jsp"/>
		
	</div>
	

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
</body>
</html>
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
					<form method="post" action="/weather/create">
					<div class="info-con d-flex justify-content-between">
						<div class="form-wrap">
							<label>날짜</label>
							<input type="text" name="date" id="date" class="w260" >
						    
						</div> 
						<div class="form-wrap">   
							<label>날씨</label>
							<select name="weather" class="">
								<option>맑음</option>
								<option>구름조금</option>
								<option>흐림</option>
								<option>비</option>
							</select>
						</div>	
						<div class="form-wrap">	
							<label>미세먼지</label>
							<select name="microDust" class="">
								<option>좋음</option>
								<option>보통</option>
								<option>나쁨</option>
								<option>최악</option>
							</select>
						</div>
					</div>
					<div class="info-con d-flex justify-content-between">
						<div class="form-wrap type-2">
							<label>기온</label>  
							<input type="text" name="temperatures" class="" >
							<div class="">
						    	<span class="input-text" >℃</span>
						  	</div>
						</div>	 
						<div class="form-wrap type-2"> 
							  <label>강수량  </label>
							  <input type="text" name="precipitation" class="">
							  <div class="">
							    <span class="input-text">mm</span>
							  </div>
						</div>	  
						<div class="form-wrap type-2">	  
							  <label>풍속  </label>
							  <input type="text" name="windSpeed" class="">
							  <div class="">
							    <span class="input-text">km/h</span>
							  </div>
						</div>
					</div>
					<div class="btn-wrap d-flex justify-content-end"> 
						<button class="btn btn-success" type="submit">저장</button>
					</div>
					</form>
				</div>
				
			</div>
		</div>
		
		<jsp:include page="footer.jsp"/>
		
	</div>
	
<script>
	#{date}.datepicker{
		dateform
	}
</script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
</body>
</html>
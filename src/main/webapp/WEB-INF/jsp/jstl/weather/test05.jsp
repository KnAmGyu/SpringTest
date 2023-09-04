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
				<h2>과거날씨</h2>
				<table class="table text-center">
					<thead>
						<tr>
							<th>날짜</th>
							<th>날씨</th>
							<th>기온</th>
							<th>강수량</th>
							<th>미세먼지</th>
							<th>풍속</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="weather" items="${history }" >
						<fmt:parseDate value="${weather.date }" pattern="yyyy-MM-dd" var="weatherDate" />
						<tr>
							<td><fmt:formatDate value="${weatherDate }" pattern="yyyy년 M월 d일" /></td>
							<c:choose>
								<c:when test="${(weather.weather ) eq '맑음' }"> 
									<td><img src="http://marondal.com/material/images/dulumary/web/jstl/sunny.jpg"></td>
								</c:when>
								<c:when test="${(weather.weather ) eq '구름조금' }"> 
									<td><img src="http://marondal.com/material/images/dulumary/web/jstl/partlyCloudy.jpg"></td>
								</c:when>
								<c:when test="${(weather.weather ) eq '흐림' }"> 
									<td><img src="http://marondal.com/material/images/dulumary/web/jstl/cloudy.jpg"></td>
								</c:when>
								<c:when test="${(weather.weather ) eq '비' }">
									<td><img src="http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg"></td>
								</c:when>
								<c:otherwise>
									<td>${weather.weather }</td>
								</c:otherwise>	
							</c:choose>
							<td>${weather.temperatures } ℃</td>
							<td>${weather.precipitation }mm</td>
							<td>${weather.microDust }</td>
							<td>${weather.windSpeed } km/h</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		
		<jsp:include page="footer.jsp"/>
		
	</div>
	

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
</body>
</html>
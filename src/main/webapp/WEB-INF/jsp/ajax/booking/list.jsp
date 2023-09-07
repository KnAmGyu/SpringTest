<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
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
        	<div class="container">
        		<h2 class="text-center mt-3 mb-3">예약 목록 보기</h2>
        		<table class="table text-center">
       				<thead>
       					<tr>
       						<th>이름</th>
       						<th>예약날짜</th>
       						<th>숙박일수</th>
       						<th>숙박인원</th>
       						<th>전화번호</th>
       						<th>예약상태</th>
       						<th></th>
       					</tr>
       				</thead> 			
       				<tbody>
       					<c:forEach var="list" items="${booking }">
       					<tr>
       						<td>${list.name }</td>
       						<td><fmt:formatDate value="${list.date }" pattern="yyyy년 M월 d일" /></td>
       						<td>${list.day }</td>
       						<td>${list.headCount }</td>
       						<td>${list.phoneNumber }</td>
       						<c:choose>
       							<c:when test="${(list.state) eq '확정' }">
       								<td class="text-success">${list.state }</td>		
       							</c:when>
       							<c:otherwise>
       								<td class="text-info">${list.state }</td>
       							</c:otherwise>
       						</c:choose>
       						
       						<td><button class="delete-btn btn btn-danger btn-sm" data-booking-id="${list.id }">삭제</button></td>
       					</tr>
       					</c:forEach>
       				</tbody>
        		</table>
        	</div>
        </div>
        <jsp:include page="footer.jsp"/>
	</div>


<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function(){
		
		$(".delete-btn").on("click", function(){
			let id = $(this).data("booking-id");
			
			//console.log(id);
			
			$.ajax({
				type:"get"
				, url:"/ajax/booking/delete"
				, data:{"id":id}
				, success:function(data){
					if(data.result == "success"){
						location.reload();
					}else{
						alert("삭제 실패");
					}
				}
				, error:function(){
					alert("삭제 진행 에러");
				}	
			});
			
			
		});
		
	});
</script>
</body>
</html>
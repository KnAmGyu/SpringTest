<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core 라이브러리 1</title>
</head>
<body>
	<h1>JSTL Core 라이브러리 1</h1>
	<h3>1. JSTL core 변수</h3>
	<c:set var="number1" value="36"/>
	<c:set var="number2" value="3"/>
	<h4>number1 : ${number1 }</h4>
	<h4>number2 : ${number2 }</h4>
	
	<h3>JSTL core 연산</h3>
	<h4>더하기 : ${number1 + number2 }</h4>
	<h4>빼기 : ${number1 - number2 } </h4>
	<h4>곱하기 : ${number1 * number2 } </h4>
	<h4>나누기 : ${number1 / number2 } </h4>
	
	<h3>core out</h3>
	<h4>더하기 : <c:out value="${number1 + number2 }" /></h4>
	<h4>빼기 : <c:out value="${number1 - number2 }" /></h4>
	<h4>곱하기 : <c:out value="${number1 * number2 }" /></h4>
	<h4>나누기 : <c:out value="${number1 / number2 }" /></h4>
	
	<h3>JSTL core if</h3>
	<c:set var="avg" value="${(number1 + number2) / 2.0 }" />
	<c:if test="${avg ge 10  }">
		<h1>${avg }</h1>
	</c:if>
	<c:if test="${avg lt 10 }">
		<h3>${avg }</h3>
	</c:if>
	
	<h3>core if</h3>
	
	<c:if test="${(number1 * number2) gt 100 }">
	
		<c:out value="<script>alert('너무 큰 수 입니다.') </script>" escapeXml="false" />
	
	</c:if>
	
	
	
	
</body>
</html>
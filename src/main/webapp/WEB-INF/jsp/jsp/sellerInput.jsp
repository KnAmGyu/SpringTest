<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/jsp/seller/create">	
		<h1>판매자 추가</h1>
		<label>닉네임</label><input type="text" name="nickName"> <br>
		<label>프로필 사진 url</label><input type="text" name="profileImage"> <br>
		<label>온도</label><input type="text" name="temperature"> <br>
		<button type="submit">추가</button> 
	</form>	
</body>
</html>
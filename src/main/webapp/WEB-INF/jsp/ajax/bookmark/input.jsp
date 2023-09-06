<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가하기</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2>즐겨 찾기 추가하기</h2>
		
		<label>제목</label><input class="form-control" id="nameInput" type="text">
		<label>주소</label>
		<div class="input-group">
			<input class="form-control" id="urlInput" type="text">
			<button class="btn btn-info" type="button" id="duplicateBtn">중복확인</button>
		</div>
		<div id="warnmsg-wrap"><span class="text-danger">중복된 url 입니다.</span></div>
		<div id="successmsg-wrap"><span class="text-success">사용 가능한 url 입니다.</span></div>		
		<button type="button" id="addBtn">추가</button>
	</div>
	

<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function(){
		
		$("#warnmsg-wrap").hide();
		$("#successmsg-wrap").hide();
		
		$("#duplicateBtn").on("click",function(){
			let url = $("#urlInput").val();
			
			if(url == ""){
				alert("경로를 입력하세요");
				return;
			}
			
			$.ajax({
				type:"get"
				, url:"/ajax/bookmark/duplicate-url"
				, data:{"url": url}
				, success:function(data){
					if(data.isDuplicate){
						//중복
						$("#warnmsg-wrap").show();
						$("#successmsg-wrap").hide();
					}else{
						//중복아님
						$("#successmsg-wrap").show();
						$("#warnmsg-wrap").hide();
					}
					
				}
				, error:function(){
					alert("실행 실패");
				}
			});
			
		});
		
		
		
		$("#addBtn").on("click",function(){
			let name = $("#nameInput").val();
			let url = $("#urlInput").val();
			
			// console.log(name + " " + url);
			
			if(name == ""){
				alert("이름을 입력하세요");
				return;
			}
			if(url == ""){
				alert("경로를 입력하세요");
				return;
			}
			// 주소가 http:// https://로 시작하지 않으면
			
		//	if((url.substring(0,7) != "http://")){
			//	alert("http:// 로 시작해야 합니다");
				//return;
		//	}
			if(!url.startsWith("http://") && !url.startsWith("https://")){
				alert("주소형식을 확인해주세요");
				return;
			}
			
			
			$.ajax({
				type:"get"
				, url:"/ajax/bookmark/create"
				, data:{"name": name, "url": url}
				, success:function(markData){
					if(markData.result == "success"){
						location.href = "/ajax/bookmark/list";
					}else{
						alert("북마크추가실패!");
					}
				}
				, error:function(){
					alert("실행 실패")
				}
			});
			
			
		});
		
		
	});

</script>	
	
	
	
	
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
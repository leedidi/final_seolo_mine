<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UpdateBookmarkChecklist.jsp</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
	
<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>

<script>
	
	$(document).ready(function()
	{
		// 북마크 수정하기
		$("#bookUpdateBtn").click(function()
		{
			//$("#readCheck").attr("method", "GET");
			//$("#readCheck").attr("action", "updatecheck.action?checkNo=" + $(this).val() + "&acNo=" + $("#acNo").val());
			// 수정하는 쪽으로 수정하기
		});
		
	});
		
	
</script>

</head>
<body>
	
	<!-- 메뉴바 영역 -->
	<div>
		<c:import url="MenuNavbar_new.jsp"></c:import>
	</div>

	<!-- 본문 영역 -->
	<br><br><br><br><br><br><br>
	<div class="container">
		<div class="py-5 text-center">
			<h1 style="margin-top: 50px;">북마크 수정</h1>
		</div>

		<!-- 폼 시작 -->
		<form class="needs-validation" action="" method="get" id="readCheck">
		<label for="title"><h4 class="mb-3">북마크 제목</h4></label>
				<div class="mb-3">
					<input type="text" class="form-control" id="title" name="title"
					 maxlength="25" required="required" value="${bookMark.title }">
				</div><br>
	    
	    <div style="text-align: center;">
		<button class="btn btn-primary" id="bookUpdateBtn" style="width: 20%; align-content: center;" value="${checklist.checkNo}">북마크 수정하기</button>	
		<a class="btn btn-secondary mx-auto" href="javascript:history.back();">뒤로가기</a>
		</div>
		
    	<div class="text-right mb-4" style="margin: 20px 0;">
	    	<a href="#">▲ TOP</a>
    	</div>
	</div>

	<!-- footer 영역 -->
	<div>
	</div>

</body>
</html>
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
<title>MyInfoReportList.jsp</title>

<!-- 통일하기로 한 부트스트랩 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" 
integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>



<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">     
            
    // 첫번째 거만 클릭되고, 나머진 안됨!
    /*
	$(function()
	{
		// 취소 버튼 클릭
		$("#cancleBtn").click(function()
		{
			if (confirm("해당 신고를 취소하시겠습니까?"))
			{
				alert("취소 처리 해줄거당");
				alert($(this).val());
				
				//$(location).attr("href", "reportrefake.action?rpcheck_no=" + $(this).val());
				//$(location).attr("href", "myInfoReportDelete.action?rpcheck_no=" + $(this).val());
				
			}
		});
	});
	*/
	
	// 모든 버튼 클릭 가능 버전
	$(function()
	{
		// 취소 버튼 클릭
		$(".btn-secondary").click(
				function()
				{
					if (confirm("해당 게시물을 정말 취소하시겠습니까?"))
					{
						$(location).attr("href", "myInfoReportDelete.action?rpcheck_no=" + $(this).val());
					}
				});

	});
	
</script>


</head>
<body>


<br><br><br><br><br>

<!-- 메뉴 영역 -->
<div>
<c:import url="/nav.action"></c:import>
</div>


<div class="container">
   <!-- 게시판 메인 -->
   <div class="page-header"><h1 class="page-heading">나의 신고리스트</h1></div>
   <br><br>
   
   <div class="table-responsive">
       <table class="table table-hover">
         <thead>
         <!-- <thead class="thead-light"> -->
            <tr class="table-primary">
               <th>신고 번호</th>
               <th>대상 게시물</th>
               <th style="text-align: center;">신고사유</th>
               <th style="text-align: center;" width="40%;">신고 상세 사유</th>
               <th>신고 상태</th>
               <th>신고일시</th>
               <th></th>
            </tr>
         </thead>
         <tbody>
            <c:forEach var="myinfoAllList" items="${myinfoAllList }">
	            <tr>
	               <th scope="row" style="text-align: center">${myinfoAllList.rpcheck_no }</th>
	               <td style="text-align: center">
	               <button type="button" class="btn btn-light" style="height: 24pt; font-size: 13px;" onclick="location.href='readcheck.action?checkNo=${myinfoAllList.check_no}'">
	               이동</button></td>
	               <td>[${myinfoAllList.title }]</td>
	               <td>${myinfoAllList.why }</td>
	               <td>${myinfoAllList.statusname }</td>
	               <td>${myinfoAllList.reportdate }</td>
	               <%-- <td><button type="button" class="btn btn-secondary" id="cancleBtn" value="${myinfoAllList.rpcheck_no }" 
	               style="height: 24pt; font-size: 13px;">취소</button></td> --%>
	               <!-- 취소 버튼은 미해결 일때만 클릭할 수 있게 함 -->
	               <c:choose>
	               <c:when test="${myinfoAllList.statusname eq '미해결'}">
	               		<td><button type="button" class="btn btn-secondary" id="cancleBtn" value="${myinfoAllList.rpcheck_no }" 
	               		style="height: 24pt; font-size: 13px;">취소</button></td>
	               </c:when>
	               <c:otherwise>
	               		<td><button type="button" class="btn btn-secondary" id="cancleBtn" value="${myinfoAllList.rpcheck_no }" 
	               		style="height: 24pt; font-size: 13px;" disabled="disabled">취소</button></td>
	               </c:otherwise>
	               </c:choose>
	            </tr>
	            <tr>
            </c:forEach>
         
         </tbody>
      </table>
      <br>
      
      <!-- 마이페이지로 돌아가는 부분 -->
      <div class="d-flex justify-content-end">
           <button type="button" class="btn btn-primary" onclick="location.href='myinfo.action'">마이페이지로 돌아가기</button>
      </div>
         
      <!-- 페이징 처리 부분 -->
      <div class="dataTables_paginate paging_simple_numbers" style="text-align:center; id="datatable_paginate">
         <ul id="datatable_pagination" class="pagination datatable-custom-pagination justify-content-center">
            <!-- prev 부분도 필요할까봐 넣어둠! -->
            <li class="paginate_item page-item disabled">
               <a class="paginate_button previous page-link" aria-controls="datatable" data-dt-idx="0" tabindex="0" id="datatable_previous">
               <span aria-hidden="true">Prev</span></a>
            </li>
            <li class="paginate_item page-item active">
               <a class="paginate_button page-link" aria-controls="datatable" data-dt-idx="1" tabindex="0">1</a>
            </li>
            <li class="paginate_item page-item">
               <a class="paginate_button page-link" aria-controls="datatable" data-dt-idx="2" tabindex="0">2</a>
            </li>
           <!--  <li class="paginate_item page-item">
               <a class="paginate_button page-link" aria-controls="datatable" data-dt-idx="2" tabindex="0">3</a>
            </li>
            <li class="paginate_item page-item">
               <a class="paginate_button page-link" aria-controls="datatable" data-dt-idx="2" tabindex="0">4</a>
            </li> -->
            <li class="paginate_item page-item">
               <a class="paginate_button next page-link" aria-controls="datatable" data-dt-idx="3" tabindex="0" id="datatable_next">
               <span aria-hidden="true">Next</span></a>
            </li>
         </ul>
      </div>
      
   </div>
</div>

</body>
</html>
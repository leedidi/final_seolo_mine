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
<title>NoticeList.jsp</title>

<!-- 통일하기로 한 부트스트랩 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" 
integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</head>
<body>


<br><br><br><br><br>

<div class="container">
   <!-- 게시판 메인 -->
   <div class="page-header"><h1 class="page-heading">나의 신고리스트</h1></div>
   <br><br>
   
   <div class="table-responsive">
      <table class="table table-hover">
         <thead>
         <!-- <thead class="thead-light"> -->
         	<!-- <tr> -->
            <tr class="table-primary">
               <th>신고 번호</th>
               <th>신고 상태</th>
               <th style="text-align: center;">신고사유</th>
               <th>신고 대상자</th>
               <th>신고일시</th>
            </tr>
         </thead>
         <tbody>
            <tr>
               <th scope="row">37</th>
               <td>[미해결]</td>
               <td>영리목적/홍보</td>
               <td>superman</td>
               <td>2021-12-13</td>
            </tr>
            <tr>
               <th scope="row">20</th>
               <td>[미해결]</td>
               <td>도배</td>
               <td>batman</td>
               <td>2021-11-22</td>
            </tr>
            <tr>
               <th scope="row">13</th>
               <td>[승인]</td>
               <td>욕설/인신공격</td>
               <td>blinkman</td>
               <td>2021-11-10</td>
            </tr>
            <tr>
               <th scope="row">11</th>
               <td>[승인]</td>
               <td>영리목적/홍보</td>
               <td>superman</td>
               <td>2021-10-11</td>
            </tr>
            <tr>
               <th scope="row">7</th>
               <td>[허위신고]</td>
               <td>욕설/인신공격</td>
               <td>carman</td>
               <td>2021-10-22</td>
            </tr>
            <tr>
               <th scope="row">3</th>
               <td>[승인]</td>
               <td>욕설/인신공격</td>
               <td>snowman</td>
               <td>2021-09-10</td>
            </tr>
         </tbody>
      </table>
      <br>
         
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
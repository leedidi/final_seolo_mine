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
<title>Myinfo.jsp</title>
<link rel="stylesheet" href="<%=cp %>/css/CreateAccountInsert.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
crossorigin="anonymous">
<style type="text/css">
	p { font-size: small; color: red; }
	.errMsg { font-size: small; color: red; }
	.okMsg { font-size: small; color: blue; }
	
	input { pointer-events: none; }

</style>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">


		$(function()
		{
			$("#updateBtn").click(function()
			{
				$(location).attr("href", "infoupdateconfirmform.action");
			});
			
			$("#pwdUpdateBtn").click(function()
			{
				$(location).attr("href", "pwdchangeform.action");
			});
			
			$("#withdrawalBtn").click(function()
			{
				$(location).attr("href", "withdrawalconfirm.action");
			});
			
			// 나의 신고리스트로 이동 버튼 추가
			$("#myInfoReportBtn").click(function()
			{
				$(location).attr("href", "myInfoReportList.action");
			});
	
			//myInfoReportList.action
		});
	
</script>



</head>
<body>

	<!-- 메뉴 영역 -->
	<div>
	<c:import url="/nav.action"></c:import>
	</div>

	<!-- 콘텐츠 영역 -->
	<div class="wrap wd668">
	<!-- <div class="container" style="width:50%; text-align: left;"> -->
        <div class="form_txtInput">
        <br>
          <h2 class="sub_tit_txt">내 정보 조회</h2>
          <hr>
		<!-- 프로필사진 업로드구역 -->
		<div class="col-md-4 mx-auto">
			<img src="<%=cp %>/images/profile.jpg" width="250px"><br><br>
			<div style="text-align: center;">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="button" class="btn btn-primary">사진 바꾸기</button>
			</div>
		</div>
        
        <hr style="margin: 30px 0;">
          
          <div class="join_form">
          <form action="" method="post" id="personalInsertForm">
            <table>
              <colgroup>
                <col width="30%"/>
                <col width="auto"/>
              </colgroup>
              <tbody>
                <tr>
                  <th>아이디</th>
                  <td><input type="text" class="send_number" id="id" name="id" maxlength="12"
                  style="width: 550px; background-color: #e9ecef;" value="${user.pe_Id }" readonly="readonly">
                      <span id="idErrMsg" class="errMsg"></span>
                  </td>
                </tr>
                <tr>
                  <th>이름</th>
                  <td><input type="text" id="name" name="name" class="name"maxlength="10" value="${user.name }" readonly="readonly"
                  style="background-color: #e9ecef;"></td>
                </tr>
                <tr>
                	<th></th>
                	<td><span id="nameErrMsg" class="errMsg"></span></td>
                </tr>
                <!-- ★ 소연 수정 -->
                <tr>
                  <th>닉네임</th>
                  <td>
					<input type="text" class="nickName" id="nickName" name="nickName" maxlength="10" value="${user.nickName }" readonly="readonly"
					style="background-color: #e9ecef;">
                  </td>
                </tr>
                <tr>
                	<th></th>
                	<td><span id="nickErrMsg" class="errMsg"></span><span id="nickOkMsg" class="okMsg"></span></td>
                </tr>
                <tr class="email">
                  <th>이메일</th>
                  <td>
                    <input type="text" id="email" name="email" class="email" value="${user.email }" readonly="readonly"
                    style="background-color: #e9ecef;">
                  </td>
                <tr>
                	<th></th>
                	<td><span id="emailErrMsg" class="errMsg"></span></td>
                </tr>  
                <tr>
                  <th>휴대전화</th>
                  <td><input type="text" id="tel" name="tel" class="phone" maxlength="11"
                  value="${user.tel }" readonly="readonly" style="background-color: #e9ecef;">
                  </td>
                </tr>
                <tr>
                	<th></th>
                	<td><!-- <p>이미 가입했거나, 현재 가입이 불가능한 번호입니다.</p> -->
						<span id="telErrMsg" class="errMsg"></span></td>
                </tr>
                <tr>
                	<th></th>
                	<td><span id="idnErrMsg" class="errMsg"></span><span id="idnOkMsg" class="okMsg"></span></td>
                </tr>
                <tr>
                  <th>주소</th>
                  <td>					
					<input type="text" id="roadAddr" name="roadAddr" readonly="readonly"
					value="${user.roadAddr } ${user.detailAddr }" style="background-color: #e9ecef;"><br>
				  </td>
                </tr>
                <tr>
                	<th></th>
                	<td><span id="addrErrMsg" class="errMsg"></span></td>
                </tr>  
                <tr>
              </tbody>
            </table>
            </form>
           
          </div><!-- join_form E  -->
          <div class="text-center">
          	<span id="flagMsg" class="errMsg"></span>
          </div>
          <div class="btn_wrap">
			<button type="button" class="btn btn-primary" id="updateBtn" style="font-size: 13px;">수정하기</button>&nbsp;&nbsp;&nbsp;
			<button type="button" class="btn btn-primary" id="pwdUpdateBtn" style="font-size: 13px;">비밀번호 변경</button>&nbsp;&nbsp;&nbsp;
			<button type="button" class="btn btn-secondary" id="withdrawalBtn" style="font-size: 13px;">탈퇴하기</button>
          </div>
           <hr style="margin: 30px 0;"><br>
           <!-- <h2 class="sub_tit_txt">나의 신고리스트</h2> -->
           <h4>나의 신고리스트<button type="button" class="btn btn-light" id="myInfoReportBtn" style="float: right;">바로가기▶</button></h4>
           <br>
          <div class="table-responsive">
      	 <table class="table table-hover">
         	<thead>
         	<!-- <thead class="thead-light"> -->
         	<!-- <thead class="thead-dark"> -->
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
               <td>[허위신고]</td>
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
         </tbody>
      </table>
      <br><br>
          
          <br>
        </div> <!-- form_txtInput E -->
      </div><!-- content E-->
    </div> <!-- container E -->
    

</body>
</html>
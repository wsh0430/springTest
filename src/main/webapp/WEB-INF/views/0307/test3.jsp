<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test3.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
	<style>
		.atom{
			background-color: #eee;
		}
		.atom:hover{
			background-color: #ddd;
		}
	</style>
</head>
<body>
<p><br/></p>
<div class="container">
  <h2>성적 결과</h2>
  <div class="row bg-secondary text-light m-1 p-3">
  	<div class="col">번호</div>
  	<div class="col">성명</div>
  	<div class="col">국어</div>
  	<div class="col">영어</div>
  	<div class="col">수학</div>
  	<div class="col">총점</div>
  	<div class="col">평균</div>
  	<div class="col">학점</div>
  </div>
  <c:forEach var="vo" items="${vos}" varStatus="st">
  	<div class="row m-1 p-3 atom">
  		<div class="col">${st.count}</div>
  		<div class="col">${vo.name}</div>
  		<div class="col">${vo.kor}</div>
  		<div class="col">${vo.eng}</div>
  		<div class="col">${vo.mat}</div>
  		<div class="col">${vo.tot}</div>
  		<div class="col">${vo.avg}</div>
  		<div class="col">${vo.grade}</div>
  	</div>
  </c:forEach>
  <hr/>
  <div><a href="${ctp}/0307/xmlMenu" class="btn btn-success">돌아가기</a></div>
</div>
<p><br/></p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>Home</title>
	<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h1>
		Hello world!  
		<input type="button" value="새로고침" onclick="location.reload();" class="btn btn-success"/>
	</h1>
	
	<P>  The time on the server is ${serverTime}. </P>
	<hr/>
	<h2>0306폴더</h2>
	<div>
		<a href="<%=request.getContextPath() %>/0306/test1" class="btn btn-success btn-sm">test1.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test2" class="btn btn-primary btn-sm">test2.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test3" class="btn btn-info btn-sm">test3.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test4" class="btn btn-secondary btn-sm">test4.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test5" class="btn btn-warning btn-sm">test5.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test6" class="btn btn-danger btn-sm">test6.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test7" class="btn btn-outline-success btn-sm">test7.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test8" class="btn btn-outline-primary btn-sm">test8.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test9" class="btn btn-outline-info btn-sm">test9.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test10" class="btn btn-outline-secondary btn-sm">test10.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test11" class="btn btn-outline-warning btn-sm">test11.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test12" class="btn btn-outline-danger btn-sm">test12.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test13" class="btn btn-success btn-sm">test13.jsp</a>
		<a href="<%=request.getContextPath() %>/0306/test14" class="btn btn-primary btn-sm">test14.jsp</a>
	</div>
	<hr/>
	<h2>0307폴더</h2>
	<div>
		<a href="${ctp}/0307/test1" class="btn btn-success btn-sm">test1.jsp</a>
	</div>
	<hr/>
	<div>
		<a href="${ctp}/logTest" class="btn btn-primary">로그연습</a>
	</div>
	<hr/>
	<div>
		<a href="${ctp}/aop/aopMenu" class="btn btn-info">AOP연습</a>
	</div>
	<hr/>
	<div>
		<a href="${ctp}/0307/xmlMenu" class="btn btn-info">XML연습</a>
	</div>
</div>
</body>
</html>

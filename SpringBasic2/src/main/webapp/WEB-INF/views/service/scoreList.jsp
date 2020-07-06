<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>점수 결과화면</h2>
	
	<c:forEach var="vo" items="${list }" varStatus="index">
		번호 : ${index }
		이름 : ${vo.name }
		국어 : ${vo.kor }
		영어 : ${vo.eng }
		수학 : ${vo.math }
		<br>
	</c:forEach>
	<br>
	<a href="scoreRegist">점수 추가 등록</a>
	
</body>
</html>
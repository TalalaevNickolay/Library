<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
  <form action="Controller" method="post">
    <input type="hidden" name="command" value="sign_in"/>
    Login:<input type="text" name="login" value=""/>
    <br/>
    Password:<input type="password" name="password" value=""/>
    <br/>
    <input type="submit" value="sign in"/>
 </form>
 <c:if test="${not empty requestScope.errorMessage}">
    <c:out value="${requestScope.errorMessage}"/>   
 </c:if>
</body>
</html>
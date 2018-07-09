<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${user.username!=null }">
欢迎你：${user.username }    <a href="logout">退出登录</a>
</c:if>
<c:if test="${user.username==null }">
您还未登录，点击这里<a href="${pageContext.request.contextPath }/login">登录</a>
</c:if>
主页
</body>
</html>
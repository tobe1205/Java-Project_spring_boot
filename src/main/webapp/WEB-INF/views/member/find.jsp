<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
<h1> 아이디로 정보 확인 </h1>
<form action="/find" method = "POST">
    account : <input type="text" name= "account"> <br>

    <button type="submit">찾기</button>


</form><br>
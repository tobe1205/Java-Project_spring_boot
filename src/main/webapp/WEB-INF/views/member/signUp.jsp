<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
<h1> 회원가입 페이지 </h1>
<form action="/sign-up" method = "POST">
    account : <input type="text" name= "account"> <br>
    password : <input type="text" name= "password"> <br>
    name : <input type="text" name= "name"> <br>
    email : <input type="text" name= "email"> <br>

    <input type="radio" name= "auth" value = "ADMIN"> admin
    <input type="radio" name= "auth" value = "COMMON" checked = "checked"> user <br>
    <button type="submit">회원 가입하기 </button>


</form><br>
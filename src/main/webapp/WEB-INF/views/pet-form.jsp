<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<%--
    jsp주석입니다.
    form태그의 action속성에는 양식의 입력데이터를 보낼 서버 URL을 적습니다.
--%>
<form action="/pet/info" method="POST">
    # 애완동물 종류 : <input type = "text" name="kind"> <br>
    # 이름 : <input type = "text" name="name"> <br>
    # 나이 : <input type = "text" name="age"> <br>
    # 예방접종 여부 :
    <input type = "radio" name="injection" value = "true">예
    <input type = "radio" name="injection" value = "false">아니오 <br>

    # 취미 :
    <input type = "checkbox" name="hobby" value = "수면"> 수면
    <input type = "checkbox" name="hobby" value = "산책"> 산책
    <input type = "checkbox" name="hobby" value = "놀이"> 놀이 <br>

    <button type="submit">등록</button>


</form>

</body>

</html>
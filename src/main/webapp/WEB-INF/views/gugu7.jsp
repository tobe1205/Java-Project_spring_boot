
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <h1>안녕 안녕 jsp~~ gugu7.jsp란다~~</h1>

    <h2>구구단 7단</h2>


    <c:forEach var = "num" begin="1" end="9" step="1">
    <div>7 x ${num} = ${num * 7} </div>
    </c:forEach>

</body>

</html>
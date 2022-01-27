<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <style>

            .reg {
                border: 1px solid gray;
                margin : 20px auto;
                padding: 15px;
                width: 40%;
            }

        </style>
</head>
<body>

<%--
    jsp주석입니다.
    form태그의 action속성에는 양식의 입력데이터를 보낼 서버 URL을 적습니다.
--%>

    <div class="reg">
        <form action="/user/confirm" method="POST">
            # 이름 : <input type = "text" name="userName"> <br>
            # 키 : <input type = "text" name="height" placeholder="cm로 입력"> <br> <%-- palceholder는 힌트 --%>
            # 몸무게 : <input type = "text" name="weight" placeholder="kg으로 입력"> <br>

            <button type="submit">등록</button>
        </form>
    </div>

</body>
</html>
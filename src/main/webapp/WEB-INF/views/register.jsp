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

    <div class="reg">
        <form action="/user/join" method="POST">
            # 아이디: <input type="text" name = "id"> <br>
            # 비밀번호: <input type="password" name = "pw"> <br>
            # 이름: <input type="text"name = "userName"> <br>
            # 취미: <input type="checkbox" name = "hobby" value ="운동" > 운동
                    <input type="checkbox" name = "hobby" value ="음악감상"> 음악감상
                    <input type="checkbox" name = "hobby" value ="영화보기"> 영화보기 <br>
            # 메일 수신여부:
            <input type="radio" name="mail" value = "true"> 예
            <input type="radio" name="mail" value = "false"> 아니오 <br>

            <button type="submit">회원가입하기</button>
        </form>
    </div>

</body>
</html>
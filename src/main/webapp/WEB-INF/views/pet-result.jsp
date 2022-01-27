<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <h2>서버가 전송한 데이터 : ${pi}</h2>

     <h3>
        저는 ${pi.kind} 종류의 애완동물입니다. <br>
        제 이름은 ${pi.name}이구요 ~~ 나이는 ${2022 - pi.age + 1}년생 ${pi.age}살이에요~~ <br>
        <c:if test="${pi.injection == true}">
            예방 접종은 맞았어요 <br>
        </c:if>
        <c:if test="${pi.injection == false}">
            예방 접종은 아직 안맞았어요. <br>
        </c:if>
        좋아하는 것들은 ${pi.hobby}입니다!! <br>

    </h3>

</body>

</html>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

       <h2>서버가 전송한 데이터 : ${ui}</h2>

       <h3>
            저의 아이디는 ${ui.id}이고 <br>
            제 비밀번호는 ${ui.pw}입니다. <br>
            제 이름은 ${ui.userName}이고, <br>
             제 취미는 ${ui.hobby}입니다. <br>
       <c:if test="${ui.mail == true}">
            해당 관련 메일을 받겠습니다.<br>
       </c:if>
       <c:if test="${ui.mail == false}">
            해당 관련 메일을 받지않겠습니다.. <br>
       </c:if>

       </h3>



</body>

</html>
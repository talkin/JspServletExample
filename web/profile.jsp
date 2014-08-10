<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="account" class="servlet.AccountBean" scope="session"/>
<html>
<head>
    <title>Log in success</title>
</head>
<body>
welcome,
<%=session.getAttribute("userName")%>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Create Account</title>
    <link rel="stylesheet" type="text/css" href="/assets/css/user/formCreateUser.css">
</head>
<body>
<div class="container">
    <h1>Cadastro de usuário</h1>
    <form:form modelAttribute="userCreateDTO" action="/user/account/submit" method="post">
        <form:label path="username">Username:</form:label>
        <form:input path="username" required="true" id="username"/>

        <form:label path="password">Password:</form:label>
        <form:password path="password" required="true" id="password"/>

        <form:label path="email">Email:</form:label>
        <form:input path="email" required="true" id="email"/>

        <form:label path="phone">Telefone:</form:label>
        <form:input path="phone" required="true" id="phone"/>

        <button type="submit">cadastrar</button>
    </form:form>
</div>
</body>
</html>

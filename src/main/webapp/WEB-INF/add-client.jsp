<%--
  Created by IntelliJ IDEA.
  User: baptp
  Date: 06/12/2022
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add game</h1>
<form method="post" action="/client/add">

  <label for="clientId">Id :</label>
  <input id="clientId" type="text" name="clientId">

  <label for="clientAdress">Adresse :</label>
  <input id="clientAdress" type="text" name="clientAdress">

  <label for="clientName">Name :</label>
  <input id="clientName" type="text" name="clientName">

  <label for="clientTel">Tel :</label>
  <input id="clientTel" type="text" name="clientTel">

  <label for="clientEmail">Email :</label>
  <input id="clientEmail" type="text" name="clientEmail">

  <label for="clientPostalCode">Code Postal :</label>
  <input id="clientPostalCode" type="text" name="clientPostalCode">

  <label for="clientCity">Ville :</label>
  <input id="clientCity" type="text" name="clientCity">

  <label for="userId">Id User :</label>
  <input id="userId" type="text" name="userId">

  <button>Add</button>
</form>
</body>
</html>

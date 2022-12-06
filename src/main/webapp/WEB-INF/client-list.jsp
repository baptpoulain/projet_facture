<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client List</title>
</head>
<body>

<h1>Listes des clients</h1>
<thead>
<tr>
    <th>#</th>
    <th>Name</th>
    <th>City</th>
</tr>
</thead>
<tbody>
<c:forEach items="${clients}" var="client">
    <tr>
    <td id="clientId">${client.idClient} - ${client.nameClient} - ${client.cityClient}</td>
        <td><a class="btn btn-success" href="${pageContext.request.contextPath}/client/invoice?id=${client.idClient}">Ces Factures</a></td>
    </tr>
</c:forEach>
</tbody>

</body>
</html>

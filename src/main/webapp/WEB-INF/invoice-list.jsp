<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Listes des factures pour ce client</h1>
<thead>

</thead>
<tbody>
<c:forEach items="${invoices}" var="invoice">
    <tr>
        <td id="invoiceId">${invoice.idInvoice} - ${invoice.dateInvoice} - ${invoice.montantHtInvoice}</td>
    </tr>
</c:forEach>
</tbody>

</body>
</html>

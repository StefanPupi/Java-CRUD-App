<%-- 
    Document   : AddFIzickoLice
    Created on : Feb 3, 2023, 2:06:02 PM
    Author     : stefanmilenkovic
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Dodajte novo fizicko lice</h1>
    <c:if test="${uspesno!=null}">
        <div style="color:green">${uspesno}</div>
    </c:if>
        <form action="AddFizickoLice" method="post">
            <input name="ime" placeholder="Unesite ime"><br>
            <input name="prezime" placeholder="Unesite prezime"><br>
            <input name="adresa" placeholder="Unesite adresu"><br>
            <button type="submit">Dodajte fizicko lice</button>
        </form>
    </body>
</html>

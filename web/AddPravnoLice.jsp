<%-- 
    Document   : AddPravnoLice
    Created on : Feb 3, 2023, 2:27:27 PM
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
        <h1>Dodaj novo pravno lice</h1>
        
        <c:if test="${uspesno!=null}">
        <div style="color:green">${uspesno}</div>
        </c:if>
        <form action="AddPravnoLice" method="post">
            <input name="naziv" placeholder="Unesite naziv"><br>
            <input name="ime" placeholder="Unesite ime"><br>
            <input name="prezime" placeholder="Unesite prezime"><br>
            <input name="sediste" placeholder="Unesite sediste"><br>
            <button type="submit">Dodajte pravno lice</button>
        </form>
    </body>
</html>

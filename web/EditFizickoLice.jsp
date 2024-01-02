<%-- 
    Document   : EditFizickoLice
    Created on : Feb 8, 2023, 1:12:24 PM
    Author     : stefanmilenkovic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Izmeni fizicko lice</h1>
        
        <c:if test="${uspesno!=null}">
        <div style="color:green">${uspesno}</div>
    </c:if>
        <form action="EditFizickoLice" method="post">
            <input name="ime" placeholder="Unesite ime" value="${fizickolice.ime}"><br>
            <input name="prezime" placeholder="Unesite prezime" value="${fizickolice.prezime}"><br>
            <input name="adresa" placeholder="Unesite adresu" value="${fizickolice.adresa}"><br>
            <button type="submit">Izmenite fizicko lice</button>
        </form>
    </body>
</html>

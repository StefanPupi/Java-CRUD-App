<%-- 
    Document   : AddFizickiServer
    Created on : Feb 4, 2023, 2:03:13 PM
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
        <h1>Dodaj novi fizicki server korisniku</h1>
        <c:if test="${uspesno!=null}"><div style="color:green">${uspesno}</div></c:if>
        <p>Specifikacija servera:<br> Intel i7 3.9GHz<br> RAM 32 GB<br> Broj diskova 2 SSD<br> Brzina linka 1Gbps<br> RAID nema<br><br> <b>CENA $1999.99</b></p>
        
        <form action="AddFizickiServer" method="post">
            <button type="submit">Dodaj fizicki server</button>
        </form>
    </body>
</html>

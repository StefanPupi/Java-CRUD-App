<%-- 
    Document   : PrikazPoslovanja
    Created on : Feb 6, 2023, 7:30:06 PM
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
        <h1>Prikaz svih usluga</h1>
        
        <table border="1">
            <thead>
                <tr>
                    <td>#</td>
                    <td>Ime vlasnika</td>
                    <td>Prezime vlasnika</td>
                    <td>Vrsta servera</td>
                    <td>Cena</td>
                </tr>
            </thead>
            <tbody>
             
            </tbody>
        </table><br><br>
        
        <div><b>UKUPNA VREDNOST: ${ukupno}</b></div>
    </body>
</html>

<%-- 
    Document   : PrikazFizickoLice
    Created on : Feb 3, 2023, 2:01:09 PM
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
        <h1>Pregled fizickih lica</h1>
        
        <a href="AddFizickoLice">Dodaj novo fizicko lice</a>
        
        <table border="1">
            <thead>
                <tr>
                    <td>#</td>
                    <td>Ime</td>
                    <td>Prezime</td>
                    <td>Adresa</td>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${fizickalica}" var="fizickolice"  varStatus="loop">
                    <tr>
                        <td>${loop.index+1}</td>
                        <td>${fizickolice.ime}</td>
                        <td>${fizickolice.prezime}</td>
                        <td>${fizickolice.adresa}</td>
                        <td><a href="./PrikazServeri?adresa=${fizickolice.adresa}">Serveri</a></td>
                        <td><a href="./EditFizickoLice?adresa=${fizickolice.adresa}">Izmeni</a></td>
                    </tr>
                </c:forEach>
                 
            </tbody>
        </table>
    </body>
</html>

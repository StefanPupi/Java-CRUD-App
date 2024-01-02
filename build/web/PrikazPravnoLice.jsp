<%-- 
    Document   : PrikazPravnoLice
    Created on : Feb 3, 2023, 2:25:44 PM
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
        <h1>Pregled pravnih lica</h1>
        
        <a href="AddPravnoLice">Dodaj novo pravno lice</a>
        <table border="1">
            <thead>
                <tr>
                    <td>#</td>
                    <td>Naziv</td>
                    <td>Sediste</td>
                    <td>Ime</td>
                    <td>Prezime</td>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${pravnalica}" var="pravnolice" varStatus="loop">
                    <tr>
                        <td>${loop.index+1}</td>
                        <td>${pravnolice.naziv}</td>
                        <td>${pravnolice.sediste}</td>
                        <td>${pravnolice.ime}</td>
                        <td>${pravnolice.prezime}</td>
                        <td><a href="./PrikazServeri?sediste=${pravnolice.sediste}">Serveri</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

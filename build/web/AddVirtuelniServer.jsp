<%-- 
    Document   : AddVirtuelniServer
    Created on : Feb 5, 2023, 3:32:48 PM
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
        <h1>Dodaj novi virtuelni server korisniku</h1>
        <c:if test="${uspesno!=null}"><div style="color:green">${uspesno}</div></c:if>
        <b>CENA SA DEFAULT OPCIJAMA JE $7.00 MESECNO NEZAVISNO OD ODABRANOG SISTEMA</b><br>
        <form action="AddVirtuelniServer" method="post">
            PERIOD PLACANJA: 
            <select name="naplata">
                <option value="1">Mesecno</option>
                <option value="3">Kvartalno</option>
                <option value="6">Pola godine</option>
                <option value="12">Godisnje</option>
            </select><br>
            SISTEM:  
            <select name="sistem">
                <option value="Windows 32bit">Windows 32bit</option>
                <option value="Windows 64bit">Windows 64bit</option>
                <option value="Ubuntu 32bit">Ubuntu 32bit</option>
                <option value="Ubuntu 64bit">Ubuntu 64bit</option>
            </select><br>
            CPU: 
            <select name="cpu">
                <option value="0">2 Cores (default) FREE</option>
                <option value="3">+1 Core $3.00</option>
                <option value="6">+2 Cores $6.00</option>
                <option value="9">+3 Cores $9.00</option>
                <option value="12">+4 Cores $12.00</option>
            </select><br>
            RAM: 
            <select name="ram">
                <option value="0">4 GB (default) FREE</option>
                <option value="2">+1 GB $2.00</option>
                <option value="4">+2 GB $4.00</option>
                <option value="8">+4 GB $8.00</option>
                <option value="16">+6 GB $16.00</option>
            </select><br>
            DISK:  
            <select name="disk">
                <option value="0">50 GB (default) FREE</option>
                <option value="3">+20 GB $3.00</option>
                <option value="6">+40 GB $6.00</option>
                <option value="12">+80 GB $12.00</option>
                <option value="24">+160 GB $24.00</option>
            </select><br>
            PROTOK:  
            <select name="protok">
                <option value="0">10 TB (default) FREE</option>
                <option value="10">+20 GB $10.00</option>
                <option value="20">+30 GB $20.00</option>
                <option value="30">+40 GB $30.00</option>
                <option value="50">+60 GB $50.00</option>
            </select><br>
            <button type="submit">Dodaj novi virtuelni server</button>
        </form>
    </body>
</html>

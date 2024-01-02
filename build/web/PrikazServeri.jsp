<%-- 
    Document   : PrikazServeri
    Created on : Feb 4, 2023, 1:39:34 PM
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
        <h1>Korisnik poseduje sledece servere</h1>
        
        <a href="AddFizickiServer?adresa=${adr}">Dodaj novi fizicki server</a><br>
        <a href="AddVirtuelniServer?sediste=${sed}">Dodaj novi virtuelni server</a>
        <table border="1">
            <thead>
                <tr>
                    <td>#</td>
                    <td>Vrsta servera</td>
                    <td>Procesor</td>
                    <td>RAM</td>
                    <td>Broj i vrsta diskova</td>
                    <td>Brzina linka</td>
                    <td>RAID</td>
                    <td>Pocetni datum</td>
                    <td>Krajnji datum</td>
                    <td>Cena</td>
                </tr>
            </thead>
            <tbody>
               <c:forEach items="${fs}" var="fizickiserver"  varStatus="loop">
                    <tr style="background-color:lime">
                        <td>${loop.index+1}</td>
                        <td>Fizicki server</td>
                        <td>${fizickiserver.procesor}</td>
                        <td>${fizickiserver.ram} GB</td>
                        <td>${fizickiserver.diskovi}</td>
                        <td>${fizickiserver.link} Gbps</td>
                        <td>${fizickiserver.raid}</td>
                        <td>${fizickiserver.datumprodaje}</td>
                        <td>------</td>
                        <td>$${fizickiserver.cena}</td>
                    </tr>
                </c:forEach>
             
            </tbody>
        </table><br><br>
            <table border="1">
            <thead>
                <tr>
                    <td>#</td>
                    <td>Vrsta servera</td>
                    <td>Ciklus placanja</td>
                    <td>Sistem</td>
                    <td>Jezgra</td>
                    <td>RAM</td>
                    <td>Disk</td>
                    <td>Protok</td>
                    <td>Pocetni datum</td>
                    <td>Krajnji datum</td>
                    <td>Cena za obnovu</td>
                </tr>
            </thead>
            <tbody>
               <c:forEach items="${vs}" var="virtuelniserver"  varStatus="loop">
                    <tr style="background-color:lime">
                        <td>${loop.index+1}</td>
                        <td>Virtuelni server</td>
                        <td>${virtuelniserver.placanje}</td>
                        <td>${virtuelniserver.sistem}</td>
                        <td>${virtuelniserver.jezgra}</td>
                        <td>${virtuelniserver.ram} GB</td>
                        <td>${virtuelniserver.disk} GB</td>
                        <td>${virtuelniserver.protok} Gbps</td>
                        <td>${virtuelniserver.pocetak}</td>
                        <td>${virtuelniserver.kraj}</td>
                        <td>$${virtuelniserver.cena}</td>
                    </tr>
                </c:forEach>
             
            </tbody>
        </table>
    </body>
</html>

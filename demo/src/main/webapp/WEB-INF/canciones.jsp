<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/style.css">
    <title>Canciones</title>
</head>
<body>
    <h1>Canciones:</h1>
    <table>
        <thead>
            <tr class="header">
                <th>Título</th>
                <th>Autor</th>
                <th>Detalle</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cancion" items="${listaCanciones}">
                <tr class="header">
                    <td>${cancion.titulo} </td>
                    <td>${cancion.artista}</td>
                    <td>
                        <a class="btn-1" href="/canciones/detalle/${cancion.id}">Detalle</a>
                    </td>
                </tr>              
            </c:forEach>
        </tbody>
    </table>
    <a class="btn-1" href="/canciones/formulario/agregar">Agregar canción</a>
    
</body>
</html>
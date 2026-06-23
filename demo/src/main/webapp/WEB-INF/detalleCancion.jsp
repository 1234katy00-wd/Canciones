<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/style.css">
    <title>Detalle canciones</title>
</head>
<body>
    <h1>Detalle canciones:</h1>
    <c:choose>
        <c:when test="${not empty cancion}"> 
        <h2>Título: ${cancion.titulo}</h2>
            <ul>
                <li>Artista: ${cancion.artista}</li>
                <li>ÁLbum: ${cancion.album}</li>
                <li>Género: ${cancion.genero}</li>
                <li>Idioma: ${cancion.idioma}</li>
                <li>Fecha Creación: ${cancion.fecha_creacion}</li>
            </ul>
            </c:when>
            <c:otherwise>
                <p>Canción no encontrada</p>
            </c:otherwise>
    </c:choose>

    <a class="btn-1" href="/canciones">Volver</a>
    
</body>
</html>
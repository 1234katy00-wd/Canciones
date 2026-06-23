<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle canciones</title>
</head>
<body>
    <h1>Detalle canciones:</h1>
    <ul>
        <li>Título: ${cancion.titulo}</li>
        <li>Artista: ${cancion.artista}</li>
        <li>ÁLbum: ${cancion.album}</li>
        <li>Género: ${cancion.genero}</li>
        <li>Idioma: ${cancion.idioma}</li>
        <li>Idioma: ${cancion.fecha_creacion}</li>
    </ul>
    <<a href="/canciones">Volver</a>
    
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/style.css">
    <title>Agregar Canciones</title>
</head>
<body>
    <h1>Agregar Caciones</h1>

    <form:form action="/canciones/procesa/agregar" method="POST" modelAttribute="cancion">     
        <form:label path="titulo">Título:</form:label>
        <form:input type="text" path="titulo"/>
        <form:errors class="error" path="titulo"/>

        <form:label path="artista">Artista:</form:label>
        <form:input type="text" path="artista"/>
        <form:errors class="error" path="artista"/>

        <form:label path="album">Álbum:</form:label>
        <form:input type="text" path="album"/>
        <form:errors class="error" path="album"/>

        <form:label path="genero">Género:</form:label>
        <form:input type="text" path="genero"/>
        <form:errors class="error" path="genero"/>

        <form:label path="idioma">Idioma:</form:label>
        <form:input type="text" path="idioma"/>
        <form:errors class="error" path="idioma"/>    

        <input class="btn-1" type="submit" value="Agregar canción"/> 
    
    </form:form>  
    

        <a class="btn-1" href="/canciones">Volver a lista de canciones</a>
    
</body>
</html>
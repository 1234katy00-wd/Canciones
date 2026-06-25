package com.katerin.demo.modelos;


import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="canciones")
public class Cancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 5, message = "Al menos 5 caracteres de longitud.")
    private String titulo;

    @Size(min = 3, message = "Al menos 3 caracteres de longitud.")
    private String artista;

    @Size(min = 3, message = "Al menos 3 caracteres de longitud.")
    private String album;

    @Size(min = 3, message = "Al menos 3 caracteres de longitud.")
    private String genero;

    @Size(min = 3, message = "Al menos 3 caracteres de longitud.")
    private String idioma;


    @CreationTimestamp
    @Column (updatable=false, name="fecha_creacion")
    //@DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate fecha_creacion;
    
    @UpdateTimestamp
    @Column (name="fecha_actualizacion")
    //@DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate fecha_actualizacion;


    public Cancion(){
    
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tiulo) {
        this.titulo = tiulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    public void setFecha_actualizacion(LocalDate fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public LocalDate getFecha_actualizacion() {
        return fecha_actualizacion;
    }
    
    
}

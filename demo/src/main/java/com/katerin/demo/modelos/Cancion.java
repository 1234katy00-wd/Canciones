package com.katerin.demo.modelos;


import java.time.LocalDate;

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

    @NotNull(message= "Este campo es obligatorio")
    @Size(max=40, message = "Debe contener máximo 40 caracteres.")
    private String titulo;

    @Size(max =80, message = "Debe contener máximo 40 caracteres.")
    private String artista;

    @Size(max =40, message = "Debe contener máximo 40 caracteres.")
    private String album;

    @Size(max=40, message = "Debe contener máximo 40 caracteres.")
    private String genero;

    @Size(max=20, message = "Debe contener máximo 40 caracteres.")
    private String idioma;

    @Column (updatable=false, name="fecha_creacion")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate fecha_creacion;
    
    @Column (name="fecha_actualizacion")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate fecha_actualizacion;


    public Cancion(){
    
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTiulo() {
        return titulo;
    }

    public void setTiulo(String tiulo) {
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

    @PrePersist
    protected void onCreate (){
        this.fecha_creacion= LocalDate.now();
        this.fecha_actualizacion=LocalDate.now();
    }
    @PreUpdate
    protected void onUpdate(){
        this.fecha_actualizacion=LocalDate.now();
    }


    




    
}

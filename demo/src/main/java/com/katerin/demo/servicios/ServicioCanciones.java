package com.katerin.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.katerin.demo.modelos.Cancion;
import com.katerin.demo.repositorios.RepositorioCanciones;

@Service
public class ServicioCanciones {
    @Autowired
    private RepositorioCanciones repositorioCanciones;

//Todas las canciones
    public List<Cancion>obtenerTodasLasCanciones(){
        return this.repositorioCanciones.findAll();
    }

//Por id
    public Cancion obtenerCancionPorId(Long id){
        return this.repositorioCanciones.findById(id).orElse(null);
    }
//metodo Nuevo agregar cancion
    public Cancion agregarCancion(Cancion cancion){
        return this.repositorioCanciones.save(cancion);

    }

}

package com.katerin.demo.controladores;

import com.katerin.demo.modelos.Cancion;
import com.katerin.demo.repositorios.RepositorioCanciones;
import com.katerin.demo.servicios.ServicioCanciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControladorCanciones {
    @Autowired
    private  ServicioCanciones servicioCanciones;

//Todas las canciones
    @GetMapping("/canciones")
    public String desplegarCanciones(Model modelo){
        modelo.addAttribute("listaCanciones",servicioCanciones.obtenerTodasLasCanciones());
        return"canciones.jsp";
    }

//Detalle de cancion
@GetMapping("/canciones/detalle/{idCancion}")
public String desplegarDetalleCancion(@PathVariable("idCancion")Long id, Model modelo){
    Cancion c = this.servicioCanciones.obtenerCancionPorId(id);
    modelo.addAttribute("cancion", c);
    return  "detalleCancion.jsp";
}



}

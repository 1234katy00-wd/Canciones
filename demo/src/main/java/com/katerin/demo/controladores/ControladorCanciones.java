package com.katerin.demo.controladores;

import com.katerin.demo.modelos.Cancion;
import com.katerin.demo.servicios.ServicioCanciones;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
    Cancion cancion = this.servicioCanciones.obtenerCancionPorId(id);
    modelo.addAttribute("cancion", cancion);
    return  "detalleCancion.jsp";
}

//agregar cancion
@GetMapping("/canciones/formulario/agregar")
public String formularioAgregarCancion(@ModelAttribute("cancion")Cancion cancion){
    return"agregarCancion.jsp";
}

//Procesar agregar cancion
@PostMapping("/canciones/procesa/agregar")
public String procesarAgregarCancion(@Valid @ModelAttribute("cancion")Cancion cancion, BindingResult validaciones){
    if(validaciones.hasErrors()){
        return"agregarCancion.jsp";
    }
    this.servicioCanciones.agregarCancion(cancion);
    return "redirect:/canciones";

}
// formulario editar
    @GetMapping("/canciones/formulario/editar/{idCancion}")
    public String formularioEditarCancion(@ModelAttribute("cancion")Cancion cancion,@PathVariable("idCancion")Long id, Model modelo){
        Cancion cancionActual = this.servicioCanciones.obtenerCancionPorId(id);
        modelo.addAttribute("cancionActual", cancionActual);
        return"editarCancion.jsp";
    }


    @PutMapping("/canciones/procesa/editar/{idCancion}")
    public String procesarEditarCancion(@Valid @ModelAttribute("cancion")Cancion cancion, BindingResult validaciones, @PathVariable("idCancion")Long idCancion){
    if(validaciones.hasErrors()){
        return"editarCancion.jsp";
        }
        cancion.setId(idCancion);
        this.servicioCanciones.actualizaCancion(cancion);
        return "redirect:/canciones";
        
    }
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class NuevoController {

    ArrayList<String> list = new ArrayList<>();

    @GetMapping("/saludo/{nombre}/{edad}/otra_ruta")
    public String obtener(@PathVariable String nombre, @PathVariable Integer edad) {
        String texto = "Hola " + nombre + " tu edad es " + edad;
        return texto;
    }

    @GetMapping("/mostrar")
    public String mostrar() {
        String text = "";
        for (String x: list) {
            text = text + " " +x;
        }
        return text;
    }

    @PostMapping("/enviar")
    public String enviar(@RequestBody String nombre) {
        list.add(nombre);
        return "Nombre enviado";
    }


}

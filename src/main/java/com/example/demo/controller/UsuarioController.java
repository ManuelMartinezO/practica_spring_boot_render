package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @GetMapping("/{id}")
    public Map<String, Object> obtenerUsuario(@PathVariable("id") Long id) {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Buscando al usuario con ID: " + id);
        return respuesta;
    }

    @PostMapping
    public Map<String, Object> crearUsuario(@RequestBody Map<String, Object> nuevoUsuario) {
        nuevoUsuario.put("mensaje", "Usuario creado con éxito");
        nuevoUsuario.put("estado", 201);
        return nuevoUsuario;
    }

    @PutMapping("/{id}")
    public Map<String, Object> actualizarUsuario(@PathVariable("id") Long id, @RequestBody Map<String, Object> datosActualizados) {
        datosActualizados.put("mensaje", "Usuario " + id + " actualizado correctamente");
        return datosActualizados;
    }

    @DeleteMapping("/{id}")
    public Map<String, String> borrarUsuario(@PathVariable("id") Long id) {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Usuario " + id + " eliminado permanentemente");
        return respuesta;
    }
}
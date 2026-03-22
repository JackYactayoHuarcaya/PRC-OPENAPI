package com.prcopenapi.prcopenapi.controller;

import org.springframework.http.ResponseEntity;
import com.prcopenapi.api.UsuariosApi;
import com.prcopenapi.model.Usuario;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController implements UsuariosApi {
    @Override
    public ResponseEntity<List<Usuario>> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario user1 = new Usuario();
        user1.setId(1);
        user1.setName("jack");
        Usuario user2 = new Usuario();
        user2.setId(2);
        user2.setName("andres");
        usuarios.add(user1);
        usuarios.add(user2);
        return ResponseEntity.ok(usuarios);
    }
}

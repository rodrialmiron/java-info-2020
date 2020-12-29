package com.proyectofinal.informatorio.Controller;
import java.util.List;
import com.proyectofinal.informatorio.Entity.Usuario;
import com.proyectofinal.informatorio.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping("/usuario")
    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }
    @PostMapping("/nuevousuario")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

}

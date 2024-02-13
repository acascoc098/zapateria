package com.iesvdc.acceso.zapateria.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iesvdc.acceso.zapateria.models.Usuario;
// import com.iesvdc.acceso.zapateria.modelos.Direccion;
// import com.iesvdc.acceso.zapateria.modelos.Telefono;
import com.iesvdc.acceso.zapateria.repos.RepoDireccion;
import com.iesvdc.acceso.zapateria.repos.RepoRol;
import com.iesvdc.acceso.zapateria.repos.RepoTelefono;
import com.iesvdc.acceso.zapateria.repos.RepoUsuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@RequestMapping("/usuarios")
public class ControllerUsuario {
    
    @Autowired 
    private RepoUsuario repoUsuario;

    @Autowired
    private RepoDireccion repoDireccion;

    @Autowired
    private RepoTelefono repoTelefono;

    @Autowired
    private RepoRol repoRol;

    @GetMapping(path = "/")    
    public String findAll(Model modelo) {
        List<Usuario> lUsuario = repoUsuario.findAll();
        modelo.addAttribute("usuarios", lUsuario);
        return "usuarios/usuarios";
    }

    @GetMapping("")
    public String findAll2(Model modelo) {
        return findAll(modelo);
    }
    
    
    @GetMapping("/add")
    public String addUsuario(Model modelo) {
        modelo.addAttribute("usuario", new Usuario());
        modelo.addAttribute("telefonos", repoTelefono.findAll());
        modelo.addAttribute("direcciones", repoDireccion.findAll());
        modelo.addAttribute("roles", repoRol.findAll());
        return "usuarios/add";
    }

    @PostMapping("/add")
    public String addUsuario(@ModelAttribute("usuario") Usuario usuario) {
        repoUsuario.save(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping("/delete/{id}")
    public String deleteUsuarioForm(Model modelo, @PathVariable("id") Long id) {
        modelo.addAttribute("usuario", repoUsuario.findById(id).get());
        return "delete";
    }

    @PostMapping("/delete/{id}")
    public String deleteUsuario(@PathVariable("id") Long id) {
        repoUsuario.deleteById(id);
        return "redirect:/usuarios";
    }
}

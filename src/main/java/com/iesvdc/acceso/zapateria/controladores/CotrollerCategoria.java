package com.iesvdc.acceso.zapateria.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.iesvdc.acceso.zapateria.models.Categoria;
import com.iesvdc.acceso.zapateria.repos.RepoCategoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/categorias")
public class CotrollerCategoria {
    @Autowired
    RepoCategoria repoCategoria;

    @GetMapping("")
    public String findAll(Model modelo) {
        modelo.addAttribute(
            "categorias", 
            repoCategoria.findAll());
        return "categorias/categorias";
    }
    
    @GetMapping("/add")
    public String addForm(Model modelo) {
        modelo.addAttribute("categorias", repoCategoria.findAll());        
        return "categorias/add";
    }

    @PostMapping("/add")
    public String postMethodName(
        @ModelAttribute("categoria") Categoria categoria)  {
        repoCategoria.save(categoria);
        return "redirect:/categorias";
    }
    
    
}

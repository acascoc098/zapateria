package com.iesvdc.acceso.zapateria.controladores;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.iesvdc.acceso.zapateria.models.Producto;
import com.iesvdc.acceso.zapateria.repos.RepoProducto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/productos")
public class ControllerProducto {
    @Autowired
    RepoProducto repoProducto;

    @GetMapping("")
    public String findAll(Model modelo) {
        modelo.addAttribute(
            "productos", 
            repoProducto.findAll());
        return "productos/productos";
    }
    
    @GetMapping("/add")
    public String addForm(Model modelo) {
        modelo.addAttribute("productos", repoProducto.findAll());        
        return "productos/add";
    }

    @PostMapping("/add")
    public String postMethodName(
        @ModelAttribute("producto") Producto producto)  {
        repoProducto.save(producto);
        return "redirect:/productos";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteForm(
            @PathVariable(name = "id") @NonNull Long id,
            Model modelo) {
        try {
            Optional<Producto> producto = repoProducto.findById(id);
            if (producto.isPresent()){
                // si existe la producto
                modelo.addAttribute(
                    "producto", producto.get());
                return "productos/delete";
            } else {
                return "error";
            }

        } catch (Exception e) {
            return "error";
        }
    }
    

    @PostMapping("/delete/{id}")
    public String delete(
            @PathVariable("id") @NonNull Long id) {
        try {
            repoProducto.deleteById(id);    
        } catch (Exception e) {
            return "error";
        }
        
        return "redirect:/productos";
    }


    @GetMapping("/edit/{id}")
    public String editForm(
        @PathVariable @NonNull Long id,
        Model modelo) {

            Optional<Producto> producto = 
                repoProducto.findById(id);
            List<Producto> productos = 
                repoProducto.findAll();
                
            if (producto.isPresent()){
                modelo.addAttribute("producto", producto.get());
                modelo.addAttribute("productos", productos);
                return "productos/edit";
            } else {
                modelo.addAttribute(
                    "mensaje", 
                    "Producto no encontrada");
                return "error";
            }
            
    }
    
}

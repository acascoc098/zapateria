package com.iesvdc.acceso.zapateria.controladores;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.iesvdc.acceso.zapateria.models.Localidad;
import com.iesvdc.acceso.zapateria.repos.RepoLocalidad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/localidades")
public class ControllerLocalidad {
    @Autowired
    RepoLocalidad repoLocalidad;

    @GetMapping("")
    public String findAll(Model modelo) {
        modelo.addAttribute(
            "localidades", 
            repoLocalidad.findAll());
        return "localidades/localidades";
    }
    
    @GetMapping("/add")
    public String addForm(Model modelo) {
        modelo.addAttribute("localidades", repoLocalidad.findAll());        
        return "localidades/add";
    }

    @PostMapping("/add")
    public String postMethodName(
        @ModelAttribute("localidad") Localidad localidad)  {
        repoLocalidad.save(localidad);
        return "redirect:/localidades";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteForm(
            @PathVariable(name = "id") @NonNull Integer id,
            Model modelo) {
        try {
            Optional<Localidad> localidad = repoLocalidad.findById(id);
            if (localidad.isPresent()){
                // si existe la localidad
                modelo.addAttribute(
                    "localidad", localidad.get());
                return "localidades/delete";
            } else {
                return "error";
            }

        } catch (Exception e) {
            return "error";
        }
    }
    

    @PostMapping("/delete/{id}")
    public String delete(
            @PathVariable("id") @NonNull Integer id) {
        try {
            repoLocalidad.deleteById(id);    
        } catch (Exception e) {
            return "error";
        }
        
        return "redirect:/localidades";
    }


    @GetMapping("/edit/{id}")
    public String editForm(
        @PathVariable @NonNull Integer id,
        Model modelo) {

            Optional<Localidad> localidad = 
                repoLocalidad.findById(id);
            List<Localidad> localidades = 
                repoLocalidad.findAll();
                
            if (localidad.isPresent()){
                modelo.addAttribute("localidad", localidad.get());
                modelo.addAttribute("localidades", localidades);
                return "localidades/edit";
            } else {
                modelo.addAttribute(
                    "mensaje", 
                    "Localidad no encontrada");
                return "error";
            }
            
    }
    
}

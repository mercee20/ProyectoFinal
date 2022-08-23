
package com.portfolio.MercedesAlonso.controller;

import com.portfolio.MercedesAlonso.entry.persona;
import com.portfolio.MercedesAlonso.interfaz.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<persona> getpersona(){
        return ipersonaService.getpersona();
    }
    
    @PostMapping("/personas/crear")
    public String createpersona(@RequestBody persona persona){
        ipersonaService.savepersona(persona);
        return "La persona fue creada correctamente";
                }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletepersona(@PathVariable Long id) {
     ipersonaService.deletepersona(id);
     return "La persona fue eliminada perfectamente";
    }
    
    @PutMapping("/personas/editar/{id}")
    public persona editpersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("img") String nuevoImg) {
    persona persona = ipersonaService.findpersona(id);
            
    persona.setNombre(nuevoNombre);
    
    persona.setApellido(nuevoApellido);
    
    persona.setImg(nuevoImg);
    
    ipersonaService.savepersona(persona);
    return persona;
    }
    
    @GetMapping("/personas/traer/perfil")
    public persona findPersona() {
        return ipersonaService.findpersona((long)1);
    }
   
}

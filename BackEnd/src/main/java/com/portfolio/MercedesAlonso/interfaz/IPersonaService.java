
package com.portfolio.MercedesAlonso.interfaz;

import com.portfolio.MercedesAlonso.entry.persona;
import java.util.List;


public interface IPersonaService {
    //Traer lista de personas
    public List<persona> getpersona();
    
    //Guardar un objeto de tipo persona
    public void savepersona(persona persona);
    
    //Eliminar un usuario buscado por ID
    public void deletepersona(Long id);
            
    //Buscar persona por id
    public persona findpersona(Long id);
            }

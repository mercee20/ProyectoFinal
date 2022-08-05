
package com.portfolio.MercedesAlonso.service;

import com.portfolio.MercedesAlonso.entry.persona;
import com.portfolio.MercedesAlonso.interfaz.IPersonaService;
import com.portfolio.MercedesAlonso.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
@Autowired IPersonaRepository ipersonaRepository;
    
  
    @Override
    public List<persona> getpersona() {
        List<persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savepersona(persona persona) {
       ipersonaRepository.save(persona);
    }

    @Override
    public void deletepersona(Long id) {
      ipersonaRepository.deleteById(id);
    }

    @Override
    public persona findpersona(Long id) {
      persona persona = ipersonaRepository.findById(id).orElse(null);
      return persona;
    }
    
}

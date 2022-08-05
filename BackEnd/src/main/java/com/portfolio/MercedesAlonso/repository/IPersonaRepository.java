
package com.portfolio.MercedesAlonso.repository;

import com.portfolio.MercedesAlonso.entry.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<persona,Long> {
    
}

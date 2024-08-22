package com.CIC.demoJPA.repository;

import com.CIC.demoJPA.entity.D10Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface D10Repository extends JpaRepository<D10Entity, Integer> {
   D10Entity save(D10Entity d10);
}

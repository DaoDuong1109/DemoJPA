package com.CIC.demoJPA.repository;

import com.CIC.demoJPA.entity.D10_CaNhanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface D10_CaNhanRepository extends JpaRepository<D10_CaNhanEntity, String> {
    @Override
    <S extends D10_CaNhanEntity> List<S> saveAll(Iterable<S> entities);
}

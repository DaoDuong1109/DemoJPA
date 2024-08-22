package com.CIC.demoJPA.repository;

import com.CIC.demoJPA.entity.D10_ToChucEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface D10_ToChucRepository extends JpaRepository<D10_ToChucEntity, String> {

    @Override
    <S extends D10_ToChucEntity> List<S> saveAll(Iterable<S> entities);
}

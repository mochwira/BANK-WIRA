package com.wira.databank.repository;

import com.wira.databank.entity.Nasabah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NasabahRepository extends JpaRepository<Nasabah, Integer> {
}

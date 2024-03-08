package com.sbgroup.haras.repositories;

import com.sbgroup.haras.models.FarmModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FarmRepository extends JpaRepository<FarmModel, UUID> {
}

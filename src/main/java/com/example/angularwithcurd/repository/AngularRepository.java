package com.example.angularwithcurd.repository;

import com.example.angularwithcurd.entity.AngularEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AngularRepository extends JpaRepository<AngularEntity,Long> {
}

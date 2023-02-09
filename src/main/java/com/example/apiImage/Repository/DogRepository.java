package com.example.apiImage.Repository;

import com.example.apiImage.Entity.DogEntity;
import com.example.apiImage.Entity.DogImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<DogEntity,Integer> {
}

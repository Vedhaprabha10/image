package com.example.apiImage.Repository;

import com.example.apiImage.Entity.DogImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogImageRepository extends JpaRepository<DogImage,Integer> {
}

package com.example.apiImage.Service;

import com.example.apiImage.Entity.DogEntity;
import com.example.apiImage.Entity.DogImage;
import com.example.apiImage.Wapper.Wapper;

import java.util.List;

public interface DogService {
       DogEntity upload(DogEntity wapper);

       List<DogEntity> getAll();

       DogEntity getById( int id);

       DogImage upload(Wapper wapper);
}

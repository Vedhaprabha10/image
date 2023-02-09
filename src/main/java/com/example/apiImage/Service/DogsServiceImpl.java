package com.example.apiImage.Service;

import com.example.apiImage.Entity.DogEntity;
import com.example.apiImage.Entity.DogImage;
import com.example.apiImage.Repository.DogImageRepository;
import com.example.apiImage.Repository.DogRepository;
import com.example.apiImage.Wapper.Wapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogsServiceImpl implements DogService{
    @Autowired
    DogRepository dogRepository;

    @Autowired
    DogImageRepository dogImageRepository;
    @Override
    public DogEntity upload(DogEntity wapper) {
        return dogRepository.save(wapper);
    }

    @Override
    public List<DogEntity> getAll() {
        return dogRepository.findAll();
    }

    @Override
    public DogEntity getById(int id) {
        return dogRepository.findById(id).get();
    }

    @Override
    public DogImage upload(Wapper wapper) {
        DogImage dogImage = new DogImage();
        dogImage.setDog(dogRepository.findById(wapper.getDogId()).get());
        dogImage.setContentType(wapper.getContentType());
        dogImage.setBase64(wapper.getBase64());
        return dogImageRepository.save(dogImage);
    }

}

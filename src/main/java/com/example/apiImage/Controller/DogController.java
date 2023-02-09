package com.example.apiImage.Controller;

import com.example.apiImage.Entity.DogEntity;
import com.example.apiImage.Entity.DogImage;
import com.example.apiImage.Service.DogService;
import com.example.apiImage.Wapper.Wapper;
import com.example.apiImage.response.CommonResponse;
import com.example.apiImage.response.CommonResponseGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/image")
public class DogController {
    @Autowired
    DogService dogService;

    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @GetMapping(value = "test")
    public CommonResponse<String> checkApi() {
        return commonResponseGenerator.successResponse("Hello World", "Success check api gaes");
    }
    @PostMapping(value = "addNew")
    public CommonResponse<DogEntity>addNew(@RequestBody DogEntity dog){
        try {
            DogEntity dogs = dogService.upload(dog);
            return commonResponseGenerator.successResponse(dogs, "Success Add New Car");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }
    }
    @GetMapping(value = "getall")
    public CommonResponse<List<DogEntity>> getall(){
        try {
            List<DogEntity> dogList = dogService.getAll();
            return commonResponseGenerator.successResponse(dogList, "Success Get all Car");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }
    }
    @GetMapping(value = "getById")
    public CommonResponse<DogEntity> getById(@RequestParam int id) {
        try {
            DogEntity car = dogService.getById(id);
            return commonResponseGenerator.successResponse(car, "Success Get Car By Id: " + id);
        } catch (Exception e)  {
            return  commonResponseGenerator.failedResponse(e.getMessage());
        }
    }
    @PostMapping(value = "upload")
    public CommonResponse<DogImage> uploadImage(@RequestBody Wapper param){
        try {
            DogImage image = dogService.upload(param);
            return commonResponseGenerator.successResponse(image, "Success Add New Car");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(e.getMessage());
        }
    }
}
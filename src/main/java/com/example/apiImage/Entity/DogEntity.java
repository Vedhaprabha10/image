package com.example.apiImage.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dId;
    private String dogName;
    private String breed;
    private String ownerNumber;
    private String color;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getId() {
        return dId;
    }

    public void setId(int id) {
        this.dId = id;
    }



    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(String ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "DogEntity{" +
                "id=" + dId +
                ", dogNmae='" + dogName + '\'' +
                ", breed='" + breed + '\'' +
                ", ownerNumber='" + ownerNumber + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

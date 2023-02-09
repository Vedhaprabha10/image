package com.example.apiImage.Wapper;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Wapper {
    private int dogId;
    private String dogName;
    private String contentType;
    private String base64;

    @Override
    public String toString() {
        return "Wapper{" +
                "carId=" + dogId +
                ", contentType='" + contentType + '\'' +
                ", base64='" + base64 + '\'' +
                '}';
    }
}

package com.example.mpharma;

import java.io.Serializable;

public class MedModel implements Serializable {
    String img_url;
    String name;
    String description;
    double price;

    public MedModel() {
    }

    public MedModel(String img_url, String name, String description, long price) {
        this.img_url = img_url;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}


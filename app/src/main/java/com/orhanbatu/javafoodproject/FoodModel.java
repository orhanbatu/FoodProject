package com.orhanbatu.javafoodproject;

public class FoodModel {

    public String imageUrl;
    public String food;
    public String country;
    public String userEmail;

    public FoodModel(String imageUrl, String food, String country, String userEmail) {
        this.imageUrl = imageUrl;
        this.food = food;
        this.country = country;
        this.userEmail = userEmail;
    }
}

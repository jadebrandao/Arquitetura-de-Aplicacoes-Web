package com.example.RestAPI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clima")
public class UserEntity {

    @Id
    private String id;
    private String country;
    private String date;
    private String text;


    public UserEntity(String id, String country, String date, String text) {
        this.id = id;
        this.country = country;
        this.date = date;
        this.text = text;
    }

    public UserEntity() {

    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
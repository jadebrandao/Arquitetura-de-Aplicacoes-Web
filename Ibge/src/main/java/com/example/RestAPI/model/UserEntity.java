package com.example.RestAPI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ibge")
public class UserEntity {

    @Id
    private String id;
    private String releases;
    private String noticias;
    private String noticiasReleases;

    public UserEntity(String id, String releases, String noticias, String noticiasReleases) {
        this.id = id;
        this.releases = releases;
        this.noticias = noticias;
        this.noticiasReleases = noticiasReleases;
    }

    public UserEntity() {

    }

    // Getters e Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setReleases(String releases) {
        this.releases = releases;
    }

    public void setNoticias(String noticias) {
        this.noticias = noticias;
    }

    public void setNoticiasReleases(String noticiasReleases) {
        this.noticiasReleases = noticiasReleases;
    }

    public String getId() {
        return id;
    }

    public String getReleases() {
        return releases;
    }

    public String getNoticias() {
        return noticias;
    }

    public String getNoticiasReleases() {
        return noticiasReleases;
    }
}
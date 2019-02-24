package com.bookstore.bean;

public class Book {
    private String name;
    private String synopsis;
    private String description;
    private String image;

    public Book(String name, String synopsis, String description, String image) {
        this.name = name;
        this.synopsis = synopsis;
        this.description = description;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

}

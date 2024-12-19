package com.example.a5;

public class OwnerContent {
    private String ownerId;
    private String title;
    private String description;

    public OwnerContent(String ownerId, String title, String description) {
        this.ownerId = ownerId;
        this.title = title;
        this.description = description;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}


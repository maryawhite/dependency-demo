package com.example.model;

public class JobTitle {
    private String title;

    public JobTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    @Override
    public String toString() {
        return "JobTitle " +
                "title = " + title + '\'';
    }
}

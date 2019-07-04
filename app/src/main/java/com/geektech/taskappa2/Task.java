package com.geektech.taskappa2;


import java.io.Serializable;

public class Task implements Serializable {

        String title;
        String description;

        public Task(String title, String description) {
            this.title = title;
            this.description = description;
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


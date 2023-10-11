package com.kailas.webservicesdemo.post;

import androidx.annotation.NonNull;

public class MyPostResponse {
    private String createdAt;
    private String name;
    private String id;
    private String job;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getid() {
        return id;
    }

    public void setid(String value) {
        this.id = value;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String value) {
        this.job = value;
    }

    @NonNull
    @Override
    public String toString() {
        return "MyPostResponse{" +
                "createdAt=" + createdAt +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
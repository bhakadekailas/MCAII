
package com.kailas.webservicesdemo.post;

import androidx.annotation.NonNull;

public class MyPostRequest {
    private String name;
    private String job;

    public MyPostRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getJob() { return job; }
    public void setJob(String value) { this.job = value; }

    @NonNull
    @Override
    public String toString() {
        return "MyPostRequest{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

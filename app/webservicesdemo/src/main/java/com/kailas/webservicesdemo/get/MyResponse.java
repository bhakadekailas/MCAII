package com.kailas.webservicesdemo.get;

import androidx.annotation.NonNull;

public class MyResponse {
    private Data data;
    private Support support;

    public Data getData() {
        return data;
    }

    public void setData(Data value) {
        this.data = value;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support value) {
        this.support = value;
    }

    @NonNull
    @Override
    public String toString() {
        return "MyResponse{" +
                "data=" + data +
                ", support=" + support +
                '}';
    }
}

class Data {
    private String lastName;
    private long id;
    private String avatar;
    private String firstName;
    private String email;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public long getid() {
        return id;
    }

    public void setid(long value) {
        this.id = value;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String value) {
        this.avatar = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    @NonNull
    @Override
    public String toString() {
        return "Data{" +
                "lastName='" + lastName + '\'' +
                ", id=" + id +
                ", avatar='" + avatar + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class Support {
    private String text;
    private String url;

    public String getText() {
        return text;
    }

    public void setText(String value) {
        this.text = value;
    }

    public String geturl() {
        return url;
    }

    public void seturl(String value) {
        this.url = value;
    }

    @NonNull
    @Override
    public String toString() {
        return "Support{" +
                "text='" + text + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
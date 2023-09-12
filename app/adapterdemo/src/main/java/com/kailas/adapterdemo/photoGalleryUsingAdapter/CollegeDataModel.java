package com.kailas.adapterdemo.photoGalleryUsingAdapter;

public class CollegeDataModel {
    private int imagePath;
    private String collegeName;

    public CollegeDataModel(int imagePath, String collegeName) {
        this.imagePath = imagePath;
        this.collegeName = collegeName;
    }

    public int getImagePath() {
        return imagePath;
    }

    public void setImagePath(int imagePath) {
        this.imagePath = imagePath;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}

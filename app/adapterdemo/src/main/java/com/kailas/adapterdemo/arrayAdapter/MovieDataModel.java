package com.kailas.adapterdemo.arrayAdapter;

import androidx.annotation.NonNull;

public class MovieDataModel {
    private String movieName;
    private String releaseDate;
    private int rating;

    public MovieDataModel(String movieName, String releaseDate, int rating) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @NonNull
    @Override
    public String toString() {
        return "MovieDataModel{" +
                "movieName='" + movieName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", rating=" + rating +
                '}';
    }
}

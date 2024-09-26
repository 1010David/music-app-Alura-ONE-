package com.aluraone.musicapp.modelo;

public class Song extends Audio {

    private String album;
    private String artist;
    private String genre;

    @Override
    public int getClasification() {
        if (getTotalLikes() > 5000){
            return 8;
        }else {
            return 4;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

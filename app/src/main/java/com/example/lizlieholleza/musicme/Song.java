package com.example.lizlieholleza.musicme;

public class Song {
    private String title;
    private String artist;
    private int imageID;
    private int songID;
    private String category;
    private int followers;
    private String playlist;

    public Song(int image, String title, String artist, int song) {
        this.imageID = image;
        this.title = title;
        this.artist = artist;
        this.songID = song;
    }

    public Song(int image, String category, int followers) {
        this.imageID = image;
        this.category = category;
        this.followers = followers;
    }

    public Song(int image, String playlist) {
        this.imageID = image;
        this.playlist = playlist;
    }
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getImageID() {
        return imageID;
    }

    public int getSongID() {
        return songID;
    }

    public String getCategory() {
        return category;
    }

    public int getFollowers() {
        return followers;
    }

    public String getPlaylist() {
        return playlist;
    }
}

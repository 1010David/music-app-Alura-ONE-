package com.aluraone.musicapp.main;

import com.aluraone.musicapp.modelo.Podcast;
import com.aluraone.musicapp.modelo.Song;

public class Main {
    public static void main(String[] args) {

        Song mySong = new Song();
        mySong.setTittle("Forever");
        mySong.setArtist("Kiss");

        Podcast myPodcast = new Podcast();
        myPodcast.setPresenter("Gab Aguilar");
        myPodcast.setTittle("Cafe.Tech");

        for (int i = 0; i < 100; i++){
            mySong.likes();
        }
        for (int i = 0; i < 5000; i++){
            mySong.reproduction();
        }

        System.out.println("Total Reproductions" + mySong.getTotalRproductions());
        System.out.println("Total likes" + mySong.getTotalLikes());

    }
}

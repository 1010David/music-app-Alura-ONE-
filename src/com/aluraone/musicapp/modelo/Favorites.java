package com.aluraone.musicapp.modelo;

public class Favorites {

    public void addition(Audio audio){
        if (audio.getClasification() >= 8){
            System.out.println(audio.getTittle() + "One Favorite");
        } else {
            System.out.println(audio.getTittle() + "Favorite Too");
        }
    }
}

package com.aluraone.musicapp.modelo;

public class Audio {

    private  String tittle;
    private int totalRproductions;
    private int totalLikes;
    private  int clasification;

    public void likes(){
        this.totalLikes++;
    }

    public void  reproduction(){
        this.totalRproductions++;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getTotalRproductions() {
        return totalRproductions;
    }

    public void setTotalRproductions(int totalRproductions) {
        this.totalRproductions = totalRproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getClasification() {
        return clasification;
    }

    public void setClasification(int clasification) {
        this.clasification = clasification;
    }
}

package org.serferian.projects.lesson1;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer2 {

    private List<Music> musicList = new ArrayList<>();

    // Задание1 - сделать проигрывание музыки из плейлиста
    // нужно сделать еще 1 жанр
    // изменить Play чтобы по массиву проигрывал
    // настроить передачу параметры в Bean для массив


    private String name;
    private int volume;

    public MusicPlayer2(List<Music> musicList) {
        this.musicList = musicList;
    }
    public MusicPlayer2() { }

    public void playMusic() {
        for (Music musiс: musicList) {
            System.out.println("Playing " + musiс.getSong());
        }
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}

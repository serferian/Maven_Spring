package org.serferian.projects.lesson1;

public class MusicPlayer3 {

    private Music music;

    // Задание1 - сделать проигрывание музыки из плейлиста
    // нужно сделать еще 1 жанр
    // изменить Play чтобы по массиву проигрывал
    // настроить передачу параметры в Bean для массив


    private String name;
    private int volume;


    public MusicPlayer3(Music music) {
        this.music = music;
    }

    public MusicPlayer3() {
    }

    public void playMusic() {
       System.out.println("Playing " + music.getSong());
    }

    public void setMusicList(Music music) {
        this.music = music;
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

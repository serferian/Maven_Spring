package org.serferian.projects.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    // Задание 2
// 1. Список / массив из 3 песен в каждом жанре
// 2. В Плеер надо внедрить оба бина
// 3. Создать Enum с жанрами Class  и Rock
// 4. переделать playMusic() для приема Enum
// 5. В зависимоси  от значения Enum должна воспроизводится рандом песня из листа
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic")Music music1,
                       @Qualifier("classicalMusic")Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(Enum<GENRES> genre) {

         if (genre == GENRES.ClassicalGENRE)
            System.out.println("Playing " + music2.getSong());
        else
            System.out.println("Playing " + music1.getSong());

    }
}

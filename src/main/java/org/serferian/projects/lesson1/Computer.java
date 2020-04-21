package org.serferian.projects.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer mp;

    @Autowired
    public Computer(MusicPlayer mp) {
        this.id=1;
        this.mp=mp;
    }

    /*@Override
    public String toString() {
        return "Computer " +
                mp.playMusic(GENRES.ClassicalGENRE) + "/t" +
                mp.playMusic(GENRES.RockGENRE);
    }*/
}

package org.serferian.projects.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerLS2 {
    Music music2;

    @Autowired
    public MusicPlayerLS2 (Music music){
        this.music2 = music;
    }

    public void playMusic() {

       System.out.println("Playing " + music2.getSong());

    }
}

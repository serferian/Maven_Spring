package org.serferian.projects.lesson2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // Java
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("ContextConfig");

        MusicPlayerLS2 mp = context.getBean("musicPlayerLS2", MusicPlayerLS2.class);

        mp.playMusic();

        context.close();

    }
}

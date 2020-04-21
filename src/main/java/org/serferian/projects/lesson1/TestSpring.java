package org.serferian.projects.lesson1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // Java
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ContextConfig");

/*      // Через XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
*/

 /*       //Вариант 1 Внедрение Зависимости просто через Constructor
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //Вариант 2 Внедрение Зависимости через Spring - через Constructor
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        //System.out.println(musicPlayer.getSong());

        //Вариант 3 Внедрение Зависимости через Spring - через Setter
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer2", MusicPlayer.class);
        musicPlayer2.playMusic();
        System.out.println(musicPlayer2.getName());
        System.out.println(musicPlayer2.getVolume());


        //Вариант 3 Внедрение Зависимости через Spring - через Setter
        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
        musicPlayer.playMusic();
        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());

        //Урок 4: Инит / Дестрой + Scope
        RockMusic rock = context.getBean("musicBean", RockMusic.class);


        // Урок 5: Аннотации (@Component)
        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer3 musicPlayer = new MusicPlayer3(music);

        musicPlayer.playMusic();
        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer3 musicPlayer2 = new MusicPlayer3(music2);

        musicPlayer2.playMusic();
*/

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//        musicPlayer.playMusic();

//        Computer comp = context.getBean("computer", Computer.class);

        MusicPlayer mp = context.getBean("musicPlayer", org.serferian.projects.lesson1.MusicPlayer.class);

        mp.playMusic(GENRES.ClassicalGENRE);

        //System.out.println(mp.getName());
        //System.out.println(mp.getVolume());

//        ClassicalMusic lc1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic lc2 = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(lc1==lc2);

        context.close();

    }
}

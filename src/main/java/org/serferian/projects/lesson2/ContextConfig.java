package org.serferian.projects.lesson2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.serferian.projects.Lesson2")
class ContextConfig {

 /*   @Bean
    public RockMusic musicBean() {
        return new RockMusic();
    }
    @Bean
    public ClassicalMusic musicBeanClassical() {
        return new ClassicalMusic();
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicBeanClassical(), musicBean());
    }
    @Bean
    public Computer comp() {
        return new Computer((MusicPlayer) musicPlayer());
    }*/
}

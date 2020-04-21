package org.serferian.projects.lesson1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//@Configuration
@ComponentScan("org.serferian.project")
@PropertySource("classpath:musicPlayer.properties")
class ContextConfigLS1 {

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

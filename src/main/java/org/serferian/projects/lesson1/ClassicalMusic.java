package org.serferian.projects.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    private List<String> playList = Arrays.asList("Classical Song 1",
            "Classical Song 2",
            "Classical Song 3");

    @PostConstruct
    public void init() {
        System.out.println("Classic init");
    }

    @PreDestroy
    public void destr() {
        System.out.println("Classic Destroy");
    }

    // для создание объектов этого класса - надо исп.фабричный метод!
    @Autowired
    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return playList.get(new Random().nextInt(2));
    }
}

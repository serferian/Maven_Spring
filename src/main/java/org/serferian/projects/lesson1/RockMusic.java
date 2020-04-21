package org.serferian.projects.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {

    private List<String> playList = Arrays.asList("Rock Song 1",
            "Rock Song 2",
            "Rock Song 3");

    // для создание объектов этого класса - надо исп.фабричный метод!
    @Autowired
    private RockMusic() {

    }

    @Override
    public String getSong() {

        return playList.get(new Random().nextInt(2));
    }
}

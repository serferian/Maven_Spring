package org.serferian.projects.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    // для создание объектов этого класса - надо исп.фабричный метод!
    @Autowired
    private RockMusic() {

    }

    @Override
    public String getSong() {

        return "Rock Song";
    }
}

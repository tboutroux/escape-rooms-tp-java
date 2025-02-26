package org.sebsy.demo.escaperooms.controller;

import org.springframework.stereotype.Component;

@Component("room1")
public class EscapeRoom1Controller {

    public void entreeSalle1() {
        System.out.println("Bravo, vous avez trouvé la première salle !");
    }

}

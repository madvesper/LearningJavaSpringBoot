package com.julian.burgerfactory.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRest {

    @GetMapping("/")
    public String saludar(){
        return "Mamá estoy triunfando, hice mi primera página web con Spring Boot";
    }

    @GetMapping("/introducing")
    public String presentar(){
        return "Hola me llamo Julian Alberto Acosta :)";
    }
}

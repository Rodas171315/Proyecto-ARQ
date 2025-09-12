package com.servidor.servidor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @RequestMapping("/hola")
    public String home() {
        return "Hello World";
    }
}

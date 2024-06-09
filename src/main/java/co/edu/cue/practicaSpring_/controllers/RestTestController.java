package co.edu.cue.practicaSpring_.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestTestController {

    @RequestMapping(value = "/test")
    public String test() {return "hola desde test"; }

    @RequestMapping(value = "/test-lista")
    public List<String> testLista(){
        return List.of("test1","test2","test3");
    }
}

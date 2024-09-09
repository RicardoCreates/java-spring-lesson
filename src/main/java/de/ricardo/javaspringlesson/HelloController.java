package de.ricardo.javaspringlesson;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping()
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/{greetform}")
    public String sayCustomGreet(@PathVariable String greetform, // Variabler Pfad in URL -> Name muss übereinstimmen
                                 @RequestParam(required = false, defaultValue = "") String name, // -> ?name=Max
                                 @RequestParam(required = false, defaultValue = "") String q) {
        return greetform + " " + name + " " + q;
    }

    @PostMapping
    public String readData(@RequestBody Student currywurst) {
        return currywurst.id();
    }
}

package de.neuefische.ffmjava231spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class MyController {

    @GetMapping
    public String getHello() {
        return "Hello";
    }

    @PostMapping
    public String addHello(@RequestBody String body) {
        System.out.println(body);
        return "Hello: " + body;
    }

    @GetMapping("/{id}")
    public String getHelloPathVariable(@PathVariable String id) {
        System.out.println("PathVariable: " + id);
        return "Hello: " + id;
    }

    @GetMapping("/test")
    public String getHelloQuery(@RequestParam String id) {
        System.out.println("RequestParameter: " + id);
        return "Hello: " + id;
    }
}

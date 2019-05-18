package com.Backend.Test.Controller;

import org.springframework.web.bind.annotation.*;
import com.Backend.Test.Model.Person;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins="http://localhost:4200")
public class BackendController {
    Person object;

    @PostMapping
    public void testPost(@RequestBody Person person){
        object = person;
        System.out.println(person.getUsername());
        System.out.println(person.getPassword());
    }

    @GetMapping
    public Person testGet(){
        System.out.println("Worked");
        return object;
    }
}

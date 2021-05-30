package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/v1/map")
public class PathVariableController {

    //Path variables
    @GetMapping(path = "/get/{id}")
    public String test1(@PathVariable String id) {
        return id;
    }

    //Path variables
    @GetMapping(path = "/set/{name}/{address}")
    public String test2(@PathVariable String name, @PathVariable String address) {
        return name + " " + address;
    }

    @GetMapping
    public String test3() {
        return "Test 3";
    }

    //Path variables can be validate using Reg-ex// C001
    @GetMapping(path = "/find/{id:C[0-9]{3}}/{name:[A-z]{1,5}}")
    public String test4(@PathVariable String id, @PathVariable String name) {
        return id + " " + name;
    }


    //Setting Allies for path variables
    @GetMapping(path = "/name/{id}/{name}")
    public String test5(@PathVariable("id") String myid, @PathVariable("name") String myname) {
        return myid + " " + myname;
    }



}

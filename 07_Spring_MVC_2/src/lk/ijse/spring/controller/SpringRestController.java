package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

//return HTTP response (Representational State (REST))
@RestController
@RequestMapping("/api/v1/customer")
public class SpringRestController {

    //mapping methods
    @GetMapping
    public String getMethod() {
        return "Get Request Invoked";
    }

    @PostMapping
    public String postMethod() {
        return "Post Method Invoked";
    }

    @DeleteMapping
    public String deleteMethod() {
        return "Delete Method Invoked";
    }

    @PutMapping
    public String putMapping() {
        return "Put Mapping Invoked";
    }

}

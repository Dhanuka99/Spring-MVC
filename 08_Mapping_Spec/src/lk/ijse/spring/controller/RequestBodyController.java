package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/v1/request")
public class RequestBodyController {
/*
    @GetMapping
    public String test1(HttpServletRequest request) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        return id + " " + name;
    }
*/
    //Query String id,name == yes
    //x-www-form-urlencoded == no (work only with post)
/*
    @GetMapping
    public String test1(String id,String name) {
        return id + " " + name;
    }

    //Query String id,name == yes
    //x-www-form-urlencoded (id,name,address,salary) =yes
    @PostMapping
    public String test2(String id, String name, String address, String salary) {
        return id + " " + name + " " + address + " " + salary;
    }
*/


    //Model Attribute
    //Can get x-www-form-urlencoded type data and Query String data
    //Not Supporting for application/json type

    //Query String id,name == yes
    //x-www-form-urlencoded (id,name,address,salary) =yes
    @PostMapping
    public String test3(@ModelAttribute CustomerDTO dto) {
        return dto.toString();
    }



}

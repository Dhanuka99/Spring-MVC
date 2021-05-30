package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

@RestController
@RequestMapping("/api/v1/param")
public class ParamsController {

//    Usage of parameters for request narrow downing

    @GetMapping(params = {"id", "name"})
    public String test1(@RequestParam String id, @RequestParam String name) {
        System.out.println("id and name");
        return id + " " + name;
    }


    @GetMapping(params = {"address", "salary"})
    public String test2(@RequestParam("address") String address12, @RequestParam("salary") String monthsalary) {
        System.out.println("address and salary");
        return address12 + " " + monthsalary;
    }

    // can use query string params to narrow down a request
    @GetMapping(params = {"id", "name", "address", "salary"})
    public String test3(String id, String name, String address, String salary) {
        return id + " " + name + " " + address + " " + salary;
    }


}

package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/v1/json")
public class JSONController {

    //if request content owns JSON
    @PostMapping
    public String saveCustomers(@RequestBody CustomerDTO dto) {
        return dto.toString();
    }

    @GetMapping
    public CustomerDTO getAllCustomers() {
        return new CustomerDTO("C001", "Dasun", "Galle", "1000");
    }

    @GetMapping(path = "/bool")
    public boolean getBooleanResponse() {
        return false;
    }

    @GetMapping(path = "/number")
    public int getNumberResponse() {
        return 1000;
    }


}

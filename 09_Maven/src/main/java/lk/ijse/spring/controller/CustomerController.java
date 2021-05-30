package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @GetMapping
    public String getDetails() {
        return "Hello Maven";
    }

    @PostMapping
    public String saveCustomer1(@ModelAttribute CustomerDTO dto) {
        return dto.toString();
    }

    @PostMapping(path = "/json")
    public String saveCustomer2(@RequestBody CustomerDTO dto) {
        return dto.toString();
    }

    @PostMapping(path = "/array")
    public String SaveCustomer3(@RequestBody ArrayList<CustomerDTO> customerList) {
        return customerList.toString();
    }

}

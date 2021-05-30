package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

//@PathVariable =  required
//@RequestParam = not required
//@ModelAttribute = not required
//@RequestBody = required

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    //json request body
    @PostMapping
    public String saveCustomer(@RequestBody CustomerDTO dto) {
        return dto.toString();
    }

    //json request body
    @PostMapping(path = "/array")
    public String saveCustomer2(@RequestBody ArrayList<CustomerDTO> customerList) {
        return customerList.toString();
    }

    @GetMapping
    public CustomerDTO searchCustomer() {
        return new CustomerDTO("C001", "Ramal", "Galle", 1000);
    }

    //Query String or x-www-form-urlencoded type body
    @PostMapping("/model")
    public String searchCustomer2(@ModelAttribute CustomerDTO dto) {
        return dto.toString();
    }


}

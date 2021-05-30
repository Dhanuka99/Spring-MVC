package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/v1/customer")
public class AmbitiousMappingController {

    @PostMapping
    public String addCustomer() {
        return "Customer Added";
    }

    @DeleteMapping
    public String deleteCustomer() {
        return "Customer Deleted";
    }

    //Ambiguous mapping -> narrow down using path segment
    @GetMapping(path = "/id") //path segment
    public String searchCustomer() {
        return "Customer Searched";
    }

    //Ambiguous mapping
    @GetMapping
    public String getAllCustomers() {
        return "Customer Get All";
    }

    @PutMapping
    public String updateCustomer() {
        return "Update Customer";
    }

}

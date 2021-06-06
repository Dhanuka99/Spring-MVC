package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping
    public String saveCustomer(@RequestBody CustomerDTO dto){
        customerService.addCustomer(dto);
        return "true";
    }
    @GetMapping(path = "/name/{name}")
    public  CustomerDTO customerSearchByName(@PathVariable String name){
        return customerService.customerSearchByName(name);

    }
}

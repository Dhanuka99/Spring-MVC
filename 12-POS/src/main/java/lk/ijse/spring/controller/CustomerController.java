package lk.ijse.spring.controller;


import lk.ijse.spring.exception.NotFoundException;
import lk.ijse.spring.dto.CustomerDTO;


import lk.ijse.spring.exception.ValidationException;
import lk.ijse.spring.service.impl.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    ModelMapper mapper;

    @PostMapping(path = "save")
    public void saveCustomer(@RequestBody CustomerDTO dto){

        if(dto.getId().trim().length()<=0){
            throw new ValidationException("Customer ID cant be empty");
        }
            boolean b = customerService.saveCustomer(dto);
    }
}

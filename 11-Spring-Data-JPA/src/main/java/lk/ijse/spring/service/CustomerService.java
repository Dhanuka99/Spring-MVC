package lk.ijse.spring.service;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public boolean addCustomer(CustomerDTO dto){
        Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary());
        customerRepo.save(customer);
        return true;
    }
}

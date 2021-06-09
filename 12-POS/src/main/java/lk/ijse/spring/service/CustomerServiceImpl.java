package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements lk.ijse.spring.service.impl.CustomerService {


    @Autowired
    ModelMapper mapper;

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public boolean saveCustomer(CustomerDTO dto) {
        Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary());
        customerRepo.save(customer);
        return true;
    }
}

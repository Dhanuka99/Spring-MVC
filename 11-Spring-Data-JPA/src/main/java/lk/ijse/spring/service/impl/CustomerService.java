package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;

public interface CustomerService {
    boolean addCustomer(CustomerDTO dto);

    CustomerDTO customerSearchByName(String name);
}

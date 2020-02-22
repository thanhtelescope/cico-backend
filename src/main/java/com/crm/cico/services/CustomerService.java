package com.crm.cico.services;

import com.crm.cico.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface CustomerService extends CrudRepository<Customer, Long> {
}

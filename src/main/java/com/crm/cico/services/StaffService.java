package com.crm.cico.services;

import com.crm.cico.model.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffService extends CrudRepository<Staff, Long> {
}

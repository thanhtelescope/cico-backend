package com.crm.cico.services;

import com.crm.cico.model.Manager;
import org.springframework.data.repository.CrudRepository;

public interface ManagerService extends CrudRepository<Manager, Long> {
}

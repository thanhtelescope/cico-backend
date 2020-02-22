package com.crm.cico.services;

import com.crm.cico.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerService extends CrudRepository<Owner, Long> {
}

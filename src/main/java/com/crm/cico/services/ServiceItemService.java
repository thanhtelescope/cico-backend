package com.crm.cico.services;

import com.crm.cico.model.ServiceItem;
import org.springframework.data.repository.CrudRepository;

public interface ServiceItemService extends CrudRepository<ServiceItem, Long> {
}

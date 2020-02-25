package com.crm.cico.services;

import com.crm.cico.model.ServiceCategory;
import org.springframework.data.repository.CrudRepository;

public interface ServiceCategoryService extends CrudRepository<ServiceCategory, Long> {
}

package com.crm.cico.services;

import com.crm.cico.model.ServiceProvider;
import org.springframework.data.repository.CrudRepository;

public interface ShopProviderService extends CrudRepository<ServiceProvider, Long> {
}

package com.crm.cico.services;

import com.crm.cico.model.Shop;
import org.springframework.data.repository.CrudRepository;

public interface ShopService extends CrudRepository<Shop, Long> {
}

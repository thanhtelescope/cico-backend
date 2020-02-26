package com.crm.cico.services;

import com.crm.cico.model.MenuItem;
import org.springframework.data.repository.CrudRepository;

public interface MenuItemService extends CrudRepository<MenuItem, Long> {
}

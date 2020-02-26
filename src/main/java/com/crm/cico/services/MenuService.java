package com.crm.cico.services;

import com.crm.cico.model.Menu;
import org.springframework.data.repository.CrudRepository;

public interface MenuService extends CrudRepository<Menu, Long> {
}

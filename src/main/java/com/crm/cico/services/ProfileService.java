package com.crm.cico.services;

import com.crm.cico.model.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileService extends CrudRepository<Profile, Long> {
}

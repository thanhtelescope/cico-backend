package com.crm.cico.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "service_categories")
public class ServiceCategory extends BaseEntity {

    private String name;

    @ManyToOne
    private Shop shop;

    @ManyToMany
    private Set<ServiceItem> services = new HashSet<>();

    public ServiceCategory(String name) {
        this.name = name;
    }
}

package com.crm.cico.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "services")
public class ServiceItem extends BaseEntity {

    private String name;
    private String description;

    @ManyToOne
    private Shop shop;

    @ManyToMany()
    @JoinTable(name = "service_service_category",
            joinColumns = @JoinColumn(name = "service_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<ServiceCategory> categories = new HashSet<>();

    public ServiceItem(String name, String description) {
        this.name = name;
        this.description = description;
    }
}

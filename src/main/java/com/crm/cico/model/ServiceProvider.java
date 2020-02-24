package com.crm.cico.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "services")
public class ServiceProvider extends BaseEntity {

    private String name;

    @ManyToOne
    private Shop shop;
}

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
@Table(name = "menu_items")
public class MenuItem extends BaseEntity {

    private String name;
    private String description;

    @ManyToOne
    private MenuItemGroup group;

    @ManyToOne
    private Shop shop;

    public MenuItem(String name, String description) {
        this.name = name;
        this.description = description;
    }


}

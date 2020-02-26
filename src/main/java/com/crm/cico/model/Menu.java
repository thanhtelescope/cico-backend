package com.crm.cico.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "menus")
public class Menu extends BaseEntity {

    private String name;

    @ManyToOne
    private Shop shop;

    @OneToMany
    Set<MenuItemGroup> itemGroups = new HashSet<>();

    private Boolean isActive = false;

    public Menu(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
    }

    public Menu(String name) {
        this.name = name;
    }
}

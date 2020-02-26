package com.crm.cico.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "menu_item_groups")
public class MenuItemGroup extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "group")
    private Set<MenuItem> items = new HashSet<>();

    public MenuItemGroup(String name) {
        this.name = name;
    }
}

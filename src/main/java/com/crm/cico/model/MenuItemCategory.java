package com.crm.cico.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "menu_item_categories")
public class MenuItemCategory extends BaseEntity {
    private String name;
}

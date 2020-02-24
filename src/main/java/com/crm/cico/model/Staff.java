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
@Table(name = "staffs")
public class Staff extends BaseEntity {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner boss;

    @ManyToMany
    @JoinTable(name = "staff_shop",
            joinColumns = @JoinColumn(name = "shop_id"),
            inverseJoinColumns = @JoinColumn(name = "staff_id"))
    private Set<Shop> shops = new HashSet<>();


    public Staff(Profile profile) {
        this.profile = profile;
    }
}
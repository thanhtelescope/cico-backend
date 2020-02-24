package com.crm.cico.model;

import lombok.*;

import javax.persistence.*;

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
}
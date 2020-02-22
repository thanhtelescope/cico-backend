package com.crm.cico.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "accounts")
public class Account extends BaseEntity {

    @OneToOne()
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;

    private String password;

    @Enumerated(value = EnumType.STRING)
    private AccountType accountType;
}

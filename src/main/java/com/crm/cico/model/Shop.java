package com.crm.cico.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shops")
public class Shop extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private String zip;

    @Column(name = "country")
    private String country;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @ManyToOne
    private Owner owner;

    public Shop(String name, String phone, String email, String address, String city, String state, String zip, String country, Double latitude, Double longitude, Owner owner) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.owner = owner;
    }
    @ManyToMany(mappedBy = "shops")
    private Set<Manager> managers;

    @ManyToMany(mappedBy = "shops")
    private Set<Staff> staffs;

    @OneToMany(mappedBy = "shop")
    private Set<ServiceProvider> services;
}
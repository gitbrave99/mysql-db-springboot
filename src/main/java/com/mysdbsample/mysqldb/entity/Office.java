package com.mysdbsample.mysqldb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "offices")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Office implements Serializable {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "officeCode", nullable = false)
    private String officeCode;
    
    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "phone", length = 50)
    private String phone;

    @Column(name = "addressLine1", length = 50)
    private String addressLine1;

    @Column(name = "addressLine2", length = 50)
    private String addressLine2;

    @Column(name = "state", length = 50)
    private String state;

    @Column(name = "country", length = 50)
    private String country;

    @Column(name = "postalCode", length = 15)
    private String postalCode;

    @Column(name = "territory", length = 10)
    private String territory;
}

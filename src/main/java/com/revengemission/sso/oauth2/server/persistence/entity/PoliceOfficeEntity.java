package com.revengemission.sso.oauth2.server.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class PoliceOfficeEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    private String address;

    private Float lat;

    private Float lng;

}

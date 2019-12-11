package com.revengemission.sso.oauth2.server.persistence.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class StreetEntity extends BaseEntity {

    @Column(nullable = false)
    private String streetName;

    @Column(nullable = false)
    private Long policeId;

    @Column(length = 5000)
    private String description;

}

package com.revengemission.sso.oauth2.server.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
//社区
public class RegionEntity extends BaseEntity {

    @Column(nullable = false)
    private String regionName;

    private Long streetId;

    private Long policeId;

}

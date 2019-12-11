package com.revengemission.sso.oauth2.server.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class PoliceEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String telphone;

    private Long officeId;

}

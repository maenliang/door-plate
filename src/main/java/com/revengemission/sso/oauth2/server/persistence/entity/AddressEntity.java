package com.revengemission.sso.oauth2.server.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
@GenericGenerator(name = "uuid-gen", strategy = "uuid")
public class AddressEntity {

    @Id
    @GeneratedValue(generator = "uuid-gen")
    @Column(length = 32)
    private String id;

    private Long streetId;

    private Long policeId;

    private Long districtId;
    @Column(nullable = false, length = 100)
    private String simpleName;

    @Column(nullable = false, length = 500)
    private String detailAddress;

    private float lat;

    private float lng;

    @Column(columnDefinition = "DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dateCreated;

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON update CURRENT_TIMESTAMP")
    private LocalDateTime lastModified;

}

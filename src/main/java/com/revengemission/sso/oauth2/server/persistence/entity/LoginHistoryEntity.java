package com.revengemission.sso.oauth2.server.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;


@Data
@Entity
@Table(indexes = {@Index(name = "index_username", columnList = "username")})
public class LoginHistoryEntity extends BaseEntity {

    /**
     *
     */
    private static final long serialVersionUID = -7088423724470075317L;
    /**
     * 用于记录用户在哪个子系统进行的登陆
     */
    private String clientId;
    @Column(nullable = false, columnDefinition = "VARCHAR(40)")
    private String username;
    private String ip;
    private String device;

}

package com.revengemission.sso.oauth2.server.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"roleName"}))
public class RoleEntity extends BaseEntity {


    @Column(nullable = false, columnDefinition = "VARCHAR(15)")
    private String roleName;
}

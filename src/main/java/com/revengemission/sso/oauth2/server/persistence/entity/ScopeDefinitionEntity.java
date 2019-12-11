package com.revengemission.sso.oauth2.server.persistence.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"scope"}))
public class ScopeDefinitionEntity extends BaseEntity {
    /**
     *
     */
    private static final long serialVersionUID = 1522239249392557103L;
    private String scope;
    /**
     * 定义 解释
     */
    private String definition;
}

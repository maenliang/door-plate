package com.revengemission.sso.oauth2.server.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"thirdParty", "thirdPartyAccountId"}))
public class ThirdPartyAccountEntity extends BaseEntity {

    private static final long serialVersionUID = -5519234457588411587L;
    @Column(nullable = false, columnDefinition = "VARCHAR(20)")
    private String thirdParty;
    @Column(nullable = false, columnDefinition = "VARCHAR(100)")
    private String thirdPartyAccountId;
    /**
     * 多种登陆方式合并账号使用
     */
    private String accountOpenCode;
    @ManyToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(name = "third_party_account_id", referencedColumnName = "id"), foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"), inverseForeignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    List<RoleEntity> roles = new ArrayList<>();
    private String nickName;
    private String avatarUrl;

}

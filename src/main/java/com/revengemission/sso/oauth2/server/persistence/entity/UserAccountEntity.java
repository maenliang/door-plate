package com.revengemission.sso.oauth2.server.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"username"}))
public class UserAccountEntity extends BaseEntity {

    private static final long serialVersionUID = -5519234457588411587L;
    @Column(nullable = false, columnDefinition = "VARCHAR(50)")
    private String username;
    @Column(nullable = false)
    private String password;
    /**
     * 多种登陆方式合并账号使用
     */
    private String accountOpenCode;
    private String nickName;
    private String avatarUrl;
    private String email;
    private String mobile;
    private String province;
    private String city;
    private String address;
    private LocalDate birthday;
    private String gender;
    private LocalDateTime failureTime;
    @Column(name = "failure_count", columnDefinition = "int default 0")
    private int failureCount;

    @ManyToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"), inverseForeignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    List<RoleEntity> roles = new ArrayList<>();

}

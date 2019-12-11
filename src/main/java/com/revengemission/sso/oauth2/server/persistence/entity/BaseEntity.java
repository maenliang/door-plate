package com.revengemission.sso.oauth2.server.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "record_status", columnDefinition = "int default 0")
    private int recordStatus;

    @Version
    @Column(name = "version", columnDefinition = "int default 0")
    private int version;

    private String remarks;

    @Column(name = "sort_priority", columnDefinition = "int default 0")
    private int sortPriority;

    @Column(columnDefinition = "DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dateCreated;

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON update CURRENT_TIMESTAMP")
    private LocalDateTime lastModified;

    @PreUpdate
    @PrePersist
    public void updateTimeStamps() {
        lastModified = LocalDateTime.now();
        if (dateCreated == null) {
            dateCreated = LocalDateTime.now();
        }
    }
}

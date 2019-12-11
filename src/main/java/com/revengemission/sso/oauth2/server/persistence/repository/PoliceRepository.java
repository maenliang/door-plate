package com.revengemission.sso.oauth2.server.persistence.repository;

import com.revengemission.sso.oauth2.server.persistence.entity.PoliceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliceRepository extends JpaRepository<PoliceEntity,Long> {
}

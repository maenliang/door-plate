package com.revengemission.sso.oauth2.server.persistence.repository;

import com.revengemission.sso.oauth2.server.persistence.entity.PoliceOfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliceOfficeRepository extends JpaRepository<PoliceOfficeEntity,Long> {
}

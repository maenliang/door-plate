package com.revengemission.sso.oauth2.server.persistence.repository;

import com.revengemission.sso.oauth2.server.persistence.entity.StreetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetRepository extends JpaRepository<StreetEntity,Long> {
}

package com.fiserv.chargebackapi.v1.infrastructure.adapter.repository;

import com.fiserv.chargebackapi.v1.domain.model.Chargeback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaChargebackRepository extends JpaRepository<Chargeback, Long> {
}

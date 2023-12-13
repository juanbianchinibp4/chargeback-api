package com.fiserv.chargebackapi.adapter.repository;

import com.fiserv.chargebackapi.model.Chargeback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaChargebackRepository extends JpaRepository<Chargeback, Long> {
}

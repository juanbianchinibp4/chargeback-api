package com.fiserv.chargebackapi.v1.infrastructure.adapter.repository;

import com.fiserv.chargebackapi.v1.application.port.ChargebackPort;
import com.fiserv.chargebackapi.v1.domain.model.Chargeback;
import org.springframework.stereotype.Service;

@Service
public class ChargebackJpaAdapter implements ChargebackPort {

    private final JpaChargebackRepository repository;

    public ChargebackJpaAdapter(JpaChargebackRepository repository) {
        this.repository = repository;
    }

    @Override
    public Chargeback saveChargeback(Chargeback chargeback) {
        return repository.save(chargeback);
    }

    @Override
    public Chargeback getChargeback(String refNumber) {
        return repository.getReferenceById(Long.valueOf(refNumber));
    }
}

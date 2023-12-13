package com.fiserv.chargebackapi.adapter.repository;

import com.fiserv.chargebackapi.model.Chargeback;
import com.fiserv.chargebackapi.port.ChargebackPort;
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

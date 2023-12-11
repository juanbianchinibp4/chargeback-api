package com.fiserv.chargebackapi.v1.application.event;

import com.fiserv.chargebackapi.v1.application.port.ChargebackPort;
import com.fiserv.chargebackapi.v1.domain.model.Chargeback;
import com.fiserv.chargebackapi.v1.domain.event.CreateChargeback;

public class CreateChargebackImpl implements CreateChargeback {

    private final ChargebackPort chargebackPort;

    public CreateChargebackImpl(ChargebackPort chargebackPort) {
        this.chargebackPort = chargebackPort;
    }

    @Override
    public Chargeback apply(Chargeback chargeback) {
        return chargebackPort.saveChargeback(chargeback);
    }
}

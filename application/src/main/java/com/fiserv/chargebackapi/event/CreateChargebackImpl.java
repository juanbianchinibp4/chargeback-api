package com.fiserv.chargebackapi.event;

import com.fiserv.chargebackapi.model.Chargeback;
import com.fiserv.chargebackapi.port.ChargebackPort;

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

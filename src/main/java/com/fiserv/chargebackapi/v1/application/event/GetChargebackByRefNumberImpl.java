package com.fiserv.chargebackapi.v1.application.event;

import com.fiserv.chargebackapi.v1.application.port.ChargebackPort;
import com.fiserv.chargebackapi.v1.domain.event.GetChargebackByRefNumber;
import com.fiserv.chargebackapi.v1.domain.model.Chargeback;

public class GetChargebackByRefNumberImpl implements GetChargebackByRefNumber {

    private final ChargebackPort chargebackPort;

    public GetChargebackByRefNumberImpl(ChargebackPort chargebackPort) {
        this.chargebackPort = chargebackPort;
    }

    @Override
    public Chargeback apply(String refNumber) {
        return chargebackPort.getChargeback(refNumber);
    }
}

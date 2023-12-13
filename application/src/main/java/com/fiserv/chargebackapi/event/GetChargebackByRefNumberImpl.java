package com.fiserv.chargebackapi.event;


import com.fiserv.chargebackapi.model.Chargeback;
import com.fiserv.chargebackapi.port.ChargebackPort;

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

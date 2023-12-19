package com.fiserv.chargebackapi.service;

import com.fiserv.chargebackapi.model.Chargeback;
import com.fiserv.chargebackapi.port.ChargebackPort;

public class ChargebackService {
    private final ChargebackPort chargebackPort;

    public ChargebackService(ChargebackPort chargebackPort) {
        this.chargebackPort = chargebackPort;
    }


    public Chargeback createChargeback(Chargeback chargeback) {
        return chargebackPort.saveChargeback(chargeback);
    }

    public Chargeback getGetChargebackByRefNumber(String refNumber) {
        return chargebackPort.getChargeback(refNumber);
    }
}

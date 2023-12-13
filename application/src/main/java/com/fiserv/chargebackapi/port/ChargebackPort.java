package com.fiserv.chargebackapi.port;


import com.fiserv.chargebackapi.model.Chargeback;

public interface ChargebackPort {
    Chargeback saveChargeback(Chargeback chargeback);

    Chargeback getChargeback(String refNumber);

}

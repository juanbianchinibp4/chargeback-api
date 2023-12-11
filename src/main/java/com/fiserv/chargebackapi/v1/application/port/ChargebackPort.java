package com.fiserv.chargebackapi.v1.application.port;

import com.fiserv.chargebackapi.v1.domain.model.Chargeback;

public interface ChargebackPort {
    Chargeback saveChargeback(Chargeback chargeback);

    Chargeback getChargeback(String refNumber);

}

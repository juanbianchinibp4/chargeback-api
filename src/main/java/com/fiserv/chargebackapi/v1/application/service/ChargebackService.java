package com.fiserv.chargebackapi.v1.application.service;

import com.fiserv.chargebackapi.v1.domain.event.CreateChargeback;
import com.fiserv.chargebackapi.v1.domain.event.GetChargebackByRefNumber;

public class ChargebackService {
    private final CreateChargeback createChargeback;
    private final GetChargebackByRefNumber getChargebackByRefNumber;

    public ChargebackService(CreateChargeback createChargeback, GetChargebackByRefNumber getChargebackByRefNumber) {
        this.createChargeback = createChargeback;
        this.getChargebackByRefNumber = getChargebackByRefNumber;
    }


    public CreateChargeback getCreateChargeback() {
        return createChargeback;
    }

    public GetChargebackByRefNumber getGetChargebackByRefNumber() {
        return getChargebackByRefNumber;
    }
}

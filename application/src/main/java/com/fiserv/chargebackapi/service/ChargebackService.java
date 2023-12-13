package com.fiserv.chargebackapi.service;


import com.fiserv.chargebackapi.event.CreateChargeback;
import com.fiserv.chargebackapi.event.GetChargebackByRefNumber;

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

package com.fiserv.chargebackapi.v1.application.service;

import com.fiserv.chargebackapi.v1.domain.event.GetCardByCardNumber;

public class CardService {

    private final GetCardByCardNumber getCardByCardNumber;


    public CardService(GetCardByCardNumber getCardByCardNumber) {
        this.getCardByCardNumber = getCardByCardNumber;
    }


    public GetCardByCardNumber getGetCardByCardNumber() {
        return getCardByCardNumber;
    }
}

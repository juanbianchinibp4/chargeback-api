package com.fiserv.chargebackapi.service;


import com.fiserv.chargebackapi.event.GetCardByCardNumber;

public class CardService {

    private final GetCardByCardNumber getCardByCardNumber;


    public CardService(GetCardByCardNumber getCardByCardNumber) {
        this.getCardByCardNumber = getCardByCardNumber;
    }


    public GetCardByCardNumber getGetCardByCardNumber() {
        return getCardByCardNumber;
    }
}

package com.fiserv.chargebackapi.service;

import com.fiserv.chargebackapi.model.Card;
import com.fiserv.chargebackapi.port.CardPort;

public class CardService {

    private final CardPort cardPort;


    public CardService(CardPort cardPort) {
        this.cardPort = cardPort;
    }


    public Card getGetCardByCardNumber(String cardNumber) {
        return cardPort.getCard(cardNumber);
    }
}

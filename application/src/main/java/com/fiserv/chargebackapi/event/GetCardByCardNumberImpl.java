package com.fiserv.chargebackapi.event;


import com.fiserv.chargebackapi.model.Card;
import com.fiserv.chargebackapi.port.CardPort;

public class GetCardByCardNumberImpl implements GetCardByCardNumber {

    private final CardPort cardPort;

    public GetCardByCardNumberImpl(CardPort cardPort) {
        this.cardPort = cardPort;
    }

    @Override
    public Card apply(String cardNumber) {
        return cardPort.getCard(cardNumber);
    }
}

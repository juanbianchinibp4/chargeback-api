package com.fiserv.chargebackapi.v1.application.event;

import com.fiserv.chargebackapi.v1.application.port.CardPort;
import com.fiserv.chargebackapi.v1.domain.event.GetCardByCardNumber;
import com.fiserv.chargebackapi.v1.domain.model.Card;

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

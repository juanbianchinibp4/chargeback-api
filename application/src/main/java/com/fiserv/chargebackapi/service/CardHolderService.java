package com.fiserv.chargebackapi.service;

import com.fiserv.chargebackapi.model.CardHolder;
import com.fiserv.chargebackapi.port.CardHolderPort;

public class CardHolderService {
    private final CardHolderPort cardHolderPort;

    public CardHolderService(CardHolderPort cardHolderPort) {
        this.cardHolderPort = cardHolderPort;
    }


    public CardHolder getCardHolderByCardId(String cardId) {
        return cardHolderPort.getCardHolder(cardId);
    }
}

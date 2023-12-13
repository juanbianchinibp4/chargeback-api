package com.fiserv.chargebackapi.service;

import com.fiserv.chargebackapi.event.GetCardHolderByCardId;

public class CardHolderService {
    private final GetCardHolderByCardId cardHolderByCardId;

    public CardHolderService(GetCardHolderByCardId cardHolderByCardId) {
        this.cardHolderByCardId = cardHolderByCardId;
    }


    public GetCardHolderByCardId getCardHolderByCardId() {
        return cardHolderByCardId;
    }
}

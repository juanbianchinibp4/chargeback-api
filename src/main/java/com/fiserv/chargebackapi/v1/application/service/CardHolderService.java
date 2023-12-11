package com.fiserv.chargebackapi.v1.application.service;

import com.fiserv.chargebackapi.v1.domain.event.GetCardHolderByCardId;

public class CardHolderService {
    private final GetCardHolderByCardId cardHolderByCardId;

    public CardHolderService(GetCardHolderByCardId cardHolderByCardId) {
        this.cardHolderByCardId = cardHolderByCardId;
    }


    public GetCardHolderByCardId getCardHolderByCardId() {
        return cardHolderByCardId;
    }
}

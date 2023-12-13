package com.fiserv.chargebackapi.event;

import com.fiserv.chargebackapi.model.CardHolder;
import com.fiserv.chargebackapi.port.CardHolderPort;

public class GetCardHolderByCardIdImpl implements GetCardHolderByCardId {

    private final CardHolderPort cardHolderPort;

    public GetCardHolderByCardIdImpl(CardHolderPort cardHolderPort) {
        this.cardHolderPort = cardHolderPort;
    }

    @Override
    public CardHolder apply(String cardId) {
        return cardHolderPort.getCardHolder(cardId);
    }
}

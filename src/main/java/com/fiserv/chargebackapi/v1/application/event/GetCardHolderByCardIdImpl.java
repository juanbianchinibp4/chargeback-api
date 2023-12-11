package com.fiserv.chargebackapi.v1.application.event;

import com.fiserv.chargebackapi.v1.application.port.CardHolderPort;
import com.fiserv.chargebackapi.v1.domain.event.GetCardHolderByCardId;
import com.fiserv.chargebackapi.v1.domain.model.CardHolder;

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

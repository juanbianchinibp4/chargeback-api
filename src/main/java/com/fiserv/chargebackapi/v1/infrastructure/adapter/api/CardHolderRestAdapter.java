package com.fiserv.chargebackapi.v1.infrastructure.adapter.api;

import com.fiserv.chargebackapi.v1.application.port.CardHolderPort;
import com.fiserv.chargebackapi.v1.domain.model.CardHolder;

public class CardHolderRestAdapter implements CardHolderPort {
    @Override
    public CardHolder getCardHolder(String id) {
        /*
        aca codigo para obtener el cardHolder a una api rest externa
         */
        return null;
    }
}

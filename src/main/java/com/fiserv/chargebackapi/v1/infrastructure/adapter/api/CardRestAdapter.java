package com.fiserv.chargebackapi.v1.infrastructure.adapter.api;

import com.fiserv.chargebackapi.v1.application.port.CardPort;
import com.fiserv.chargebackapi.v1.domain.model.Card;
import org.springframework.stereotype.Service;

@Service
public class CardRestAdapter implements CardPort{
    @Override
    public Card getCard(String id) {
        /*
        codigo para obtener una tarjeta usando una api rest
         */
        return null;
    }
}

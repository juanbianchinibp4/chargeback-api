package com.fiserv.chargebackapi.adapter.api;

import com.fiserv.chargebackapi.model.Card;
import com.fiserv.chargebackapi.port.CardPort;
import org.springframework.stereotype.Service;

@Service
public class CardRestAdapter implements CardPort {
    @Override
    public Card getCard(String id) {
        /*
        codigo para obtener una tarjeta usando una api rest
         */
        return null;
    }
}

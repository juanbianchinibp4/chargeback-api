package com.fiserv.chargebackapi.port;


import com.fiserv.chargebackapi.model.Card;

public interface CardPort {
    Card getCard(String id);
}

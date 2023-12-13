package com.fiserv.chargebackapi.port;


import com.fiserv.chargebackapi.model.CardHolder;

public interface CardHolderPort {
    CardHolder getCardHolder(String id);
}

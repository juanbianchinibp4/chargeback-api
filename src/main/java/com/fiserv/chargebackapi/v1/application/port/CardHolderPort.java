package com.fiserv.chargebackapi.v1.application.port;

import com.fiserv.chargebackapi.v1.domain.model.CardHolder;

public interface CardHolderPort {
    CardHolder getCardHolder(String id);
}

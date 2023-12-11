package com.fiserv.chargebackapi.v1.application.port;

import com.fiserv.chargebackapi.v1.domain.model.Card;

public interface CardPort {
    Card getCard(String id);
}

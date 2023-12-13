package com.fiserv.chargebackapi.event;


import com.fiserv.chargebackapi.model.Card;

import java.util.function.Function;

@FunctionalInterface
public interface GetCardByCardNumber extends Function<String, Card> {
}

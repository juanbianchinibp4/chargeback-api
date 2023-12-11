package com.fiserv.chargebackapi.v1.domain.event;

import com.fiserv.chargebackapi.v1.domain.model.Card;

import java.util.function.Function;

@FunctionalInterface
public interface GetCardByCardNumber extends Function<String, Card> {
}

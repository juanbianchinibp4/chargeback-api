package com.fiserv.chargebackapi.v1.domain.event;

import com.fiserv.chargebackapi.v1.domain.model.CardHolder;

import java.util.function.Function;

@FunctionalInterface
public interface GetCardHolderByCardId extends Function<String, CardHolder> {
}

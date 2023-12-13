package com.fiserv.chargebackapi.event;


import com.fiserv.chargebackapi.model.CardHolder;

import java.util.function.Function;

@FunctionalInterface
public interface GetCardHolderByCardId extends Function<String, CardHolder> {
}

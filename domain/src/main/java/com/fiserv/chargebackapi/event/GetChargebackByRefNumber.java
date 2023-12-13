package com.fiserv.chargebackapi.event;


import com.fiserv.chargebackapi.model.Chargeback;

import java.util.function.Function;

@FunctionalInterface
public interface GetChargebackByRefNumber extends Function<String, Chargeback> {
}

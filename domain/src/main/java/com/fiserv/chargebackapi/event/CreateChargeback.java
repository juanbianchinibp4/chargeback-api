package com.fiserv.chargebackapi.event;

import com.fiserv.chargebackapi.model.Chargeback;

import java.util.function.Function;

@FunctionalInterface
public interface CreateChargeback extends Function<Chargeback, Chargeback> {
}

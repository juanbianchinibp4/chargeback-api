package com.fiserv.chargebackapi.v1.domain.event;

import com.fiserv.chargebackapi.v1.domain.model.Chargeback;

import java.util.function.Function;

@FunctionalInterface
public interface CreateChargeback extends Function<Chargeback, Chargeback> {
}

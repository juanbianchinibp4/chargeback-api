package com.fiserv.chargebackapi.v1.domain.event;

import com.fiserv.chargebackapi.v1.domain.model.Presentment;

import java.util.function.Function;

@FunctionalInterface
public interface CreatePresentment extends Function<Presentment, Presentment> {
}

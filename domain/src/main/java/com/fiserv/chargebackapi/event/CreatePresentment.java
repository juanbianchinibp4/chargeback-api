package com.fiserv.chargebackapi.event;

import com.fiserv.chargebackapi.model.Presentment;

import java.util.function.Function;

@FunctionalInterface
public interface CreatePresentment extends Function<Presentment, Presentment> {
}

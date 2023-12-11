package com.fiserv.chargebackapi.v1.domain.event;

import com.fiserv.chargebackapi.v1.domain.model.Presentment;

import java.util.function.Consumer;

@FunctionalInterface
public interface UpdatePresentment extends Consumer<Presentment> {
}

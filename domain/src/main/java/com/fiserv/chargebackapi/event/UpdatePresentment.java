package com.fiserv.chargebackapi.event;


import com.fiserv.chargebackapi.model.Presentment;

import java.util.function.Consumer;

@FunctionalInterface
public interface UpdatePresentment extends Consumer<Presentment> {
}

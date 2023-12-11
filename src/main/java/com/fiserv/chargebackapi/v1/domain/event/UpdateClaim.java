package com.fiserv.chargebackapi.v1.domain.event;

import com.fiserv.chargebackapi.v1.domain.model.Claim;

import java.util.function.Consumer;

@FunctionalInterface
public interface UpdateClaim extends Consumer<Claim> {
}

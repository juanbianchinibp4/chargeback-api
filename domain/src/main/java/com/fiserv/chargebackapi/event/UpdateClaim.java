package com.fiserv.chargebackapi.event;


import com.fiserv.chargebackapi.model.Claim;

import java.util.function.Consumer;

@FunctionalInterface
public interface UpdateClaim extends Consumer<Claim> {
}

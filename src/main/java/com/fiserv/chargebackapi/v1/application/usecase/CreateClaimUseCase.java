package com.fiserv.chargebackapi.v1.application.usecase;

import com.fiserv.chargebackapi.v1.application.service.CardHolderService;
import com.fiserv.chargebackapi.v1.application.service.CardService;
import com.fiserv.chargebackapi.v1.application.service.ChargebackService;
import com.fiserv.chargebackapi.v1.domain.model.Card;
import com.fiserv.chargebackapi.v1.domain.model.CardHolder;
import com.fiserv.chargebackapi.v1.domain.model.Chargeback;
import com.fiserv.chargebackapi.v1.domain.model.Claim;

public class CreateClaimUseCase {
    private final ChargebackService chargebackService;
    private final CardService cardService;
    private final CardHolderService cardHolderService;

    public CreateClaimUseCase(ChargebackService chargebackService, CardService cardService, CardHolderService cardHolderService) {
        this.chargebackService = chargebackService;
        this.cardService = cardService;
        this.cardHolderService = cardHolderService;
    }

    public Claim createClaim(String cardNumber){ //esto podria ser un payload con cosas que necesito para crear un reclamo
        Card card = cardService.getGetCardByCardNumber().apply(cardNumber);

        CardHolder cardHolder = cardHolderService.getCardHolderByCardId().apply(card.getId());

        Chargeback chargeback = new Chargeback(cardHolder);

        chargebackService.getCreateChargeback().apply(chargeback);

        return new Claim(chargeback);
    }
}

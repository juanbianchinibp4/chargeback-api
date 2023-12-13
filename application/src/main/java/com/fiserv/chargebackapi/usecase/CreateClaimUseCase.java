package com.fiserv.chargebackapi.usecase;

import com.fiserv.chargebackapi.model.Card;
import com.fiserv.chargebackapi.model.CardHolder;
import com.fiserv.chargebackapi.model.Chargeback;
import com.fiserv.chargebackapi.model.Claim;
import com.fiserv.chargebackapi.service.CardHolderService;
import com.fiserv.chargebackapi.service.CardService;
import com.fiserv.chargebackapi.service.ChargebackService;

public class CreateClaimUseCase {
    private final ChargebackService chargebackService;
    private final CardService cardService;
    private final CardHolderService cardHolderService;

    public CreateClaimUseCase(ChargebackService chargebackService, CardService cardService, CardHolderService cardHolderService) {
        this.chargebackService = chargebackService;
        this.cardService = cardService;
        this.cardHolderService = cardHolderService;
    }

    public Claim createClaim(String cardNumber) { //esto podria ser un payload con cosas que necesito para crear un reclamo
        Card card = cardService.getGetCardByCardNumber().apply(cardNumber);

        CardHolder cardHolder = cardHolderService.getCardHolderByCardId().apply(card.getId());

        Chargeback chargeback = new Chargeback(cardHolder);

        chargebackService.getCreateChargeback().apply(chargeback);

        return new Claim(chargeback);
    }
}

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

    public Claim createClaim(String cardNumber) {
        Card card = cardService.getGetCardByCardNumber(cardNumber);

        CardHolder cardHolder = cardHolderService.getCardHolderByCardId(card.getId());

        Chargeback chargeback = new Chargeback(cardHolder);

        chargebackService.createChargeback(chargeback);

        return new Claim(chargeback);
    }
}

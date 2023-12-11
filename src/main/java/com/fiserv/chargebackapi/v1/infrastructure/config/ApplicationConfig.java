package com.fiserv.chargebackapi.v1.infrastructure.config;

import com.fiserv.chargebackapi.v1.application.port.CardPort;
import com.fiserv.chargebackapi.v1.application.port.ChargebackPort;
import com.fiserv.chargebackapi.v1.infrastructure.adapter.api.CardRestAdapter;
import com.fiserv.chargebackapi.v1.infrastructure.adapter.repository.ChargebackJpaAdapter;
import org.springframework.context.annotation.Bean;

public class ApplicationConfig { //podemos optar por esto o por anotar los adapters

    @Bean
    public CardPort cardPort(CardRestAdapter cardRestAdapter){
        return cardRestAdapter;
    }

    @Bean
    public ChargebackPort chargebackPort(ChargebackJpaAdapter chargebackJpaAdapter){
        return chargebackJpaAdapter;
    }
}

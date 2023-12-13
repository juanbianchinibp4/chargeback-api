package com.fiserv.chargebackapi.config;

import com.fiserv.chargebackapi.adapter.api.CardRestAdapter;
import com.fiserv.chargebackapi.adapter.repository.ChargebackJpaAdapter;
import com.fiserv.chargebackapi.port.CardPort;
import com.fiserv.chargebackapi.port.ChargebackPort;
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

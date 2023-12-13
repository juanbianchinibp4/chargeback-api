//package com.fiserv.chargebackapi.adapter.repository;
//
//import com.fiserv.chargebackapi.model.Chargeback;
//import com.fiserv.chargebackapi.port.ChargebackPort;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ChargebackJpaAdapter implements ChargebackPort {
//
//    @Autowired
//    private final JpaChargebackRepository repository;
//
//    public ChargebackJpaAdapter(JpaChargebackRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public Chargeback saveChargeback(Chargeback chargeback) {
//        //return repository.save(chargeback);
//        return chargeback;
//    }
//
//    @Override
//    public Chargeback getChargeback(String refNumber) {
//        //return repository.getReferenceById(Long.valueOf(refNumber));
//        return null;
//    }
//}

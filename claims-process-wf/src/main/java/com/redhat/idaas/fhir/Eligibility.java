package com.redhat.idaas.fhir;

import javax.enterprise.context.ApplicationScoped;

import org.hl7.fhir.r4.model.Claim;


@ApplicationScoped
public class Eligibility {

    public boolean checkEligibility(Claim claim) {
        return true;
    }
}

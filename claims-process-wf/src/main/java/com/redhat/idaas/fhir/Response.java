package com.redhat.idaas.fhir;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class Response {

    public FHIRResourceCE setResponse(FHIRResourceCE fhir) {
        
        fhir.setOperation("workflow-response");
        return fhir;
    }
}

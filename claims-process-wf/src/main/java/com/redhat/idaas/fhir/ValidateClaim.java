package com.redhat.idaas.fhir;

import javax.enterprise.context.ApplicationScoped;

import java.util.Base64;
import org.hl7.fhir.r4.model.Claim;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;

@ApplicationScoped
public class ValidateClaim {

    public Claim convertJSONFHIR(FHIRResourceCE fhir) {
        System.out.println("-------------------------------------------------------------------------------");
        FhirContext ctx = FhirContext.forR4();
        System.out.println(fhir.getPayload());
        byte[] decodedBytes = Base64.getDecoder().decode(fhir.getPayload());
        String json = new String(decodedBytes);
        //String json=Base64.getDecoder().decode(fhir.getPayload()).toString();
        // Instantiate a new parser
        IParser parser = ctx.newJsonParser();

        // Parse it
        System.out.println(json);
        Claim parsed = parser.parseResource(Claim.class, json);
        System.out.println("" + parsed.getIdBase());
        System.out.println("-------------------------------------------------------------------------------");
        
        return parsed;
    }

}

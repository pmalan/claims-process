package com.redhat.idaas.fhir;

public class FHIRResourceCE {

    String resourceId;
    String excahngeId;
    String resource;
    String payload;
    String synchronous;
    String channel;
    String format;
    String correlationId;
    String operation;

    

    public FHIRResourceCE() {

    }


    public String getResourceId() {
        return resourceId;
    }
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    public String getExcahngeId() {
        return excahngeId;
    }
    public void setExcahngeId(String excahngeId) {
        this.excahngeId = excahngeId;
    }
    public String getResource() {
        return resource;
    }
    public void setResource(String resource) {
        this.resource = resource;
    }
    public String getPayload() {
        return payload;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }
    public String getSynchronous() {
        return synchronous;
    }
    public void setSynchronous(String synchronous) {
        this.synchronous = synchronous;
    }
    public String getChannel() {
        return channel;
    }
    public void setChannel(String channel) {
        this.channel = channel;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public String getCorrelationId() {
        return correlationId;
    }
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    
}

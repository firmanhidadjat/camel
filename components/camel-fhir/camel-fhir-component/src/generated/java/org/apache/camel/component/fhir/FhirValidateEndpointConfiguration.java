
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.fhir.api.FhirValidate}.
 */
@ApiParams(apiName = "validate", description = "API for validating resources /",
           apiMethods = {@ApiMethod(methodName = "resource")})
@UriParams
@Configurer
public final class FhirValidateEndpointConfiguration extends FhirConfiguration {
    @UriParam
    @ApiParam(apiMethods = "resource")
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters;
    @UriParam
    @ApiParam(apiMethods = "resource")
    private org.hl7.fhir.instance.model.api.IBaseResource resource;
    @UriParam
    @ApiParam(apiMethods = "resource")
    private String resourceAsString;

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public org.hl7.fhir.instance.model.api.IBaseResource getResource() {
        return resource;
    }

    public void setResource(org.hl7.fhir.instance.model.api.IBaseResource resource) {
        this.resource = resource;
    }

    public String getResourceAsString() {
        return resourceAsString;
    }

    public void setResourceAsString(String resourceAsString) {
        this.resourceAsString = resourceAsString;
    }
}

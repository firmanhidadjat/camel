
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.box.api.BoxEventsManager}.
 */
@ApiParams(apiName = "events", description = "Box Events Manager",
           apiMethods = {@ApiMethod(methodName = "listen")})
@UriParams
@Configurer
public final class BoxEventsManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam
    @ApiParam(apiMethods = "listen", description = "The starting position of the event stream")
    private Long startingPosition;

    public Long getStartingPosition() {
        return startingPosition;
    }

    public void setStartingPosition(Long startingPosition) {
        this.startingPosition = startingPosition;
    }
}

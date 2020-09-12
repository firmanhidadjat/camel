
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
 * Camel endpoint configuration for {@link org.apache.camel.component.box.api.BoxSearchManager}.
 */
@ApiParams(apiName = "search", description = "Box Search Manager",
           apiMethods = {@ApiMethod(methodName = "searchFolder")})
@UriParams
@Configurer
public final class BoxSearchManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam
    @ApiParam(apiMethods = "searchFolder", description = "The id of folder searched")
    private String folderId;
    @UriParam
    @ApiParam(apiMethods = "searchFolder", description = "The search query")
    private String query;

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}

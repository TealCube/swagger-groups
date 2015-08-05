package com.tealcube.java.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExternalDocs;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.ResponseHeader;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Allows definition of reusable groups of Swagger annotations.
 * @author AD82225
 * @version 05082015
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ApiDefine {
    Api[] apis() default @Api();

    ApiImplicitParams apiImplicitParams() default @ApiImplicitParams({});

    ApiModel[] apiModels() default @ApiModel();

    ApiModelProperty[] apiModelProperties() default @ApiModelProperty();

    ApiOperation[] apiOperations() default @ApiOperation("");

    ApiParam[] apiParams() default @ApiParam();

    ApiResponses apiResponses() default @ApiResponses({});

    Authorization[] authorizations() default @Authorization("");

    AuthorizationScope[] authorizationScopes() default @AuthorizationScope(scope = "", description = "");

    Contact[] contacts() default @Contact(name = "");

    Extension[] extensions() default @Extension(properties = {});

    ExternalDocs externalDocs() default @ExternalDocs(url = "");

    Info[] infos() default @Info(title = "", version = "");

    License[] licenses() default @License(name = "");

    ResponseHeader[] responseHeaders() default @ResponseHeader();

    SwaggerDefinition[] swaggerDefinitions() default @SwaggerDefinition();

    Tag[] tags() default @Tag(name = "");
}

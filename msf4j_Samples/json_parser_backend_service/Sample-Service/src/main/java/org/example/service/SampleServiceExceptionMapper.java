package org.example.service;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class SampleServiceExceptionMapper implements ExceptionMapper<SampleServiceException> {

    @Override
    public Response toResponse(SampleServiceException e) {

        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).
                entity(String.format("{\"%s\":\"%s\"}", "error", e.getMessage())).
                type("application/json").
                build();
    }
}
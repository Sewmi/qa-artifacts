/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.example.service;

import com.google.gson.JsonParser;
import org.apache.commons.io.IOUtils;
import org.wso2.msf4j.Request;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Path("/service")
public class SampleService {

    private static final Log log = LogFactory.getLog(SampleService.class);

    private @Context HttpServletRequest httpServletRequest;

    @POST
    @Produces("application/json")
    @Path("transaction")
    public Response post(@Context Request request) throws SampleServiceException {

        try{
            //Reading the from the input stream
            String content = IOUtils.toString(request.getMessageContentStream());

            log.debug(" TimeInMillis : " + System.currentTimeMillis() + " Payload String ==" + content);
            System.out.println("Time : "+ System.currentTimeMillis() + " Before Passing json ==" + content);

            //Passing the payload string to check the json payload validity
            new JsonParser().parse(content);

            return Response.status(Response.Status.OK).
                    entity(String.format("{\"%s\":\"%s\"}", "status", "OK")).
                    type("application/json").
                    build();

        }catch (Exception e){
            // on an event of an exception, creating SampleServiceException type exception
            // and throwing it.
            throw new SampleServiceException(e.getMessage(), e);
        }

    }

}

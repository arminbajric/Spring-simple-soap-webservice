package com.practice.webservice.soap.soap;

import localhost._3000.GetUserInfoRequest;
import localhost._3000.GetUserInfoResponse;
import localhost._3000.UserInfo;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserInfoEndpoint {
    @PayloadRoot(namespace = "http://localhost:3000",localPart = "GetUserInfoRequest")
    @ResponsePayload
    public GetUserInfoResponse getUserInfo(@RequestPayload GetUserInfoRequest getUserInfoRequest) {
        GetUserInfoResponse getUserInfoResponse=new GetUserInfoResponse();
        UserInfo userInfo=new UserInfo();
        userInfo.setId(getUserInfoRequest.getId());
        userInfo.setEmail("john@doe.com");
        userInfo.setName("John");
        getUserInfoResponse.setUserInfo(userInfo);
        return getUserInfoResponse;
    };
}

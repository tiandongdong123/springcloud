package com.tiandd.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "eurekaclient",fallback = ApiServiceError.class)
public interface ApiService {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();
}

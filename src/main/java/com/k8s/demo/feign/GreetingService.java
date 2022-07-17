package com.k8s.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "seata-storage-service",url = "http://localhost:9003")
public interface GreetingService {

}

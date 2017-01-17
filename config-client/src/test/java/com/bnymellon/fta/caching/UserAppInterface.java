package com.bnymellon.fta.caching;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sbaoneCachingClient")
public interface UserAppInterface {

	@RequestMapping(value = "/hello")
	public String hi(@RequestParam(value = "name", defaultValue = "Krishna") String name);

}

package com.bnymellon.fta.caching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClientConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.ConfigurationBasedServerList;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;

public class SbaoneConfiguration extends RibbonClientConfiguration {

	//@Autowired
	//IClientConfig ribbonClientConfig;

/*	@Bean
	public IPing ribbonPing(IClientConfig config) {
		return new PingUrl();
	}

	@Bean
	public IRule ribbonRule(IClientConfig config) {
		return new AvailabilityFilteringRule();
	}
*/
	@Bean
	@Override
	public ServerList<Server> ribbonServerList(IClientConfig clientConfig) {
		ConfigurationBasedServerList serverList = new ConfigurationBasedServerList();
		serverList.initWithNiwsConfig(clientConfig);
		return serverList;
	}

}

package com.bnymellon.fta.config.client;

//@Configuration
public class AppConfig {

	/*private @Value("${redis.host:localhost}") String redisHost;
	private @Value("${redis.port:6379}") int redisPort;

	@Bean
	public RedisConnectionFactory redisConnectionFactory() {
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		jedisConnectionFactory.setHostName(redisHost);
		jedisConnectionFactory.setPort(redisPort);
		jedisConnectionFactory.setUsePool(true);
		return jedisConnectionFactory;
	}
*/
/*	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		RedisTemplate<String, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory());
		template.setKeySerializer(new StringRedisSerializer());
		template.setValueSerializer(new GenericToStringSerializer<>(Object.class));
		// template.setValueSerializer(new
		// JacksonJsonRedisSerializer<>(Object.class));
		template.setHashKeySerializer(new StringRedisSerializer());
		// template.setHashValueSerializer(new
		// JacksonJsonRedisSerializer<>(Object.class));
		template.setHashValueSerializer(new GenericToStringSerializer<>(Object.class));
		return template;
	}*/

/*	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setHostName(redisHost);
		factory.setPort(redisPort);
		factory.setUsePool(true);
		return factory;
	}

	@Bean
	RedisTemplate<String, Object> redisTemplate() {
		final RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
		template.setConnectionFactory(jedisConnectionFactory());
		template.setKeySerializer(new StringRedisSerializer());
		template.setHashValueSerializer(new GenericToStringSerializer<Object>(Object.class));
		template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
		return template;
	}
*/
}

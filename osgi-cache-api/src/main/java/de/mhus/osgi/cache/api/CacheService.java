package de.mhus.osgi.cache.api;

import javax.cache.Cache;
import javax.cache.configuration.MutableConfiguration;

public interface CacheService<K,V> {

	void configure(MutableConfiguration<K,V> configuration);
	
	Cache<K,V> getCache();
	
}

package hibernate.tutorial.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Profile;

/**
 * Created by thangnguyen-imac on 8/13/16.
 */

@Profile("dev")
public class CacheDevConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(CacheDevConfig.class);

    public CacheManager concurrentMapCacheManager(){
        LOGGER.debug("Cache manager is concurrentCacheManager");
        return new ConcurrentMapCacheManager("");
    }
}

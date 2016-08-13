package hibernate.tutorial.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by thangnguyen-imac on 8/13/16.
 */
@Configuration
@ComponentScan(basePackages = "hibernate.tutorial")
@EnableCaching
public class AppConfig {

    //@Autowired
    //private DataSource dataSource;

}

package hibernate.tutorial.config;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by thangnguyen-imac on 8/13/16.
 */
public interface DatabaseConfig {

    DataSource createDataSource();

    Properties hibernateProperties();

}

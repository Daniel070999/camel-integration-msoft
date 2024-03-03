package org.apache.camel.learn;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.support.DefaultRegistry;
import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        String URLJDBC = "jdbc:postgresql://localhost:5432/postgres";
        DataSource dataSource = setupDataSource(URLJDBC);

        DefaultRegistry registry = new DefaultRegistry();
        registry.bind("myDataSource", dataSource);

        CamelContext context = new DefaultCamelContext(registry);
        context.addRoutes(new MyRouteBuilder());
        context.start();
        Thread.sleep(5000);
        context.stop();
    }

    private static DataSource setupDataSource(String jdbcURL){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("camel");
        dataSource.setPassword("camel");
        dataSource.setUrl(jdbcURL);
        return dataSource;
    }




}


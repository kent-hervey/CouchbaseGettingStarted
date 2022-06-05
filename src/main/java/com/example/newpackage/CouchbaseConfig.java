//don't forget to always put your package name here
package com.example.newpackage;


import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {



    protected List<String> getBootstrapHosts() {
        return Arrays.asList("127.0.0.1");
    }

    @Override
    public String getConnectionString() {
        return null;
    }

    @Override
    public String getUserName() {
        return "Administrator";
    }

    @Override
    public String getPassword() {
        return "password";
    }

    @Override
    public String getBucketName() {
        return null;
    }


}

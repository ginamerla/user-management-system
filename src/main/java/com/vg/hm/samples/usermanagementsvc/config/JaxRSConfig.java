package com.vg.hm.samples.usermanagementsvc.config;

import com.vg.hm.samples.usermanagementsvc.rest.api.v1.UserV1RestService;
import lombok.extern.log4j.Log4j2;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Log4j2
@Configuration
public class JaxRSConfig extends ResourceConfig {

    public JaxRSConfig() {
        log.info("Initializing Rest Services...");
        packages("com.vg.hm.samples.usermanagementsvc");
        register(UserV1RestService.class);
        log.info("UserV1RestService - Added!");
    }
}

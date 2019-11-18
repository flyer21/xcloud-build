package com.flyer.xcloud.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class XCloudEurekaApplication {

    public static void main(String[] args) {
        log.debug("VoleEurekaApplication startup main");
        SpringApplication application = new SpringApplication(XCloudEurekaApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}

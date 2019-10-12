package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * TestDubboApplication.
 *
 */
@SpringBootApplication
@ImportResource({"classpath:spring-dubbo.xml"})
public class TestDubboApplication {

    /**
     * Main Entrance.
     *
     * @param args startup arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(TestDubboApplication.class, args);
    }

}

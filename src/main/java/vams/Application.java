package vams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static String ROOT = "/tmp";

    public static void main(String... args){
        SpringApplication.run(Application.class,args);
    }
}

package vams.config;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;

/**
 * Created by vicmejia on 15/05/16.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("journal/list");
        registry.addViewController("/journal/list").setViewName("journal/list");
        registry.addViewController("/journal/publish").setViewName("journal/create");
        registry.addViewController("/new_account").setViewName("user/create");
        registry.addViewController("/account").setViewName("user/update");
        registry.addViewController("/login").setViewName("login");
    }
}

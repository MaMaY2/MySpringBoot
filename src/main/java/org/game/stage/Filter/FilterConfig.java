package org.game.stage.Filter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;

/**
 * Created by Stiles on 2017/8/20.
 */
@Configuration
public class FilterConfig {
    @Bean
    public RemoteIpFilter ownFilter(){
        return new RemoteIpFilter();
    }
    @Bean
    public FilterRegistrationBean testfilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new FilterSetup());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("paramName", "paramValue");
        filterRegistrationBean.setName("FilterSetup");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}

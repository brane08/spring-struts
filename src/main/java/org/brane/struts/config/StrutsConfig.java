package org.brane.struts.config;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.apache.struts2.tiles.StrutsTilesListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;

@Configuration
public class StrutsConfig {

    @Bean
    public FilterRegistrationBean<StrutsPrepareAndExecuteFilter> struts2Filter() {
        FilterRegistrationBean<StrutsPrepareAndExecuteFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new StrutsPrepareAndExecuteFilter());
        registration.addUrlPatterns("*.do");
        registration.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
        registration.setName("struts2");
        return registration;
    }

    @Bean
    public ServletListenerRegistrationBean<StrutsTilesListener> struts2TilesListener() {
        ServletListenerRegistrationBean<StrutsTilesListener> registrationBean = new ServletListenerRegistrationBean<>();
        registrationBean.setListener(new StrutsTilesListener());
        return registrationBean;
    }
}

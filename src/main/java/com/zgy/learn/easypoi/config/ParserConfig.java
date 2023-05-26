package com.zgy.learn.easypoi.config;

import com.zgy.learn.easypoi.pojo.ContentType.TypeConstants;
import com.zgy.learn.easypoi.service.ParserFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParserConfig {
    @Bean(TypeConstants.CSV_PARSER)
    public FactoryBean serviceLocatorFactoryBean(){
      ServiceLocatorFactoryBean serviceLoaderFactoryBean = new ServiceLocatorFactoryBean();
      serviceLoaderFactoryBean.setServiceLocatorInterface(ParserFactory.class);
      return serviceLoaderFactoryBean;
    }
}

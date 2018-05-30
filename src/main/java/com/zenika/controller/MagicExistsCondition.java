package com.zenika.controller;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.io.IOException;
import java.util.Properties;

public class MagicExistsCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ResourceLoader resourceLoader = context.getResourceLoader();
        Resource resource = resourceLoader.getResource("application.properties");
        Properties properties = new Properties();
        try {
            properties.load(resource.getInputStream());

            return Boolean.parseBoolean(properties.getProperty("aopStatus"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }


}






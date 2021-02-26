package com.zjut.bridge.config.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration
public class WebMvcConfig implements WebMvcConfigurer {

    public static final String WINDOW_CONFIG_UPLOAD_PATH = "file:E:\\upload\\";

    public static final String WINDOW_UPLOAD_PATH = "E:\\";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);
        logger.info("图片上传路径为："+WINDOW_CONFIG_UPLOAD_PATH);
        registry.addResourceHandler("/upload/**").addResourceLocations(WINDOW_CONFIG_UPLOAD_PATH);
    }
}

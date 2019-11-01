package com.map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@MapperScan(basePackages = "com.map.mapper" )
@ComponentScan(basePackages = {"com.map.controller", "com.map.service"})
public class App 
{
    public static void main( String[] args )
    {
        //启动springboot项目
        SpringApplication.run(App.class,args);
    }
}

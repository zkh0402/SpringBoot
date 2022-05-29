package com.zkh.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zkh
 * @date 2022/5/29 -16:41
 */
/*
* 主程序类
* @SpringBootApplication:这是一个SpringBoot应用
*/
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}

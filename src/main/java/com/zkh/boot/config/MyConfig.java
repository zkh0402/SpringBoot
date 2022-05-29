package com.zkh.boot.config;

import com.zkh.boot.bean.Pet;
import com.zkh.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zkh
 * @date 2022/5/29 -18:14
 */
 /**
  * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
  * 2、配置类本身也是组件
  * 3、proxyBeanMethods：代理方法对象
  */
@Configuration(proxyBeanMethods = true)//告诉SpringBoot这是一个配置类 == 配置文件
public class MyConfig {

    @Bean//给容器添加组件。以方法名作为组件id:user01。返回类型为组件类型：User。返回的值就是组件在容器中的实例。
    public User user01(){
        return new User("zs",11);
    }

    @Bean
    public Pet tomcatPet(){
        return new Pet("tomcat01");
    }

}

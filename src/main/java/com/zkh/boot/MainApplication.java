package com.zkh.boot;

import com.zkh.boot.bean.Pet;
import com.zkh.boot.bean.User;
import com.zkh.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
        //返回ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //获取容器中组件的名字
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        //从容器中获取组件
        Pet pet01 = run.getBean("tomcatPet", Pet.class);
        Pet pet02 = run.getBean("tomcatPet", Pet.class);
        System.out.println("组件："+(pet01==pet02));
        //com.zkh.boot.config.MyConfig$$EnhancerBySpringCGLIB$$32194c1f@347bdeef
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);
        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器，为了保持组件单实例
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user==user1);

        System.out.println("用户的宠物："+(user.getPet()==pet02));

    }
}

package com.guichang.springboot01helloword.config;

import com.guichang.springboot01helloword.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * create by author MaGuichang
 * create date 2019/1/30 14:28
 */

/**
 * @Configuration： 指明当前类为配置类，配置类就是用来替代之前的Spring配置文件
 * 在配置文件中用<bean><bean/>标签添加组件
 *
 */

@Configuration
public class myAppConfig {

    //将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){

        System.out.println("配置类@Bean给容器添加组件了");
        return new HelloService();

    }
}

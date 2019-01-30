package com.guichang.springboot01helloword;

import com.guichang.springboot01helloword.bean.Person;
import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01HellowordApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    org.springframework.context.ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean( "helloService");
        System.out.println(b);
    }

    @Test
    public void contextLoads() {

        System.out.println(person);
    }

}


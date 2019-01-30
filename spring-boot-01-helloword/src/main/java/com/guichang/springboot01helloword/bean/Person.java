package com.guichang.springboot01helloword.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * create by author MaGuichang
 * create date 2019/1/28 9:58
 */

/**
 * 降配置文件中配合的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *      prefix = "person":配置文件中哪个下面的所有属性进行一一映射
 *  只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
 * @ConfigurationProperties默认从全局配置文件中获取值
 *
 */
//@Validated
@Component
//@PropertySource(value = {"classpath:person.properties"})    //加载指定的配置文件
@ConfigurationProperties(prefix = "person")
public class Person {

    /**
     * @Value获取配置文件中的值，支持SpEL表达式("#{11*2}")
     */
//    @Value("${person.lastName}")
//    @Email
    private String lastName;
//    @Value("#{11*2}")
    private Integer age;
    private Boolean boss;

    private Map<String,Object> maps;
    private List<Object> lists;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }
}

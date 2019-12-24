package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
配置类
@Configuration  表示配置类
@ComponentScan("spring")  扫描组件
 */

@Configuration
@ComponentScan("spring")
public class AutoMachine {
    /*
    @Autowired  自动装配 前提是 必须都是组件
      可以加载属性上面(比较多) 也可以加到set方法上面
     */
    @Autowired
    private Apple apple;

    @Autowired
    private Water water;

    @Autowired
    private Suger suger;

    @Autowired
    private Juice juice;





}

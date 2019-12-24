package spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
饮料生成
 */
@Configuration
@ComponentScan("spring")
public class ShopMinche {
// psv 生成 main方法
    public static void main(String[] args) {
          /*
          传统的对象创建方式
           */
          Apple apple=new Apple();
          apple.setName("苹果");

          Suger suger=new Suger();
          suger.setName("红糖");

          Water water=new Water();
          water.setName("矿泉水");

          Juice juice=new Juice(apple,suger,water);
          System.out.println(juice);

          /*
          java中所有的类或是JavaBean 都会被当成bean去处理
          Spring是管理对象的容器
           */

    }



}

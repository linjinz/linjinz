package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Apple {
    //名字
    private String name;
    //颜色
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Bean
    public Apple getApple()
    {
        return new Apple();
    }
}

package spring;

import org.springframework.stereotype.Component;

/*
糖
 */
@Component
public class Suger {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

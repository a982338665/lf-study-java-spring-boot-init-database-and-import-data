package pers.li.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author : Mr huangye
 * @URL : CSDN 皇夜_
 * @createTime : 2022/7/21 16:26
 * @Description :
 */
@Component
@Configuration
public class TestConfig {

    @Value("${name1:null}")
    private String name1;
    @Value("${name2:null}")
    private String name2;
    @Value("${name3:null}")
    private String name3;
    @Value("${name4:null}")
    private String name4;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public void print(){

    }

    @Override
    public String toString() {
        return "TestConfig{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", name3='" + name3 + '\'' +
                ", name4='" + name4 + '\'' +
                '}';
    }
}

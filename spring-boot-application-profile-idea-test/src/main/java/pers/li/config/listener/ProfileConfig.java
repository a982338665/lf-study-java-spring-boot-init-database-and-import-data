package pers.li.config.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Mr huangye
 * @URL : CSDN 皇夜_
 * @createTime : 2023/8/10 0:03
 * @Description :
 */
@Component
public class ProfileConfig {

    public static String name;

    public static String getName() {
        return name;
    }

    @Value("${xxx.profile}")
    public void setName(String name) {
        ProfileConfig.name = name;
    }
}

package pers.li.config.listener;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author : Mr huangye
 * @URL : CSDN 皇夜_
 * @createTime : 2023/8/9 23:09
 * @Description :
 */
@Component
//条件表达式，仅当xxx.profile==dev的时候才会生效，如果配置文件修改为其他的话，则会报错，因为spring中并未管理此bean
@ConditionalOnProperty(name = "xxx.profile",havingValue = "dev")
public class TestAnnotation {


}

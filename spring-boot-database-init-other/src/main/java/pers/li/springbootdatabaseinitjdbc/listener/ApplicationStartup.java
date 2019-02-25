package pers.li.springbootdatabaseinitjdbc.listener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
/**
 * 第2步，写1个监听器，监听项目加载完后执行指定操作
 * spring boot 容器加载完成后执行
 * @author lijunming
 * @date 2018/7/22 下午3:04
 */
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext ac = event.getApplicationContext();
        StepExecutor StepExecutor = ac.getBean(StepExecutor .class);
        Thread thread = new Thread(StepExecutor);
        thread.start();
    }
}

package pers.li.springbootdatabaseinitjdbc.listener;
import org.springframework.stereotype.Component;
/**
 * 第1步：先写1个线程类，在springboot启动加载完，自动执行的操作放在里面
 * @author lijunming
 * @date 2018/7/22 下午2:54
 */
@Component
public class StepExecutor implements Runnable {
    @Override
    public void run() {
        startStreamTask();

    }
    /**
     * 项目启动后打开1个页面
     */
    public void startStreamTask() {
        System.out.println("开始启动1个页面");
        try {
            Runtime.getRuntime().exec("cmd   /c   start   http://localhost:8080/index");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
 
}

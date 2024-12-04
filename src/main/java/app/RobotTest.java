package app;

import beans.Robot;
import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RobotTest {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Robot robot=context.getBean(Robot.class);
        robot.doWork();
        //Need to fix
    }
}

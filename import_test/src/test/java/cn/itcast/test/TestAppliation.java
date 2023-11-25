package cn.itcast.test;

import cn.itcast.bean.EnableUserBean;
import cn.itcast.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author: asus
 * Date: 2023/11/24 9:35
 */
@EnableUserBean
public class TestAppliation {
    public static void main(String[] args) {
        //     获取spring容器
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(TestAppliation.class);
        User user = ac.getBean(User.class);
        System.out.println("user = " + user);


    }

}

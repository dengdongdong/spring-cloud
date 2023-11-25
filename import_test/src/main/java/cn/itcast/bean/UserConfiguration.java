package cn.itcast.bean;

import org.springframework.context.annotation.Bean;

/**
 * Author: asus
 * Date: 2023/11/23 18:06
 */
public class UserConfiguration {

    @Bean
    public User getUser() {
        User user = new User();
        user.setUsername("传智播客");
        user.setAge(18);

        return user;
    }
}

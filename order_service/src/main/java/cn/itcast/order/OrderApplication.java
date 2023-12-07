package cn.itcast.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Author: asus
 * Date: 2023/11/23 11:28
 */
@SpringBootApplication
// @EntityScan("cn.itcast.product.entity")
@EnableFeignClients//激活Feign
public class OrderApplication {


    /**
     * 使用spring提供的RestTemplate发送http请求到商品服务
     * 1.创建RestTemplate对象交给容器管理*
     * 2.在使用的时候，调用其方法完成操作 (getxx,postxxx)
     *
     * @LoadBalanced : 是ribbon提供的负载均的注解
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);

    }
}

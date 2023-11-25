package cn.itcast.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: asus
 * Date: 2023/11/23 11:28
 */
@SpringBootApplication
@EntityScan("cn.itcast.product.entity")
// 激活eurekaClient @EnableEurekaClient @EnableDiscoveryClient都可以激活
// @EnableEurekaClient
@EnableDiscoveryClient
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);

    }
}

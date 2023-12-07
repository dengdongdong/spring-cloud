package cn.itcast.order.controller;

import cn.itcast.order.entity.Product;
import cn.itcast.order.feign.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: asus
 * Date: 2023/11/23 11:52
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    // @Autowired
    // private RestTemplate restTemplate;

    /**
     * 注入DiscoveryClient
     * spring cloud 提供获取元数据的工具类
     * 调用方法获取服务的元数据
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ProductFeignClient productFeignClient;

    /**
     * 基于ribbon的形式调用远程微服务
     * <p>
     * 1、使用@loadBlanced
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {

        // Product product = restTemplate.getForObject("http://service-product/product/1",
        //         Product.class);
        Product product1 = productFeignClient.findById(id);
        return product1;
    }


    // @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    // public Product findById(@PathVariable Long id) {
    //     List<ServiceInstance> instances = discoveryClient.getInstances("SERVICE-PRODUCT");
    //     ServiceInstance instance = instances.get(0);
    //
    //     Product product =
    //             restTemplate.getForObject("http://" + instance.getHost() + ":" + instance
    //             .getPort() +
    //                     "/product/1",
    //             Product.class);
    //     return product;
    // }


}

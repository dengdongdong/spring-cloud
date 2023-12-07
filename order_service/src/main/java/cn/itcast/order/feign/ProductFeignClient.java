package cn.itcast.order.feign;

import cn.itcast.order.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author: asus
 * Date: 2023/12/7 11:48
 * 声明需要调用的微服务名称
 * @FeignClient
 *      name：服务提供者名称
 */
@FeignClient(name = "service-product")
public interface ProductFeignClient {

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable("id") Long id) ;

}

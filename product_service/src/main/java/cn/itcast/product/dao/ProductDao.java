package cn.itcast.product.dao;

import cn.itcast.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Author: asus
 * Date: 2023/11/23 11:05
 * 集成接口
 */
public interface ProductDao extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

}

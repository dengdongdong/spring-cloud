package cn.itcast.product.service;

import cn.itcast.product.entity.Product;

/**
 * Author: asus
 * Date: 2023/11/23 11:09
 */
public interface ProductService {
    /**
     * 根据id查询
     */
    Product findById(Long id);

    /**
     * 保存
     */
    void save(Product product);

    /**
     * 更新
     */
    void update(Product product);

    /**
     * 删除
     */
    void delete(Long id);
}

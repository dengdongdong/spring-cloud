package cn.itcast.order.entity;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Author: asus
 * Date: 2023/11/23 11:56
 */
@Data
public class Product {

    private Long id;
    private String productName;
    private Integer status;
    private BigDecimal price;
    private String productDesc;
    private String caption;
    private Integer inventory;
}

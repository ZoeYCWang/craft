package com.craft.entity;

import javax.persistence.*;

import com.zoe.snow.model.annotation.Property;
import com.zoe.snow.model.annotation.Unique;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.Date;
import com.zoe.snow.json.Jsonable;
import com.zoe.snow.model.support.BaseModelSupport;

/**
 * @Description 商品基本信息
 * @author 
 * @date 2018-5-15 2:10:40
 */
@Entity
@Table(name = "m_goods_info")
@Component("com.craft.entity.GoodsInfo")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Property(name = "商品基本信息")
public class GoodsInfoModel extends BaseModelSupport {
    private String name;    //名称

    private String code;    //编码

    private String description;    //描述

    private String isUse;    //是否可用，0：关闭使用，1：可以使用

    private String productId;    //款式Id


    @Jsonable
    @Column(name = "name")
    @Property(name = "名称")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    @Jsonable
    @Column(name = "code")
    @Property(name = "编码")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

    @Jsonable
    @Column(name = "description")
    @Property(name = "描述")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

    @Jsonable
    @Column(name = "is_use")
    @Property(name = "是否可用，0：关闭使用，1：可以使用")
	public String getIsUse() {
		return isUse;
	}
	public void setIsUse(String isUse) {
		this.isUse = isUse;
	}

    @Jsonable
    @Column(name = "product_id")
    @Property(name = "款式Id")
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
}
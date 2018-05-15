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
 * @Description 产品（款式）基本信息表
 * @author 
 * @date 2018-5-15 2:10:46
 */
@Entity
@Table(name = "m_product_info")
@Component("com.craft.entity.ProductInfo")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Property(name = "产品（款式）基本信息表")
public class ProductInfoModel extends BaseModelSupport {
    private String name;    //名称

    private String productDescription;    //描述

    private String productPhoto;    //图片

    private String isUse;    //是否使用，0：暂停使用，1：开启使用

    private String companyId;    //公司Id


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
    @Column(name = "product_description")
    @Property(name = "描述")
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

    @Jsonable
    @Column(name = "product_photo")
    @Property(name = "图片")
	public String getProductPhoto() {
		return productPhoto;
	}
	public void setProductPhoto(String productPhoto) {
		this.productPhoto = productPhoto;
	}

    @Jsonable
    @Column(name = "is_use")
    @Property(name = "是否使用，0：暂停使用，1：开启使用")
	public String getIsUse() {
		return isUse;
	}
	public void setIsUse(String isUse) {
		this.isUse = isUse;
	}

    @Jsonable
    @Column(name = "company_id")
    @Property(name = "公司Id")
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
}
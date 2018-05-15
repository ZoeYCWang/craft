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
 * @Description 产品（款式）组成成分关系表
 * @author 
 * @date 2018-5-15 2:10:44
 */
@Entity
@Table(name = "m_product_component_rela")
@Component("com.craft.entity.ProductComponentRela")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Property(name = "产品（款式）组成成分关系表")
public class ProductComponentRelaModel extends BaseModelSupport {
    private String productId;    //产品Id

    private String componentId;    //组成成分Id

    private String componentType;    //组成成分类型，分别为：0,1,2,3,4    对应表component_info的type

    private String componentFomula;    //组成成分公式，由加减乘除以及商品变量名（m_goods_variable_info)组成的公式

    private String productPhoto;    //图片


    @Jsonable
    @Column(name = "product_id")
    @Property(name = "产品Id")
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

    @Jsonable
    @Column(name = "component_id")
    @Property(name = "组成成分Id")
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

    @Jsonable
    @Column(name = "component_type")
    @Property(name = "组成成分类型，分别为：0,1,2,3,4    对应表component_info的type")
	public String getComponentType() {
		return componentType;
	}
	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

    @Jsonable
    @Column(name = "component_fomula")
    @Property(name = "组成成分公式，由加减乘除以及商品变量名（m_goods_variable_info)组成的公式")
	public String getComponentFomula() {
		return componentFomula;
	}
	public void setComponentFomula(String componentFomula) {
		this.componentFomula = componentFomula;
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
	
}
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
 * @Description 基本组成成分材料基本信息表
 * @author 
 * @date 2018-5-15 2:10:38
 */
@Entity
@Table(name = "m_component_info")
@Component("com.craft.entity.ComponentInfo")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Property(name = "基本组成成分材料基本信息表")
public class ComponentInfoModel extends BaseModelSupport {
    private String name;    //名称

    private String description;    //描述

    private String photo;    //图片

    private String type;    //基本成分类型：0：铁，1：木板，2：玻璃，3：大理石，4：纸箱

    private String isUse;    //是否使用，0：暂停使用，1：开启使用

    private String unitPrice;    //单价

    private Integer cartonLength;    //长

    private Integer cartonWidth;    //宽

    private Integer cartonHeight;    //高

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
    @Column(name = "description")
    @Property(name = "描述")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

    @Jsonable
    @Column(name = "photo")
    @Property(name = "图片")
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

    @Jsonable
    @Column(name = "type")
    @Property(name = "基本成分类型：0：铁，1：木板，2：玻璃，3：大理石，4：纸箱")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
    @Column(name = "unit_price")
    @Property(name = "单价")
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

    @Jsonable
    @Column(name = "carton_length")
    @Property(name = "长")
	public Integer getCartonLength() {
		return cartonLength;
	}
	public void setCartonLength(Integer cartonLength) {
		this.cartonLength = cartonLength;
	}

    @Jsonable
    @Column(name = "carton_width")
    @Property(name = "宽")
	public Integer getCartonWidth() {
		return cartonWidth;
	}
	public void setCartonWidth(Integer cartonWidth) {
		this.cartonWidth = cartonWidth;
	}

    @Jsonable
    @Column(name = "carton_height")
    @Property(name = "高")
	public Integer getCartonHeight() {
		return cartonHeight;
	}
	public void setCartonHeight(Integer cartonHeight) {
		this.cartonHeight = cartonHeight;
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
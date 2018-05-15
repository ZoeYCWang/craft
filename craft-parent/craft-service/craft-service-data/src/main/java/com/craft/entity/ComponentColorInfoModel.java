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
 * @Description 组成成分颜色信息
 * @author 
 * @date 2018-5-15 2:10:37
 */
@Entity
@Table(name = "m_component_color_info")
@Component("com.craft.entity.ComponentColorInfo")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Property(name = "组成成分颜色信息")
public class ComponentColorInfoModel extends BaseModelSupport {
    private String name;    //名称

    private String code;    //编码

    private String value;    //颜色值（十六进制）

    private String description;    //描述

    private String type;    //基本成分类型，0：铁，1：木板，2：玻璃，3：大理石

    private String isUse;    //是否可用，0：关闭使用，1：可以使用

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
    @Column(name = "code")
    @Property(name = "编码")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

    @Jsonable
    @Column(name = "value")
    @Property(name = "颜色值（十六进制）")
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
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
    @Column(name = "type")
    @Property(name = "基本成分类型，0：铁，1：木板，2：玻璃，3：大理石")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
    @Column(name = "company_id")
    @Property(name = "公司Id")
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
}
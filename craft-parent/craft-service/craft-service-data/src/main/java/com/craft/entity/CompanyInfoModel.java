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
 * @Description 公司基本信息表
 * @author 
 * @date 2018-5-15 2:10:36
 */
@Entity
@Table(name = "m_company_info")
@Component("com.craft.entity.CompanyInfo")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Property(name = "公司基本信息表")
public class CompanyInfoModel extends BaseModelSupport {
    private String name;    //名称

    private String companyDescription;    //公司简介描述

    private String companyAddr;    //公司地址

    private String isUse;    //是否可用，0：关闭使用，1：可以使用


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
    @Column(name = "company_description")
    @Property(name = "公司简介描述")
	public String getCompanyDescription() {
		return companyDescription;
	}
	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}

    @Jsonable
    @Column(name = "company_addr")
    @Property(name = "公司地址")
	public String getCompanyAddr() {
		return companyAddr;
	}
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
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
	
}
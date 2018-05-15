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
 * @Description 
 * @author 
 * @date 2018-5-15 2:10:47
 */
@Entity
@Table(name = "m_role_info")
@Component("com.craft.entity.RoleInfo")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Property(name = "")
public class RoleInfoModel extends BaseModelSupport {
    private String name;    //名称

    private String roleCode;    //角色编码

    private String roleDescription;    //角色说明

    private String roleLoginPage;    //角色登录页

    private String roleLevel;    //角色级别


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
    @Column(name = "role_code")
    @Property(name = "角色编码")
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

    @Jsonable
    @Column(name = "role_description")
    @Property(name = "角色说明")
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

    @Jsonable
    @Column(name = "role_login_page")
    @Property(name = "角色登录页")
	public String getRoleLoginPage() {
		return roleLoginPage;
	}
	public void setRoleLoginPage(String roleLoginPage) {
		this.roleLoginPage = roleLoginPage;
	}

    @Jsonable
    @Column(name = "role_level")
    @Property(name = "角色级别")
	public String getRoleLevel() {
		return roleLevel;
	}
	public void setRoleLevel(String roleLevel) {
		this.roleLevel = roleLevel;
	}
	
}
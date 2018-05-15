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
 * @Description 用户基本信息表
 * @author 
 * @date 2018-5-15 2:10:48
 */
@Entity
@Table(name = "m_user_info")
@Component("com.craft.entity.UserInfo")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Property(name = "用户基本信息表")
public class UserInfoModel extends BaseModelSupport {
    private String name;    //名称

    private String password;    //密码

    private String roleId;    //角色Id，一个用户只有一个角色

    private String sex;    //性别

    private String age;    //年龄

    private String salt;    //盐加密

    private String photoPath;    //用户头像

    private String phone;    //用户手机

    private String email;    //用户邮箱

    private String openId;    //用户微信

    private String addr;    //用户地址

    private String userType;    //用户类型，0：加工厂  1：公司所属

    private String userSource;    //用户来源，0：平台生成 1：公司生成，2：注册生成，3：邀请生成


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
    @Column(name = "password")
    @Property(name = "密码")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    @Jsonable
    @Column(name = "role_id")
    @Property(name = "角色Id，一个用户只有一个角色")
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

    @Jsonable
    @Column(name = "sex")
    @Property(name = "性别")
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

    @Jsonable
    @Column(name = "age")
    @Property(name = "年龄")
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

    @Jsonable
    @Column(name = "salt")
    @Property(name = "盐加密")
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}

    @Jsonable
    @Column(name = "photo_path")
    @Property(name = "用户头像")
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

    @Jsonable
    @Column(name = "phone")
    @Property(name = "用户手机")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

    @Jsonable
    @Column(name = "email")
    @Property(name = "用户邮箱")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

    @Jsonable
    @Column(name = "open_id")
    @Property(name = "用户微信")
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

    @Jsonable
    @Column(name = "addr")
    @Property(name = "用户地址")
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

    @Jsonable
    @Column(name = "user_type")
    @Property(name = "用户类型，0：加工厂  1：公司所属")
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

    @Jsonable
    @Column(name = "user_source")
    @Property(name = "用户来源，0：平台生成 1：公司生成，2：注册生成，3：邀请生成")
	public String getUserSource() {
		return userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}
	
}
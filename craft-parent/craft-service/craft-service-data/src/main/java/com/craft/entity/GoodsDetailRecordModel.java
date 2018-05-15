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
 * @date 2018-5-15 2:10:39
 */
@Entity
@Table(name = "m_goods_detail_record")
@Component("com.craft.entity.GoodsDetailRecord")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Property(name = "商品基本信息")
public class GoodsDetailRecordModel extends BaseModelSupport {
    private String goodsId;    //商品Id

    private String type;    //详情类型，0：铁详情，1：木板详情，2：玻璃详情，3：大理石详情，4：纸箱详情，5现货详情

    private String makeUser;    //制造人

    private String colorVal;    //颜色

    private Date dateline;    //截止时间

    private String dataDetail;    //数据详情


    @Jsonable
    @Column(name = "goods_id")
    @Property(name = "商品Id")
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

    @Jsonable
    @Column(name = "type")
    @Property(name = "详情类型，0：铁详情，1：木板详情，2：玻璃详情，3：大理石详情，4：纸箱详情，5现货详情")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

    @Jsonable
    @Column(name = "make_user")
    @Property(name = "制造人")
	public String getMakeUser() {
		return makeUser;
	}
	public void setMakeUser(String makeUser) {
		this.makeUser = makeUser;
	}

    @Jsonable
    @Column(name = "color_val")
    @Property(name = "颜色")
	public String getColorVal() {
		return colorVal;
	}
	public void setColorVal(String colorVal) {
		this.colorVal = colorVal;
	}

    @Jsonable
    @Column(name = "dateline")
    @Property(name = "截止时间")
	public Date getDateline() {
		return dateline;
	}
	public void setDateline(Date dateline) {
		this.dateline = dateline;
	}

    @Jsonable
    @Column(name = "data_detail")
    @Property(name = "数据详情")
	public String getDataDetail() {
		return dataDetail;
	}
	public void setDataDetail(String dataDetail) {
		this.dataDetail = dataDetail;
	}
	
}
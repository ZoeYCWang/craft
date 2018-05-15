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
 * @Description 商品变量值
 * @author 
 * @date 2018-5-15 2:10:42
 */
@Entity
@Table(name = "m_goods_variable_record")
@Component("com.craft.entity.GoodsVariableRecord")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Property(name = "商品变量值")
public class GoodsVariableRecordModel extends BaseModelSupport {
    private String goodsId;    //商品Id

    private String variableId;    //变量Id

    private Double value;    //商品变量值


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
    @Column(name = "variable_id")
    @Property(name = "变量Id")
	public String getVariableId() {
		return variableId;
	}
	public void setVariableId(String variableId) {
		this.variableId = variableId;
	}

    @Jsonable
    @Column(name = "value")
    @Property(name = "商品变量值")
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
}
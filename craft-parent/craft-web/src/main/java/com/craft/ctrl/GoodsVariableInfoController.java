package com.craft.ctrl;


import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.GoodsVariableInfoService;
import com.craft.entity.GoodsVariableInfoModel;
import java.util.List;

@Controller("com.craft.ctrl.GoodsVariableInfo.ctrl")
@RequestMapping(value="/goodsVariableInfo")
public class GoodsVariableInfoController extends BaseController {

	@Autowired
	private GoodsVariableInfoService goodsVariableInfoService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return goodsVariableInfoService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(GoodsVariableInfoModel model){
		return goodsVariableInfoService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return goodsVariableInfoService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(GoodsVariableInfoModel model){
		return goodsVariableInfoService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<GoodsVariableInfoModel> models){
		return goodsVariableInfoService.saveList(models,this.getToken());
	}

}

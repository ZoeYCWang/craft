package com.craft.ctrl;


import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.GoodsInfoService;
import com.craft.entity.GoodsInfoModel;
import java.util.List;

@Controller("com.craft.ctrl.GoodsInfo.ctrl")
@RequestMapping(value="/goodsInfo")
public class GoodsInfoController extends BaseController {

	@Autowired
	private GoodsInfoService goodsInfoService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return goodsInfoService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(GoodsInfoModel model){
		return goodsInfoService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return goodsInfoService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(GoodsInfoModel model){
		return goodsInfoService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<GoodsInfoModel> models){
		return goodsInfoService.saveList(models,this.getToken());
	}

}

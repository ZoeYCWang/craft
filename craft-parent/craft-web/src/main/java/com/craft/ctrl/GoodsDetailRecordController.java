package com.craft.ctrl;


import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.GoodsDetailRecordService;
import com.craft.entity.GoodsDetailRecordModel;
import java.util.List;

@Controller("com.craft.ctrl.GoodsDetailRecord.ctrl")
@RequestMapping(value="/goodsDetailRecord")
public class GoodsDetailRecordController extends BaseController {

	@Autowired
	private GoodsDetailRecordService goodsDetailRecordService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return goodsDetailRecordService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(GoodsDetailRecordModel model){
		return goodsDetailRecordService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return goodsDetailRecordService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(GoodsDetailRecordModel model){
		return goodsDetailRecordService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<GoodsDetailRecordModel> models){
		return goodsDetailRecordService.saveList(models,this.getToken());
	}

}

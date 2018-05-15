package com.craft.ctrl;


import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.GoodsVariableRecordService;
import com.craft.entity.GoodsVariableRecordModel;
import java.util.List;

@Controller("com.craft.ctrl.GoodsVariableRecord.ctrl")
@RequestMapping(value="/goodsVariableRecord")
public class GoodsVariableRecordController extends BaseController {

	@Autowired
	private GoodsVariableRecordService goodsVariableRecordService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return goodsVariableRecordService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(GoodsVariableRecordModel model){
		return goodsVariableRecordService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return goodsVariableRecordService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(GoodsVariableRecordModel model){
		return goodsVariableRecordService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<GoodsVariableRecordModel> models){
		return goodsVariableRecordService.saveList(models,this.getToken());
	}

}

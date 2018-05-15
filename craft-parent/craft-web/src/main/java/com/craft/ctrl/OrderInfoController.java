package com.craft.ctrl;


import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.OrderInfoService;
import com.craft.entity.OrderInfoModel;
import java.util.List;

@Controller("com.craft.ctrl.OrderInfo.ctrl")
@RequestMapping(value="/orderInfo")
public class OrderInfoController extends BaseController {

	@Autowired
	private OrderInfoService orderInfoService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return orderInfoService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(OrderInfoModel model){
		return orderInfoService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return orderInfoService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(OrderInfoModel model){
		return orderInfoService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<OrderInfoModel> models){
		return orderInfoService.saveList(models,this.getToken());
	}

}

package com.craft.ctrl;


import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.ComponentColorInfoService;
import com.craft.entity.ComponentColorInfoModel;
import java.util.List;

@Controller("com.craft.ctrl.ComponentColorInfo.ctrl")
@RequestMapping(value="/componentColorInfo")
public class ComponentColorInfoController extends BaseController {

	@Autowired
	private ComponentColorInfoService componentColorInfoService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return componentColorInfoService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(ComponentColorInfoModel model){
		return componentColorInfoService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return componentColorInfoService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(ComponentColorInfoModel model){
		return componentColorInfoService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<ComponentColorInfoModel> models){
		return componentColorInfoService.saveList(models,this.getToken());
	}

}

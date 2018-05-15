package com.craft.ctrl;


import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.RoleInfoService;
import com.craft.entity.RoleInfoModel;
import java.util.List;

@Controller("com.craft.ctrl.RoleInfo.ctrl")
@RequestMapping(value="/roleInfo")
public class RoleInfoController extends BaseController {

	@Autowired
	private RoleInfoService roleInfoService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return roleInfoService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(RoleInfoModel model){
		return roleInfoService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return roleInfoService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(RoleInfoModel model){
		return roleInfoService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<RoleInfoModel> models){
		return roleInfoService.saveList(models,this.getToken());
	}

}

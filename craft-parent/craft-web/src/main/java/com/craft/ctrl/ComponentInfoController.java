package com.craft.ctrl;


import com.zoe.snow.context.aop.AccessAspect;
import com.zoe.snow.crud.Result;
import com.zoe.snow.dao.hibernate.SessionManageImpl;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.ComponentInfoService;
import com.craft.entity.ComponentInfoModel;
import java.util.List;

@Controller("com.craft.ctrl.ComponentInfo.ctrl")
@RequestMapping(value="/componentInfo")
public class ComponentInfoController extends BaseController {

	@Autowired
	private ComponentInfoService componentInfoService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return componentInfoService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(ComponentInfoModel model){
		return componentInfoService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return componentInfoService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(ComponentInfoModel model){
		return componentInfoService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<ComponentInfoModel> models){
		return componentInfoService.saveList(models,this.getToken());
	}

}

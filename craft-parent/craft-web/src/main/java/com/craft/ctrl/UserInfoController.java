package com.craft.ctrl;


import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.UserInfoService;
import com.craft.entity.UserInfoModel;
import java.util.List;

@Controller("com.craft.ctrl.UserInfo.ctrl")
@RequestMapping(value="/userInfo")
public class UserInfoController extends BaseController {

	@Autowired
	private UserInfoService userInfoService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return userInfoService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(UserInfoModel model){
		return userInfoService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return userInfoService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(UserInfoModel model){
		return userInfoService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<UserInfoModel> models){
		return userInfoService.saveList(models,this.getToken());
	}

}

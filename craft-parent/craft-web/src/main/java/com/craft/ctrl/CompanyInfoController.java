package com.craft.ctrl;


import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.CompanyInfoService;
import com.craft.entity.CompanyInfoModel;
import java.util.List;

@Controller("com.craft.ctrl.CompanyInfo.ctrl")
@RequestMapping(value="/companyInfo")
public class CompanyInfoController extends BaseController {

	@Autowired
	private CompanyInfoService companyInfoService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return companyInfoService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(CompanyInfoModel model){
		return companyInfoService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return companyInfoService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(CompanyInfoModel model){
		return companyInfoService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<CompanyInfoModel> models){
		return companyInfoService.saveList(models,this.getToken());
	}

}

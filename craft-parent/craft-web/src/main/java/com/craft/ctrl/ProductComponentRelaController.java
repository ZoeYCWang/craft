package com.craft.ctrl;


import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.ProductComponentRelaService;
import com.craft.entity.ProductComponentRelaModel;
import java.util.List;

@Controller("com.craft.ctrl.ProductComponentRela.ctrl")
@RequestMapping(value="/productComponentRela")
public class ProductComponentRelaController extends BaseController {

	@Autowired
	private ProductComponentRelaService productComponentRelaService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return productComponentRelaService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(ProductComponentRelaModel model){
		return productComponentRelaService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return productComponentRelaService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(ProductComponentRelaModel model){
		return productComponentRelaService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<ProductComponentRelaModel> models){
		return productComponentRelaService.saveList(models,this.getToken());
	}

}

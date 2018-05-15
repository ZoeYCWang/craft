package com.craft.ctrl;


import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.craft.service.ProductInfoService;
import com.craft.entity.ProductInfoModel;
import java.util.List;

@Controller("com.craft.ctrl.ProductInfo.ctrl")
@RequestMapping(value="/productInfo")
public class ProductInfoController extends BaseController {

	@Autowired
	private ProductInfoService productInfoService;

	@ResponseBody
	@RequestMapping("/find/by/id")
	public Object saveFormInfo(String id){
		return productInfoService.findById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save")
	public Object save(ProductInfoModel model){
		return productInfoService.save(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/delete/by/id")
	public Object deleteById(String id){
		return productInfoService.deleteById(id,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/update")
	public Object update(ProductInfoModel model){
		return productInfoService.update(model,this.getToken());
	}

	@ResponseBody
	@RequestMapping("/save/batch")
	public Object saveList(List<ProductInfoModel> models){
		return productInfoService.saveList(models,this.getToken());
	}

}

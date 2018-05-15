package com.craft.service.impl;

import com.zoe.snow.bean.BeanFactory;
import com.zoe.snow.context.aop.annotation.Statistics;
import com.zoe.snow.crud.CrudService;
import com.zoe.snow.crud.Result;
import com.zoe.snow.message.Message;
import com.zoe.snow.model.Model;
import com.zoe.snow.model.annotation.NotNull;
import com.zoe.snow.util.Validator;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.util.List;

/**
 * Created by Administrator on 2018/5/13.
 */
public class SuportServiceImpl<T extends Model> {
    @Statistics
    public Result findById(String id,String token) {
        Result result = new Result();
        CrudService crudService = BeanFactory.getBean(CrudService.class);
        Class<T> tClass = (Class<T>) ((ParameterizedTypeImpl) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Model model= crudService.findById(tClass, id);
        if (Validator.isEmpty(model)){
            result.setResult(null,false, Message.NoExist);
        }else {
            result.setResult(model,true,Message.Success);
        }
        return result;
    }

    @Statistics
    public Result deleteById(String id,String token) {
        Result result = new Result();
        CrudService crudService = BeanFactory.getBean(CrudService.class);
        Class<T> tClass = (Class<T>) ((ParameterizedTypeImpl) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Boolean isSuccess= crudService.deleteById(tClass, id);
        if (isSuccess){
            result.setResult(true,true,Message.Success);
        }else {
            result.setResult(null,false, Message.NoExist);
        }
        return result;
    }

    @Statistics
    @Transactional
    public Result save(@NotNull Model t, String token) {
        Result result = new Result();
        CrudService crudService = BeanFactory.getBean(CrudService.class);
        boolean isSuccess = crudService.save(t);
        if (isSuccess){
            result.setResult(t,true,Message.Success);
        }else {
            result.setResult(null,false,Message.Error);
        }
        return result;
    }

    @Statistics
    @Transactional
    public <M extends Model> Result saveList(List<M> tlist, String token) {
        Result result = new Result();
        CrudService crudService = BeanFactory.getBean(CrudService.class);
        boolean isSuccess = crudService.saveList(tlist);
        if (isSuccess){
            result.setResult(true,true,Message.Success);
        }else {
            result.setResult(null,false,Message.Error);
        }
        return result;
    }

    @Statistics
    @Transactional
    public Result update(@NotNull Model t, String token) {
        Result result = new Result();
        CrudService crudService = BeanFactory.getBean(CrudService.class);
        boolean isSuccess = crudService.update(t);
        if (isSuccess){
            result.setResult(t,true,Message.Success);
        }else {
            result.setResult(null,false,Message.Error);
        }
        return result;
    }


}

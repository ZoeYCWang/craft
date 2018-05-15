package com.craft.service;

import com.zoe.snow.crud.Result;
import com.zoe.snow.model.Model;
import com.zoe.snow.model.annotation.NotNull;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/5/15.
 */
public interface IBaseService {
    public Result findById(String id, String token);

    public Result deleteById(String id,String token);

    public Result save(Model t, String token);

    public <M extends Model> Result saveList(List<M> tlist, String token);

    public Result update(Model t, String token);
}

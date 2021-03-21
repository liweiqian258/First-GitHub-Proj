package com.duele.controller;

import com.duele.DoubleResult;
import com.duele.service.LocalGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：duele-parent
 * 类 名 称：GoodsController
 * 类 描 述：TODO
 * 创建时间：2021/1/25 下午3:18
 * 创 建 人：liweiqian
 */
@RestController
@RequestMapping("/api")
public class GoodsController {

    @Autowired
    private LocalGoodsService goodsService;

    @PostMapping(value="/v/queryGoodsById")
    public DoubleResult findGoodsById(String id)throws Exception{
        DoubleResult result=goodsService.getGoodsById(id);
        return result;
    }

    @PostMapping(value="/v/getGoods/1")
    public DoubleResult sendQgGoodsMessage(String goodsId,String token)throws Exception{
        DoubleResult doubleResult=goodsService.getGoods (goodsId,token);
        return doubleResult;
    }



}

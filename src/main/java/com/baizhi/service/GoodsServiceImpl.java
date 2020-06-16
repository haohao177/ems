package com.baizhi.service;

import com.baizhi.dao.GoodsDAO;
import com.baizhi.entity.Goods;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {
    private GoodsDAO goodsDAO;

    public GoodsDAO getGoods() {
        return goodsDAO;
    }

    public void setGoods(GoodsDAO goods) {
        this.goodsDAO = goods;
    }

    @Override
    public List<Goods> showAllGoods() {
        return goodsDAO.selectGoods();
    }

    @Override
    public void deleteGoods(Integer id) {
        goodsDAO.deletegGoods(id);
    }
}

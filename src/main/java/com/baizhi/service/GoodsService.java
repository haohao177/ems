package com.baizhi.service;

import com.baizhi.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> showAllGoods();
    void deleteGoods(Integer id);
}

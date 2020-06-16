package com.baizhi.dao;

import com.baizhi.entity.Goods;

import java.util.List;

public interface GoodsDAO {
    List<Goods> selectGoods();
    void deletegGoods(Integer id);
}

package com.baizhi.test;

import com.baizhi.dao.GoodsDAO;
import com.baizhi.entity.Goods;
import com.baizhi.service.GoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class goodsText {
    @Test
    public void asd(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-code.xml");
        System.out.println("开始");
        GoodsDAO goodsDAO = (GoodsDAO) cxt.getBean("goodsDAO");
        List<Goods> goods = goodsDAO.selectGoods();
        for (Goods g:goods
             ) {
            System.out.println(g);
        }
    }
    @Test
    public void sadad(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-code.xml");
//        GoodsService goodsService = (GoodsService) cxt.getBean("goodsService");
//        List<Goods> goods = goodsService.showAllGoods();
        GoodsDAO goodsDAO = (GoodsDAO) cxt.getBean("goodsDAO");
        List<Goods> goods = goodsDAO.selectGoods();
        System.out.println(goods);
    }
}

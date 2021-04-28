package com.wbc.service;

import com.wbc.pojo.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GoodsService {

    List<Goods> findGoodsAll();
    Goods findGoodsById(Integer id);
    Page<Goods> findGoodsByPage(Pageable pageable);
    void saveGoods(Goods goods);
    void deleteGoods(Integer id);
    List<Goods> findByName(String name);

}

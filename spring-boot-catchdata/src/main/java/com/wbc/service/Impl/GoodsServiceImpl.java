package com.wbc.service.Impl;

import com.wbc.dao.GoodsRepository;
import com.wbc.pojo.Goods;
import com.wbc.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;



    @Override
    @Cacheable(value = "goods")
    public List<Goods> findGoodsAll() {
        return this.goodsRepository.findAll();
    }

    @Override
    @Cacheable(value = "goods")
    public Goods findGoodsById(Integer id) {
        return this.goodsRepository.findOne(id);
    }

    @Override
    @Cacheable(value = "goods")
    public Page<Goods> findGoodsByPage(Pageable pageable) {
        return this.goodsRepository.findAll(pageable);
    }

    @Override
     @CacheEvict(value = "goods",allEntries = true)
    public void saveGoods(Goods goods) {
        this.goodsRepository.save(goods);
    }

    @Override
    public void deleteGoods(Integer id) {
        this.goodsRepository.delete(id);
    }

    @Override
    @Cacheable(value = "goods")
    public List<Goods> findByName(String name) {

        return this.goodsRepository.findByName(name);
    }
}

package com.wbc.word.service;

import java.util.List;

import com.wbc.word.pojo.Goods;

public interface GoodsService {
	
	List<Goods> selectGoodsAll();
	List<Goods> selectGoodsByuser(Integer uid);

}

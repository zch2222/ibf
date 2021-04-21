package com.wbc.word.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wbc.word.pojo.Goods;

@Mapper
public interface GoodsMapper {
	
	List<Goods> selectGoodsAll();
	
	List<Goods> selectGoodsByuser(Integer uid);
	
	
	
	

}

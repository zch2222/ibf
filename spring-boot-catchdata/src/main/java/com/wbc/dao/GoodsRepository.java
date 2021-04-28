package com.wbc.dao;

import com.wbc.pojo.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods,Integer> {

    List<Goods> findByName(String name);

}

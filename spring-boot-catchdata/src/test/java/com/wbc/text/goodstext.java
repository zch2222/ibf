package com.wbc.text;


import com.wbc.App;
import com.wbc.pojo.Goods;
import com.wbc.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class goodstext {

    @Autowired
    private GoodsService goodsService;

    @Test
    public void testId(){
        System.out.println(this.goodsService.findGoodsById(1));
        System.out.println(this.goodsService.findGoodsById(1));
    }

    @Test
    public void testpage(){
        Pageable pageable=new PageRequest(0,2);
        System.out.println(this.goodsService.findGoodsByPage(pageable).getTotalPages());

    }


    @Test
    public void findall(){

        System.out.println(this.goodsService.findGoodsAll().size());
        List<Goods> goods=this.goodsService.findGoodsAll();
        for (Goods g:goods){
            System.out.println(g.getName());
        }
        List<Goods> goods2=this.goodsService.findGoodsAll();
        for (Goods g:goods2){

            System.out.println(g.getName());
        }


    }
    @Test
    public void addgoods(){
        Goods goods=new Goods();
        goods.setName("凳子");
        Integer price=333;
        goods.setPrice("343");
        goods.setType(32);
        goods.setUserid(2);
        this.goodsService.saveGoods(goods);
        System.out.println(this.goodsService.findGoodsAll().size());

    }

    @Test
    public void  deletegoods(){

        this.goodsService.deleteGoods(5);
    }
}

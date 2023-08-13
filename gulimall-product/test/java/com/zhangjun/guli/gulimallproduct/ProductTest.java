package com.zhangjun.guli.gulimallproduct;

import com.zhangjun.guli.gulimallproduct.entity.BrandEntity;
import com.zhangjun.guli.gulimallproduct.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GulimallProductApplication.class)
public class ProductTest {

    @Autowired
    private BrandService brandService;

    @Test
    public void test(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("siwang");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }
}

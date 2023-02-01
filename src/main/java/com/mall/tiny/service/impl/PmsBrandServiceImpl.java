package com.mall.tiny.service.impl;

import com.github.pagehelper.PageHelper;
import com.mall.tiny.mbg.mapper.PmsBrandMapper;
import com.mall.tiny.mbg.model.PmsBrand;
import com.mall.tiny.mbg.model.PmsBrandExample;
import com.mall.tiny.service.PmsBrandService;
import com.mall.tiny.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PmsBrandService实现类
 * Created by macro on 2019/4/19.
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        pmsBrandExample.setDistinct(true);
        pmsBrandExample.setOrderByClause("sort desc");
//        return brandMapper.selectByExample(new PmsBrandExample());
        return brandMapper.selectByExample(pmsBrandExample);
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
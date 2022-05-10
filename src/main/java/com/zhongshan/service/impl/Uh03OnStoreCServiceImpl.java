package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.service.Uh03OnStoreCService;
import com.zhongshan.mapper.Uh03OnStoreCMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* @author 13427
* @description 针对表【uh03_on_store_c】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class Uh03OnStoreCServiceImpl extends ServiceImpl<Uh03OnStoreCMapper, Uh03OnStoreC>
    implements Uh03OnStoreCService{
@Resource
Uh03OnStoreCMapper uh03OnStoreCMapper;
    @Override
    public List<Uh03OnStoreC> findByZ() {
        List<Uh03OnStoreC> list = uh03OnStoreCMapper.queryZ();
        return list;
    }

    @Override
    public List<Uh03OnStoreC> findByH() {
        List<Uh03OnStoreC> list = uh03OnStoreCMapper.queryH();
        return list;
    }

    @Override
    public List<Uh03OnStoreC> findAll() {
        List<Uh03OnStoreC> list=uh03OnStoreCMapper.queryAll();
        return list;
    }

    @Override
    public List<Uh03OnStoreC> findMN() {
        List<Uh03OnStoreC> list=uh03OnStoreCMapper.queryMN();
        return list;
    }

    @Override
    public List<Uh03OnStoreC> findallList() {
        List<Uh03OnStoreC> list=uh03OnStoreCMapper.findallList();
        return list;
    }

    @Override
    public Integer findSum() {
     Integer uh03OnStoreC=uh03OnStoreCMapper.findSum();
        return uh03OnStoreC;
    }

    @Override
    public List<Uh03OnStoreC> selectMedical() {
        QueryWrapper<Uh03OnStoreC> queryWrapper=new QueryWrapper<>();
        List<Uh03OnStoreC> list=uh03OnStoreCMapper.selectList(null);
        return list;
    }

    @Override
    public Uh03OnStoreC selectQuantity(String mediNo) {
        Uh03OnStoreC uh03OnStoreC=uh03OnStoreCMapper.selectById(mediNo);
        return uh03OnStoreC;
    }
}





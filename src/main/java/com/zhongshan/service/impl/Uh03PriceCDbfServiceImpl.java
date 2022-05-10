package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.entity.Uh03PriceCDbf;
import com.zhongshan.mapper.Uh03OnStoreCMapper;
import com.zhongshan.service.Uh03PriceCDbfService;
import com.zhongshan.mapper.Uh03PriceCDbfMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_price_c_dbf】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class Uh03PriceCDbfServiceImpl extends ServiceImpl<Uh03PriceCDbfMapper, Uh03PriceCDbf>
    implements Uh03PriceCDbfService{
@Resource
Uh03PriceCDbfMapper uh03PriceCDbfMapper;
@Resource
    Uh03OnStoreCMapper uh03OnStoreCMapper;
    @Override
    public int add(Uh03PriceCDbf uh03PriceCDbf) {
        if (uh03PriceCDbfMapper.selectById(uh03PriceCDbf.getMediNo()) == null) {
            int row = uh03PriceCDbfMapper.insert(uh03PriceCDbf);
            if (row > 0) {
                Uh03OnStoreC uh03OnStoreC = new Uh03OnStoreC(uh03PriceCDbf.getMediNo(), uh03PriceCDbf.getUnitPrice(), uh03PriceCDbf.getUnit(), uh03PriceCDbf.getSpecification());
                int row1 = uh03OnStoreCMapper.updateById(uh03OnStoreC);
                return row1;
            }
        } else if (uh03PriceCDbfMapper.selectById(uh03PriceCDbf.getMediNo()) != null){
            int row = uh03PriceCDbfMapper.updateById(uh03PriceCDbf);
            if (row > 0) {
                Uh03OnStoreC uh03OnStoreC = new Uh03OnStoreC(uh03PriceCDbf.getMediNo(), uh03PriceCDbf.getUnitPrice(), uh03PriceCDbf.getUnit(), uh03PriceCDbf.getSpecification());
                int row1 = uh03OnStoreCMapper.updateById(uh03OnStoreC);
                return row1;
            }
        }else {
        return 0;}
    return 0;}

    @Override
    public List<Uh03PriceCDbf> queryAll() {
        List<Uh03PriceCDbf> list=uh03PriceCDbfMapper.queryAll();
        return list;
    }

    @Override
    public List<Uh03PriceCDbf> queryByid(Uh03PriceCDbf uh03PriceCDbf) {

        List<Uh03PriceCDbf> list=uh03PriceCDbfMapper.queryByid(uh03PriceCDbf);
        return list;
    }

    @Override
    public List<Uh03PriceCDbf> selectAllMedicine() {
        return uh03PriceCDbfMapper.selectList(null);
    }

    @Override
    public Uh03PriceCDbf selectQuantity(String medi_name) {
        QueryWrapper<Uh03PriceCDbf> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("medi_name",medi_name);
        Uh03PriceCDbf uh03PriceCDbf=uh03PriceCDbfMapper.selectOne(queryWrapper);
        return uh03PriceCDbf;
    }
}





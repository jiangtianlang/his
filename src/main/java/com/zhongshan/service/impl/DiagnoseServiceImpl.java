package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Diagnose;
import com.zhongshan.service.DiagnoseService;
import com.zhongshan.mapper.DiagnoseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【diagnose】的数据库操作Service实现
* @createDate 2022-04-27 18:13:36
*/
@Service
public class DiagnoseServiceImpl extends ServiceImpl<DiagnoseMapper, Diagnose>
    implements DiagnoseService{
@Resource
DiagnoseMapper diagnoseMapper;
    @Override
    public List<Diagnose> queryAll() {
        List<Diagnose> list=diagnoseMapper.queryAll();
        return list;
    }

    @Override
    public List<Diagnose> findById(Diagnose diagnose) {
        List<Diagnose> list=diagnoseMapper.queryBy(diagnose);
        return list;
    }

    @Override
    public int insert(Diagnose diagnose) {
        int row =diagnoseMapper.insert(diagnose);
        return row;
    }

    @Override
    public int updateBytj(Diagnose diagnose) {
        int row =diagnoseMapper.updateById(diagnose);
        return row;
    }
}





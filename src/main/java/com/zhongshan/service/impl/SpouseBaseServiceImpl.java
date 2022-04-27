package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.SpouseBaseDao;
import com.zhongshan.entity.SpouseBase;
import com.zhongshan.service.SpouseBaseService;
import org.springframework.stereotype.Service;

/**
 * (SpouseBase)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:29
 */
@Service("spouseBaseService")
public class SpouseBaseServiceImpl extends ServiceImpl<SpouseBaseDao, SpouseBase> implements SpouseBaseService {

}

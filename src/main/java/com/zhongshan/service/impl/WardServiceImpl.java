package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.WardMapper;
import com.zhongshan.entity.Ward;
import com.zhongshan.service.WardService;
import org.springframework.stereotype.Service;

/**
 * (Ward)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:32
 */
@Service("wardService")
public class WardServiceImpl extends ServiceImpl<WardMapper, Ward> implements WardService {

}

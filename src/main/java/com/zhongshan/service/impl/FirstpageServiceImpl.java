package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.FirstpageMapper;
import com.zhongshan.entity.Firstpage;
import com.zhongshan.service.FirstpageService;
import org.springframework.stereotype.Service;

/**
 * (Firstpage)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("firstpageService")
public class FirstpageServiceImpl extends ServiceImpl<FirstpageMapper, Firstpage> implements FirstpageService {

}

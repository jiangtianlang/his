package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.FixedAssetsMapper;
import com.zhongshan.entity.FixedAssets;
import com.zhongshan.service.FixedAssetsService;
import org.springframework.stereotype.Service;

/**
 * (FixedAssets)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("fixedAssetsService")
public class FixedAssetsServiceImpl extends ServiceImpl<FixedAssetsMapper, FixedAssets> implements FixedAssetsService {

}

package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.TitleDao;
import com.zhongshan.entity.Title;
import com.zhongshan.service.TitleService;
import org.springframework.stereotype.Service;

/**
 * (Title)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:29
 */
@Service("titleService")
public class TitleServiceImpl extends ServiceImpl<TitleDao, Title> implements TitleService {

}

package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.GoodMapper;
import com.qf.entity.Goods;
import com.qf.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class goodServiceImpl implements IGoodsService {

    @Autowired
    private GoodMapper goodMapper;

    @Override
    public List<Goods> getList() {
        return goodMapper.selectList(null);
    }
}

package com.yangtao.springDemo.service.impl;

import com.yangtao.springDemo.dao.MybatisDao;
import com.yangtao.springDemo.dao.impl.MybatisDaoImpl;
import com.yangtao.springDemo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * @Description: TODO
 * @Author Gao
 * @Date 2018/4/26 16:29
 */
@Service
public class BaseServiceImpl<T> implements BaseService<T> {

    @Resource
    private MybatisDao<T> mybatisDao;



    @Override
    public T selectOneById(Serializable id) {
        return mybatisDao.selectOneById(id);
    }

    @Override
    public int deleteById(Serializable id) {
        return mybatisDao.deleteById(id);
    }

    @Override
    public int insert(T t) {
        return mybatisDao.insert(t);
    }

    @Override
    public int update(T t) {
        return mybatisDao.update(t);
    }

    @Override
    public int insertSelective(T t) {
        return mybatisDao.insertSelective(t);
    }

    @Override
    public int updateSelective(T t) {
        return mybatisDao.updateSelective(t);
    }

    @Override
    public T selectOneByParams(T t) {
        return mybatisDao.selectOneByParams(t);
    }

    @Override
    public List<T> selectListByParams(T t) {
        return mybatisDao.selectListByParams(t);
    }

    @Override
    public List<T> selectListAll() {
        return mybatisDao.selectListAll();
    }

    @Override
    public Integer countByParams(T t) {
        return mybatisDao.countByParams(t);
    }

    @Override
    public Integer countAll() {
        return mybatisDao.countAll();
    }
}

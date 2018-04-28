package com.yangtao.springDemo.service.impl;

import com.yangtao.springDemo.dao.MybatisDao;
import com.yangtao.springDemo.service.BaseService;
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
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Resource
    protected MybatisDao<T> mybatisDao;

    private String getMapperNameSpace(){
        return this.getClass().getName();
    }

    @Override
    public T selectOneById(Serializable id) {

        return mybatisDao.selectOneById(getMapperNameSpace(), id);
    }

    @Override
    public int deleteById(Serializable id) {
        return mybatisDao.deleteById(this.getMapperNameSpace(), id);
    }

    @Override
    public int insert(T t) {
        return mybatisDao.insert(this.getMapperNameSpace(), t);
    }

    @Override
    public int update(T t) {
        return mybatisDao.update(this.getMapperNameSpace(), t);
    }

    @Override
    public int insertSelective(T t) {
        return mybatisDao.insertSelective(this.getMapperNameSpace(), t);
    }

    @Override
    public int updateSelective(T t) {
        return mybatisDao.updateSelective(this.getMapperNameSpace(), t);
    }

    @Override
    public T selectOneByParams(T t) {
        return mybatisDao.selectOneByParams(this.getMapperNameSpace(), t);
    }

    @Override
    public List<T> selectListByParams(T t) {
        return mybatisDao.selectListByParams(this.getMapperNameSpace(), t);
    }

    @Override
    public List<T> selectListAll() {
        return mybatisDao.selectListAll(this.getMapperNameSpace());
    }

    @Override
    public Integer countByParams(T t) {
        return mybatisDao.countByParams(this.getMapperNameSpace(), t);
    }

    @Override
    public Integer countAll() {
        return mybatisDao.countAll(this.getMapperNameSpace());
    }

    protected String getStatement(String sqlId) {
        return this.getClass().getName()+"."+sqlId;
    }
}

package com.yangtao.springDemo.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author Gao
 * @date 2018/4/26 16:25
 */
public interface BaseService<T> {
    /**
     * 根据id获取一个对象
     * @param id sa
     * @return sa
     */
    T selectOneById(Serializable id);

    /**
     * 根据id删除一个对象
     * @param id sa
     *          @return sa
     */
    int deleteById(Serializable id);

    /**
     * 插入对象完整信息
     * @param t
     */
    int insert(T t);

    /**
     * 根据id更新对象所有信息
     * @param t
     */
    int update(T t);

    /**
     * 有选择性的插入这个对象
     * @param t
     */
    int insertSelective(T t);

    /**
     * 根据id有选择性的更新这个对象
     * @param t
     */
    int updateSelective(T t);

    /**
     * 根据对象的非空属性(is not null/'')查询查询一个对象
     * @param t
     * @return
     */
    T selectOneByParams(T t);

    /**
     * 根据对象的非空属性(is not null/'')查询列表信息
     * @param t
     * @return
     */
    List<T> selectListByParams(T t);

    /**
     * 查询对象的全部列表信息
     * @return
     */
    List<T> selectListAll();

    /**
     * 根据对象的非空属性(is not null/'')统计个数
     * @param t
     * @return
     */
    Integer countByParams(T t);

    /**
     * 统计所有个数
     * @return
     */
    Integer countAll();
}

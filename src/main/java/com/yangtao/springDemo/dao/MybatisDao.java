package com.yangtao.springDemo.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Dao接触接口，定义标准
 * @author Administrator
 * @date 2018-4-26
 * @param <T>
 */
public interface MybatisDao<T>{
	
	/**
	 * 根据id获取一个对象
	 * @param id duixiang
	 * @return sa
	 */
	T selectOneById(String fullSqlId, Serializable id);
	
	/**
	 * 根据id删除一个对象
	 * @param id sa
	 */
	int deleteById(String fullSqlId, Serializable id);
	
	/**
	 * 插入对象完整信息
	 * @param t
	 */
	int insert(String fullSqlId, T t);
	
	/**
	 * 根据id更新对象所有信息
	 * @param t
	 */
	int update(String fullSqlId, T t);
	
	/**
	 * 有选择性的插入这个对象
	 * @param t
	 */
	int insertSelective(String fullSqlId, T t);
	
	/**
	 * 根据id有选择性的更新这个对象
	 * @param t
	 */
	int updateSelective(String fullSqlId, T t);
	
	/**
	 * 根据对象的非空属性(is not null/'')查询查询一个对象
	 * @param t
	 * @return sa
	 */
	T selectOneByParams(String fullSqlId, T t);
	
	/**
	 * 根据对象的非空属性(is not null/'')查询列表信息
	 * @param t
	 * @return
	 */
	List<T> selectListByParams(String fullSqlId, T t);
	
	/**
	 * 查询对象的全部列表信息
	 * @return
	 */
	List<T> selectListAll(String fullSqlId);
	
	/**
	 * 根据对象的非空属性(is not null/'')统计个数
	 * @param t
	 * @return
	 */
	Integer countByParams(String fullSqlId, T t);
	
	/**
	 * 统计所有个数
	 * @return
	 */
	Integer countAll(String fullSqlId);

	/**
	 * 自定义示例：
	 * @param stament fullsql
	 * @return
	 */
	Integer custerQuery(String stament);
	
	/**
	 * 增加：
	 * selectPageByParams
	 * selectExist
	 * selectListByIds
	 * deleteByParams
	 * deleteByIds
	 * 可选增加：逻辑删除
	 * logicalDeleteById
	 * logicalDeleteByIds
	 * logicalDeleteByParams
	 */
}

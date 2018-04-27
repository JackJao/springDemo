package com.yangtao.springDemo.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.yangtao.springDemo.dao.MybatisDao;
import org.springframework.stereotype.Repository;

/**
 * 定义接口标准的实现
 * @author Administrator
 *
 * @param <T>
 */
@Repository
public class MybatisDaoImpl<T> extends SqlSessionDaoSupport implements MybatisDao<T>{

	/**
	 * 注入sqlSessionFactory
	 */
	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
	    super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	/**
	 * 拼接完整的sqlId：mapper的命名空间名+sqlId
	 * @param sqlId
	 * @return fullSqlId
	 */
	private String getFullSqlId(String sqlId) {
		return new StringBuffer(this.getClass().getName()).append(sqlId).toString();
	}
	
	@Override
	public T selectOneById(Serializable id) {
		return super.getSqlSession().selectOne(this.getFullSqlId("selectOneById"),id);
	}

	@Override
	public int deleteById(Serializable id) {
		return super.getSqlSession().delete(this.getFullSqlId("deleteById"), id);
	}

	@Override
	public int insert(T t) {
		return super.getSqlSession().insert(this.getFullSqlId("insert"), t);
	}

	@Override
	public int update(T t) {
		return super.getSqlSession().update(this.getFullSqlId("update"), t);
	}

	@Override
	public int insertSelective(T t) {
		return super.getSqlSession().insert(this.getFullSqlId("insertSelective"), t);
	}

	@Override
	public int updateSelective(T t) {
		return super.getSqlSession().update(this.getFullSqlId("updateSelective"), t);		
	}

	@Override
	public T selectOneByParams(T t) {
		return super.getSqlSession().selectOne(this.getFullSqlId("selectOneByParams"), t);
	}

	@Override
	public List<T> selectListByParams(T t) {
		return super.getSqlSession().selectList(this.getFullSqlId("selectListByParams"), t);
	}

	@Override
	public List<T> selectListAll() {
		return super.getSqlSession().selectList(this.getFullSqlId("selectListAll"));
	}

	@Override
	public Integer countByParams(T t) {
		return super.getSqlSession().selectOne(this.getFullSqlId("countByParams"), t);
	}

	@Override
	public Integer countAll() {
		return super.getSqlSession().selectOne(this.getFullSqlId("countAll"));
	}

}

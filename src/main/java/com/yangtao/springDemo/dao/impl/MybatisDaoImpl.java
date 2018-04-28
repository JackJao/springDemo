package com.yangtao.springDemo.dao.impl;

import com.yangtao.springDemo.dao.MybatisDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 定义接口标准的实现
 * @author Administrator
 *
 * @param <T>
 */
@Repository
public class MybatisDaoImpl<T> implements MybatisDao<T>{

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	/**
	 * 拼接完整的sqlId：mapper的命名空间名+sqlId
	 * @param sqlId
	 * @return fullSqlId
	 */
	private String getFullSqlId(String mapperNameSpace,String sqlId) {
		return new StringBuffer(mapperNameSpace).append(".").append(sqlId).toString();
	}

	@Override
	public T selectOneById(String mapperNameSpace, Serializable id) {
		return sqlSessionTemplate.selectOne(this.getFullSqlId(mapperNameSpace, "selectOneById"),id);
	}

	@Override
	public int deleteById(String mapperNameSpace, Serializable id) {
		return sqlSessionTemplate.delete(this.getFullSqlId(mapperNameSpace, "deleteById"), id);
	}

	@Override
	public int insert(String mapperNameSpace, T t) {
		return sqlSessionTemplate.insert(this.getFullSqlId(mapperNameSpace, "insert"), t);
	}

	@Override
	public int update(String mapperNameSpace, T t) {
		return sqlSessionTemplate.update(this.getFullSqlId(mapperNameSpace, "update"), t);
	}

	@Override
	public int insertSelective(String mapperNameSpace, T t) {
		return sqlSessionTemplate.insert(this.getFullSqlId(mapperNameSpace, "insertSelective"), t);
	}

	@Override
	public int updateSelective(String mapperNameSpace, T t) {
		return sqlSessionTemplate.update(this.getFullSqlId(mapperNameSpace, "updateSelective"), t);
	}

	@Override
	public T selectOneByParams(String mapperNameSpace, T t) {
		return sqlSessionTemplate.selectOne(this.getFullSqlId(mapperNameSpace, "selectOneByParams"), t);
	}

	@Override
	public List<T> selectListByParams(String mapperNameSpace, T t) {
		return sqlSessionTemplate.selectList(this.getFullSqlId(mapperNameSpace, "selectListByParams"), t);
	}

	@Override
	public List<T> selectListAll(String mapperNameSpace) {
		return sqlSessionTemplate.selectList(this.getFullSqlId(mapperNameSpace, "selectListAll"));
	}

	@Override
	public Integer countByParams(String mapperNameSpace, T t) {
		return sqlSessionTemplate.selectOne(this.getFullSqlId(mapperNameSpace, "countByParams"), t);
	}

	@Override
	public Integer countAll(String mapperNameSpace) {
		return sqlSessionTemplate.selectOne(this.getFullSqlId(mapperNameSpace, "countAll"));
	}

	@Override
	public Integer custerQuery(String stament) {
		return sqlSessionTemplate.selectOne(stament);
	}

}

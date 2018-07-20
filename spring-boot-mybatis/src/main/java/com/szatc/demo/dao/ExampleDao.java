package com.szatc.demo.dao;

import com.szatc.demo.domain.Example;
import org.apache.ibatis.annotations.Mapper;

/**
 * 操作example数据表  DAO接口
 * @author Kuhn Wei, email@kuhnwei.com
 * @date 2018/5/21 20:48
 */
@Mapper
public interface ExampleDao extends BaseDao<Example> {


}

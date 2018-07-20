package com.szatc.demo.dao;


import java.util.List;

/**
 * @author Kuhn Wei, email@kuhnwei.com
 * @date 2018/5/22 10:02
 **/
public interface BaseDao<T> {
    /**
     * 插入一条新数据
     * @param t 数据对象
     * @return 插入成功返回：1
     */
    int save(T t);

    /**
     * 根据ID删除一条数据（逻辑删除）
     * @param t 数据对象
     * @return 删除成功返回：1
     */
    int remove(T t);

    /**
     * 根据ID查询数据
     * @param t 数据对象
     * @return T
     */
    T get(T t);

    /**
     * 列表查询
     * @param t 数据对象
     * @return List<T>
     */
    List<T> list(T t);

    /**
     * 统计总记录数
     * @param t 数据对象
     * @return 总记录数
     */
    long count(T t);

    /**
     * 修改信息
     * @param t 数据对象
     * @return 修改成功返回：1
     */
    int update(T t);
}

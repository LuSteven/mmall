package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Created by Steven.Lu on 2018/7/12.
 */
public interface ICategoryService {

    /**
     * 类别新增
     *
     * @param categoryName
     * @param parentId
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:21
     */
    ServerResponse addCategory(String categoryName, Integer parentId);

    /**
     * 更新类别名称
     *
     * @param categoryId
     * @param categoryName
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:21
     */
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    /**
     * 获取当前分类的子分类
     *
     * @param categoryId
     * @return ServerResponse<List   <   Integer>>
     * @author steven.Lu
     * @date 2018-11-28 09:21
     */
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    /**
     * 根据类别编号查询类别以及子类别
     *
     * @param categoryId
     * @return ServerResponse<List   <   Integer>>
     * @author steven.Lu
     * @date 2018-11-28 09:21
     */
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}

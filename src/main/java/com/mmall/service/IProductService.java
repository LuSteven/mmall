package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.vo.ProductDetailVo;

/**
 * Created by Steven.Lu on 2018/7/14.
 */
public interface IProductService {
    /**
     * 产品保存或更新
     *
     * @param product
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse saveOrUpdateProduct(Product product);

    /**
     * 修改产品销售状态
     *
     * @param productId
     * @param status
     * @return ServerResponse<String>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    /**
     * 获取产品详情
     *
     * @param productId
     * @return ServerResponse<ProductDetailVo>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    /**
     * 获取产品列表
     *
     * @param pageNum
     * @param pageSize
     * @return ServerResponse<PageInfo>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

    /**
     * 查找产品
     *
     * @param productName
     * @param productId
     * @param pageNum
     * @param pageSize
     * @return ServerResponse<PageInfo>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<PageInfo> searchProduct(String productName,Integer productId,int pageNum,int pageSize);

    /**
     * 获取产品详情
     *
     * @param productId
     * @return ServerResponse<ProductDetailVo>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    /**
     * 根据关键词查找产品
     *
     * @param keyword
     * @param categoryId
     * @param pageNum
     * @param pageSize
     * @param orderBy
     * @return ServerResponse<PageInfo>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword,Integer categoryId,int pageNum,int pageSize,String orderBy);
}

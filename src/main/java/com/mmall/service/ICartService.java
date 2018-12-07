package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVo;

/**
 * Created by Steven.Lu on 2018/7/16.
 */
public interface ICartService {
    /**
     * 购物车新增
     *
     * @param userId
     * @param productId
     * @param count
     * @return ServerResponse<CartVo>
     * @author steven.Lu
     * @date 2018-11-28 09:34
     */
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

    /**
     * 购物车更新
     *
     * @param userId
     * @param productId
     * @param count
     * @return ServerResponse<CartVo>
     * @author steven.Lu
     * @date 2018-11-28 09:34
     */
    ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);

    /**
     * 购物车删除产品
     *
     * @param userId
     * @param productIds
     * @return ServerResponse<CartVo>
     * @author steven.Lu
     * @date 2018-11-28 09:34
     */
    ServerResponse<CartVo> deleteProduct(Integer userId, String productIds);

    /**
     * 获取购物车列表
     *
     * @param userId
     * @return ServerResponse<CartVo>
     * @author steven.Lu
     * @date 2018-11-28 09:34
     */
    ServerResponse<CartVo> list(Integer userId);

    /**
     * 购物车选中或者不选中
     *
     * @param userId
     * @param productId
     * @param checked
     * @return ServerResponse<CartVo>
     * @author steven.Lu
     * @date 2018-11-28 09:34
     */
    ServerResponse<CartVo> selectOrUnSelect(Integer userId, Integer productId, Integer checked);

    /**
     * 获取购物车产品数量
     *
     * @param userId
     * @return ServerResponse<CartVo>
     * @author steven.Lu
     * @date 2018-11-28 09:34
     */
    ServerResponse<Integer> getCartProductCount(Integer userId);
}

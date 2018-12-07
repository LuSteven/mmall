package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Shipping;

/**
 * Created by Steven.Lu on 2018/7/21.
 */
public interface IShippingService {

    /**
     * 新增地址
     *
     * @param userId
     * @param shipping
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse add(Integer userId, Shipping shipping);

    /**
     * 删除地址
     *
     * @param userId
     * @param shippingId
     * @return ServerResponse<String>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<String> del(Integer userId,Integer shippingId);

    /**
     * 更新地址
     *
     * @param userId
     * @param shipping
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse update(Integer userId, Shipping shipping);

    /**
     * 地址查询
     *
     * @param userId
     * @param shippingId
     * @return ServerResponse<Shipping>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    /**
     * 地址列表
     *
     * @param userId
     * @param pageNum
     * @param pageSize
     * @return ServerResponse<Shipping>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}

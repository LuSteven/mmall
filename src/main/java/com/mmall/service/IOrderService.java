package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.vo.OrderVo;

import java.util.Map;

/**
 * @author Steven.Lu
 * Created by Steven.Lu on 2018/8/2.
 */
public interface IOrderService {
    /**
     * 支付功能
     *
     * @param orderNo
     * @param userId
     * @param path
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse pay(Long orderNo, Integer userId, String path);

    /**
     * 阿里支付回调
     *
     * @param params
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse aliCallback(Map<String, String> params);

    /**
     * 查询订单支付状态
     *
     * @param userId
     * @param OrderNo
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse queryOrderPayStatus(Integer userId, Long OrderNo);

    /**
     * 创建订单
     *
     * @param userId
     * @param shippingId
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse createOrder(Integer userId, Integer shippingId);

    /**
     * 取消订单
     *
     * @param userId
     * @param orderNo
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<String> cancel(Integer userId, Long orderNo);

    /**
     * 获取订单购物车产品
     *
     * @param userId
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse getOrderCartProduct(Integer userId);

    /**
     * 获取订单详情
     *
     * @param userId
     * @param orderNo
     * @return ServerResponse<OrderVo>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo);

    /**
     * 获取订单列表
     *
     * @param userId
     * @param pageNum
     * @param pageSize
     * @return ServerResponse<PageInfo>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize);

    /**
     * 获取订单列表
     *
     * @param pageNum
     * @param pageSize
     * @return ServerResponse<PageInfo>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<PageInfo> manageList(int pageNum, int pageSize);

    /**
     * 获取订单详情
     *
     * @param orderNo
     * @return ServerResponse<OrderVo>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<OrderVo> manageDetail(Long orderNo);

    /**
     * 订单查询
     *
     * @param orderNo
     * @param pageNum
     * @param pageSize
     * @return ServerResponse<PageInfo>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<PageInfo> manageSearch(Long orderNo, int pageNum, int pageSize);

    /**
     * 订单发货
     *
     * @param orderNo
     * @return ServerResponse<String>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<String> manageSendGoods(Long orderNo);
}

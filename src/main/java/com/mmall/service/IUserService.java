package com.mmall.service;


import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by Steven.Lu on 2018/6/19.
 */
public interface IUserService {

    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return ServerResponse<User>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<User> login(String username, String password);

    /**
     * 用户注册
     *
     * @param user
     * @return ServerResponse<String>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<String> register(User user);

    /**
     * 检验是否合法
     *
     * @param str
     * @param type
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse checkValid(String str,String type);

    /**
     * 查找密码找回的问题
     *
     * @param username
     * @return ServerResponse
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse selectQuestion(String username);

    /**
     * 检验问题答案是否正确
     *
     * @param username
     * @param question
     * @param answer
     * @return ServerResponse<String>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<String> checkAnswer(String username,String question,String answer);

    /**
     * 密码重置
     *
     * @param username
     * @param passwordNew
     * @param forgetToken
     * @return ServerResponse<String>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<String> forgetResetPassword(java.lang.String username, java.lang.String passwordNew, java.lang.String forgetToken);

    /**
     * 密码更新
     *
     * @param passwordOld
     * @param passwordNew
     * @param user
     * @return ServerResponse<String>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);

    /**
     * 个人信息更新
     *
     * @param user
     * @return ServerResponse<String>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<User> updateInformation(User user);

    /**
     * 获取个人信息
     *
     * @param userId
     * @return ServerResponse<String>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse<User> getInformation(Integer userId);

    /**
     * 检查是否是管理员
     *
     * @param user
     * @return ServerResponse<String>
     * @author steven.Lu
     * @date 2018-11-28 09:57
     */
    ServerResponse checkAdminRole(User user);
}

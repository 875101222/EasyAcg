package com.brahma.service;

import com.brahma.entity.UserDo;
import com.brahma.entity.request.UserBo;
import com.brahma.entity.response.UserVo;

/**
 * 用户服务Service层
 */
public interface UserService {
    /**
     * 创建用户
     *
     * @return 创建成功的用户基本信息
     */
    UserDo create(UserBo params);

    /**
     * 更新用户
     *
     * @param bo 需要更新的用户id
     * @return 更新后的基本用户信息
     */
    UserVo update(UserBo bo);

    /**
     * 删除用户
     *
     * @param userId 需要删除的用户id
     */
    void delete(Integer userId);
}
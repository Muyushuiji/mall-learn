package com.mall.tiny.service;

import com.mall.tiny.mbg.model.UmsAdmin;
import com.mall.tiny.mbg.model.UmsPermission;

import java.util.List;

/**
 * @program: mall-learn
 * @description:
 * @author: hxl
 * @create: 2023-02-23 17:20
 **/
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);
}

package com.mall.tiny.dao;

import com.mall.tiny.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 * Created by macro on 2018/10/8.
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
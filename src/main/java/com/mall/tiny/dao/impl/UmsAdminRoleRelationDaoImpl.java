package com.mall.tiny.dao.impl;

import com.mall.tiny.dao.UmsAdminRoleRelationDao;
import com.mall.tiny.mbg.model.UmsPermission;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: mall-learn
 * @description: 后台用户和角色管理实现类
 * @author: hxl
 * @create: 2023-02-23 18:00
 **/
@Service
public class UmsAdminRoleRelationDaoImpl implements UmsAdminRoleRelationDao {
    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return null;
    }
}

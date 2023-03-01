package com.mall.tiny.dao.impl;

import com.mall.tiny.dao.UmsAdminRoleRelationDao;
import com.mall.tiny.mbg.mapper.UmsPermissionMapper;
import com.mall.tiny.mbg.model.UmsPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: mall-learn
 * @description: 用户权限服务操作类
 * @author: hxl
 * @create: 2023-02-23 18:00
 **/
@Service
public class UmsAdminRoleRelationDaoImpl implements UmsAdminRoleRelationDao {
    @Autowired
    UmsPermissionMapper umsPermissionMapper;

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return umsPermissionMapper.getPermissionList(adminId);
    }
}

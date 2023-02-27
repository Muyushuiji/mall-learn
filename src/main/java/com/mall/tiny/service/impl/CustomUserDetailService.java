package com.mall.tiny.service.impl;

import com.mall.tiny.service.UmsAdminService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: mall-learn
 * @description:
 * @author: hxl
 * @create: 2023-02-27 17:43
 **/
@Service
public class CustomUserDetailService implements UserDetailsService {

    @Resource
    UmsAdminService umsAdminService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}

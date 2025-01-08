package com.coderitl.framework.web.service;

import com.coderitl.common.core.domain.entity.SysUser;
import com.coderitl.common.core.domain.model.LoginUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginUser loginUser = new LoginUser();
        loginUser.setUser(new SysUser(username,"{bcry}$2a$10$fGHYxvq81p.YrT/0ZgWZz.yYqJJUqQhJaTUZDkgiU2U.BiukCWkFS"));
        log.info("get user info by loadUserByUsername...................");
        return loginUser;
    }
}

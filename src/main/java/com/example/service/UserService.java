package com.example.service;

import com.example.common.CommonResult;

/**
 * @author Seyyu
 * @version 1.0
 * @date 2022-9-10
 */
public interface UserService {
    CommonResult queryUserList();
    CommonResult addUser(String username);
    CommonResult delUser(String username);

}

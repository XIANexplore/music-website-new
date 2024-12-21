package com.example.cookie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cookie.common.R;
import com.example.cookie.model.domain.Admin;
import com.example.cookie.model.request.AdminRequest;

import javax.servlet.http.HttpSession;

public interface AdminService extends IService<Admin> {

    R verityPasswd(AdminRequest adminRequest, HttpSession session);
}

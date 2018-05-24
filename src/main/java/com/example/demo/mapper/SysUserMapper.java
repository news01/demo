package com.example.demo.mapper;

import java.util.List;

import com.example.demo.pojo.SysUser;
import com.example.demo.utils.MyMapper;

public interface SysUserMapper extends MyMapper<SysUser> {
	
	/**
	 * 时间：2018年5月5日-下午9:21:26
	 * 作者：news
	 * 描述：查询所有用户
	 */
	public List<SysUser> getAllSysuser();
}
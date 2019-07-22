package com.example.community.utils;

import com.alibaba.fastjson.JSON;

/**
 * 统一请求返回结果封装工具类
 *
 */
public class ResponseUtil {
	
	/**
	 * 返回成功结果
	 * 
	 * @param obj 返回参数对象
	 * @return 成功结果集
	 */
	public static String success(Object obj) {
		ResultInfo resp = new ResultInfo();
		resp.setCode(200);
		resp.setMessage("请求成功");
		resp.setValue(obj);
		return JSON.toJSONString(resp);
	}

	/**
	 * 返回成功结果
	 * 
	 * @param obj 返回参数对象
	 * @param msg 返回信息
	 * @return 成功结果集
	 */
	public static String success(Integer code,String msg, Object obj) {
		ResultInfo resp = new ResultInfo();
		resp.setCode(200);
		resp.setMessage(msg);
		resp.setValue(obj);
		return JSON.toJSONString(resp);
	}

	/**
	 * 返回错误结果
	 * 
	 * @param obj  返回参数对象
	 * @param code 状态码
	 * @param msg  返回信息
	 * @return 失败结果集
	 */
	public static String error(Integer code, String msg, Object obj) {
		ResultInfo resp = new ResultInfo();
		resp.setCode(400);
		resp.setMessage(msg);
		resp.setValue(obj);
		return JSON.toJSONString(resp);
	}

	/**
	 * 返回错误结果
	 * 
	 * @param code 状态码
	 * @param msg  返回信息
	 * @return 失败结果集
	 */
	public static String error(Integer code, String msg) {
		ResultInfo resp = new ResultInfo();
		resp.setCode(code);
		resp.setMessage(msg);
		return JSON.toJSONString(resp);
	}

	/**
	 * 返回错误结果
	 * 
	 * @param code 状态码
	 * @return
	 */
	public static String error(Integer code) {
		ResultInfo resp = new ResultInfo();
		resp.setCode(code);
		return JSON.toJSONString(resp);
	}

}

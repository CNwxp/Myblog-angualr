package com.xpwang.blog.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.xpwang.blog.enity.Result;



/**
 * 返回前端的结果处理类
 */

public class ResultUntil {
	
	/**
	 * 服务端返回结果封装
	 * @param resultCode 返回码
	 * @param resultMesg 返回信息
	 * @param data 返回对象
	 * @return
	 */
	public static ResponseEntity<Result<Object>> Result(String resultCode ,String resultMesg,Object data){
		Result<Object> result = new Result<Object>();
	    result.setCode(resultCode);
	    result.setMesg(resultMesg);
	    result.setData(data);
	    return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	/**
	 * 服务端返回结果封装
	 * @param resultCode 返回码
	 * @param resultMesg 返回信息
	 * @return
	 */
	public static ResponseEntity<Result<Object>> Result(String resultCode ,String resultMesg){
		Result<Object> result = new Result<Object>();
	    result.setCode(resultCode);
	    result.setMesg(resultMesg);
	    return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	/**
	 * 服务端返回结果封装
	 * @param resultCode 返回码
	 * @param resultMesg 返回信息
	 * @param data 返回对象
	 * @param expand1 拓展字段
	 * @return
	 */
	public static ResponseEntity<Result<Object>> Result(String resultCode ,String resultMesg,Object data,String expand1){ 
		Result<Object> result = new Result<Object>();
	    result.setCode(resultCode);
	    result.setMesg(resultMesg);
	    result.setData(data);
	    result.setExpand1(expand1);
	    return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
}

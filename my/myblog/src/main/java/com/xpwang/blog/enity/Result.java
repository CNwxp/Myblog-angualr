package com.xpwang.blog.enity;

/**
 * 返回结果的对象类
 * @param <T>
 */
public class Result<T> {
    private String code;
    private String mesg;
    private T data;
    private String expand1;
    private String expand2; 

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMesg() {
        return mesg;
    }
    public void setMesg(String mesg) {
        this.mesg = mesg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
	public String getExpand1() {
		return expand1;
	}
	public void setExpand1(String expand1) {
		this.expand1 = expand1;
	}
	public String getExpand2() {
		return expand2;
	}
	public void setExpand2(String expand2) {
		this.expand2 = expand2;
	}
    
}

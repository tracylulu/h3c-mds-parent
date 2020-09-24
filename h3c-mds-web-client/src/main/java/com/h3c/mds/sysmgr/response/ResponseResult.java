package com.h3c.mds.sysmgr.response;

/**
 * 响应结果包装类
 * @author sYS2403
 *
 */
public class ResponseResult {

	/**
	 * 状态码
	 */
	private int status;
	/**
	 * 信息
	 */
	private String message;

	/**
	 * 信息
	 */
	private String msg;
	/**
	 * 数据
	 */
	private Object data;
	/**
	 * 个数
	 */
	private long size;
	/**
	 * 表单提交是否成功返回标志，true表示成功，false表示失败
	 */
	private boolean success;
	
	
	public static ResponseResult   success(boolean success, String msg){
		return new ResponseResult(true, msg);
	}
	
	public static ResponseResult   fail(boolean success, String msg){
		return new ResponseResult(false, msg);
	}
	
	public static ResponseResult success(){
		return success(null);
	}
	
	public static ResponseResult success(String message){
		return success(null, message);
	}
	
	public static ResponseResult success(Object data){
		return success(data, "");
	}
	
	public static ResponseResult success(Object data,String message){
		return success(data, message, 0);
	}
	
	public static ResponseResult success(Object data,String message,long size){
		return success(200,message,data,size);
	}
	
	public static ResponseResult success(Object data,long size){
		return success(200,"",data,size);
	}
	
	public static ResponseResult success(int status,String message,Object data,long size){
		return new ResponseResult(status, message, data,size);
	}
	
	public static ResponseResult fail(Object data){
		return fail(data, "");
	}
	
	public static ResponseResult fail(Object data,String message){
		return fail(data, message, 0);
	}
	
	public static ResponseResult fail(Object data,String message,long size){
		return fail(500,message,data,size);
	}
	
	public static ResponseResult fail(int status,String message,Object data,long size){
		return new ResponseResult(status, message, data,size);
	}
	
	public static ResponseResult fail(String message){
		return fail(500, message, null, 0);
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

	public ResponseResult() {
		super();
	}

	public ResponseResult(int status, String message, Object data,long size) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
		this.size = size;
		this.msg = message;
		//先这么处理
		if(200 == status){
			this.success = true;
		}else if(500 == status){
			this.success = false;
		}
	}

	public ResponseResult(boolean success, String msg){
		super();
		this.success = success;
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}

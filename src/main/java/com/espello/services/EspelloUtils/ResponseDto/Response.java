package com.espello.services.EspelloUtils.ResponseDto;

import com.espello.services.EspelloUtils.Enums.ApiResponseStatus;

public class Response<T> {

	private ApiResponseStatus status = ApiResponseStatus.SUCCESS;
	private T data;
	
	public ApiResponseStatus getStatus() {
		return status;
	}
	public void setStatus(ApiResponseStatus status) {
		this.status = status;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Response [status=" + status + ", data=" + data + "]";
	}
	
}

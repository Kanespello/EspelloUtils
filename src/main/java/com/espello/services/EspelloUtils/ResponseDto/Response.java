package com.espello.services.EspelloUtils.ResponseDto;

import com.espello.services.EspelloUtils.Enums.ApiResponseStatus;

public class Response<T> {

	private ApiResponseStatus status = ApiResponseStatus.SUCCESS;
	private T data;
	private String message;
	private Error error;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Error getError() {
		return error;
	}
	public void setError(Error error) {
		this.error = error;
	}
	@Override
	public String toString() {
		return "Response [status=" + status + ", data=" + data + ", message=" + message + ", error=" + error + "]";
	}
}

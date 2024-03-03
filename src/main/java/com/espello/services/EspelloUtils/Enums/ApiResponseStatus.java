package com.espello.services.EspelloUtils.Enums;
import com.fasterxml.jackson.annotation.JsonValue;


public enum ApiResponseStatus {
	SUCCESS("success"),
    FAILED("failed");

    private String value;

    ApiResponseStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    public static ApiResponseStatus getByValue(String value) {
        for (ApiResponseStatus ctaAction : ApiResponseStatus.values()){
            if (ctaAction.getValue().equals(value)){
                return ctaAction;
            }
        }
        throw new UnsupportedOperationException("The code " + value + " is not supported!");
    }
}

package com.demo.project.responseHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class VendorResponseHandler {
    public static ResponseEntity<Object> responseBuilder(String message, HttpStatus httpStatus, Object object){
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("status", httpStatus);
        response.put("data", object);

        return new ResponseEntity<>(response,httpStatus);
    }
}

package com.cdac.controllers;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class RestControllerExceptionHandlerImpl {
    @ExceptionHandler({RuntimeException.class})
	public ResponseEntity<?> handleRunTimeException(RuntimeException ex){
		  Map<String,Object> map= new HashMap<>();
		  map.put("status", "error");
		  map.put("error", ex.getMessage());
		  return ResponseEntity.ok(map);
	}
  
}
package com.deloitte.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class ExceptionControllerAdvice {

	private static final Logger logger = LoggerFactory
			.getLogger(ExceptionControllerAdvice.class);

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler({Exception.class })
	public String serverError(Exception e) {

		logger.error("Execption occured processing the request due to:", e);

		return "error";
	}

}

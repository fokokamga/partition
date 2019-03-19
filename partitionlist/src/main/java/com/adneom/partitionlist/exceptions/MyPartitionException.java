package com.adneom.partitionlist.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyPartitionException extends RuntimeException {
	
	 public MyPartitionException(String s) {

	        super(s);

	    }
}

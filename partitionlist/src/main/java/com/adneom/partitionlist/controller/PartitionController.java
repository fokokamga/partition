package com.adneom.partitionlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adneom.partitionlist.exceptions.MyPartitionException;
import com.adneom.partitionlist.model.Partition;
import com.adneom.partitionlist.service.PartitionService;

@RestController
public class PartitionController {
	
	@Autowired
	private PartitionService partitionService;

	
	@RequestMapping(value = "/Partition", method = RequestMethod.GET ,produces="application/json")
	public <T> List<List<T>> partition(@RequestParam List<T> list, @RequestParam int size) {
		try {
			partitionService.partition(list,size);
		}catch (MyPartitionException e) {
			  System.out.println(e.getMessage());
		}
		
		return new Partition<T>(list, size);
	}
}

package com.adneom.partitionlist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adneom.partitionlist.model.Partition;

@Service
public class PartitionService {
	public <T> List<List<T>> partition(List<T> list, int size) {

	       if (list == null)
	          throw new NullPointerException(
	              "'list' ne doit pas être nulle");
	        if (!(size > 0))
	          throw new IllegalArgumentException(
	              "La taille doit être supérieure à 0");

	        return new Partition<T>(list, size);
	      }
}

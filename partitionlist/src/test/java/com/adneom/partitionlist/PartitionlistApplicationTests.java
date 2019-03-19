package com.adneom.partitionlist;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.adneom.partitionlist.service.PartitionService;
import static org.hamcrest.CoreMatchers.is;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PartitionlistApplicationTests {
	PartitionService myPartition= new PartitionService();
	
	@Test
    public void SplitListWorks() {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        list.add("eleven");
        
        List<List<String>> partition = myPartition.partition(list, 1);
        System.out.println(partition.get(2).size());
        assertTrue(partition.size()==11);
        assertTrue(partition.get(0).size()==1);
        
        partition = myPartition.partition(list, 7);
        assertTrue(partition.size()==2);
        assertTrue(partition.get(0).size()==7);
        assertTrue(partition.get(1).size()==4);

        
    }
	@Test
    public void listIsEpmty() {
		
        List<String> list = new ArrayList<String>();
        assertTrue(list.isEmpty());
        

        
    }
	@Test
    public void listIsNotEpmty() {
		
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        assertFalse(list.isEmpty());
        

        
    }

}

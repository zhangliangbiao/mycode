package com.id.zlb.jvm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*int time = 10;
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = time; i >= 0; i--)
			queue.add(i);
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
			//Thread.sleep(1000);
		}*/
		
		
	
		Queue<String> nodes=new LinkedList<String>();  //存放所有岗位id
        nodes.add("cc");  
        while(!nodes.isEmpty()){  
        	
            String temp =  nodes.poll();  
            Map<String,Object> map=new HashMap<String,Object>();
			map.put("position_id",temp);        
			//查询下一级岗位id集合
			List<String> positionList = new ArrayList<String>();  
			positionList.add("dd");
			if(!positionList.isEmpty()){
				nodes.addAll(positionList);
			}
        }  
	
    }
}

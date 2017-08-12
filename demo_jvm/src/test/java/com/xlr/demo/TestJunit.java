/**
 * 
 */
package com.xlr.demo;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xlr.demo.entity.JvmInfo;
import com.xlr.demo.service.face.JvmLintenerService;
import com.xlr.demo.util.SpringUtils;

/**
 * <p>Title:TestJunit</p>
 * @author xlr
 * @date 2017年6月9日
 */

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring/spring-web.xml"
        })  
public class TestJunit {
	
	ExecutorService executorService = Executors.newCachedThreadPool();
	@Autowired
	JvmLintenerService jvmLintenerService;
	
	@Test
	public void testVersion(){
		JvmInfo jvmInfo =  jvmLintenerService.getJvmInfo();
		System.err.println(jvmInfo.toString());
	}
	
	@Test
	public void testVserIon(){}
		

	/**
	 * bean 的销毁与重新加载 热部署spring组件
	 */
	@Test
	public void testVerMax(){
		
	}
	
	@Test
	public void addOneStr(){
	
	}
	
	public synchronized String addOne(String testStr){
	    String[] strs = testStr.split("[^0-9]");//根据不是数字的字符拆分字符串
	    String numStr = strs[strs.length-1];//取出最后一组数字
	    if(numStr != null && numStr.length()>0){//如果最后一组没有数字(也就是不以数字结尾)，抛NumberFormatException异常
	        int n = numStr.length();//取出字符串的长度
	        int num = Integer.parseInt(numStr)+1;//将该数字加一
	        String added = String.valueOf(num);
	        n = Math.min(n, added.length());
	        //拼接字符串
	        return testStr.subSequence(0, testStr.length()-n)+added;
	    }else{
	        throw new NumberFormatException();
	    }
	}
}

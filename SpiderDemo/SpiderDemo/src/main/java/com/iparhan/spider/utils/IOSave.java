package com.iparhan.spider.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 爬取过来的数据存储到电脑本地
 * @author iparhan
 *
 */
public class IOSave {
	public static void saveDataToFile(String fileName,String data) {  
			BufferedWriter writer = null;  
	        File file = new File("F:\\Financial"+ fileName + ".json");  
	        //创建文件
	        if(!file.exists()){  
	            try {  
	                file.createNewFile();  
	            } catch (IOException e) {  
	                e.printStackTrace();  
	            }  
	        }  
	        //写入内容
	        try {  
	            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,false), "UTF-8"));  
	            writer.write(data);  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }finally {  
	            try {  
	                if(writer != null){  
	                    writer.close();  
	                }  
	            } catch (IOException e) {  
	                e.printStackTrace();  
	            }  
	        }
	        System.out.println("插入成功"); 
		}
          
       
    }  


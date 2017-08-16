package com.charlie1.MutualFundsWebApp;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.charlie1.funds.dao.FundsDAO;
import com.charlie1.funds.model.jPerformanceData;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext("Spring-Module.xml");
        
        	 String risk1 = "1";
        	 String risk2 = "4";
        	 String str="";
        	 
        	 FundsDAO customerDAO = (FundsDAO) context.getBean("FundsDAO");
             str =  customerDAO.buildStrPeformanceData(risk1, risk2);
        
        
    }
}

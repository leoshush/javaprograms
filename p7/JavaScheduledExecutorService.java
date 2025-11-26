package com.mjava.p7;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class JavaScheduledExecutorService {
  public static void main(String[] args)
  {
	  ScheduledExecutorService schedulor = Executors.newSingleThreadScheduledExecutor();
	  
	  Runnable task = () ->{
		  System.out.println(" task executed at : "+System.currentTimeMillis());
	  };
	  
	  schedulor.scheduleAtFixedRate(task,1,2,TimeUnit.SECONDS);
	  
	  schedulor.schedule(()->{
		  schedulor.shutdown();
		  System.out.println("Schedulor went down");
	  },10,TimeUnit.SECONDS);
  }
}

package unit;
import java.io.IOException;



public class mainRun {
	@SuppressWarnings("static-access")
	public static void main(String args[]) throws IOException, InterruptedException { 

		
		
		
		while(true){
			
			 Runcqssc cqssc=new Runcqssc();
			 Thread t2 = new Thread(cqssc.Run()); 
			 t2.sleep(10000);
			 t2.start();
			 
			 Runxync xync=new Runxync();
			 Thread t1 = new Thread(xync.Run()); 
			 t1.sleep(10000);
			 t1.start(); 
			
			 Runpk10 pk10=new Runpk10();
			 Thread t6 = new Thread(pk10.Run()); 
			 t6.sleep(10000);
			 t6.start(); 
		    
			 Rungdkl10 gdkl10=new Rungdkl10();
			 Thread t3 = new Thread(gdkl10.Run()); 
			 t3.sleep(10000);
			 t3.start(); 
			 
			
//			 Runjsk3 jsk3=new Runjsk3();
//			 Thread t4 = new Thread(jsk3.Run()); 
//			 t4.sleep(10000);
//			 t4.start(); 
//			 
//			 
//			 RunK8 k8=new RunK8();
//			 Thread t5 = new Thread(k8.Run());
//			 t5.sleep(20000);
//			 t5.start();       
			 
			 
			
			 
		}
		
       
		//*/
		
		
	} 
}


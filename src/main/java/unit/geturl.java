package unit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class geturl {
	pojo p=new pojo();
	//北京福彩
	//http://www.bwlc.net/
    public pojo getbwlc(String cpname,String cptag) throws IOException {
    	String elms=null;
    	  String urlbj="http://www.bwlc.net/";
    	 // pojo p=new pojo();
		 
	      Document document = Jsoup.connect(urlbj).header("Accept", "*/*")
					.header("Accept-Encoding", "gzip, deflate")
					.header("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
					.header("Referer", urlbj)
					.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0")
					.timeout(5000)
					.get();
	      if(cpname=="PK拾"){
	    	  elms = document.getElementsByClass("game_list cf g_last").text();
	      }else if(cpname=="快乐8"){
	    	  elms = document.getElementsByClass("game_list cf").last().text();
	      }

	      String[] sArray=elms.split("期");

	      String ball=sArray[0].replace(cpname, "");
	      p.setTime("");
	      
	      if (ball != null && !ball.equals("")) {
	    	     //do something
	    	  	p.setIssue(Long.parseLong(ball.trim()));
	    	}else{
	    		p.setIssue((long) 1);
	    	}
	      
	      
	      
	      String[] s= document.getElementsByClass(cptag).text().trim().split(" ") ;
	      

		  List<String> sA= new ArrayList<String>(); 
			
			for(String t : s){  
				sA.add(t);  
			}  
			
			p.setTime(sA.get(0));
			sA.remove(sA.size()-1); 
			
			if(sA != null && !sA.equals("")){
				p.setLotterynumber(sA);
			}else{
				p.setLotterynumber(new ArrayList<String>());
			}
			
	      

	      


	      return p;
		
	}
    
 
    
    //网易彩票
    //http://caipiao.163.com/award
    public pojo get163(String linku,String cpname) throws IOException {
    	String reg = "[\u2E80-\u9FFF]";
    	
		String url163="http://caipiao.163.com/award";
		Connection conn = Jsoup.connect(url163);
		Document document = conn.header("Accept", "*/*")
				.header("Accept-Encoding", "gzip, deflate")
				.header("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
				.header("Referer", url163)
				.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0")
				.timeout(5000)
				.get();
		Elements dc=document.getElementsByTag("tr");
		if(cpname=="江苏快3"){
			for (Element element : dc) {
								
			    if(element.select(".first").select("a").attr("href").equals(linku)) {
			    	
			    	String ballssc=element.text();
			    	String ball=ballssc.replace(cpname, "");
			    	Pattern pat = Pattern.compile(reg);      
			        Matcher mat = pat.matcher(ball);     
			        String repickStr = mat.replaceAll("");    
			        
					String[] sArray=repickStr.split("  ");
					
					
					if (sArray[0].trim() != null && !sArray[0].trim().equals("")) {
			    	     //do something
						 p.setIssue(Long.parseLong(sArray[0].trim()));
			    	}else{
			    		p.setIssue((long) 0);
			    	}
					
					
					
					
					String[] sArray2=sArray[1].split("：");
										
					List<String> sA= new ArrayList<String>(); 
					
					
					String[] s=sArray2[0].split(" ");
					for(String t : s){  
						sA.add(t);  
					}  
					
					p.setTime(sA.get(0));
					sA.remove(0); 
					
					
					p.setLotterynumber(sA);
					
					
			    }
			    
			}
			
		}else{
			
			
			
			
			for (Element element : dc) {
			    
			    if(element.select(".first").select("a").attr("href").equals(linku)) {
			    	
			    	String ballssc=element.text();
			    	Pattern pat = Pattern.compile(reg);      
			        Matcher mat = pat.matcher(ballssc);     
			        String repickStr = mat.replaceAll("");    
			        
					String[] sArray=repickStr.split("  ");
					
					if (sArray[0].trim() != null && !sArray[0].trim().equals("")) {
			    	     //do something
						p.setIssue(Long.parseLong("20"+sArray[0].trim()));
			    	}else{
			    		p.setIssue((long) 0);
			    	}
					
					
					
					
					
					List<String> sA= new ArrayList<String>(); 
					
					String[] s=sArray[1].trim().split(" ");
					for(String t : s){  
						sA.add(t);  
					}  
					p.setTime(sA.get(0));
					sA.remove(0);  
					
					
					p.setLotterynumber(sA);
			    }
			}
			
		}
			return p;
    	
    }
    
    //cailele
    //http://zs.cailele.com/
    public pojo getcailele(String url,boolean type) throws IOException {
    	
    	//String url="http://zs.cailele.com/cqklsf/baseTrend.php";
		Connection conn = Jsoup.connect(url);
			Document document = conn.header("Accept", "*/*")
					.header("Accept-Encoding", "gzip, deflate")
					.header("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
					.header("Referer", url)
					.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0")
					.timeout(5000)
					.get();	
			 
			
			String ball=document.getElementsByClass("split showline").last().getElementsByTag("td").first().text();
			if (ball != null && !ball.equals("")) {
	    	     //do something
				p.setIssue(Long.parseLong(ball)) ;
	    	}else{
	    		p.setIssue((long) 0);
	    	}
			
			

			if(type){

				
				String[] sArray=document.getElementsByClass("split showline").last()
				  .getElementsByClass("yellow")
				  .select("[style]")
				  .text()
				  .split(" ");
				List<String> sA=Arrays.asList(sArray) ;

				 p.setLotterynumber(sA);
			}else{
				String[] s=document.getElementsByClass("split showline").last()
						  .getElementsByClass("yellow")
						  .text()
						  .split(" ");
				
				List<String> sA= Arrays.asList(new String[]{s[0],s[1],s[2]}) ;

				p.setLotterynumber(sA);
				
			}
			  
			  p.setTime("");
			  return p;
    	
    }
    
    //icaile
    //http://zs.cailele.com/
    public pojo geticaile(String url,boolean type) throws IOException {
    	
    	//String cqkl10="http://cqkl10.icaile.com/";
		Connection conn = Jsoup.connect(url);
			Document document = conn.header("Accept", "*/*")
					.header("Accept-Encoding", "gzip, deflate")
					.header("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
					.header("Referer", url)
					.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0")
					.timeout(5000)
					.get();						
			Elements dc=document.getElementsByTag("tr");
			
			if(type){
			for (Element element : dc) {
				if(!element.select(".chart-bg-qh").text().equals("")) {
					
					String ball="20"+element.select(".chart-bg-qh").text();
					if (ball != null && !ball.equals("")) {
			    	     //do something
						p.setIssue(Long.parseLong(ball)) ;
			    	}else{
			    		p.setIssue((long) 0);
			    	}
					
					
					
					
					List<String> sA=Arrays.asList(element.select(".chart-bg-kjhm").text().trim().split(" ")) ;
					p.setLotterynumber(sA);
					
				}
			   
			}
			
			}else{

			for (Element element : dc) {
				if(!element.select(".chart-bg-qh").text().equals("")&&element.select(".chart-bg-qh").text().length()>10) {
					 String ball=element.select(".chart-bg-qh").text();
					 
					if (ball != null && !ball.equals("")) {
			    	     //do something
						p.setIssue(Long.parseLong(ball)) ;
			    	}else{
			    		p.setIssue((long) 0);
			    	}
					 
					 List<String> sA=Arrays.asList(element.select(".chart-bg-qh").next().text().split(",")) ;

					 p.setLotterynumber(sA);
				}
			}
			
			}
			p.setTime("");
			
			
			return p;
    	
    }
    
    
    //pk104
    //https://www.pk104.com/
    //https://www.pk104.com/draw-pk10-today.html
    public pojo getpk104(String url,String cptag,boolean is_delzero)  {
    	
    	
		 
	    Document document;
		try {
			document = Jsoup.connect(url).header("Accept", "*/*")
						.header("Accept-Encoding", "gzip, deflate")
						.header("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
						.header("Referer", url)
						.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0")
						.timeout(6000)
						.get();
			String elms = document.getElementById(cptag).selectFirst("td").text();
		      String[] Arrary= elms.split(" ");
		      p.setTime(Arrary[1]);
		      String ball=Arrary[0];

		      
		      
		      if (ball != null && !ball.equals("")) {
		    	  if(is_delzero){
		    	     //处理掉多出来的0
		    	  	StringBuffer sBuffer = new StringBuffer(ball);
		    	  	sBuffer.deleteCharAt(8);
					p.setIssue(Long.parseLong(sBuffer.toString())) ;
		    	  }else{
		    		  p.setIssue(Long.parseLong(ball)) ;
		    	  }
		    	}else{
		    		p.setIssue((long) 0);
		    	}
		     
		      
		      List<String> sA= Arrays.asList(document.getElementById(cptag).selectFirst("div").text().split(" ")) ;

		      p.setLotterynumber(sA);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	      
	      return p;
	  
    }
    
}

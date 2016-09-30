
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class StringSearch {
	public static void main(String[] args){
		try{		       
		       String path;
		       System.out.println("Enter the file path: ");
		       Scanner input = new Scanner(System.in);                                         //Enter the file path
		       path = input.nextLine();
		       BufferedReader file;
		       FileReader file_temp;
			   file_temp = new FileReader(path);            
		       file = new BufferedReader(file_temp);                                           //Read file from the path
		        String str;
		        int count_hackathon = 0, count_chicago = 0, count_dec = 0, count_java = 0;
		        while((str=file.readLine())!=null){                                            //Read tweets one by one
		        	str = str.toLowerCase();		        	
			        Pattern p1 = Pattern.compile("chicago");                                   //Match pattern for Chicago
			        Matcher m1 = p1.matcher(str);
			        if (m1.find()) { 
			            count_chicago++;	                                    
			        }		        
			        Pattern p2 = Pattern.compile("dec");                                       //Match pattern for Dec
			        Matcher m2 = p2.matcher(str);
			        if (m2.find()) {
			            count_dec++;	
		            }
			        Pattern p3 = Pattern.compile("java");                                      //Match pattern for Java
			        Matcher m3 = p3.matcher(str);
			        if (m3.find()) {
			            count_java++;	
			        }
			        Pattern p4 = Pattern.compile("hackathon");                                 //Match pattern for hackathon
			        Matcher m4 = p4.matcher(str);
			        if (m4.find()) {
			            count_hackathon++;	
			        }
		        }
		        //Output
		        System.out.println("Chicago" + " " + count_chicago); 
		        System.out.println("Dec" + " " + count_dec);
		        System.out.println("Java" + " " + count_java);
		        System.out.println("hackathon" + " " + count_hackathon);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		}
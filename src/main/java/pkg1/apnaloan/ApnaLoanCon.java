package pkg1.apnaloan;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApnaLoanCon {
	public ArrayList<String[]> loadData()throws Exception{
		ArrayList<String[]>trans1=new ArrayList<>();
		File f1=new File("loan.txt");
		Scanner sc1=new Scanner(f1);
		String temp1="";
		String[] arr1 = null;
		while(sc1.hasNext()) {
			temp1=sc1.nextLine();
			arr1=temp1.split(",");
			trans1.add(arr1);
			
		}
		for(int i=0;i<trans1.size();i++) {
			System.out.println(trans1.get(i)[0]+" "+trans1.get(i)[1]+" "+trans1.get(i)[2]);
		}
		return trans1;
	}
	
	@GetMapping("getLedger")
	public ArrayList<String> getAllLedger() throws Exception {
		ArrayList<String[]>trans1=new ArrayList<>();
		ArrayList<String>data=new ArrayList<>();
		trans1=loadData();
		String[] names = {"CS","Shashank","Keerthana","Kathyayini","Sivashankar","Lalu","Tejashwini","Navya","Ashika"};
		String name1="";
		String name2="";
		int amt1=0;
		String s1="";
		for(int i=0;i<trans1.size();i++) {
			name1=names[(Integer.valueOf(trans1.get(i)[0]))-1];
			name2=names[(Integer.valueOf(trans1.get(i)[1]))-1];
			amt1=(Integer.valueOf(trans1.get(i)[2]))*-1;
			s1=name1+" has to return Rs. "+amt1+" to "+name2;
			data.add(s1);
		}
		
		
		return data;
	}	
	
	@GetMapping("/getLedger/{id1}")
	public String getLedger1(@PathVariable int id1) throws Exception {
		ArrayList<String[]>trans1=new ArrayList<>();
		ArrayList<String>trans_1=new ArrayList<>();
		ArrayList<String>trans_5=new ArrayList<>();
		trans1=loadData();
		String[] names = {"CS","Shashank","Keerthana","Kathyayini","Sivashankar","Lalu","Tejashwini","Navya","Ashika"};
		String name1="";
		String name2="";
		String n1="";
		int amt1=0;
		int pos1=0;
		int pos2=0;
		for(int i=0;i<trans1.size();i++) {
			if(id1==(Integer.parseInt(trans1.get(i)[0]))) {
				pos1=Integer.parseInt(trans1.get(i)[0]);
				pos2=Integer.parseInt(trans1.get(i)[1]);
				amt1=Integer.parseInt(trans1.get(i)[2]);
			}
			if((Integer.parseInt(trans1.get(i)[0]))==1) {
				pos1=Integer.parseInt(trans1.get(i)[1]);
//				trans_1.add();
			}
		}
		amt1=amt1*-1;
		name1=names[pos1-1];
		name2=names[pos2-1];
		String s1=name1+" has to return Rs. "+amt1+" to "+name2;
		String s5="CS has borrowed loan from Sivashankar of Rs. 1500";
		return s1;
	}	
	
	@GetMapping("/getLedger/{id1}/{id2}")
	public String getLedger2(@PathVariable int id1, @PathVariable int id2) throws Exception {
		ArrayList<String[]>trans1=new ArrayList<>();
		trans1=loadData();
		String[] names = {"CS","Shashank","Keerthana","Kathyayini","Sivashankar","Lalu","Tejashwini","Navya","Ashika"};
		String name1="";
		String name2="";
		int amt1=0;
		int pos1=0;
		int pos2=0;
		for(int i=0;i<trans1.size();i++) {
			if(id1==(Integer.parseInt(trans1.get(i)[0])) && id2==(Integer.parseInt(trans1.get(i)[1]))) {
				pos1=Integer.parseInt(trans1.get(i)[0]);
				pos2=Integer.parseInt(trans1.get(i)[1]);
				amt1=Integer.parseInt(trans1.get(i)[2]);
			}
		}
		amt1=amt1*-1;
		name1=names[pos1-1];
		name2=names[pos2-1];
		String s1=name1+" has to return Rs. "+amt1+" to "+name2;
		return s1;
		}
}

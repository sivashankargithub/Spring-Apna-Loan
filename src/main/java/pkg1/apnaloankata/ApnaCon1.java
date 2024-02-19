package pkg1.apnaloankata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApnaCon1 {
	@GetMapping("/getLed/{id}")
	public List<String> getLedger(@PathVariable int id) throws Exception{
		List<String[]> list1 = new ArrayList<>();
		List<String> trans_1 = new ArrayList<>();
		List<String> trans_2 = new ArrayList<>();
		List<String> trans_3 = new ArrayList<>();
		List<String> trans_4 = new ArrayList<>();
		List<String> trans_5 = new ArrayList<>();
		List<String> msg = new ArrayList<>();
		msg.add("No record found");
		Integer[] ids= {1,2,3,4,5,6,7,8,9};
		String[] arr1;
		String temp1="";
		String temp2="";
		String s1="give to ";
		String s2="get from ";
		File f1=new File("loan.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			arr1=sc1.nextLine().split(",");
			list1.add(arr1);
		}
		
		for(int i=0;i<list1.size();i++) {
			int t_id=Integer.valueOf(list1.get(i)[0]);
			int g_id=Integer.valueOf(list1.get(i)[1]);
			int amt=Integer.valueOf(list1.get(i)[2])*-1;
			temp1=t_id+" has to "+s1+g_id+" "+amt;
			temp2=g_id+" has to "+s2+t_id+" "+amt;
			if(t_id==1) {
				trans_1.add(temp1);
			}
			if(g_id==1) {
				trans_1.add(temp2);
			}
			if(t_id==2) {
				trans_2.add(temp1);
			}
			if(g_id==2) {
				trans_2.add(temp2);
			}
			if(t_id==3) {
				trans_3.add(temp1);
			}
			if(g_id==3) {
				trans_3.add(temp2);
			}
			if(t_id==4) {
				trans_4.add(temp1);
			}
			if(g_id==4) {
				trans_4.add(temp2);
			}
			if(t_id==5) {
				trans_5.add(temp1);
			}
			if(g_id==5) {
				trans_5.add(temp2);
			}
		}
		if(id==1) {
			return trans_1;
		}
		else if(id==2) {
			return trans_2;
		}
		else if(id==3) {
			return trans_3;
		}
		else if(id==4) {
			return trans_4;
		}
		else if(id==5) {
			return trans_5;
		}
		else {
			return msg;
		}
	}
		
}

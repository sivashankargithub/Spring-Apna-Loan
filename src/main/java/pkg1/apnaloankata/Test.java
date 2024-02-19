package pkg1.apnaloankata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping("/getLedBulb/{id}")
	public List<String> getLedger(@PathVariable int id) throws Exception{
		List<String[]> list1 = new ArrayList<>();
		List<String> trans_1 = new ArrayList<>();
		List<String> trans_2 = new ArrayList<>();
		List<String> trans_3 = new ArrayList<>();
		List<String> trans_4 = new ArrayList<>();
		List<String> trans_5 = new ArrayList<>();
		List<String> msg = new ArrayList<>();
		msg.add("No record found");
		String[][] trans= {{},{},{},{},{},{},{},{},{}};
		String[] names = {"CS","Shashank","Keerthana","Kathyayini","Sivashankar","Lalu","Tejashwini","Navya","Ashika"};
		String[] arr1;
		String temp1="",temp2="", name1,name2, s1="give to ",s2="get from ";
		int t_id, g_id, amt;
		File f1=new File("loan.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			arr1=sc1.nextLine().split(",");
			list1.add(arr1);
		}
		sc1.close();
		for(int i=0;i<list1.size();i++) {
			t_id=Integer.valueOf(list1.get(i)[0]);
			g_id=Integer.valueOf(list1.get(i)[1]);
			amt=Integer.valueOf(list1.get(i)[2])*-1;

			name1=names[t_id-1];
			name2 = names[g_id-1];
			temp1=name1+" has to "+s1+name2+" "+amt;
			temp2=name2+" has to "+s2+name1+" "+amt;
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
		for(int k=0;k<1;k++) {
			for(int j=0;j<1;j++) {
				for(int i=0;i<2;i++) {
					t_id=Integer.valueOf(list1.get(i)[0]);
					g_id=Integer.valueOf(list1.get(i)[1]);
					amt=Integer.valueOf(list1.get(i)[2]);
					name1=names[t_id-1];
					name2 = names[g_id-1];
					temp1=name1+" has to "+s1+name2+" "+amt;
					temp2=name2+" has to "+s2+name1+" "+amt;
					
					if(t_id==1) {
						trans[j][k]=temp1;
					}
					if(g_id==1) {
						trans[j][k+1]=temp2;
					}
				}
			}
		}
		
		
		if(id==1) {
			for(int i=0;i<trans[0].length;i++) {
				
			}
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

package train1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test(dataProvider="data3")
public class DataProviderTest {
	
	public void Data1(int a ,int b){
		System.out.println(a+"hhhhhhhhhh"+b);
		
	}	

	public void Data2(String a,String b){
		System.out.println(a+"+++++++++++++++++"+b);
	}
	@DataProvider(name="data3")
	public static Object[][] da2(Method e){
		
		if(e.getName().equalsIgnoreCase("Data2")){
			return getObjs();
		}
		if(e.getName().equalsIgnoreCase("Data1")){
			return new Object[][]{
					new Object[]{3,5},
					new Object[]{4,5}
				};
		}
		return null;
		
	}
	
	
	public static Object[][] getObjs(){
		Object[][] objs = null;
		File file = new File("./objectData.txt");
		BufferedReader br = null;
		try {
			String str = null;
			br = new BufferedReader(new FileReader(file));
			List<Object[]> list = new ArrayList<Object[]>();
			while((str = br.readLine()) != null){
				String[] strs =str.split(" ");
			    list.add(new Object[]{strs[0],strs[1]});
			}
			
			if(list.size()>0){
				objs = new Object[list.size()][2];
				for (int i = 0; i < list.size(); i++) {
					objs[i] = list.get(i);
				}
			}
			return objs;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return objs;
		}
		
	}
}

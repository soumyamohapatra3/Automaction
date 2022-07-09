package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoDataDriven {

	public static void main(String[] args) {
ArrayList<String>al=new ArrayList<String>();
al.add("https://demo.actitime.com/");
al.add("admin");
al.add("manager");
al.add("admin@actitime.com");
System.out.println(al.get(1));


HashMap<String, String> hs=new HashMap<String, String>();
hs.put("url", "https://demo.actitime.com");
hs.put("username", "admin");
hs.put("email", "admin@actitime.com");
hs.put("password", "manager");
System.out.println (hs.get("email"));
	}

}

package hashmap1;

import java.util.HashMap;

public class Prgm1 {



			public static void main(String[] args) {
				// TODO Auto-generated method stub
				 HashMap hm=new HashMap();
				 hm.put(1,"alan");
				 hm.put(2,"ram");
				 hm.put(3, "sheela");
				 hm.put(1, "balan");
				 System.out.println(hm.entrySet() );
				 System.out.println(hm.containsKey(3));
				 System.out.println(hm.values());
				 System.out.println(hm.keySet());
				 System.out.println(hm.get(3));
	}

}

package com.alpha.session37;

public class Student3Constructor {
		String name;
		int id;
		
		Student3Constructor(String name,int id) 
		{
			this.name=name;
			this.id=id;
		}
		
			
		public String toString() {
				return name +id;
			}
		public int compareTo(Object o) 
		{
			Student3Constructor s2=(Student3Constructor)o;
			if(this.id==id) 
				return 0;
			else if(this.id>id)
				return 1;
			else
				return -1;
			
		} 
			
}


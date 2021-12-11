
package com.alpha.session37;

import java.util.Comparator;

public class ComparatorStudent implements Comparator
{
	
public int compare(Object o1,Object o2)
{
Student3Constructor a1=(Student3Constructor)o1;
Student3Constructor a2=(Student3Constructor)o2;
return a1.name.compareTo(a2.name);
}
}
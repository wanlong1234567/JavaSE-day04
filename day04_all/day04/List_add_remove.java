package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ṩ��һ�����ص�add,remove����
 * Ҳ����ͨ���±����Ԫ��
 * @author adminitartor
 *
 */
public class List_add_remove {
	public static void main(String[] args) {
		List<String> list 
			= new ArrayList<String>();		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * [one,2,two,three,four]
		 */
		list.add(1, "2");
		System.out.println(list);
		
		/*
		 * [one,2,three,four]
		 */
		String old = list.remove(2);
		System.out.println(list);
		System.out.println("��ɾ��Ԫ��:"+old);
		
	}
}







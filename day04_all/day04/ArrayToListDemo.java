package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * @author adminitartor
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four","five"};
		
		List<String> list = Arrays.asList(array);
		System.out.println("size:"+list.size());
		System.out.println(list);
		//�Ըü��ϵ�Ԫ�ز������Ƕ�ԭ����Ԫ�ز���
		list.set(0, "1");
		System.out.println(list);		
		for(String str : array){
			System.out.println(str);
		}
		/*
		 * ����ת���ļ����ǲ������Ԫ�صģ�
		 */
//		list.add("six");
		
		List<String> list1 
			= new ArrayList<String>(list);
	
		System.out.println("list1:"+list1);
		list1.add("six");
		System.out.println("list1:"+list1);
	}
}








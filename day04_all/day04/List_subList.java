package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ȡList�Ӽ�
 * @author adminitartor
 *
 */
public class List_subList {
	public static void main(String[] args) {
		List<Integer> list 
			= new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		/*
		 * [3,4,5,6,7]
		 */
		List<Integer> subList 
			= list.subList(3, 8);
		System.out.println(subList);
		
		//���Ӽ�Ԫ������10��
		for(int i=0;i<subList.size();i++){
			subList.set(i, subList.get(i) * 10);
		}
		System.out.println(subList);
		/*
		 * ���Ӽ���Ԫ�ز������Ƕ�ԭ���϶�ӦԪ��
		 * �Ĳ�����
		 */
		System.out.println(list);
		
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}










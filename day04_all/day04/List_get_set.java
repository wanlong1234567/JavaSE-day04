package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * List��Collection�������ͽӿڡ�
 * List�ǿ��ظ��������������ṩ��һ�׿��Ը���
 * �±����Ԫ�صķ�����
 * 
 * ����ʵ����:
 * java.util.ArrayList:����ʵ�֣���ѯЧ�ʸ�
 * java.util.LinkedList:����ʵ�֣���ɾԪ��Ч�ʸ�
 * ��������β��ɾԪ�ء�
 * @author adminitartor
 *
 */
public class List_get_set {
	public static void main(String[] args) {
		List<String> list 
			= new ArrayList<String>();	
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		/*
		 * E get(int index)
		 * ��ָ���±�����Ӧ��Ԫ�ط���
		 */
		//��ȡ�ڶ���Ԫ�� 
		String str = list.get(1);
		System.out.println(str);
		
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			System.out.println(str);
		}
		
		
		/*
		 * E set(int index,E e)
		 * ������Ԫ���滻������ָ��λ�õ�Ԫ��
		 * �������滻Ԫ�ط��ء�
		 */
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println("���滻��Ԫ��:"+old);
	}
}









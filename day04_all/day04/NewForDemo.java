package day04;
/**
 * ��ѭ��
 * ��ѭ���ֳ�Ϊ:��ǿforѭ����for each
 * ��ѭ���������������������ϻ�����
 * 
 * ��ѭ����JDK1.5֮���Ƴ���һ��������
 * @author adminitartor
 *
 */
public class NewForDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four","five"};
		
		for(int i=0;i<array.length;i++){
			String str = array[i];
			System.out.println(str);
		}
		
		for(String str : array){
			System.out.println(str);
		}
	}
}










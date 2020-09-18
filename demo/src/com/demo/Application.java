package com.demo;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subjects sub0 = new Subjects();
		sub0.setEnglish(100);
		sub0.setHindi(100);
		sub0.setMath(100);
		sub0.setScience(100);
		//sub0.setUrdu(100);
	

		Subjects sub1 = new Subjects();
		sub1.setEnglish(99);
		sub1.setHindi(99);
		sub1.setMath(99);
		sub1.setScience(99);
		sub1.setUrdu(99);
		
		Students sArr[] = new Students[5];
		sArr[0] = new Students();
		sArr[0].setName("Anas");
		sArr[0].setSubject(sub0);

		sArr[1] = new Students();
		sArr[1].setName("Zafar");
		sArr[1].setSubject(sub1);
		
		System.out.println(sArr[0]);
		System.out.println(sArr[1]);
	}

}

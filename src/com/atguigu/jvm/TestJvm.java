package com.atguigu.jvm;

import java.util.Random;

public class TestJvm {

	public static void main(String[] args){
		long maxMemory = Runtime.getRuntime().maxMemory() ;//返回 Java 虚拟机试图使用的最大内存量。
		long totalMemory = Runtime.getRuntime().totalMemory() ;//返回 Java 虚拟机中的内存总量。
		//String str = "jlh";
		Object object = new Object();
		System.out.println("MAX_MEMORY = " + maxMemory + "（字节）、" + (maxMemory / (double)1024 / 1024) + "MB");
		System.out.println("TOTAL_MEMORY = " + totalMemory + "（字节）、" + (totalMemory / (double)1024 / 1024) + "MB");
		//stack();
		String str = "aabb";
	/*	while(true){
			str += str + new Random().nextInt(88888888) + new Random().nextInt(999999999) ;

		}*/
	}

	private static void stack() {
		// TODO Auto-generated method stub
		stack();
	}

}

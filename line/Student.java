package com.line;

public class Student {
	public static void main(String[]args) {
		
		 String s="Java Development Kit";
		 String s1="java Runtime Environment";
		 String s2="Java Development Kit";
		 String s4="java development kit";
		 
		 char charAt=s.charAt(12);
		 System.out.println(charAt);
		 
		 int indexOf=s.indexOf("a");
		 System.out.println(indexOf);
		 
		 String upperCase=s.toUpperCase();
		 System.out.println(upperCase);
		 
		 String lowerCase=s.toLowerCase();
		 System.out.println(lowerCase);
		 
		 boolean startsWith=s.startsWith("Ja");
		 System.out.println(startsWith);
		 
		 boolean endsWith=s.endsWith("Kit");
		 System.out.println(endsWith);
		 
		 boolean empty=s.isEmpty();
		 System.out.println(empty);
		 
		 boolean contains=s.contains("lo");
		 System.out.println(contains);
		 
		 int lastIndexOf=s.lastIndexOf("t");
		 System.out.println(lastIndexOf);
		 
		 boolean equals=s.equals(s2);
		 System.out.println(equals);
		 
		 boolean equalsIgnoreCase=s.equalsIgnoreCase(s4);
		 System.out.println(equalsIgnoreCase);
		 
		 String substring=s4.substring(8);
		 System.out.println(substring);
		 
		 String substring2=s2.substring(2,18);
		 System.out.println(substring2);
		 
		 String[] split = s.split("");
		 for (int i = 0; i < split.length; i++) {
			 System.out.println(split[i]);
			
		}
		 
		 
	   }

	}




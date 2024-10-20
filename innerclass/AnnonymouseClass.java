package com.deloitte.training.innerclass;

public class AnnonymouseClass {

	public static void main(String[] args) {
		Student s1 =new Student(1,"Aniketh");
		System.out.print(s1.getsId());
		Student s3 = new Student(2,"Suresh") {
			public String getsName() {
				return "asthala vista"+ sName;
			}
		};
		System.out.println(s3.getsName());

	}

}

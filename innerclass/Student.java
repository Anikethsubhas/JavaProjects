package com.deloitte.training.innerclass;

public class Student {
		//encapsulation of variable and using getters and setters to initialise and get hte stored value
		 int sId;
		String sName;
		public Student(int sId,String sname) {
			setsId(sId);
			setsName(sname);
		}
		public int getsId() {
			return sId;
		}
		public void setsId(int sId) {
			this.sId = sId;
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}
}

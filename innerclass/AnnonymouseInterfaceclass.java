package com.deloitte.training.innerclass;

public class AnnonymouseInterfaceclass {
	public static void main(String args[]) {
	StudentInfo s1 = new StudentInfo() {

		@Override
		public void printid() {
			// TODO Auto-generated method stub
			System.out.println("id is printed");
		}

		@Override
		public void printname() {
			// TODO Auto-generated method stub
			System.out.println("Name is printed");
			
		}
		
	};
	s1.printid();
	s1.printname();
	StudentInfo s2 = new StudentInfo() {

		@Override
		public void printid() {
			// TODO Auto-generated method stub
			System.out.println("id ");
			
		}

		@Override
		public void printname() {
			// TODO Auto-generated method stub
			System.out.println("name");
			
		}
		
	};
	s2.printid();
	s2.printname();
	
	CarAbstract car1 = new CarAbstract() {

		@Override
		public void carMileage() {
			// TODO Auto-generated method stub
			System.out.println("good mileage");
			
		}
		
		
	};
	car1.carMileage();
	car1.carModel();
	}
}

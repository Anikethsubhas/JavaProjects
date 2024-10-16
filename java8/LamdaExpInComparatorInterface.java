package com.deloitte.training.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.UnaryOperator;

import com.deloitte.training.collections.Student;

public class LamdaExpInComparatorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> obj = new ArrayList<>();
		obj.add(new Student(1, "John Doe"));
        obj.add(new Student(2, "Jane Smith"));
        obj.add(new Student(3, "Mark Taylor"));
        obj.add(new Student(4, "Emily Davis"));
        obj.add(new Student(5, "Michael Johnson"));
        System.out.println(obj.equals(obj));
        Collections.sort(obj,(o1,o2)->o2.getsId()-o1.getsId());
        System.out.println(obj);
        
        obj.removeIf((t)->t.getsId()==4);//this take a predicate interface with a single abstract method of boolean test(class t) this should return a true or false 
        
       
        System.out.println(obj);
        obj.forEach((t)->{
        	System.out.println(t.getsId()+1);
        });
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,23,65,23));
        
        list.replaceAll((t)->t+5);//unaryoperator
        System.out.println(list);
        
	}

}

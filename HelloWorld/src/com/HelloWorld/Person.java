/**
 * 
 */
package com.HelloWorld;

/**
 * @author Ray
 *
 */
public class Person {
	String name ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int age;
	public Person(String name, int age ){
		this.name=this.getName();
		this.age=this.getAge();
	
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}

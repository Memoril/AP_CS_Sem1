package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	
	//constructors
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String a) {
		name = a;
		age = 1;
		breed = "big red dog";
	}
	public Dog(String a, String b) {
		name = a;
		age = 1;
		breed = b;
	}
	public Dog(String a, int b) {
		name = a;
		age = b;
		breed = "big dog";
	}
	
	//methods
	public void setName(String a){
		name = a;
	}
	public void setAge(int a){
		age = a;
	}
	public void setBreed(String a){
		breed = a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	
	//methods pt 2
	public boolean isSleeping(){
		int x = (int) (Math.random() * 2 + 1);
		if (x == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name + " barks!");
	}
}

package in.fi.file;
import java.io.Serializable; 
public class Data implements Serializable // tagging / 

{ 
 String name; 
 
int age; 
 
float salary; 
public String getName() { 
 return name; 
 } 
public void setName(String name) { 
 this.name = name; 
 } 
public int getAge() { 
 return age; 
 } 
public void setAge(int age) { 
 this.age = age; 
 } 
public float getSalary() { 
 return salary; 
 } 
public void setSalary(float salary) { 
 this.salary = salary; 
 }  
}
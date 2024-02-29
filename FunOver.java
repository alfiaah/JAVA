
import java.io.*;
class Person{
    int age;
    String name;
    public void read()
    {
        DataInputStream in = new DataInputStream(System.in);
        try {
            System.out.println("Enter the name and age");
            name = in.readLine();
            age = Integer.parseInt(in.readLine());
        } 
        catch(Exception e) 
	{
		System.out.println("Error" + e);
        }
    }
    public void disp()
    {
        System.out.println("Name :  " + name + " Age :" + age);
    }
}
class Teacher extends Person{
    String subj;
    public void read()
    {
        super.read();
        DataInputStream in = new DataInputStream(System.in);
        try {
            System.out.println("Enter the Subject");
            subj = in.readLine();
        } 
        catch(Exception e) {
        }
    }
    public void disp()
    {
        super.disp();
        System.out.println("Subject : " + subj);
    }
}
public class FunOver
{
	public static void main(String[] args) {
		Person p;
		Teacher t;
		p = new Person();
		t = new Teacher();
		p.read();
		t.read();
		p.disp();
		t.disp();
	}
}
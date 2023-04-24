/*WAP to display details of students of your class 
 * Variables used: name,roll,address.
 * Code:
*/


class Student{
    String name;
    int roll;
    String address;


    public static void main(String[] args){

     

        Student st1= new Student();
        Student st2= new Student();
        Student st3= new Student();
        Student st4= new Student();
        Student st5= new Student();
        Student st6= new Student();

        st1.name= "Ajay Dhakal";
        st1.roll= 1;
        st1.address= "Dhakalthok";

        st3.name= "Milan Dhakal";
        st3.roll= 3;
        st3.address= "Argaudi";

        st2.name= "Kusum Tiwari";
        st2.roll= 2;
        st2.address= "Panchamul";

        st4.name= "Punam Dhakal";
        st4.roll= 4;
        st4.address= "Dhakalthok";


        st5.name= "Rasmee Adhikari";
        st5.roll= 5;
        st5.address= "Dhakalthok";


        st6.name= "Rohit Dhakal";
        st6.roll= 6;
        st6.address= "Dhakalthok";


        System.out.println("Student1:"+st1.name +"\n" +"Roll no:"+st1.roll + "\n" + "Address:"+st1.address);
        System.out.println("Student2:"+st2.name +"\n" +"Roll no:"+st2.roll + "\n" + "Address:"+st2.address);
        System.out.println("Student3:"+st3.name +"\n" +"Roll no:"+st3.roll + "\n" + "Address:"+st3.address);
        System.out.println("Student4:"+st4.name +"\n" +"Roll no:"+st4.roll + "\n" + "Address:"+st4.address);
        System.out.println("Student5:"+st5.name +"\n" +"Roll no:"+st5.roll + "\n" + "Address:"+st5.address);
        System.out.println("Student6:"+st6.name +"\n" +"Roll no:"+st6.roll + "\n" + "Address:"+st6.address);
    }
    
}

/*Output:Student1:Ajay Dhakal
Roll no:1
Address:Dhakalthok
Student2:Kusum Tiwari
Roll no:2
Address:Panchamul
Student3:Milan Dhakal
Roll no:3
Address:Argaudi
Student4:Punam Dhakal
Roll no:4
Address:Dhakalthok
Student5:Rasmee Adhikari
Roll no:5
Address:Dhakalthok
Student6:Rohit Dhakal
Roll no:6
Address:Dhakalthok */

/*Explanation:
 * First I created a class Student.
 * Then I made variables.
 * After that I created objects.
 * I assigned the values of the objects.
 * And finally, I printed all Details and Values.
 */

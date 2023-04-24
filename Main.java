 /*WAP a program to demonstrate polymorphism
  * Variables used: none
  Code:
  */
 
 public class Main{
        public static void main(String[] args) {
           
            Animal dog = new Dog();
            Animal cat = new Cat();
            dog.makeSound();
            cat.makeSound();
        }
    }

/*Output:
 * The dog barks
The cat meows
 */
/*Explanation:
 * 1.I created a parent class(Animal)
 * 2.I created child classes which extend parent class(Animal).
 * 3.I printed the sounds of the animals.
 * 4.I created a main class and created an objects.
 * 5.Ready to go!
 */
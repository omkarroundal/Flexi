/*
 * //inhertance example
 * class Animal{
 * void eat(){
 * System.out.println("This animal eats food.");
 * }
 * }
 * class Dog extends Animal {
 * void barks(){
 * System.out.println("dog barks!");
 * }
 * }
 * public class Inheritance{
 * public static void main(String[] args){
 * Dog d = new Dog();
 * d.eat();
 * d.barks();
 * }
 * }
 * 
 * 
 * //resolving variable Name Conflict
 * // 'this' keyword is used to specify the method/variable, used to refer to
 * the current object of a class
 * 
 * 
 * // RUN TIME POLYMORPHISM
 * class Animal{
 * void eat(){
 * System.out.println("This animal eats food.");
 * }
 * }
 * class Dog extends Animal {
 * void eat(){
 * System.out.println("dog barks!"); //after calling the d.eat(); in main we get
 * the o/p of Child class here, Dog.
 * }
 * }
 * public class Inheritance{
 * public static void main(String[] args){
 * Dog d = new Dog();
 * d.eat();
 * }
 * }
 * // o/p of above code is = "dog barks!" because the child class method
 * overrides the parent class method.
 * 
 * 
 * 
 * // SUPER Keyword : Used to refer to the immediate parent class, accesses
 * parent class variables and methods.
 * class Animal{
 * void eat(){
 * System.out.println("Parent class method");
 * }
 * }
 * class Dog extends Animal {
 * void eat(){
 * super.eat(); // Calls parent class method
 * System.out.println("Child class method");
 * }
 * }
 * public class Inheritance{
 * public static void main(String[] args){
 * Dog d = new Dog();
 * d.eat();
 * }
 * }
 * // o/p = " Parent class method \n Child class method"
 * 
 * 
 * //PARENT CLASS CONSTRUCTOR
 * class Animal{
 * Animal(){
 * System.out.println("Parent class constructor");
 * }
 * }
 * class Dog extends Animal {
 * Dog(){
 * super(); // Calls parent class method
 * System.out.println("Child class constructor");
 * }
 * }
 * public class Inheritance{
 * public static void main(String[] args){
 * new Dog();
 * }
 * }
 * // o/p = " Parent class constructor \n Child class constructor"
 * 
 * 
 * 
 * // CALLING CONSTRUCTOR
 * class Demo {
 * Demo(){
 * this("Default Constructor.");
 * }
 * Demo(String message){
 * System.out.println(message);
 * }
 * }
 * public class Inhertance {
 * public static void main (String[] args){
 * new Demo();
 * }
 * }
 */
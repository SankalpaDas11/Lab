//Q.2 
class Teacher { // parent class
	public void collegeName() { 
		System.out.println("Anudip");}
	public void designation() {
		System.out.println("Teaches at that institute");}
	public void work() {
		System.out.println("Monitors students' progress");}}
class ITTeacher extends Teacher { //child 1
	public void details() {super.collegeName();
	super.designation();
	super.work();}}
class MathTeacher extends Teacher { // child2
	public void details() {
	super.collegeName();
	super.designation();
	super.work();}}
class MusicTeacher extends Teacher { // child 3
	public void details() {super.collegeName();
	super.designation();
	super.work();}}
class PhysicsTeacher extends Teacher {
	public void details() {super.collegeName();
	super.designation();
	super.work();}}
public class Stuff {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITTeacher teach1 = new ITTeacher(); MathTeacher teach2 = new MathTeacher();
		MusicTeacher teach3 = new MusicTeacher(); PhysicsTeacher teach4 = new PhysicsTeacher();
		teach1.details(); teach2.details(); teach3.details(); teach4.details();
	}}

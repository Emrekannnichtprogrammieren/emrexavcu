// Syntax = Aufbau vom Programm, zb.: Strichpunkt vergessen, falsche for schleife,...
// Semantik = Logikfehler , PR gibt etwas aus aber nicht was richtiges

//git init, git status, git add [Person.java], git commit -m "added Person.java", git push, git pull,
//git clone

public class FizzBuzz {

	public static void main(String[] args) {
		
		for (int i = 1; i < 101; i++) {
			
			if((i%3==0)&&(i%4==0)) {
				System.out.println(i + ":" + "fizzbuzz");
			}
			else if(i%3==0) {
				System.out.println(i + ":" + "fizz");
			}		
			else if(i%4==0) {
				System.out.println(i + ":" + "buzz");
			}		
			
			else {
				System.out.println(i + ":" +  i);
			}	
	}
}
}

/*
 * Lehrer Methode in der main
 * for (int i = 1; i < 101; i++) {
 * String s = i + ":";
 * boolean alreadyPrinted = false;
 * 
 * if(i%3==0){
 * 	s+= "fizz";
 * 	alreadyPrinted=true;
 * }
 * 
 * if(i%4==0){
 * 	s+= "buzz";
 * 	alreadyPrinted=true;
 * }
 * 
 * if(!alreadyPrinted) {
 * 	s+=Integer.toString(i);
 * }
 */

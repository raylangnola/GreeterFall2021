public class Greeter {
    public static void main(String[] args) {               
        
        String nameToGreet = 
            args.length > 0 ? args[0] : "Residents of Earth";       
        
        System.out.println("Greetings " + nameToGreet);
    }
}
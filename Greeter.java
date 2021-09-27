public class Greeter {
    public static void main(String[] args) {               
        
        String nameToGreet = 
            args.length > 0 ? args[0] : "Earthlings";       
        
        System.out.println("Greetings " + nameToGreet);
    }
}
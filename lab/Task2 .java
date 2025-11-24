public class Task2 {
    public static void main(String[] args) {

       
        String firstName = "Tirtho";
        String lastName = "Nag";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        String productName = "Laptop";
        String productID = "12345";
        String productCode = productName + "_" + productID;
        System.out.println("Product Code: " + productCode);

        
        String email = "tirtho2025@gmail.com";
        String username = email.substring(0, email.indexOf('@'));
        System.out.println("Username: " + username);

        
        String message = "Hello AIUB students!";
        System.out.println("Total characters: " + message.length());

        
        String sentence = "Java is fun to learn.";
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        
        String original = "I love Java programming.";
        String replaced = original.replace("Java", "C#");
        System.out.println("Updated sentence: " + replaced);
    }
}

public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot debbie = new ChatBot("debbie", 21);
        debbie.greeting("Peleh");
        debbie.favoriteNumber(204);
        debbie.weather();
        debbie.favoriteNumber(201);
        double meters = debbie.convertFeetToMeters(291);
        System.out.println("There are "+meters+" meters in 291 feet");
        int sum = debbie.addNumbers(12, 42, 21);
        System.out.println("The sum of 3 numbers is "+sum);
        debbie.goodbye();
        debbie.age();
        System.out.println(debbie.randomFact());
    }
}

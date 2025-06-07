public class Main {
    import java.util.HashMap;
import java.util.Scanner;

public class EmojiMoodResponder {
    public static void main(String[] args) {
        // Step 1: Create the HashMap
        HashMap<String, String> moodMap = new HashMap<>();
        moodMap.put("happy", "😊 Stay smiling and spread the joy!");
        moodMap.put("sad", "😢 It's okay to feel down. Better days are coming.");
        moodMap.put("tired", "😴 Take a break and rest up!");
        moodMap.put("angry", "😡 Breathe in, breathe out. Calm is power.");
        moodMap.put("excited", "🤩 Yay! Enjoy the good vibes!");

        // Step 2: Prompt the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your current mood: ");
        String mood = scanner.nextLine().toLowerCase();

        // Step 3: Search in the HashMap
        if (moodMap.containsKey(mood)) {
            // Step 4: Display emoji and message
            System.out.println(moodMap.get(mood));
        } else {
            // Step 5: Suggest another mood
            System.out.println("Mood not found. Try another mood like 'happy', 'sad', or 'tired'.");
        }

        scanner.close();
    }
}
}

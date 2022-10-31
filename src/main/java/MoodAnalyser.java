import java.util.Scanner;

public class MoodAnalyser {
    public String mood(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mood");
        String mood=sc.next();
        return mood;
    }
    public static void main(String[] args) {
        MoodAnalyser obj = new MoodAnalyser();
        System.out.println(obj.mood());

    }
}

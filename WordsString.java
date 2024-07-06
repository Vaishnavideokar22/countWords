import java.util.Scanner;

class Words {
    public void countWords(String str) {
        int count = 1; 
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("The count of Words is: " + count);
    }
}

public class WordsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The words");

        String input;
        input = sc.nextLine();

        Words w1 = new Words();
        w1.countWords(input);
    }
}
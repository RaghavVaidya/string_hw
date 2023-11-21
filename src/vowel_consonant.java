import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String b=sc.next();
        String a=b.toLowerCase();
        int count1=0;
        int count2=0;
        for(int i=0;i<=a.length()-1;i++){
            char x=a.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
                count1+=1;
            } else if (x == 'b' || x == 'c' || x == 'd' || x == 'f' || x == 'g' || x == 'h' || x == 'j' || x == 'k' || x == 'l' || x == 'm' || x == 'n' || x == 'p' || x == 'q' || x == 'r' || x == 's' || x == 't' || x == 'v' || x == 'w' || x == 'x' || x == 'y' || x == 'z') {
                count2+=1;
            }
        }
        System.out.println("The no of vowels are "+count1);
        System.out.println("The no of consonants are "+count2);

    }
}

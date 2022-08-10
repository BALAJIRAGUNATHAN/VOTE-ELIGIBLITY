import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner vote=new Scanner(System.in);
        int a= vote.nextInt();
        boolean vote_registered=true;

        if(a>=18){
            if(vote_registered==true){
                System.out.println("eligible to vote");
            }else{
                System.out.println("registration incomplete");
            }

        }else{
            System.out.println("you not eligible to vote");
        }


    }
}
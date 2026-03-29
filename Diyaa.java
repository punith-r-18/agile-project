import java.util.Scanner;
class Diyaa{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = input.nextLine();
        String originalusername = "punith";
        String originalpassword = "Diya";

        if(username.equalsIgnoreCase(originalusername)){
            System.out.println("Enter password: ");
            String password = input.nextLine();

            if(password.equals(originalpassword)){
                System.out.println("Login successful");
            }
            else{
                System.out.println("Invalid password");
            }
        }
        else{
            System.out.println("Invalid username");
        }
        input.close();
    }
}
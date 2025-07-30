import java.util.Objects;
import java.util.Scanner;
public class legalbankingsim {
    static String name;
    static int age;
    static int code;
    static double offShoreAcc = 3216231.56;
    static double onShoreAcc = 16746.23;
    static double collegeFund = 0.00;
    static String transferStart;
    static String transferEnd;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your full name(First, Middle, Last): ");
        name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        System.out.println("Your name is " + name + ", and you are " + age + " years old.");
        if(age >= 45 && !Objects.equals(name, "Theron James McCombs")){
            System.out.println("\n--> Ha Ha, you fossil! <--");
        }

        if(Objects.equals(name, "Theron James McCombs")){
            System.out.println("Welcome Theron, please enter the security code: ");
            code = scanner.nextInt();
            scanner.nextLine();
            if(code == 1820){
                System.out.println("\n\nWelcome Theron!");
                listAll();
                System.out.print("\nWhere would you like to take money from? (onshore, offshore, college, end): ");
                transferStart = scanner.nextLine();
                while (!Objects.equals(transferStart, "end")){
                    if(Objects.equals(transferStart, "onshore")){
                        System.out.println("Onshore account balance: $" + onShoreAcc);
                    }
                    if(Objects.equals(transferStart, "college")){
                        System.out.println("College fund balance: $" + collegeFund);
                    }
                    if(Objects.equals(transferStart, "offshore")){
                        System.out.println("Offshore account balance: $" + offShoreAcc);
                    }
                    System.out.print("\nWhere would you like to move money too? (onshore, offshore, college, end): ");
                    transferEnd = scanner.nextLine();
                    if(Objects.equals(transferEnd, "onshore")){
                        System.out.println("Onshore account balance: $" + onShoreAcc);
                    }
                    if(Objects.equals(transferEnd, "college")){
                        System.out.println("College fund balance: $" + collegeFund);
                    }
                    if(Objects.equals(transferEnd, "offshore")){
                        System.out.println("Offshore account balance: $" + offShoreAcc);
                    }
                    confirmAndMove(transferStart, transferEnd);
                    System.out.print("\nWhere would you like to take money from? (onshore, offshore, college, end): ");
                    transferStart = scanner.nextLine();
                }
                System.out.println("\n<||> Ending program <||>");
            }
        }
        scanner.close();
    }
    public static void listAll(){
        System.out.println("New onshore account balance: $" + onShoreAcc);
        System.out.println("New offshore account balance: $" + offShoreAcc);
        System.out.println("New college fund balance: $" + collegeFund);
    }
    public static void confirmAndMove(String location1, String location2){
        Scanner scanner2 = new Scanner(System.in);
        String confirmCheck;
        System.out.print("Moving ");
        if(Objects.equals(location1, "onshore")){
            System.out.print("onshore balance");
        }
        if(Objects.equals(location1, "offshore")){
            System.out.print("offshore balance");
        }
        if(Objects.equals(location1, "college")){
            System.out.print("college fund");
        }
        System.out.print(" to ");
        if(Objects.equals(location2, "onshore")){
            System.out.print("onshore balance");
        }
        if(Objects.equals(location2, "offshore")){
            System.out.print("offshore balance");
        }
        if(Objects.equals(location2, "college")){
            System.out.print("college fund");
        }
        System.out.println(", is this correct? (y/n):");
        confirmCheck = scanner2.nextLine();
        if(Objects.equals(confirmCheck, "y")){
            if(Objects.equals(location1, "onshore") && Objects.equals(location2, "offshore")){
                offShoreAcc += onShoreAcc;
                onShoreAcc -= onShoreAcc;
                listAll();
            }
            if(Objects.equals(location1, "onshore") && Objects.equals(location2, "college")){
                collegeFund += onShoreAcc;
                onShoreAcc -= onShoreAcc;
                listAll();
            }
            if(Objects.equals(location1, "offshore") && Objects.equals(location2, "onshore")){
                onShoreAcc += offShoreAcc;
                offShoreAcc -= offShoreAcc;
                listAll();
            }
            if(Objects.equals(location1, "offshore") && Objects.equals(location2, "college")){
                collegeFund += offShoreAcc;
                offShoreAcc -= offShoreAcc;
                listAll();
            }
            if(Objects.equals(location1, "college") && Objects.equals(location2, "onshore")){
                onShoreAcc += collegeFund;
                collegeFund -= collegeFund;
                listAll();
            }
            if(Objects.equals(location1, "college") && Objects.equals(location2, "offshore")){
                offShoreAcc += collegeFund;
                collegeFund -= collegeFund;
                listAll();
            }
        }
    }
}

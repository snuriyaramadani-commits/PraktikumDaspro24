import java.util.Scanner;
public class StudiKasus224 {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

String studentName;
String typeOfActivity;
int numberOfDocument;
int winnerRank;
String PKMFundingStatus;

System.out.println("Nama mahasiswa: ");
studentName = sc.nextLine();
System.out.println("Type of activity: ");
typeOfActivity = sc.nextLine();
System.out.println("Number of document: (0-4)");
numberOfDocument = sc.nextInt();

int minusDocument = 4 - numberOfDocument; 

if (typeOfActivity.equalsIgnoreCase("BELMAWA") || typeOfActivity.equalsIgnoreCase("BAKORMA") || typeOfActivity.equalsIgnoreCase("Mandiri")){
   System.out.println("Winner rank? (1,2,3, or 0 if not a winner): ");
   winnerRank = sc.nextInt();

    if (numberOfDocument <= 4){
        System.out.println("Status: the document is not complete");
        System.out.println("Funds are not given");
     } else {
        if(winnerRank >= 1 && winnerRank <= 3) {
           System.out.println("Status: the document is complete");
           System.out.println("Funds are given");
        } else {
            System.out.println("Status: not a winner 1,2 or 3");
            System.out.println("funds are not given");
        }
    } 
} else if (typeOfActivity.equalsIgnoreCase("PKM")){
    sc.nextLine(); 
  System.out.println("PKM funding status? (1 = funded, 0 = not funded");
  PKMFundingStatus = sc.nextLine();

      if (numberOfDocument < 4 ){
        System.out.println("Status: The document is not complete");
        System.out.println("Funds are not given");
    } else {
        
        if(PKMFundingStatus.equals("1")) {
            System.out.println("Status: PKM is funded");
            System.out.println("Funds are given");
        } else {
            System.out.println("Status: PKM is not funded");
            System.out.println("funds are not given");
        }
} 
} else {
    System.out.println("Status: other activity");
    System.out.println("funds are not given");
}
sc.close();

}
}



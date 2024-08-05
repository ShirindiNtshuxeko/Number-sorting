import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students:");
        int students = scanner.nextInt();

        //store marks in the array
        int [] marks = new int[students];

        for (int i = 0; i < students; i++){
            System.out.print("Enter marks " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        //Print entered marks
        System.out.print("\nEntered marks: ");
        for (int i = 0; i < students; i++ ){
            System.out.print(marks[i] + " ");
        }
        //Ascending order
        int sort;
        for (int i = 0; i < students; i++){
            for (int j = i; j < students; j++){
                if (marks[j] < marks[i]){
                    sort = marks[i];
                    marks[i] = marks[j];
                    marks[j] = sort;
                }
            }
        }
        System.out.print("\nSorted marks: ");
        for (int i = 0; i < students; i++){
            System.out.print(marks[i] +" ");
        }
    }
}
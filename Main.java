/* Develop a program that allows a teacher to enter
students' grades and compute their average,
highest, and lowest scores. You can use arrays or
ArrayLists to store the student data*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){

        //Arratlist to store grades
        ArrayList<Double> grades= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String inp;

        while(true){
            System.out.println("Enter a Student's grade or type Ok to finish!");
            inp = sc.nextLine();
            if(inp.equalsIgnoreCase("Ok")){
                break;
            }
            try{
                double grade = Double.parseDouble(inp);
                grades.add(grade);
            }
            catch(NumberFormatException ne){
                System.out.println("Invalid Input. Please enter a valid number!");

            }
        }

        if(grades.isEmpty()){
            System.out.println("Not any grades are entered.");
        }
        else{
            double total = 0;
            for(int i=0; i<grades.size(); i++){
                total += grades.get(i);
            }

           //Calculating Average
            double avg = total/grades.size();

            //Finding Highest grade
            double highest = Collections.max(grades);

            //Finding lowest grade
            double lowest = Collections.min(grades);

            //Printing Details
            System.out.println("\n ============Grades Summery============");
            System.out.println("Number of Students: " + grades.size());
            System.out.printf("Average: %.2f\n", avg);
            System.out.printf("Highest Grade: %.2f\n", highest);
            System.out.printf("Lowest Grade: %.2f\n", lowest);

        }

    }
}

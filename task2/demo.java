import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of subjects");
        int subjects = sc.nextInt();
        int totalMarks = 0;
        for(int i=0; i<subjects ; i++){
            System.out.println("enter mark of the subject");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        double averagePercentage = (double)totalMarks/subjects;
        String grade;
        if(averagePercentage >= 90){
            grade = "  A";

        }
        else if(averagePercentage >=80){
            grade = "  B";

        }else if(averagePercentage >=70){
            grade = " C";
        }else if(averagePercentage >=60){
            grade =  "  D";
        }
        else{
            grade = " F";
        }
        System.out.println("total no of marks  " + totalMarks);
        System.out.printf("average percentage :%2f%%\n",  averagePercentage);
        System.out.println("grade" +  grade);
    }
}
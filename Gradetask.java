import java.util.*;

class Gradetask {
    public static void main(String[] args) {
        char grade = ' '; 
		int sum=0;
		int total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int ns = sc.nextInt();
        int marks[] = new int[ns];
        System.out.println("Enter the marks for each subject");
        for (int i = 0; i < ns; i++) {
            marks[i] = sc.nextInt();
			  sum=sum+marks[i];
			  total=sum/ns;
		}
			 System.out.println("total marks="+sum);
			  System.out.println("average percentage="+total);
            switch (total/10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;					
                default:
                    grade = 'F';
                    break;
            }
        System.out.println("Grade: " + grade);
    }
}

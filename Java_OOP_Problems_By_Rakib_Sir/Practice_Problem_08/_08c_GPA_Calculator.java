public class _08c_GPA_Calculator 
{
    public static void main(String[] args)
    {
        int numStudents = 5;
        int numSubjects = 5;

        double[][] grades = {
                {3.5, 4.0, 3.8, 3.2, 3.6},
                {3.0, 3.5, 4.0, 3.7, 3.3},
                {3.8, 3.9, 4.0, 3.6, 3.5},
                {3.2, 3.3, 3.7, 3.5, 3.0},
                {4.0, 3.9, 3.8, 4.0, 3.7}
        };
        int[] credits = {3,4,3,2,4};
        int totalCredits = 0;

        for(int credit: credits) 
        {
            totalCredits += credit;
        }
        double[] cgpa = new double[numStudents];

        for(int i = 0; i < numStudents; i++)
        {
            double weightedSum = 0;

            for(int j= 0; j < numSubjects; j++)
            {
                weightedSum += grades[i][j] * credits[j];
            }

            cgpa[i] = weightedSum / totalCredits;
        }

        for(int i = 0; i < numStudents; i++)
        {
            System.out.printf("CGPA of Student %d: %.2f\n", i+1 ,cgpa[i]);
        }
    }
}

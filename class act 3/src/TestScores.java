import javax.swing.*;
public class TestScores {
    public static void main(String[] args) {
    int testScore1, testScore2, testScore3, userScore, average;

    char grade = 'F';

        testScore1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your first test score: "));
        testScore2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your second test score: "));
        testScore3 = Integer.parseInt(JOptionPane.showInputDialog("Enter your third test score: "));

        userScore = testScore1 + testScore1 + testScore3;

        average = userScore / 3;

        if(average > 89){
            grade = 'A';
        } else if (average > 79) {
            grade = 'B';
            
        } else if (average > 69) {
            grade = 'C';
            
        } else if (average > 59) {
            grade = 'D';
            
        } else {
            grade = 'F';
        }
        String output = String.format("your grade is " + grade);
        JOptionPane.showMessageDialog(null,output);


    }
}

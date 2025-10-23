import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizForm extends JFrame {

    // Components for questions
    JRadioButton q1Option1, q1Option2, q1Option3;
    ButtonGroup q1Group;
    JCheckBox q2Option1, q2Option2, q2Option3;
    JTextField q3TextField;
    JTextArea q4TextArea;
    JButton submitBtn;
    JTextArea resultArea;

    // Constructor
    public QuizForm() {
        setTitle("Interactive Quiz Form");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Main Panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Question 1
        panel.add(new JLabel("1. What is the capital of France?"));
        q1Option1 = new JRadioButton("Berlin");
        q1Option2 = new JRadioButton("Paris");
        q1Option3 = new JRadioButton("Rome");

        q1Group = new ButtonGroup();
        q1Group.add(q1Option1);
        q1Group.add(q1Option2);
        q1Group.add(q1Option3);

        panel.add(q1Option1);
        panel.add(q1Option2);
        panel.add(q1Option3);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Question 2
        panel.add(new JLabel("2. Select all prime numbers:"));
        q2Option1 = new JCheckBox("2");
        q2Option2 = new JCheckBox("4");
        q2Option3 = new JCheckBox("5");
        panel.add(q2Option1);
        panel.add(q2Option2);
        panel.add(q2Option3);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Question 3
        panel.add(new JLabel("3. Who wrote 'Hamlet'?"));
        q3TextField = new JTextField(20);
        panel.add(q3TextField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Question 4
        panel.add(new JLabel("4. Describe the process of photosynthesis:"));
        q4TextArea = new JTextArea(4, 30);
        JScrollPane scrollPane = new JScrollPane(q4TextArea);
        panel.add(scrollPane);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Submit Button
        submitBtn = new JButton("Submit");
        panel.add(submitBtn);

        // Result Area
        resultArea = new JTextArea(8, 50);
        resultArea.setEditable(false);
        JScrollPane resultScroll = new JScrollPane(resultArea);

        add(panel, BorderLayout.NORTH);
        add(resultScroll, BorderLayout.CENTER);

        // Button action
        submitBtn.addActionListener(e -> calculateScore());

        setVisible(true);
    }

    // Score calculation method
    private void calculateScore() {
        int score = 0;
        StringBuilder result = new StringBuilder();

        // Question 1 check
        if (q1Option2.isSelected()) {
            score++;
        }
        result.append("1. Capital of France: Correct answer is Paris.\n");

        // Question 2 check
        boolean q2Correct = q2Option1.isSelected() && q2Option3.isSelected() && !q2Option2.isSelected();
        if (q2Correct) {
            score++;
        }
        result.append("2. Prime numbers are 2 and 5.\n");

        // Question 3 check
        String answer3 = q3TextField.getText().trim().toLowerCase();
        if (answer3.contains("shakespeare")) {
            score++;
        }
        result.append("3. Hamlet was written by Shakespeare.\n");

        // Question 4 check
        String answer4 = q4TextArea.getText().toLowerCase();
        if (answer4.contains("photosynthesis") && answer4.contains("sunlight") && answer4.contains("plants")) {
            score++;
        }
        result.append("4. Photosynthesis is the process by which plants use sunlight to synthesize food.\n");

        // Final result
        result.append("\nYour total score is: " + score + " out of 4");

        resultArea.setText(result.toString());
    }

    // Main Method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuizForm::new);
    }
}
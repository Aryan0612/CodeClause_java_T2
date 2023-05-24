import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ResumeBuilder extends JFrame implements ActionListener {
    private JTextField nameField, emailField, phoneField, addressField;
    private JTextArea experienceArea, educationArea, skillsArea;

    public ResumeBuilder() {
        super("Online Resume Builder");

        // Create labels and fields for user input
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField(20);

        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField(20);

        JLabel experienceLabel = new JLabel("Work Experience:");
        experienceArea = new JTextArea(10, 20);
        JScrollPane experienceScrollPane = new JScrollPane(experienceArea);

        JLabel educationLabel = new JLabel("Education:");
        educationArea = new JTextArea(10, 20);
        JScrollPane educationScrollPane = new JScrollPane(educationArea);

        JLabel skillsLabel = new JLabel("Skills:");
        skillsArea = new JTextArea(10, 20);
        JScrollPane skillsScrollPane = new JScrollPane(skillsArea);

        // Create buttons for submitting and clearing the form
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                emailField.setText("");
                phoneField.setText("");
                addressField.setText("");
                experienceArea.setText("");
                educationArea.setText("");
                skillsArea.setText("");
            }
        });

        // Create a panel for the form and add the components
        JPanel formPanel = new JPanel(new GridLayout(7, 2));
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(phoneLabel);
        formPanel.add(phoneField);
        formPanel.add(addressLabel);
        formPanel.add(addressField);
        formPanel.add(experienceLabel);
        formPanel.add(experienceScrollPane);
        formPanel.add(educationLabel);
        formPanel.add(educationScrollPane);
        formPanel.add(skillsLabel);
        formPanel.add(skillsScrollPane);

        // Create a panel for the buttons and add the components
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(submitButton);
        buttonPanel.add(clearButton);

        // Add the panels to the frame
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Set the size and make the frame visible
        setSize(500, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the user input and create the resume
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String address = addressField.getText();
        String experience = experienceArea.getText();
        String education = educationArea.getText();
        String skills = skillsArea.getText();

        String resume = "===================================\n";
        resume += "              RESUME               \n";
        resume += "===================================\n";
        resume += "Name: " + name + "\n";
        resume += "Email: " + email + "\n";
        resume += "Phone: " + phone + "\n";
        resume += "Address: " + address + "\n";
        resume += "Work Experience:\n" + experience + "\n";
        resume += "Education:\n" + education + "\n";
        resume += "Skills:\n" + skills + "\n";

        // Display the resume in a dialog box
        JOptionPane.showMessageDialog(this, resume);
    }

    public static void main(String[] args) {
        new ResumeBuilder();
    }
}

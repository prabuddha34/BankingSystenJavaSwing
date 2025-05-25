import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM_Frame_Login_Page extends JFrame implements ActionListener {

    JPanel panel;
    JLabel nameLabel,ageLabel,genderLabel;
    JTextField nameField,ageField;
    JRadioButton maleRadio,femaleRadio;
    ButtonGroup genderGroup;
    JButton submitButton;

    ATM_Frame_Login_Page() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Login Page");
        this.setLayout(null); // Main frame using null layout

        panel = new JPanel();
        panel.setBounds(50, 50, 380, 300);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null); // Required for setBounds to work inside the panel

        nameLabel = new JLabel("What is Your Name?");
        nameLabel.setBounds(20, 30, 150, 25);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(180, 30, 160, 25);
        panel.add(nameField);

        ageLabel=new JLabel("What is Your Age ?");
        ageLabel.setBounds(20, 70, 150, 25);
        panel.add(ageLabel);

        ageField=new JTextField();
        ageField.setBounds(180, 70, 160, 25);
        panel.add(ageField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 130, 100, 25);

        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        maleRadio.setBounds(50, 155, 70, 25);
        femaleRadio.setBounds(130, 155, 100, 25);

        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        submitButton =new JButton("Submit");
        submitButton.setBounds(100, 200, 100, 25);
        submitButton.addActionListener(this);


        panel.add(maleRadio);
        panel.add(femaleRadio);
        panel.add(genderLabel);
        panel.add(submitButton);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name=nameField.getText();
        String age=ageField.getText();

     if(e.getSource()==submitButton){
      new ATM_Launch_Pad();
      JOptionPane.showMessageDialog(this,"Welcome "+" "+name+" Age"+" "+age+" to your System");

     }
    }
}

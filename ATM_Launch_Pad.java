import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM_Launch_Pad extends JFrame implements ActionListener {
    JButton depositButton,withdrawButton,viewBalanceButton,exitButton;
    JPanel panel;
    double balance=1000;

    ATM_Launch_Pad(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("Banking System");

        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(50, 90, 350, 300);

        depositButton=new JButton("Deposit");
        withdrawButton=new JButton("Withdraw");
        viewBalanceButton=new JButton("View balance");
        exitButton=new JButton("Exit");

        depositButton.setBounds(110, 30, 200, 50);
        withdrawButton.setBounds(110, 100, 200, 50);
        viewBalanceButton.setBounds(110, 170, 200, 50);
        exitButton.setBounds(110,230,200,50);

        depositButton.setFocusable(false);
        withdrawButton.setFocusable(false);
        viewBalanceButton.setFocusable(false);
        exitButton.setFocusable(false);

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        viewBalanceButton.addActionListener(this);
        exitButton.addActionListener(this);


        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(viewBalanceButton);
        panel.add(exitButton);


        this.add(panel);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==depositButton){
            String amountStr=JOptionPane.showInputDialog(this,"Enter the Amount to Deposit");
            JOptionPane.showMessageDialog(this,"Your money has been deposited");
            double amt=Double.parseDouble(amountStr);
            if(amt>0){
                balance=balance+amt;
            }
        }
        if(e.getSource()==withdrawButton){
            String amountStr=JOptionPane.showInputDialog(this,"Enter the amount to withdraw");
            double amt1=Double.parseDouble(amountStr);
            if(amt1>balance){
                JOptionPane.showMessageDialog(this,"Invalid Input ");
            }
            else if(amt1>0){
                balance=balance-amt1;
            }
         JOptionPane.showMessageDialog(this,"Your Money has been withdrawn");
        }
        if(e.getSource()==viewBalanceButton){
            JOptionPane.showMessageDialog(this,"Your Current Balance"+" Rs "+balance);
        }
        if(e.getSource()==exitButton){
            JOptionPane.showMessageDialog(this,"Thanks for using our System");
            System.exit(0);
        }
    }
}

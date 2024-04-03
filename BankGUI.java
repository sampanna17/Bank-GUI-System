
/**
 * Write a description of class BankGUI here.
 *
 * @author (22067519 Sampanna Piya)
 * @version (1.0.0)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
// Importing the java packages which are used for the project
public class BankGUI implements ActionListener // Implementing ActionListener
{
    private JFrame frame; // Creating a GUI Frame
    private JPanel panelCreditCard, panelDebitCard;
    // Initialization of two seperate panels within the GUI frame
    private JButton addDebitCardbtn, addCreditCardbtn, withdrawbtn, setCreditLimitbtn, cancelCreditCardbtn, displaybtn1, displaybtn2, clearbtn1, clearbtn2;
    // Setting various buttons to be used in the GUI
    private JLabel labelCreditCard, labelDebitCard, labelCardIDC1, labelCardIDC2,labelCardIDC3, labelCardIDD1, labelCardIDD2, labelName1, labelName2, labelIssuerBank1, labelIssuerBank2, labelBankAccount1, labelBankAccount2, labelBalanceAmount1, labelBalanceAmount2, labelCVCNumber, labelInterestRate, labelGracePeriod, labelCreditLimit, labelWithdrawalAmount, labelPinNumber1, labelPinNumber2, labelWithdrawlDate, labelExpirationDate;
    // Setting various labels that will used in the GUI
    private JTextField textCardIDC1, textCardIDC2, textCardIDC3, textCardIDD1, textCardIDD2, textName1, textName2, textIssuerBank1, textIssuerBank2, textBankAccount1, textBankAccount2, textBalanceAmount1, textBalanceAmount2, textCVCNumber, textInterestRate, textGracePeriod, textCreditLimit, textWithdrawalAmount, textPinNumber1, textPinNumber2;
    // Setting various text boxes that will be used in the GUI
    private JComboBox yearComboBox1,monthComboBox1, dayComboBox1,yearComboBox2,monthComboBox2, dayComboBox2;
    // Setting various combo boxes to be use in the GUI
    ArrayList<BankCard> cards = new ArrayList<BankCard>();
    // Creating a new ArrayList for BankCard class
    public static void main(String[] args){  // main method that ables GUI to run
        BankGUI obj = new BankGUI(); // Creating class object
    }
    // Method used to create physical part of the GUI
    public BankGUI(){
        // Creating the frame for the GUI
        frame = new JFrame("TheBankGUI");
        Container container = frame.getContentPane();

        // Creating panels within the GUI frame

        //CreditCard panel
        panelCreditCard = new JPanel();
        panelCreditCard.setBounds(60, 35, 485, 575);
        container.add(panelCreditCard);
        panelCreditCard.setLayout(null);
        panelCreditCard.setBackground(Color.white);

        //DebitCard panel
        panelDebitCard = new JPanel();
        panelDebitCard.setBounds(540, 35, 485, 575);
        container.add(panelDebitCard);
        panelDebitCard.setLayout(null);
        panelDebitCard.setBackground(Color.white);

        // Creating borders for the panels
        panelCreditCard.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        panelDebitCard.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        // Adding title to the CreditCard panel
        labelCreditCard = new JLabel("CreditCard");
        labelCreditCard.setFont(new Font("Arial",Font.BOLD,30));
        labelCreditCard.setBounds(160, 20, 165, 50);
        panelCreditCard.add(labelCreditCard);

        // Adding labels, text fields, combo box and buttons within the CreditCard panel

        // For CardIdC1
        labelCardIDC1 = new JLabel("Card ID");
        labelCardIDC1.setBounds(50,90,80,25);
        labelCardIDC1.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelCardIDC1);
        textCardIDC1 = new JTextField();
        textCardIDC1.setBounds(200,90,110,25);
        panelCreditCard.add(textCardIDC1);

        // For Name 1
        labelName1 = new JLabel("Name");
        labelName1.setBounds(50,120,80,25);
        labelName1.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelName1);
        textName1 = new JTextField();
        textName1.setBounds(200,120,110,25);
        panelCreditCard.add(textName1);

        // For Issuer Bank 1
        labelIssuerBank1 = new JLabel("Issuer Bank");
        labelIssuerBank1.setBounds(50,150,100,25);
        labelIssuerBank1.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelIssuerBank1);
        textIssuerBank1 = new JTextField();
        textIssuerBank1.setBounds(200,150,110,25);
        panelCreditCard.add(textIssuerBank1);

        // For Bank Account 1
        labelBankAccount1 = new JLabel("Bank Account");
        labelBankAccount1.setBounds(50,180,100,25);
        labelBankAccount1.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelBankAccount1);
        textBankAccount1 = new JTextField();
        textBankAccount1.setBounds(200,180,110,25);
        panelCreditCard.add(textBankAccount1);

        // For Balance Amount 1
        labelBalanceAmount1 = new JLabel("Balance Amount");
        labelBalanceAmount1.setBounds(50,210,120,25);
        labelBalanceAmount1.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelBalanceAmount1);
        textBalanceAmount1 = new JTextField();
        textBalanceAmount1.setBounds(200,210,110,25);
        panelCreditCard.add(textBalanceAmount1);

        // For CVC Number
        labelCVCNumber = new JLabel("CVC Number");
        labelCVCNumber.setBounds(50,240,100,25);
        labelCVCNumber.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelCVCNumber);
        textCVCNumber = new JTextField();
        textCVCNumber.setBounds(200,240,110,25);
        panelCreditCard.add(textCVCNumber);

        // For Interest Rate
        labelInterestRate = new JLabel("Interest Rate");
        labelInterestRate.setBounds(50,270,100,25);
        labelInterestRate.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelInterestRate);
        textInterestRate = new JTextField();
        textInterestRate.setBounds(200,270,110,25);
        panelCreditCard.add(textInterestRate);

        // For Expiration Date
        labelExpirationDate = new JLabel("Expiration Date");
        labelExpirationDate.setBounds(50,300,120,25);
        labelExpirationDate.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelExpirationDate);

        String[] yearArray = new String[10];
        String[] monthArray = new String[12];
        String[] dayArray = new String[31];

        for (int i = 0; i < 10; i++) {
            yearArray[i] = Integer.toString(2020 + i);
        }

        for (int i = 0; i < 12; i++) {
            monthArray[i] = Integer.toString(i + 1);
        }

        for (int i = 0; i < 31; i++) {
            dayArray[i] = Integer.toString(i + 1);
        }

        yearComboBox1 = new JComboBox(yearArray);
        monthComboBox1 = new JComboBox(monthArray);
        dayComboBox1 = new JComboBox(dayArray);

        yearComboBox1.insertItemAt("Year",0);
        yearComboBox1.setSelectedIndex(0);

        monthComboBox1.insertItemAt("Month",0);
        monthComboBox1.setSelectedIndex(0);

        dayComboBox1.insertItemAt("Day",0);
        dayComboBox1.setSelectedIndex(0);

        yearComboBox1.setFont(new Font("Arial",Font.PLAIN,14));
        monthComboBox1.setFont(new Font("Arial",Font.PLAIN,14));
        dayComboBox1.setFont(new Font("Arial",Font.PLAIN,14));

        yearComboBox1.setBounds(200,300,65,25);
        monthComboBox1.setBounds(265,300,70,25);
        dayComboBox1.setBounds(335,300,65,25);

        panelCreditCard.add(yearComboBox1);
        panelCreditCard.add(monthComboBox1);
        panelCreditCard.add(dayComboBox1);

        // For CardIdC2
        labelCardIDC2 = new JLabel("Card ID");
        labelCardIDC2.setBounds(50,385,80,25);
        labelCardIDC2.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelCardIDC2);
        textCardIDC2 = new JTextField();
        textCardIDC2.setBounds(200,385,110,25);
        panelCreditCard.add(textCardIDC2);

        // For Grace Period
        labelGracePeriod = new JLabel("Grace Period");
        labelGracePeriod.setBounds(50,415,100,25);
        labelGracePeriod.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelGracePeriod);
        textGracePeriod = new JTextField();
        textGracePeriod.setBounds(200,415,110,25);
        panelCreditCard.add(textGracePeriod);

        //For Credit Limit
        labelCreditLimit = new JLabel("Credit Limit");
        labelCreditLimit.setBounds(50,445,100,25);
        labelCreditLimit.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelCreditLimit);
        textCreditLimit = new JTextField();
        textCreditLimit.setBounds(200,445,110,25);
        panelCreditCard.add(textCreditLimit);

        // For setting credit limit button
        setCreditLimitbtn = new JButton("Set credit limit ");
        setCreditLimitbtn.setFont(new Font("Arial",Font.PLAIN,12));
        //setCreditlimitbtn.setBounds(50,465,150,25);
        setCreditLimitbtn.setBounds(335,445,115,25);
        setCreditLimitbtn.addActionListener(this);
        panelCreditCard.add(setCreditLimitbtn);

        // For CardID 3
        labelCardIDC3 = new JLabel("Card ID");
        labelCardIDC3.setBounds(50,500,100,25);
        labelCardIDC3.setFont(new Font("Arial",Font.PLAIN,16));
        panelCreditCard.add(labelCardIDC3);
        textCardIDC3 = new JTextField();
        textCardIDC3.setBounds(110,500,90,25);
        panelCreditCard.add(textCardIDC3);

        // For add button
        addCreditCardbtn = new JButton("Add");
        addCreditCardbtn.setFont(new Font("Arial",Font.PLAIN,16));
        addCreditCardbtn.setBounds(50,335,150,25);
        addCreditCardbtn.addActionListener(this);
        panelCreditCard.add(addCreditCardbtn);

        // For display button 1
        displaybtn1 = new JButton("Display");
        displaybtn1.setFont(new Font("Arial",Font.PLAIN,16));
        //displaybtn1.setBounds(340,470,110,25);
        displaybtn1.setBounds(340,500,110,25);
        displaybtn1.addActionListener(this);
        panelCreditCard.add(displaybtn1);

        // For cancel button
        cancelCreditCardbtn = new JButton("Cancel Credit Card");
        cancelCreditCardbtn.setFont(new Font("Arial",Font.PLAIN,12));
        cancelCreditCardbtn.setBounds(50,530,150,25);
        cancelCreditCardbtn.addActionListener(this);
        panelCreditCard.add(cancelCreditCardbtn);

        // For clear all button 1
        clearbtn1 = new JButton("Clear all");
        clearbtn1.setFont(new Font("Arial",Font.PLAIN,16));
        clearbtn1.setBounds(340,530,110,25);
        clearbtn1.addActionListener(this);
        panelCreditCard.add(clearbtn1);

        // Adding title to the DebitCard panel
        labelDebitCard = new JLabel("DebitCard");
        labelDebitCard.setFont(new Font("Arial",Font.BOLD,30));
        labelDebitCard.setBounds(160, 20, 165, 50);
        panelDebitCard.add(labelDebitCard);

        // Adding labels, text fields, combo box and buttons within the DebitCard panel

        // For Card ID 1
        labelCardIDD1 = new JLabel("Card ID");
        labelCardIDD1.setBounds(50,90,80,25);
        labelCardIDD1.setFont(new Font("Arial",Font.PLAIN,16));
        panelDebitCard.add(labelCardIDD1);
        textCardIDD1 = new JTextField();
        textCardIDD1.setBounds(200,90,110,25);
        panelDebitCard.add(textCardIDD1);

        // For Card ID 2
        labelCardIDD2 = new JLabel("Card ID");
        labelCardIDD2.setBounds(50,310,120,25);
        labelCardIDD2.setFont(new Font("Arial",Font.PLAIN,16));
        panelDebitCard.add(labelCardIDD2);
        textCardIDD2 = new JTextField();
        textCardIDD2.setBounds(200,310,110,25);
        panelDebitCard.add(textCardIDD2);

        // For Name 2
        labelName2 = new JLabel("Name");
        labelName2.setBounds(50,120,80,25);
        labelName2.setFont(new Font("Arial",Font.PLAIN,16));
        panelDebitCard.add(labelName2);
        textName2 = new JTextField();
        textName2.setBounds(200,120,110,25);
        panelDebitCard.add(textName2);

        // For Issuer Bank 2
        labelIssuerBank2 = new JLabel("Issuer Bank");
        labelIssuerBank2.setBounds(50,150,100,25);
        labelIssuerBank2.setFont(new Font("Arial",Font.PLAIN,16));
        panelDebitCard.add(labelIssuerBank2);
        textIssuerBank2 = new JTextField();
        textIssuerBank2.setBounds(200,150,110,25);
        panelDebitCard.add(textIssuerBank2);

        // For Bank Account 2
        labelBankAccount2 = new JLabel("Bank Account");
        labelBankAccount2.setBounds(50,180,100,25);
        labelBankAccount2.setFont(new Font("Arial",Font.PLAIN,16));
        panelDebitCard.add(labelBankAccount2);
        textBankAccount2 = new JTextField();
        textBankAccount2.setBounds(200,180,110,25);
        panelDebitCard.add(textBankAccount2);

        // For Balance Amount 2
        labelBalanceAmount2 = new JLabel("Balance Amount");
        labelBalanceAmount2.setBounds(50,210,120,25);
        labelBalanceAmount2.setFont(new Font("Arial",Font.PLAIN,16));
        panelDebitCard.add(labelBalanceAmount2);
        textBalanceAmount2 = new JTextField();
        textBalanceAmount2.setBounds(200,210,110,25);
        panelDebitCard.add(textBalanceAmount2);

        // For PIN Number
        labelPinNumber1 = new JLabel("PIN Number");
        labelPinNumber1.setBounds(50,240,100,25);
        labelPinNumber1.setFont(new Font("Arial",Font.PLAIN,16));
        panelDebitCard.add(labelPinNumber1);
        textPinNumber1 = new JTextField();
        textPinNumber1.setBounds(200,240,110,25);
        panelDebitCard.add(textPinNumber1);

        // For PIN Number 2
        labelPinNumber2 = new JLabel("PIN Number");
        labelPinNumber2.setBounds(50,370,110,25);
        labelPinNumber2.setFont(new Font("Arial",Font.PLAIN,16));
        panelDebitCard.add(labelPinNumber2);
        textPinNumber2 = new JTextField();
        textPinNumber2.setBounds(200,370,110,25);
        panelDebitCard.add(textPinNumber2);

        // For Withdrawl date
        labelWithdrawlDate = new JLabel("Withdrawal Date");
        labelWithdrawlDate.setBounds(50,400,115,25);
        labelWithdrawlDate.setFont(new Font("Arial",Font.PLAIN,16));
        panelDebitCard.add(labelWithdrawlDate);
        String[] year = new String[11];
        String[] month = new String[13];
        String[] day = new String[32];

        for (int i = 0; i < 10; i++) {
            year[i] = Integer.toString(2023 + i);
        }

        for (int i = 0; i < 12; i++) {
            month[i] = Integer.toString(i + 1);
        }

        for (int i = 0; i < 31; i++) {
            day[i] = Integer.toString(i + 1);
        }

        yearComboBox2 = new JComboBox(year);
        monthComboBox2 = new JComboBox(month);
        dayComboBox2 = new JComboBox(day);

        yearComboBox2.insertItemAt("Year",0);
        yearComboBox2.setSelectedIndex(0);

        monthComboBox2.insertItemAt("Month",0);
        monthComboBox2.setSelectedIndex(0);

        dayComboBox2.insertItemAt("Day",0);
        dayComboBox2.setSelectedIndex(0);

        yearComboBox2.setFont(new Font("Arial",Font.PLAIN,14));
        monthComboBox2.setFont(new Font("Arial",Font.PLAIN,14));
        dayComboBox2.setFont(new Font("Arial",Font.PLAIN,14));

        yearComboBox2.setBounds(200,400,65,25);
        monthComboBox2.setBounds(265,400,70,25);
        dayComboBox2.setBounds(335,400,65,25);

        panelDebitCard.add(yearComboBox2);
        panelDebitCard.add(monthComboBox2);
        panelDebitCard.add(dayComboBox2);

        // For Withdrawl Amount
        labelWithdrawalAmount = new JLabel("Withdrawal Amount");
        labelWithdrawalAmount.setBounds(50,340,140,25);
        labelWithdrawalAmount.setFont(new Font("Arial",Font.PLAIN,16));
        panelDebitCard.add(labelWithdrawalAmount);
        textWithdrawalAmount = new JTextField();
        textWithdrawalAmount.setBounds(200,340,110,25);
        panelDebitCard.add(textWithdrawalAmount);

        // For add debit card button
        addDebitCardbtn = new JButton("Add");
        addDebitCardbtn.setFont(new Font("Arial",Font.PLAIN,16));
        addDebitCardbtn.setBounds(50,275,260,25);
        addDebitCardbtn.addActionListener(this);
        panelDebitCard.add(addDebitCardbtn);

        // For withdraw button
        withdrawbtn = new JButton("Withdraw");
        withdrawbtn.setFont(new Font("Arial",Font.PLAIN,16));
        withdrawbtn.setBounds(50,435,150,25);
        withdrawbtn.addActionListener(this);
        panelDebitCard.add(withdrawbtn);

        // For display button
        displaybtn2 = new JButton("Display");
        displaybtn2.setFont(new Font("Arial",Font.PLAIN,16));
        displaybtn2.setBounds(340,500,110,25);
        displaybtn2.addActionListener(this);
        panelDebitCard.add(displaybtn2);

        // For clear all button
        clearbtn2 = new JButton("Clear all");
        clearbtn2.setFont(new Font("Arial",Font.PLAIN,16));
        clearbtn2.setBounds(340,530,110,25);
        clearbtn2.addActionListener(this);
        panelDebitCard.add(clearbtn2);

        frame.setSize(1100,680);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    // implementing the methods of the listener interface
    @Override
    public void actionPerformed(ActionEvent e){ // implementing the methode of the Action Listener
        if(e.getSource() == addDebitCardbtn){
            if(textCardIDD1.getText().isEmpty() || textName2.getText().isEmpty() || textIssuerBank2.getText().isEmpty() || textBankAccount2.getText().isEmpty() || textBalanceAmount2.getText().isEmpty() || textPinNumber1.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please enter all the necessary fields.","Warning",JOptionPane.WARNING_MESSAGE); 
            }
            else{
                try{
                    // getting all the parameter
                    String bankAccount = textBankAccount2.getText();
                    String issuerBank = textIssuerBank2.getText();
                    String name = textName2.getText();
                    int balanceAmount = Integer.parseInt(textBalanceAmount2.getText());
                    int cardID = Integer.parseInt(textCardIDD1.getText());
                    int pin = Integer.parseInt(textPinNumber1.getText());
                    String addingValues = "\n CardID : "+cardID+"\n Name : "+name+"\n Bank Account : "+bankAccount+"\n Balance Amount : "+balanceAmount+"\n Issuer Bank : "+issuerBank+"\n PIN : "+pin;
                    //If array list is empty
                    if (cards.isEmpty()) {
                        DebitCard debitObj = new DebitCard(balanceAmount, cardID, bankAccount, issuerBank, name, pin);
                        cards.add(debitObj);
                        JOptionPane.showMessageDialog(frame, "The DebitCard has been successfully added" + addingValues);
                    } else {
                        boolean foundDuplicate = false;
                        for (BankCard card : cards) {   
                            if (card instanceof DebitCard) {
                                DebitCard debitCard = (DebitCard) card;
                                if (debitCard.getCardId() == cardID) {
                                    JOptionPane.showMessageDialog(frame, "The DebitCard has already been added. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                                    foundDuplicate = true;
                                    break;
                                }
                            }
                        }
                        if (!foundDuplicate) {
                            DebitCard debitObj = new DebitCard(balanceAmount, cardID, bankAccount, issuerBank, name, pin);
                            cards.add(debitObj);
                            JOptionPane.showMessageDialog(frame, "The DebitCard has been successfully added" + addingValues);
                        }
                    }
                }catch(Exception ex){
                    // Showing a warning message if there is an error with the input data
                    JOptionPane.showMessageDialog(frame,"There was an invalid entry found.","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        if(e.getSource() == addCreditCardbtn){
            // Gettinng the selected index for each date field
            int selectedIndexE1 = yearComboBox1.getSelectedIndex();
            int selectedIndexE2 = monthComboBox1.getSelectedIndex();
            int selectedIndexE3 = dayComboBox1.getSelectedIndex();
            // Check if any of the required fields are empty
            if(textCardIDC1.getText().isEmpty() || textName1.getText().isEmpty() || textIssuerBank1.getText().isEmpty() || textBankAccount1.getText().isEmpty() || textBalanceAmount1.getText().isEmpty() || textCVCNumber.getText().isEmpty() || textInterestRate.getText().isEmpty() || selectedIndexE1 == 0 || selectedIndexE2 == 0|| selectedIndexE3 == 0){
                // Show a warning message if any of the fields are empty
                JOptionPane.showMessageDialog(frame, "Please enter all the necessary fields.","Warning",JOptionPane.WARNING_MESSAGE); 
            }else{
                try{
                    // Getting the values of each field
                    String bankAccount = textBankAccount1.getText();
                    String issuerBank = textIssuerBank1.getText();
                    String name = textName1.getText();
                    String year = yearComboBox1.getSelectedItem().toString();
                    String month = monthComboBox1.getSelectedItem().toString();
                    String day = dayComboBox1.getSelectedItem().toString();
                    String date = year + "/" +month+"/" + day; 
                    int cardID = Integer.parseInt(textCardIDC1.getText());
                    int balanceAmount = Integer.parseInt(textBalanceAmount1.getText());
                    int cvcNumber = Integer.parseInt(textCVCNumber.getText());
                    double interestRate = Double.parseDouble(textInterestRate.getText());
                    String addingValues = "\n CardID : "+cardID+"\n Name : "+name+"\n Bank Account : "+bankAccount+"\n Balance Amount : "+balanceAmount+"\n Issuer Bank : "+issuerBank+"\n CVC Number : "+cvcNumber+"\n Interest Rate : "+interestRate+"\n Expiration Date : "+date;
                    if (cards.isEmpty()) { // Check if the "cards" list is empty
                        CreditCard creditObj = new CreditCard( balanceAmount,  cardID,  bankAccount,  issuerBank, name, cvcNumber, interestRate, date);
                        cards.add(creditObj);
                        JOptionPane.showMessageDialog(frame, "The CreditCard has been successfully added" + addingValues);
                    } else {
                        boolean foundDuplicate = false;
                        for (BankCard card : cards) {
                            if (card instanceof CreditCard) {
                                CreditCard creditCard = (CreditCard) card;
                                if (creditCard.getCardId() == cardID) {
                                    JOptionPane.showMessageDialog(frame, "The CreditCard has already been added. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                                    foundDuplicate = true;
                                    break;
                                }
                            }
                        }
                        // If a CreditCard with the same card ID does not exist, add a new CreditCard to the "cards" list
                        if (!foundDuplicate) {
                            CreditCard creditObj = new CreditCard( balanceAmount,  cardID,  bankAccount,  issuerBank, name, cvcNumber, interestRate, date);
                            cards.add(creditObj);
                            JOptionPane.showMessageDialog(frame, "The CreditCard has been successfully added" + addingValues);
                        }
                    }
                }catch(Exception exp){
                    // Showing a warning message if there is an error with the input data
                    JOptionPane.showMessageDialog(frame,"Inaapropriate data filled. Try again","Error",JOptionPane.WARNING_MESSAGE); 
                }
            }
        }
        if(e.getSource() == withdrawbtn){
            // Get the selected index values of the year, month, and day combo boxes
            int selectedIndexW1 = yearComboBox2.getSelectedIndex();
            int selectedIndexW2 = monthComboBox2.getSelectedIndex();
            int selectedIndexW3 = dayComboBox2.getSelectedIndex();
            if(textCardIDD2.getText().isEmpty() || textWithdrawalAmount.getText().isEmpty() || textPinNumber2.getText().isEmpty() || selectedIndexW1 == 0 || selectedIndexW2 == 0 | selectedIndexW3 == 0){
                // Show a warning message if any of the fields are empty
                JOptionPane.showMessageDialog(frame, "Please enter all the necessary fields.","Warning",JOptionPane.WARNING_MESSAGE); 
            }else{
                try{
                    // Getting the values of each field
                    int cardID = Integer.parseInt(textCardIDD2.getText());
                    int withdrawlAmount = Integer.parseInt(textWithdrawalAmount.getText());
                    int pinNumber = Integer.parseInt(textPinNumber2.getText());
                    int balanceAmount = Integer.parseInt(textBalanceAmount2.getText());
                    String year = yearComboBox2.getSelectedItem().toString();
                    String month = monthComboBox2.getSelectedItem().toString();
                    String day = dayComboBox2.getSelectedItem().toString();
                    String date = year +"/"+month + "/" + day; 
                    if(cards.isEmpty()){
                        // Show a warning message if the Debit Card list is empty
                        JOptionPane.showMessageDialog(frame, "Debit Card is Empty. Can not Withdrawl.","Warning",JOptionPane.WARNING_MESSAGE);
                    }else{
                        for(BankCard card : cards){
                            if(card instanceof DebitCard){
                                DebitCard debitCard = (DebitCard)card;
                                if(debitCard.getCardId() == cardID){
                                    if(debitCard.getPinNumber() == pinNumber){
                                        if(withdrawlAmount<balanceAmount){
                                            // Withdraw the entered amount from the debit card
                                            debitCard.withdraw(withdrawlAmount,date,pinNumber);
                                            JOptionPane.showMessageDialog(frame,"Amount has been withdrawn successfully.");
                                        }
                                        else{
                                            // Show an error message if the entered withdrawal amount is more than the available balance
                                            JOptionPane.showMessageDialog(frame, "You don't seem to have enough balance", "Not Enough Balance", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }else{
                                        // Showing an error message if the entered PIN number is incorrect
                                        JOptionPane.showMessageDialog(frame,"Incorrect PIN Number");
                                    }
                                }else{
                                    // Showing a warning message if the entered card ID is not found in the Debit Card list
                                    JOptionPane.showMessageDialog(frame, "Card not found","Warning",JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        }                       
                    }              
                }catch(Exception ex){
                    // Showing a warning message if there is an error with the input data
                    JOptionPane.showMessageDialog(frame,"Inaapropriate data filled. Try again","Error",JOptionPane.WARNING_MESSAGE); 
                }
            }
        }
        if(e.getSource() == setCreditLimitbtn){
            if(textCardIDC2.getText().isEmpty() || textGracePeriod.getText().isEmpty() || textCreditLimit.getText().isEmpty()){
                // Show a warning message if any of the fields are empty
                JOptionPane.showMessageDialog(frame, "Please enter all the necessary fields.","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                try{
                    // Getting the values of each field
                    int cardID = Integer.parseInt(textCardIDC2.getText());
                    int gracePeriod = Integer.parseInt(textGracePeriod.getText());
                    double creditLimit = Double.parseDouble(textCreditLimit.getText());
                    String values = "\n CardID:"+cardID+"\n Grace Period:"+gracePeriod+"\n Credit Limit"+creditLimit;
                    if(cards.isEmpty()){
                        JOptionPane.showMessageDialog(frame, "Card not found. Can not set Credit limit.","Warning",JOptionPane.WARNING_MESSAGE);
                    }else{
                        for(BankCard card : cards){
                            if(card instanceof CreditCard){
                                CreditCard creditCard = (CreditCard)card;
                                if(creditCard.getCardId() == cardID){
                                    creditCard.setCreditLimit(creditLimit, gracePeriod);
                                    JOptionPane.showMessageDialog(frame,"Credit limit is set successfully" + values);
                                }else{
                                    JOptionPane.showMessageDialog(frame, "Card not found","Warning",JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        }          
                    }
                }catch(Exception ex){
                    // Showing a warning message if there is an error with the input data
                    JOptionPane.showMessageDialog(frame,"Inaapropriate data filled. Try again","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        if(e.getSource() == cancelCreditCardbtn){
            if(textCardIDC3.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please enter Card ID","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                try{
                    // Getting the value of card id field
                    int cardID = Integer.parseInt(textCardIDC3.getText());
                    int count = 1;
                    //checking if the CardID has been cancel or not
                    for(BankCard card : cards){
                        if(card instanceof CreditCard){
                            CreditCard creditCard = (CreditCard)card;
                            if(creditCard.getCardId() == cardID){
                                if(creditCard.getIsGranted() == true){
                                    creditCard.setCancelCreditCard();
                                    JOptionPane.showMessageDialog(frame,"The Card has been successfully cancelled.");
                                    break;
                                }else{
                                    JOptionPane.showMessageDialog(frame,"The Credit Card has already been cancel");
                                    break;
                                }
                            }else{
                                if(count == cards.size()){
                                    JOptionPane.showMessageDialog(frame,"The entered CardID does not exist.");
                                    break;
                                }   
                            }
                        }else{
                            if(count == cards.size()){
                                JOptionPane.showMessageDialog(frame,"The entered CardID does not exist.");
                                break;
                            }
                        }
                        count ++;
                    }
                }catch(Exception ex){
                    // Showing a warning message if there is an error with the input data
                    JOptionPane.showMessageDialog(frame,"Inaapropriate data filled. Try again","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        if(e.getSource() == displaybtn1){// Check if the Credit Card display button  has been clicked
            // Check if the cards list is empty
            if(cards.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Can not display","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                for (BankCard card : cards){
                    // Check if the card is a credit card object
                    if(card instanceof CreditCard){
                        // Display the credit card information by calling the "display" method
                        ((CreditCard) card).display();
                    }
                }
            }
        }
        if(e.getSource() == displaybtn2){// Check if the Debit Card display button  has been clicked
            // Check if the cards list is empty
            if(cards.isEmpty()){
                // Display a warning message if the list is empty
                JOptionPane.showMessageDialog(frame, "Can not display","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                for (BankCard card : cards){
                    // Check if the card is a debit card object
                    if(card instanceof DebitCard){
                        // Display the debit card information by calling the "display" method
                        ((DebitCard) card).display();
                    }
                }
            }
        }
        if(e.getSource() == clearbtn1){
            int n = JOptionPane.showConfirmDialog(null,"Do you want to clear all","Confirm",JOptionPane.YES_NO_OPTION);
            if(n == JOptionPane.YES_OPTION){
                textCardIDC1.setText("");
                textCardIDC2.setText("");
                textCardIDC3.setText("");
                textName1.setText("");
                textIssuerBank1.setText("");
                textBalanceAmount1.setText("");
                textBankAccount1.setText("");
                textCVCNumber.setText("");
                textInterestRate.setText("");
                textGracePeriod.setText("");
                textCreditLimit.setText("");
                yearComboBox1.setSelectedIndex(0);
                monthComboBox1.setSelectedIndex(0);
                dayComboBox1.setSelectedIndex(0);
            }else{
                JOptionPane.showMessageDialog(frame,"OK");
            }
        }
        if(e.getSource() == clearbtn2){
            int n =JOptionPane.showConfirmDialog(null,"Do you want to clear all","Confirm",JOptionPane.YES_NO_OPTION);
            if(n == JOptionPane.YES_OPTION){
                textCardIDD1.setText("");
                textCardIDD2.setText("");
                textName2.setText("");
                textIssuerBank2.setText("");
                textBalanceAmount2.setText("");
                textBankAccount2.setText("");
                textCVCNumber.setText("");
                textWithdrawalAmount.setText("");
                textPinNumber1.setText("");
                textPinNumber2.setText("");
                yearComboBox2.setSelectedIndex(0);
                monthComboBox2.setSelectedIndex(0);
                dayComboBox2.setSelectedIndex(0);
            }else{
                JOptionPane.showMessageDialog(frame,"OK");
            }
        }
    }
}
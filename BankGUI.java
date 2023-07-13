
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.util.ArrayList;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankGUI implements ActionListener
{
    private JFrame f1,f2,f3,f4,f5,f6;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26;
    
    private ArrayList<BankCard> cards;
    
    

    public BankGUI()
    {
        this.cards = new ArrayList<>();
        



        // creating first frame for bank card  and adding required components 

        f1 = new JFrame("Bank Card");
        f1.setSize(700,700);
        f1.setLayout(null);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);

        Container c = f1.getContentPane();
        c.setBackground(Color.GRAY);

        l1 = new JLabel("Name");
        l1.setBounds(25, 20, 150, 50);
        f1.add(l1);

        l2 = new JLabel("Card Id");
        l2.setBounds(25, 100, 150, 50);
        f1.add(l2);

        l3 = new JLabel("Issuer Bank");
        l3.setBounds(25, 180, 150, 50);
        f1.add(l3);

        l4 = new JLabel("Account");
        l4.setBounds(25, 260, 150, 50);
        f1.add(l4);

        l5 = new JLabel("Balance");
        l5.setBounds(25, 340, 150, 50);
        f1.add(l5);

        t1 = new JTextField();
        t1.setBounds(150, 20, 250, 50);
        f1.add(t1);

        t2 = new JTextField();
        t2.setBounds(150, 100, 250, 50);
        f1.add(t2);

        t3 = new JTextField();
        t3.setBounds(150, 180, 250, 50);
        f1.add(t3);

        t4 = new JTextField();
        t4.setBounds(150, 260, 250, 50);
        f1.add(t4);

        t5 = new JTextField();
        t5.setBounds(150, 340, 250, 50);
        f1.add(t5);

        b1 = new JButton("Debit Card");
        b1.setBounds(150, 420, 150, 50);
        f1.add(b1);

        b2 = new JButton("Credit Card");
        b2.setBounds(350, 420, 150, 50);
        f1.add(b2);

        b3 = new JButton("Display");
        b3.setBounds(100, 550, 150, 50);
        f1.add(b3);

        b4 = new JButton("Clear");
        b4.setBounds(450,550, 150, 50);
        f1.add(b4);

        f1.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
       
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                String a = getName();
                    int b = getCardID();
                    String c = getIssuerBank();
                    String d = getAccount();
                    double ee = getBalance();

                    JOptionPane.showMessageDialog(null,"Name: "+ a+ "\n"+
                                                        "Card Id: "+ b+ "\n"+
                                                        "Bank: "+c+ "\n"+
                                                        "Account: "+d+ "\n"+
                                                        "Balance: "+ee);

            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
            }
        });
        
     
       

        // Creating second frame for debit card


        f2 = new JFrame("Debit Card");
        f2.setSize(700,700);
        f2.setLayout(null);
        f2.setResizable(false);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLocationRelativeTo(null);
        Container cc = f2.getContentPane();
        cc.setBackground(Color.GRAY);

        l6 = new JLabel("PIN Number");
        l6.setBounds(25, 20, 150, 50);
        f2.add(l6);

        l7 = new JLabel("Withdrawl Amount");
        l7.setBounds(25, 100, 150, 50);
        f2.add(l7);

        l28 = new JLabel("Card ID");
        l28.setBounds(25, 180, 150, 50);
        f2.add(l28);

        l8 = new JLabel("Withdrawl Date");
        l8.setBounds(25, 260, 150, 50);
        f2.add(l8);

        JComboBox<String> c1 = new JComboBox<String>(new String[]{"Year","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"});
        c1.setBounds(180, 260, 100, 50);
        f2.add(c1);

        JComboBox<String> c2 = new JComboBox<String>(new String[]{"Month","Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"});
        c2.setBounds(300, 260, 100, 50);
        f2.add(c2);

        JComboBox<String> c3 = new JComboBox<String>(new String[]{"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"});
        c3.setBounds(420, 260, 100, 50);
        f2.add(c3);
      

        t6 = new JTextField();
        t6.setBounds(180, 20, 250, 50);
        f2.add(t6);

        t7 = new JTextField();
        t7.setBounds(180, 100, 250, 50);
        f2.add(t7);

        t25 = new JTextField();
        t25.setBounds(180, 180, 250, 50);
        f2.add(t25);

        b7 = new JButton("Bank Card");
        b7.setBounds(150, 420, 150, 50);
        f2.add(b7);

        b8 = new JButton("Credit Card");
        b8.setBounds(350, 420, 150, 50);
        f2.add(b8);

        b9 = new JButton("Add Debit Card");
        b9.setBounds(180, 340, 150, 50);
        f2.add(b9);

        b10 = new JButton("Withdraw");
        b10.setBounds(360,340, 150, 50);
        f2.add(b10);


        b5 = new JButton("Display");
        b5.setBounds(100, 550, 150, 50);
        f2.add(b5);

        b6 = new JButton("Clear");
        b6.setBounds(450,550, 150, 50);
        f2.add(b6);

        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                double withdrawlAmount = getWithdrawlAmount();
                String a = (String) c1.getSelectedItem();
                String b = (String) c2.getSelectedItem();
                String c = (String) c3.getSelectedItem();

                String dateOfWithdrawl = a+"/"+b+"/"+c;
                int pin = getPinNumber();
                int cardId = getCardID28();
            
                JOptionPane.showMessageDialog(null,"PIN: "+ pin+ "\n"+
                "Card Id: "+ cardId+ "\n"+
                "Amount: "+withdrawlAmount+ "\n"+
                "Date: "+ dateOfWithdrawl);
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                t6.setText("");
                t7.setText("");
                t25.setText("");
                c1.setSelectedIndex(0);
                c2.setSelectedIndex(0);
                c3.setSelectedIndex(0);

            }
        });

        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                double withdrawlAmount = getWithdrawlAmount();
                String a = (String) c1.getSelectedItem();
                String b = (String) c2.getSelectedItem();
                String c = (String) c3.getSelectedItem();

                String dateOfWithdrawl = a+"/"+b+"/"+c;
                int pin = getPinNumber();
                int cardId = getCardID28();
                boolean isFound = false;
                
                if( dateOfWithdrawl=="Year/Month/Day" || a =="Year" || b=="Month" || c=="Day")
                {
                    JOptionPane.showMessageDialog(null,"Please select valid date!","Invalid Date",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    for(BankCard obj: cards)
                    {
                        if(obj instanceof DebitCard)
                        {
                            JOptionPane.showMessageDialog(null,"PIN: "+ pin+ "\n"+
                                                        "Card Id: "+ cardId+ "\n"+
                                                        "Amount: "+withdrawlAmount);
                            DebitCard d = (DebitCard) obj;
                            if(d.getCardID() == cardId)
                            {
                              
                                isFound = true;
                                d.Withdraw(withdrawlAmount, dateOfWithdrawl, pin);
                                break;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Please input correct cardID!","Invalid ",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
               
            }
        });

        // Creating frame for Credit Card

        f3 = new JFrame("Credit Card");
        f3.setSize(700,700);
        f3.setLayout(null);
        f3.setResizable(false);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setLocationRelativeTo(null);
        Container ccc = f3.getContentPane();
        ccc.setBackground(Color.GRAY);

        l9 = new JLabel("CVC Number");
        l9.setBounds(25, 20, 150, 50);
        f3.add(l9);

        l10 = new JLabel("Credit Limit");
        l10.setBounds(25, 100, 150, 50);
        f3.add(l10);

        l11 = new JLabel("Card ID");
        l11.setBounds(25, 180, 150, 50);
        f3.add(l11);

        l12 = new JLabel("Grace Period");
        l12.setBounds(25, 260, 150, 50);
        f3.add(l12);

        l13 = new JLabel("Expiration Date");
        l13.setBounds(25, 340, 150, 50);
        f3.add(l13);

        t8 = new JTextField();
        t8.setBounds(150, 20, 250, 50);
        f3.add(t8);

        t9 = new JTextField();
        t9.setBounds(150, 100, 250, 50);
        f3.add(t9);

        t10 = new JTextField();
        t10.setBounds(150, 180, 250, 50);
        f3.add(t10);

        t11 = new JTextField();
        t11.setBounds(150, 260, 250, 50);
        f3.add(t11);

        JComboBox<String> c4 = new JComboBox<String>(new String[]{"Year","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"});
        c4.setBounds(150, 340, 100, 50);
        f3.add(c4);

        JComboBox<String> c5 = new JComboBox<String>(new String[]{"Month","Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"});
        c5.setBounds(270, 340, 100, 50);
        f3.add(c5);

        JComboBox<String> c6 = new JComboBox<String>(new String[]{"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"});
        c6.setBounds(390, 340, 100, 50);
        f3.add(c6);

        b15 = new JButton("Add Credit Card");
        b15.setBounds(420, 20, 170, 50);
        f3.add(b15);

        b16 = new JButton("Set Credit Limit");
        b16.setBounds(420, 100, 170, 50);
        f3.add(b16);

        b17 = new JButton("Cancel Credit Card");
        b17.setBounds(420, 180, 170, 50);
        f3.add(b17);

        b11 = new JButton("Bank Card");
        b11.setBounds(150, 420, 150, 50);
        f3.add(b11);

        b12 = new JButton("Debit Card");
        b12.setBounds(350, 420, 150, 50);
        f3.add(b12);

        b13 = new JButton("Display");
        b13.setBounds(100, 550, 150, 50);
        f3.add(b13);

        b14 = new JButton("Clear");
        b14.setBounds(450,550, 150, 50);
        f3.add(b14);

        b11.addActionListener(this);
        b12.addActionListener(this);
        b15.addActionListener(this);

        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String a = (String) c4.getSelectedItem();
                String b = (String) c5.getSelectedItem();
                String c = (String) c6.getSelectedItem();

                String dateOfWithdrawl = a+"/"+b+"/"+c;
                double credit = getCreditLimit();
                int cvc = getCvcNumber();
                int id = getCardID10();
                int gracee = getGracePeriod();
            
                JOptionPane.showMessageDialog(null,"CVC: "+ cvc+ "\n"+
                "Credit Limit: "+ credit+ "\n"+
                "Card ID: "+id+ "\n"+
                "Grace: "+gracee +"\n"+
                "Date: "+ dateOfWithdrawl);
            }
        });

        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                t8.setText("");
                t9.setText("");
                t10.setText("");
                t11.setText("");
                c4.setSelectedIndex(0);
                c5.setSelectedIndex(0);
                c6.setSelectedIndex(0);

            }
        });

        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               int id = getCardID10();
               int cvc = getCvcNumber();
               int grace = getGracePeriod();
               double credit = getCreditLimit();

               for(BankCard obj1 : cards){
                if(obj1 instanceof CreditCard){
                  
                  CreditCard c = (CreditCard) obj1;
                  if(c.getCardID() == id){
                    c.setCreditLimit(credit, grace);
                    JOptionPane.showMessageDialog(f3, "Credit Limit added succesfully!!","Credit Limit Added",JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                    JOptionPane.showMessageDialog(f3, " Card ID doesn't match."+"\n Credit Limit cannot be set","Credit Limit not set",JOptionPane.ERROR_MESSAGE);
                  }
                }


            }

            }
        });

        b17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               
                JOptionPane.showMessageDialog(null,"Please input the correct cardID to cancel the credit card!");
                f6.setVisible(true);
                f3.dispose();
            }
        });

         // Creating frame for adding a debit card

         f4 = new JFrame("Adding Debit Card");
         f4.setSize(700,700);
         f4.setLayout(null);
         f4.setResizable(false);
         f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f4.setLocationRelativeTo(null);
 
         Container cccc = f4.getContentPane();
         cccc.setBackground(Color.GRAY);
 
         l14 = new JLabel("Name");
         l14.setBounds(25, 20, 150, 50);
         f4.add(l14);
 
         l15 = new JLabel("Card Id");
         l15.setBounds(25, 100, 150, 50);
         f4.add(l15);
 
         l16 = new JLabel("Issuer Bank");
         l16.setBounds(25, 180, 150, 50);
         f4.add(l16);
 
         l17 = new JLabel("Account");
         l17.setBounds(25, 260, 150, 50);
         f4.add(l17);
 
         l18 = new JLabel("Balance");
         l18.setBounds(25, 340, 150, 50);
         f4.add(l18);
 
         l19 = new JLabel("PIN");
         l19.setBounds(25, 420, 150, 50);
         f4.add(l19);
 
         t12 = new JTextField();
         t12.setBounds(150, 20, 250, 50);
         f4.add(t12);
 
         t13 = new JTextField();
         t13.setBounds(150, 100, 250, 50);
         f4.add(t13);
 
         t14 = new JTextField();
         t14.setBounds(150, 180, 250, 50);
         f4.add(t14);
 
         t15 = new JTextField();
         t15.setBounds(150, 260, 250, 50);
         f4.add(t15);
 
         t16 = new JTextField();
         t16.setBounds(150, 340, 250, 50);
         f4.add(t16);
 
         t17 = new JTextField();
         t17.setBounds(150, 420, 250, 50);
         f4.add(t17);
 
         b21 = new JButton("Back");
         b21.setBounds(100, 550, 150, 50);
         f4.add(b21);
 
         b22 = new JButton("Clear");
         b22.setBounds(450,550, 150, 50);
         f4.add(b22);

         b23 = new JButton("Add");
         b23.setBounds(450, 20, 150, 50);
         f4.add(b23);

         b21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f2.setVisible(true);
                f4.dispose();

            }
        });

        b22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                t12.setText("");
                t13.setText("");
                t14.setText("");
                t15.setText("");
                t16.setText("");
                t17.setText("");
                


            }
        });

        b23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(checkDebitCard(getCardID1())==true)
                {
                try 
                  {
                    int cardId = getCardID1();
                    String clientName =  getName1();
                    String issuerBank = getIssuerBank1();
                    String account = getAccount1();
                    double balance = getBalance1();
                    int pin = getPinNumber1();
                    
                    DebitCard newDebitCard = new DebitCard(balance, cardId, account, issuerBank, clientName, pin);
                    cards.add(newDebitCard);
        
                    JOptionPane.showMessageDialog(null,"DebitCard created succesfully!");
                    
                    
                    
                   } 
                   catch (Exception e1) 
                   {
                    JOptionPane.showMessageDialog(null,"Please follow the instructions properly!");
                   } 
                
                }
            

            }
        });
        
         
         


         // Crreating frame for adding a credit card

         f5 = new JFrame("Adding Credit Card");
         f5.setSize(700,700);
         f5.setLayout(null);
         f5.setResizable(false);
         f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f5.setLocationRelativeTo(null);
 
         Container ccccc = f5.getContentPane();
         ccccc.setBackground(Color.GRAY);
 
         l20 = new JLabel("Name");
         l20.setBounds(25, 20, 150, 50);
         f5.add(l20);
 
         l21 = new JLabel("Card Id");
         l21.setBounds(25, 100, 150, 50);
         f5.add(l21);
 
         l22 = new JLabel("Issuer Bank");
         l22.setBounds(25, 180, 150, 50);
         f5.add(l22);
 
         l23 = new JLabel("Account");
         l23.setBounds(25, 260, 150, 50);
         f5.add(l23);
 
         l24 = new JLabel("Balance");
         l24.setBounds(25, 340, 150, 50);
         f5.add(l24);
 
         l25 = new JLabel("CVC");
         l25.setBounds(25, 420, 150, 50);
         f5.add(l25);

         l26 = new JLabel("Rate");
         l26.setBounds(25, 500, 150, 50);
         f5.add(l26);

         l27 = new JLabel("Expiration");
         l27.setBounds(25, 580, 150, 50);
         f5.add(l27);
 
         t18 = new JTextField();
         t18.setBounds(150, 20, 250, 50);
         f5.add(t18);
 
         t19 = new JTextField();
         t19.setBounds(150, 100, 250, 50);
         f5.add(t19);
 
         t20 = new JTextField();
         t20.setBounds(150, 180, 250, 50);
         f5.add(t20);
 
         t21 = new JTextField();
         t21.setBounds(150, 260, 250, 50);
         f5.add(t21);
 
         t22 = new JTextField();
         t22.setBounds(150, 340, 250, 50);
         f5.add(t22);
 
         t23 = new JTextField();
         t23.setBounds(150, 420, 250, 50);
         f5.add(t23);

         t24 = new JTextField();
         t24.setBounds(150, 500, 250, 50);
         f5.add(t24);
 
         b18 = new JButton("Back");
         b18.setBounds(450, 100, 150, 50);
         f5.add(b18);
 
         b19 = new JButton("Clear");
         b19.setBounds(450,180, 150, 50);
         f5.add(b19);

         b20 = new JButton("Add");
         b20.setBounds(450, 20, 150, 50);
         f5.add(b20);

         JComboBox<String> c7 = new JComboBox<String>(new String[]{"Year","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"});
         c7.setBounds(150, 580, 100, 50);
         f5.add(c7);
 
         JComboBox<String> c8 = new JComboBox<String>(new String[]{"Month","Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"});
         c8.setBounds(270, 580, 100, 50);
         f5.add(c8);
 
         JComboBox<String> c9 = new JComboBox<String>(new String[]{"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"});
         c9.setBounds(390, 580, 100, 50);
         f5.add(c9);

         b18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f3.setVisible(true);
                f5.dispose();

            }
        });

        b19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                t18.setText("");
                t19.setText("");
                t20.setText("");
                t21.setText("");
                t22.setText("");
                t23.setText("");
                t24.setText("");
                
                


            }
        });

        b20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(checkCreditCard(getCardID2())==true)
                {
                    try 
                        {
                        int cardId = getCardID2();
                            String clientName = getName2();
                            String issuerBank = getIssuerBank2();
                            String account = getAccount2();
                            double balance = getBalance2();
                            int cvc = getCvcNumber1();
                            double interest = getInterestRate1();
                            String a = (String) c7.getSelectedItem();
                            String b = (String) c8.getSelectedItem();
                            String c = (String) c9.getSelectedItem();

                            String expire = a+"/"+b+"/"+c;

                            if( expire=="YearMonthDay" || a =="Year" || b=="Month" || c=="Day")
                            {
                                JOptionPane.showMessageDialog(null,"Please select valid date!","Invalid Date",JOptionPane.ERROR_MESSAGE);
                            }
                            else{
                                CreditCard newCreditCard = new CreditCard(cardId, clientName, issuerBank, account, balance, cvc, interest, expire);
                                cards.add(newCreditCard);
                                JOptionPane.showMessageDialog(null,"CreditCard created succesfully!");
                            }                        
                       } 
                       catch (Exception ee) 
                       {
                        JOptionPane.showMessageDialog(null,"Please follow the instructions properly!");
                       }  
                
                }
                

            }
        });

        // Frame for cancelling credit card

        f6 = new JFrame("Cancel Credit Card");
        f6.setSize(400,400);
        f6.setLayout(null);
        f6.setResizable(false);
        f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f6.setLocationRelativeTo(null);

        Container cccccc = f6.getContentPane();
        cccccc.setBackground(Color.GRAY);

        l29 = new JLabel("Card ID");
        l29.setBounds(25, 20, 150, 50);
        f6.add(l29);

        t26 = new JTextField();
        t26.setBounds(130, 20, 200, 50);
        f6.add(t26);

        b24 = new JButton("Back");
        b24.setBounds(40, 95, 150, 50);
        f6.add(b24);

        b25 = new JButton("Cancel");
        b25.setBounds(220, 95, 150, 50);
        f6.add(b25);

        b24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f3.setVisible(true);
                f6.dispose();
            }
        });
 
        b25.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                for(BankCard obj: cards)
                    {
                        if(obj instanceof CreditCard)
                        {
                            CreditCard c = (CreditCard) obj;
                            if(c.getCardID() == getCardID26())
                            {
                              c.cancelCreditCard();
                              JOptionPane.showMessageDialog(null,"Credit card cancelled succesfully!");

                               
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Please input correct cardID!","Invalid ",JOptionPane.ERROR_MESSAGE);
                            }
            }
        }}
        });


    }


    // Actionperformed class for event handeling

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            f2.setVisible(true);
            f1.dispose();
        }
        else if(ae.getSource()==b2)
        {
            f3.setVisible(true);
            f1.dispose();
        }
        else if(ae.getSource()==b7)
        {
            f1.setVisible(true);
            f2.dispose();
        }
        else if(ae.getSource()==b8)
        {
            f3.setVisible(true);
            f2.dispose();
        }
        else if(ae.getSource()==b11)
        {
            f1.setVisible(true);
            f3.dispose();
        }
        else if(ae.getSource()==b12)
        {
            f2.setVisible(true);
            f3.dispose();
        }

        if (ae.getSource() == b9 ) {
            f4.setVisible(true);
            JOptionPane.showMessageDialog(null,"Please input these fields and press the add button!"+ "\n" +
                                                        "Name: " + "\n" +
                                                        "Card Id: "+ "\n"+
                                                        "Bank: "+"\n"+
                                                        "Account: "+"\n"+
                                                        "Pin: " + "\n" +
                                                        "Balance: ");
                                                    }


        if (ae.getSource() == b15 ) {
            f5.setVisible(true);
            JOptionPane.showMessageDialog(null,"Please input these fields and press the add button!"+ "\n" +
                                                        "Name: " + "\n" +
                                                        "Card Id: "+ "\n"+
                                                        "Bank: "+"\n"+
                                                        "Account: "+"\n"+
                                                        "Pin: " + "\n" +
                                                        "CVC: "+"\n"+
                                                        "Interest: "+"\n"+
                                                        "Expiry date: " + "\n" +
                                                        "Balance: ");
                                                    }
    }

    

    // Getter methods for Bank Card

    public String getName() throws RuntimeException
    {
        String name = t1.getText().trim();
        if(name.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("");
        }
        return name;
    }

    public int getCardID() throws NumberFormatException 
    {
        int id = 0;
        try {
            id = Integer.parseInt(t2.getText().trim());
            if (id <= 0) {
                throw new NumberFormatException("Card ID must be a positive number");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f1, "Please enter a valid number for Card ID.", "Invalid", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return id;
    }
    

    public String getIssuerBank()
    {
        String bank = t3.getText().trim();
        if(bank.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bank cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return bank;
    }

    public String getAccount()
    {
       String account = t4.getText().trim();
       if(account.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Account cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }
       return account;
    } 

    public double getBalance() throws NumberFormatException {
        double balance = 0;
        try {
            balance = Double.parseDouble(t5.getText().trim());
            if (balance <= 0) {
                throw new NumberFormatException("Balance must be a positive number");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f1, "Please enter a valid number for Balance.", "Invalid", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return balance;
    }
    
        
        
     
    


    // Getter methods for Debit Card

    public int getPinNumber()
    {

        final int Invalid_Pin = -1;
        try  
        {
            int pin = Integer.parseInt(t6.getText().trim());
            if(pin<=0)
            {
                JOptionPane.showMessageDialog(f2, "Enter a valid pin.", "Invalid", JOptionPane.ERROR_MESSAGE);
                return Invalid_Pin;
            }
            else
            {
                return pin;
            }   
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(f2, "Please enter valid pin .", "Invalid", JOptionPane.ERROR_MESSAGE);
            return Invalid_Pin;
        }
    }

    public double getWithdrawlAmount() throws NumberFormatException {
        double withamtt = 0;
        try {
            withamtt = Double.parseDouble(t7.getText().trim());
            if (withamtt < 0) {
                throw new NumberFormatException(" must be a positive number");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f2, "Please enter a valid number.", "Invalid", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return withamtt;
    }

    public int getCardID28() throws NumberFormatException 
    {
        int id = 0;
        try {
            id = Integer.parseInt(t25.getText().trim());
            if (id <= 0) {
                throw new NumberFormatException("Card ID must be a positive number");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f2, "Please enter a valid number for Card ID.", "Invalid", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return id;
    }

    // Getter methods for Credit Card 

    public int getCvcNumber() throws NumberFormatException 
    {
        int cvc = 0;
        try {
            cvc = Integer.parseInt(t8.getText().trim());
            if (cvc <= 0) {
                throw new NumberFormatException("Cvc must be a positive number");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f3, "Please enter a valid number for Cvc.", "CVC", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return cvc;
    }
    
    public double getCreditLimit() throws NumberFormatException {
        double limit = 0;
        try {
            limit = Double.parseDouble(t9.getText().trim());
            if (limit <= 0) {
                throw new NumberFormatException(" Must be a positive number");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f3, "Please enter a valid number.", "Limit", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return limit;
    }

    public int getCardID10() throws NumberFormatException {
        int id = 0;
        try {
            id = Integer.parseInt(t10.getText().trim());
            if (id <= 0) {
                throw new NumberFormatException(" Must be a positive number");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f3, "Please enter a valid number.", "Rate", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return id;
    }

    public int getGracePeriod() throws NumberFormatException 
    {
        int grace = 0;
        try {
            grace = Integer.parseInt(t11.getText().trim());
            if (grace <= 0) {
                throw new NumberFormatException("Must be a positive number");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f3, "Please enter a valid number.", "Grace", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return grace;
    }

     // Getter methods for Adding Debit Card

     public String getName1() throws RuntimeException
     {
         String name = t12.getText().trim();
         if(name.isEmpty())
         {
             JOptionPane.showMessageDialog(null, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             throw new RuntimeException("");
         }
         return name;
     }
 
     public int getCardID1() throws NumberFormatException 
     {
         int id = 0;
         try {
             id = Integer.parseInt(t13.getText().trim());
             if (id <= 0) {
                 throw new NumberFormatException("Card ID must be a positive number");
             }
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(f4, "Please enter a valid number for Card ID.", "Invalid", JOptionPane.ERROR_MESSAGE);
             throw e;
         }
         return id;
     }
     
 
     public String getIssuerBank1()
     {
         String bank = t14.getText().trim();
         if(bank.isEmpty())
         {
             JOptionPane.showMessageDialog(null, "Bank cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
         }
         return bank;
     }
 
     public String getAccount1()
     {
        String account = t15.getText().trim();
        if(account.isEmpty())
         {
             JOptionPane.showMessageDialog(null, "Account cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
         }
        return account;
     } 
 
     public double getBalance1() throws NumberFormatException {
         double balance = 0;
         try {
             balance = Double.parseDouble(t16.getText().trim());
             if (balance <= 0) {
                 throw new NumberFormatException("Balance must be a positive number");
             }
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(f4, "Please enter a valid number for Balance.", "Invalid", JOptionPane.ERROR_MESSAGE);
             throw e;
         }
         return balance;
     }
     
 
     public int getPinNumber1() throws NumberFormatException
     {
 
        int pin = 0;
         try {
             pin = Integer.parseInt(t17.getText().trim());
             if (pin <= 0) {
                 throw new NumberFormatException("Invalid PIN");
             }
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(f4, "Please enter a valid PIN.", "Invalid", JOptionPane.ERROR_MESSAGE);
             throw e;
         }
         return pin;
     }
    
    
     // Getter methods for adding a credit card

     public String getName2() throws RuntimeException
     {
         String name = t18.getText().trim();
         if(name.isEmpty())
         {
             JOptionPane.showMessageDialog(null, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             throw new RuntimeException("");
         }
         return name;
     }
 
     public int getCardID26() throws NumberFormatException 
     {
         int id = 0;
         try {
             id = Integer.parseInt(t26.getText().trim());
             if (id <= 0) {
                 throw new NumberFormatException("Card ID must be a positive number");
             }
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(f6, "Please enter a valid number for Card ID.", "Invalid", JOptionPane.ERROR_MESSAGE);
             throw e;
         }
         return id;
     }
     
 
     public String getIssuerBank2()
     {
         String bank = t20.getText().trim();
         if(bank.isEmpty())
         {
             JOptionPane.showMessageDialog(null, "Bank cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
         }
         return bank;
     }
 
     public String getAccount2()
     {
        String account = t21.getText().trim();
        if(account.isEmpty())
         {
             JOptionPane.showMessageDialog(null, "Account cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
         }
        return account;
     } 
 
     public double getBalance2() throws NumberFormatException {
         double balance = 0;
         try {
             balance = Double.parseDouble(t22.getText().trim());
             if (balance <= 0) {
                 throw new NumberFormatException("Balance must be a positive number");
             }
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(f5, "Please enter a valid number for Balance.", "Invalid", JOptionPane.ERROR_MESSAGE);
             throw e;
         }
         return balance;
     }

     public int getCvcNumber1() throws NumberFormatException 
     {
         int cvc = 0;
         try {
             cvc = Integer.parseInt(t23.getText().trim());
             if (cvc <= 0) {
                 throw new NumberFormatException("Must be a positive number");
             }
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(f5, "Please enter a valid number.", "Invalid", JOptionPane.ERROR_MESSAGE);
             throw e;
         }
         return cvc;
     }

     public double getInterestRate1() throws NumberFormatException {
        double interest = 0;
        try {
            interest = Double.parseDouble(t24.getText().trim());
            if (interest <= 0) {
                throw new NumberFormatException("Interest must be a positive number");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f5, "Please enter a valid number.", "Invalid", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return interest;
    }

    // Getter method for cancelling credit card

    public int getCardID2() throws NumberFormatException 
    {
        int id = 0;
        try {
            id = Integer.parseInt(t19.getText().trim());
            if (id <= 0) {
                throw new NumberFormatException("Card ID must be a positive number");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f5, "Please enter a valid number for Card ID.", "Invalid", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return id;
    }

    //  Method for checking if Card id is unique 
    
    public boolean checkDebitCard(int cardID)
    {
        boolean isUnique = true;
        for (BankCard obj: cards)
        {
            if(obj instanceof DebitCard)
            {
                DebitCard d = (DebitCard) obj;
                if(d.getCardID() == cardID)
                {
                    JOptionPane.showMessageDialog(f4, "Card ID is already added. Please add different ID.","not unique",JOptionPane.WARNING_MESSAGE);
                    isUnique = false;
                    break;
                }
            }
        }
        return isUnique;
    }

    public boolean checkCreditCard(int cardID)
    {
        boolean isUnique = true;
        for (BankCard obj: cards)
        {
            if(obj instanceof CreditCard)
            {
                CreditCard d = (CreditCard) obj;
                if(d.getCardID() == cardID)
                {
                    JOptionPane.showMessageDialog(f5, "Card ID is already added. Please add different ID.","not unique",JOptionPane.WARNING_MESSAGE);
                    isUnique = false;
                    break;
                }
            }
        }
        return isUnique;
    }




    public static void main(String[] args) {
        new BankGUI();
        
    }

}











































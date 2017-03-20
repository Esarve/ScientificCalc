/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author sourav
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    boolean tswitch = false; //For using the SCI button
    //boolean allSwichOff = false;
    
    public Calculator() {
        initComponents();
        SciModeOFF();
        On_key.setSelected(true);
    }
    
    double number, answer;
    int calc;
    
    public void engine(){
        switch(calc){
            case 1: //Add
                answer=number+ Double.parseDouble(Display_window.getText());
                Display_window.setText(Double.toString(answer));
                break;
            case 2: //Substract
                answer=number- Double.parseDouble(Display_window.getText());
                Display_window.setText(Double.toString(answer));
                break;
            case 3: //Multiplication
                answer=number * Double.parseDouble(Display_window.getText());
                Display_window.setText(Double.toString(answer));
                break;
            case 4: //Division
                answer=number / Double.parseDouble(Display_window.getText());
                Display_window.setText(Double.toString(answer));
                break;
            case 5: //Squre Root
                answer=Math.sqrt(Double.parseDouble(Display_window.getText()));
                Display_window.setText(Double.toString(answer));
                break;
            case 6: //Squre
                answer=Math.pow(Double.parseDouble(Display_window.getText()), 2);
                Display_window.setText(Double.toString(answer));
                break;
            case 7: //Exponential
                answer= Math.pow(number, Integer.parseInt(Display_window.getText()));
                Display_window.setText(Double.toString(answer));
                break;
            case 8: //Sine
                answer=Math.sin(Math.toRadians(Double.parseDouble(Display_window.getText())));
                Display_window.setText(Double.toString(answer));
                break;
            case 9: //Cosine
                answer=Math.cos(Math.toRadians(Double.parseDouble(Display_window.getText())));
                Display_window.setText(Double.toString(answer));
                break;
            case 10: //Tangent
                try {
                    answer=Math.tan(Math.toRadians(Double.parseDouble(Display_window.getText())));
                } catch (ArithmeticException e) {
                    Display_window.setText("Math Error");
                    break;
                }
                Display_window.setText(Double.toString(answer));
                break;
            case 11: //Ln
                answer=Math.log10(Double.parseDouble(Display_window.getText()));
                Display_window.setText(Double.toString(answer));
                break;
        }
    }
    
    public void powerON(){
        Display_window.setEnabled(true);
        Backspace_key.setEnabled(true);
        One_number_key.setEnabled(true);
        Alldelete_key.setEnabled(true);
        Two_number_key.setEnabled(true);
        Minus_key.setEnabled(true);
        Three_number_key.setEnabled(true);
        Six_number_key.setEnabled(true);
        Five_number_key.setEnabled(true);
        Four_number_key.setEnabled(true);
        Equal_key.setEnabled(true);
        Zero_number_key.setEnabled(true);
        Dot_key.setEnabled(true);
        Seven_number_key.setEnabled(true);
        Eight_number_key.setEnabled(true);
        Nine_number_key.setEnabled(true);
        Addition_key.setEnabled(true);
        Multiplication_key.setEnabled(true);
        Division_key.setEnabled(true);
        Scientific_pic.setEnabled(true);
    }
    public void powerOFF(){
        Display_window.setEnabled(false);
        Backspace_key.setEnabled(false);
        One_number_key.setEnabled(false);
        Alldelete_key.setEnabled(false);
        Two_number_key.setEnabled(false);
        Minus_key.setEnabled(false);
        Three_number_key.setEnabled(false);
        Six_number_key.setEnabled(false);
        Five_number_key.setEnabled(false);
        Four_number_key.setEnabled(false);
        Equal_key.setEnabled(false);
        Zero_number_key.setEnabled(false);
        Dot_key.setEnabled(false);
        Seven_number_key.setEnabled(false);
        Eight_number_key.setEnabled(false);
        Nine_number_key.setEnabled(false);
        Addition_key.setEnabled(false);
        Multiplication_key.setEnabled(false);
        Division_key.setEnabled(false);
        Square_key.setEnabled(false);
        Log_key.setEnabled(false);
        Root_key.setEnabled(false);
        Exponential_key.setEnabled(false);
        Factorial_key.setEnabled(false);
        Sin_key.setEnabled(false);
        Ln_key.setEnabled(false);
        Tan_key.setEnabled(false);
        Cos_key.setEnabled(false);
        Scientific_pic.setEnabled(false);
        
    }
    
    public void SciModeOn(){
        Square_key.setEnabled(true);
        Log_key.setEnabled(true);
        Root_key.setEnabled(true);
        Exponential_key.setEnabled(true);
        Factorial_key.setEnabled(true);
        Sin_key.setEnabled(true);
        Ln_key.setEnabled(true);
        Tan_key.setEnabled(true);
        Cos_key.setEnabled(true);
        tswitch = true;
        
    }
    
    public void SciModeOFF(){
        Square_key.setEnabled(false);
        Log_key.setEnabled(false);
        Root_key.setEnabled(false);
        Exponential_key.setEnabled(false);
        Factorial_key.setEnabled(false);
        Sin_key.setEnabled(false);
        Ln_key.setEnabled(false);
        Tan_key.setEnabled(false);
        Cos_key.setEnabled(false);
        tswitch=false;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Display_window = new javax.swing.JTextField();
        On_key = new javax.swing.JRadioButton();
        OFF_key = new javax.swing.JRadioButton();
        Backspace_key = new javax.swing.JButton();
        One_number_key = new javax.swing.JButton();
        Alldelete_key = new javax.swing.JButton();
        Two_number_key = new javax.swing.JButton();
        Minus_key = new javax.swing.JButton();
        Three_number_key = new javax.swing.JButton();
        Six_number_key = new javax.swing.JButton();
        Five_number_key = new javax.swing.JButton();
        Four_number_key = new javax.swing.JButton();
        Equal_key = new javax.swing.JButton();
        Zero_number_key = new javax.swing.JButton();
        Dot_key = new javax.swing.JButton();
        Seven_number_key = new javax.swing.JButton();
        Eight_number_key = new javax.swing.JButton();
        Nine_number_key = new javax.swing.JButton();
        Addition_key = new javax.swing.JButton();
        Multiplication_key = new javax.swing.JButton();
        Division_key = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Square_key = new javax.swing.JButton();
        Log_key = new javax.swing.JButton();
        Root_key = new javax.swing.JButton();
        Exponential_key = new javax.swing.JButton();
        Factorial_key = new javax.swing.JButton();
        Sin_key = new javax.swing.JButton();
        Ln_key = new javax.swing.JButton();
        Tan_key = new javax.swing.JButton();
        Cos_key = new javax.swing.JButton();
        Scientific_pic = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);


        
        // Display_window.setBackground(new java.awt.Color(254, 254, 254));
        // Display_window.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        // Display_window.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        // Display_window.setToolTipText("");
        // Display_window.addActionListener(new java.awt.event.ActionListener() {
        // Display_window.setEditable(false);
        // Display_window.setBackground(new java.awt.Color(254, 254, 254));
        // Display_window.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        // Display_window.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        // Display_window.setToolTipText("");

        Display_window.setEditable(false);
        Display_window.setBackground(new java.awt.Color(254, 254, 254));
        Display_window.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        Display_window.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Display_window.setToolTipText("");


        // buttonGroup1.add(jRadioButton1);
        // jRadioButton1.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        // jRadioButton1.setText("On");
        // jRadioButton1.setToolTipText("Turns off Calculator");
        // jRadioButton1.addActionListener(new java.awt.event.ActionListener() {

        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         Display_windowActionPerformed(evt);
        //     }
        // });

        buttonGroup1.add(On_key);
        On_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        On_key.setText("On");
        On_key.setToolTipText("Turns off Calculator");
        On_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                On_keyActionPerformed(evt);
            }
        });

        buttonGroup1.add(OFF_key);
        OFF_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        OFF_key.setText("OFF");
        OFF_key.setToolTipText("Turns off calculator");
        OFF_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFF_keyActionPerformed(evt);
            }
        });

        Backspace_key.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Backspace_key.setText("← ");
        Backspace_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Backspace_keyActionPerformed(evt);
            }
        });

        One_number_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        One_number_key.setText("1");
        One_number_key.setToolTipText("");
        One_number_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                One_number_keyActionPerformed(evt);
            }
        });

        Alldelete_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Alldelete_key.setText("C");
        Alldelete_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alldelete_keyActionPerformed(evt);
            }
        });

        Two_number_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Two_number_key.setText("2");
        Two_number_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Two_number_keyActionPerformed(evt);
            }
        });

        Minus_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Minus_key.setText("-");
        Minus_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minus_keyActionPerformed(evt);
            }
        });

        Three_number_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Three_number_key.setText("3");
        Three_number_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Three_number_keyActionPerformed(evt);
            }
        });

        Six_number_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Six_number_key.setText("6");
        Six_number_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Six_number_keyActionPerformed(evt);
            }
        });

        Five_number_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Five_number_key.setText("5");
        Five_number_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Five_number_keyActionPerformed(evt);
            }
        });

        Four_number_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Four_number_key.setText("4");
        Four_number_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Four_number_keyActionPerformed(evt);
            }
        });

        Equal_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Equal_key.setText("=");
        Equal_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Equal_keyActionPerformed(evt);
            }
        });

        Zero_number_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Zero_number_key.setText("0");
        Zero_number_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zero_number_keyActionPerformed(evt);
            }
        });

        Dot_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Dot_key.setText(".");
        Dot_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dot_keyActionPerformed(evt);
            }
        });

        Seven_number_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Seven_number_key.setText("7");
        Seven_number_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seven_number_keyActionPerformed(evt);
            }
        });

        Eight_number_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Eight_number_key.setText("8");
        Eight_number_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eight_number_keyActionPerformed(evt);
            }
        });

        Nine_number_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Nine_number_key.setText("9");
        Nine_number_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nine_number_keyActionPerformed(evt);
            }
        });

        Addition_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Addition_key.setText("+");
        Addition_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addition_keyActionPerformed(evt);
            }
        });

        Multiplication_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Multiplication_key.setText("×");
        Multiplication_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Multiplication_keyActionPerformed(evt);
            }
        });

        Division_key.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        Division_key.setText("÷");
        Division_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Division_keyActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(236, 106, 85));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        Square_key.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Square_key.setText("x²");
        Square_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Square_keyActionPerformed(evt);
            }
        });

        Log_key.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Log_key.setText("log");
        Log_key.setPreferredSize(new java.awt.Dimension(23, 35));
        Log_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_keyActionPerformed(evt);
            }
        });

        Root_key.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Root_key.setText("√");
        Root_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Root_keyActionPerformed(evt);
            }
        });

        Exponential_key.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Exponential_key.setText("^");
        Exponential_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exponential_keyActionPerformed(evt);
            }
        });

        Factorial_key.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Factorial_key.setText("!");

        Sin_key.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Sin_key.setText("sin");
        Sin_key.setPreferredSize(new java.awt.Dimension(23, 35));
        Sin_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sin_keyActionPerformed(evt);
            }
        });

        Ln_key.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ln_key.setText("ln");
        Ln_key.setPreferredSize(new java.awt.Dimension(23, 35));
        Ln_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ln_keyActionPerformed(evt);
            }
        });

        Tan_key.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tan_key.setText("tan");
        Tan_key.setPreferredSize(new java.awt.Dimension(23, 35));
        Tan_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tan_keyActionPerformed(evt);
            }
        });

        Cos_key.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cos_key.setText("cos");
        Cos_key.setPreferredSize(new java.awt.Dimension(23, 35));
        Cos_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cos_keyActionPerformed(evt);
            }
        });

        Scientific_pic.setText("SCI");
        Scientific_pic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scientific_picActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Dot_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Zero_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Equal_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Seven_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Eight_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Nine_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Two_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(Four_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(Five_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(One_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Six_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Three_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Addition_key, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Multiplication_key, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Minus_key, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Cos_key, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                            .addComponent(Sin_key, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Log_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Tan_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OFF_key)
                                    .addComponent(Scientific_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(210, 210, 210)
                                .addComponent(Division_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(On_key, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(210, 210, 210)
                                .addComponent(Exponential_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Backspace_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Alldelete_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)
                                        .addComponent(Ln_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Root_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Square_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)
                                        .addComponent(Factorial_key, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Display_window, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Display_window, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(On_key, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Square_key)
                        .addComponent(Root_key)
                        .addComponent(Exponential_key)
                        .addComponent(Factorial_key)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Backspace_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Alldelete_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Division_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OFF_key)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Scientific_pic)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Multiplication_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Log_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(One_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Two_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Three_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Four_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Five_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Six_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Minus_key, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tan_key, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Ln_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cos_key, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sin_key, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Seven_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eight_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nine_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Equal_key, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Dot_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Zero_number_key, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Addition_key, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void On_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_On_keyActionPerformed
        powerON();
    }//GEN-LAST:event_On_keyActionPerformed

    private void OFF_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFF_keyActionPerformed
        powerOFF(); //Calling powerOFF method
    }//GEN-LAST:event_OFF_keyActionPerformed

    private void Two_number_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Two_number_keyActionPerformed
        Display_window.setText(Display_window.getText()+"2");
    }//GEN-LAST:event_Two_number_keyActionPerformed

    private void Minus_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minus_keyActionPerformed
        number = Double.parseDouble(Display_window.getText());
        calc=2;
        Display_window.setText("");
        jLabel2.setText(number + " -");
    }//GEN-LAST:event_Minus_keyActionPerformed

    private void Three_number_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Three_number_keyActionPerformed
        Display_window.setText(Display_window.getText()+"3");
    }//GEN-LAST:event_Three_number_keyActionPerformed

    private void Six_number_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Six_number_keyActionPerformed
        Display_window.setText(Display_window.getText()+"6");
    }//GEN-LAST:event_Six_number_keyActionPerformed

    private void Five_number_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Five_number_keyActionPerformed
        Display_window.setText(Display_window.getText()+"5");
    }//GEN-LAST:event_Five_number_keyActionPerformed

    private void Equal_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Equal_keyActionPerformed
        engine();
        jLabel2.setText("");
    }//GEN-LAST:event_Equal_keyActionPerformed

    private void Zero_number_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zero_number_keyActionPerformed
        Display_window.setText(Display_window.getText()+"0");
    }//GEN-LAST:event_Zero_number_keyActionPerformed

    private void Eight_number_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eight_number_keyActionPerformed
        Display_window.setText(Display_window.getText()+"8");
    }//GEN-LAST:event_Eight_number_keyActionPerformed

    private void Nine_number_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nine_number_keyActionPerformed
        Display_window.setText(Display_window.getText()+"9");
    }//GEN-LAST:event_Nine_number_keyActionPerformed

    private void Addition_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addition_keyActionPerformed
        number = Double.parseDouble(Display_window.getText());
        calc=1;
        Display_window.setText("");
        jLabel2.setText(number + " +");
    }//GEN-LAST:event_Addition_keyActionPerformed

    private void Multiplication_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Multiplication_keyActionPerformed
        number = Double.parseDouble(Display_window.getText());
        calc=3;
        Display_window.setText("");
        jLabel2.setText(number + " *");
    }//GEN-LAST:event_Multiplication_keyActionPerformed

    private void Division_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Division_keyActionPerformed
        number = Double.parseDouble(Display_window.getText());
        calc=4;
        Display_window.setText("");
        jLabel2.setText(number + " /");
    }//GEN-LAST:event_Division_keyActionPerformed

    private void One_number_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_One_number_keyActionPerformed
        Display_window.setText(Display_window.getText()+"1");
    }//GEN-LAST:event_One_number_keyActionPerformed

    private void Dot_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dot_keyActionPerformed
        Display_window.setText(Display_window.getText()+".");
    }//GEN-LAST:event_Dot_keyActionPerformed

    private void Four_number_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Four_number_keyActionPerformed
        Display_window.setText(Display_window.getText()+"4");
    }//GEN-LAST:event_Four_number_keyActionPerformed

    private void Seven_number_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seven_number_keyActionPerformed
        Display_window.setText(Display_window.getText()+"7");
    }//GEN-LAST:event_Seven_number_keyActionPerformed

    private void Alldelete_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alldelete_keyActionPerformed
        Display_window.setText("");
        Display_window.setText("");
    }//GEN-LAST:event_Alldelete_keyActionPerformed

    private void Backspace_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Backspace_keyActionPerformed
        int length = Display_window.getText().length();
        int number = Display_window.getText().length()-1;
        String store;
        
        if (length>0){
            StringBuilder dlt = new StringBuilder(Display_window.getText());
            dlt.deleteCharAt(number);
            store=dlt.toString();
            Display_window.setText(store);
        }
    }//GEN-LAST:event_Backspace_keyActionPerformed

    private void Cos_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cos_keyActionPerformed
        jLabel2.setText("Cos("+Display_window.getText()+")");
        calc=9;
        engine();
    }//GEN-LAST:event_Cos_keyActionPerformed

    private void Root_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Root_keyActionPerformed
        jLabel2.setText("SqureRoot("+Display_window.getText()+")");
        calc=5;
        engine();
    }//GEN-LAST:event_Root_keyActionPerformed

    private void Square_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Square_keyActionPerformed
        jLabel2.setText("Squreing("+Display_window.getText()+")");
        calc=6;
        engine();
    }//GEN-LAST:event_Square_keyActionPerformed

    private void Exponential_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exponential_keyActionPerformed
        jLabel2.setText(Display_window.getText()+"^");
        calc=7;
        number = Double.parseDouble(Display_window.getText());
        Display_window.setText("");
        engine();
    }//GEN-LAST:event_Exponential_keyActionPerformed

    private void Sin_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sin_keyActionPerformed
        jLabel2.setText("Sin("+Display_window.getText()+")");
        calc=8;
        engine();
    }//GEN-LAST:event_Sin_keyActionPerformed

    private void Tan_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tan_keyActionPerformed
        jLabel2.setText("Tan("+Display_window.getText()+")");
        calc=10;
        engine();
    }//GEN-LAST:event_Tan_keyActionPerformed

    private void Log_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_keyActionPerformed
        jLabel2.setText("log("+Display_window.getText()+")");
        calc=11;
        engine();
    }//GEN-LAST:event_Log_keyActionPerformed

    private void Scientific_picActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scientific_picActionPerformed
        if(tswitch){
            SciModeOFF();
        }else
        SciModeOn();
    }//GEN-LAST:event_Scientific_picActionPerformed

    private void Ln_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ln_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ln_keyActionPerformed

    private void Display_windowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_windowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Display_windowActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addition_key;
    private javax.swing.JButton Alldelete_key;
    private javax.swing.JButton Backspace_key;
    private javax.swing.JButton Cos_key;
    private javax.swing.JTextField Display_window;
    private javax.swing.JButton Division_key;
    private javax.swing.JButton Dot_key;
    private javax.swing.JButton Eight_number_key;
    private javax.swing.JButton Equal_key;
    private javax.swing.JButton Exponential_key;
    private javax.swing.JButton Factorial_key;
    private javax.swing.JButton Five_number_key;
    private javax.swing.JButton Four_number_key;
    private javax.swing.JButton Ln_key;
    private javax.swing.JButton Log_key;
    private javax.swing.JButton Minus_key;
    private javax.swing.JButton Multiplication_key;
    private javax.swing.JButton Nine_number_key;
    private javax.swing.JRadioButton OFF_key;
    private javax.swing.JRadioButton On_key;
    private javax.swing.JButton One_number_key;
    private javax.swing.JButton Root_key;
    private javax.swing.JToggleButton Scientific_pic;
    private javax.swing.JButton Seven_number_key;
    private javax.swing.JButton Sin_key;
    private javax.swing.JButton Six_number_key;
    private javax.swing.JButton Square_key;
    private javax.swing.JButton Tan_key;
    private javax.swing.JButton Three_number_key;
    private javax.swing.JButton Two_number_key;
    private javax.swing.JButton Zero_number_key;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;

    // End of variables declaration//GEN-END:variables
}

package projectsPractice;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumit CodeBrewer
 */
public class ScientificCalculator {

    String str = "", mod = "", s2;
    String s1;
    int a, b, c = 0;
    char ch;
    boolean isDoubleOp = false;
    TextField tf;
    Frame f1;

    ScientificCalculator() {
        Font f2 = new Font("TimesRoman", Font.PLAIN, 36);
        Font f3 = new Font("Arial", Font.PLAIN, 24);
        Font f4 = new Font("Arial", Font.PLAIN, 8);
        f1 = new Frame("   Scientific Calculator Made by Sumit CodeBrewer ©2021  ");
        Panel p = new Panel();
        f1.setFont(f3);
        tf = new TextField();
        tf.setPreferredSize(new Dimension(600, 80));
        tf.setFont(f2);
        Button b1a = new Button("sin");
        b1a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.sin(Double.valueOf(s1).doubleValue());
            }
        });
        Button b1b = new Button("cos");
        b1b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = "" + Math.cos(Double.valueOf(s1).doubleValue());
            }
        });
        Button b1c = new Button("tan");
        b1c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = "" + Math.tan(Double.valueOf(s1).doubleValue());
            }
        });
        CheckboxGroup cb = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Deg", cb, true);
        Checkbox c2 = new Checkbox("Rad", cb, false);
        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (c1.getState()) {
                    mod = "deg";
                }
            }
        });
        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (c2.getState()) {
                    mod = "rad";
                }
            }
        });
        Button b1 = new Button("1");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += "1";
                tf.setText(str);
            }
        });
        Button b2 = new Button("2");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += "2";
                tf.setText(str);
            }
        });
        Button b2a = new Button("sin^-1");
        b2a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.asin(Double.valueOf(s1).doubleValue());
            }
        });
        Button b2b = new Button("cos^-1");
        b2b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.acos(Double.valueOf(s1).doubleValue());
            }
        });
        Button b2c = new Button("tan^-1");
        b2c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.atan(Double.valueOf(s1).doubleValue());
            }
        });
        Button b2d = new Button("log");
        b2d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.log10(Double.valueOf(s1).doubleValue());
            }
        });
        Button b2e = new Button("ln");
        b2e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.log(Double.valueOf(s1).doubleValue());
            }
        });
        Button b3 = new Button("3");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += "3";
                tf.setText(str);
            }
        });
        Button b3a1 = new Button("x");
        b3a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s2 = tf.getText();
                tf.setText("");
                str = "";
            }
        });
        Button b3a = new Button("x^y");
        b3a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.pow(Integer.valueOf(s2).intValue(), Integer.valueOf(s1).intValue());
            }
        });
        Button b3b = new Button("x3");
        b3b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.pow(Integer.valueOf(s1).intValue(), 3);
            }
        });
        Button b3c = new Button("x2");
        b3c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.pow(Integer.valueOf(s1).intValue(), 2);
            }
        });
        Button b3d = new Button("e^x");
        b3d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.exp(Double.valueOf(s1).doubleValue());
            }
        });
        Button b3e = new Button("x2");
        b3e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.atan(Double.valueOf(s1).doubleValue());
            }
        });
        Button b4 = new Button("+");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch = '+';
                s1 = tf.getText();
                tf.setText("");
                str = "";
            }
        });

        Button b5 = new Button("4");
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += "4";
                tf.setText(str);
            }
        });

        Button b6 = new Button("5");
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += "5";
                tf.setText(str);
            }
        });
        Button b4a = new Button("2√x");
        b4a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.sqrt(Double.valueOf(s1).doubleValue());
            }
        });
        Button b4b = new Button("3√x");
        b4b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                s2 = " " + Math.cbrt(Double.valueOf(s1).doubleValue());
            }
        });
        Button b4c = new Button("n!");
        b4c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1 = tf.getText();
                int val = Integer.valueOf(s1).intValue();
                int res = 1;
                for (int i = val; i > 0; i--) {
                    res = res * i;
                }
                s2 = " " + res;
            }
        });
        Button b4d = new Button("%");
        b4d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch = '%';
                s1 = tf.getText();
                tf.setText("");
                str = "";
            }
        });
        Button b4e = new Button("±");
        b4e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch = '+';
                s1 = tf.getText();
                int val = -Integer.valueOf(s1);
                s1 = String.valueOf(val);
                tf.setText("");
                str = "";
            }
        });
        Button b7 = new Button("6");
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += "6";
                tf.setText(str);
            }
        });
        Button b8 = new Button("-");
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch = '-';
                s1 = tf.getText();
                tf.setText("");
                str = "";
            }
        });
        Button b9 = new Button("7");
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += "7";
                tf.setText(str);
            }
        });
        Button b10 = new Button("8");
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += "8";
                tf.setText(str);
            }
        });
        Button b11 = new Button("9");
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += "9";
                tf.setText(str);
            }
        });
        Button b12 = new Button("*");
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch = '*';
                s1 = tf.getText();
                tf.setText("");
                str = "";
            }
        });
        Button b13 = new Button("C");
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                str = "";
            }
        });

        Button b14 = new Button("0");
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += "0";
                tf.setText(str);
            }
        });

        Button b15 = new Button("=");
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                    s2 = tf.getText();
                    tf.setText("");
                    if (isDoubleOp) {
                        double a, b;
                        try {
                            a = Double.parseDouble(s1);
                            b = Double.parseDouble(s2);
                        } catch (NumberFormatException f) {
                            tf.setText("NaN");
                            return;
                        }
                        double r = 0.0;
                        switch (ch) {
                            case '+':
                                r = a + b;
                                break;
                            case '-':
                                r = a - b;
                                break;
                            case '*':
                                r = a * b;
                                break;
                            case '/':
                                r = a / b;
                                break;
                            case '%':
                                r = a % b;
                                break;
                        }
                        tf.setText(String.valueOf(r));
                    } else {
                        int b = 0;
                        try {
                            a = Integer.parseInt(s1);
                            b = Integer.parseInt(s2);
                        } catch (NumberFormatException f) {
                            tf.setText("NaN");
                            return;
                        }
                        switch (ch) {
                            case '+':
                                c = a + b;
                                break;
                            case '-':
                                c = a - b;
                                break;
                            case '*':
                                c = a * b;
                                break;
                            case '/':
                                c = a / b;
                                break;
                            case '%':
                                c = a % b;
                        }
                        tf.setText(String.valueOf(c));

                    }
                } else {
                    if (mod == "deg") {
                        tf.setText(s2);
                    } else {
                        double res = Double.parseDouble(s2) * 0.0174;
                        tf.setText(String.valueOf(res));
                    }
                }
            }
        });
        Button b16 = new Button("/");
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch = '/';
                s1 = tf.getText();
                tf.setText("");
                str = "";
            }
        });
        Button b17 = new Button(".");
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += ".";
                tf.setText(str);
                isDoubleOp = true;
            }
        });
        Button b18 = new Button("M+");
        b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });
        Button b19 = new Button("M-");
        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
            }
        });
        Button b20 = new Button("Off");
        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               f1.setVisible(false);
            }
        });
        
        f1.add(tf, BorderLayout.NORTH);
        p.add(b1a); p.add(b1b); p.add(b1c); p.add(c1); p.add(c2); p.add(b2a); p.add(b2b);
        p.add(b2c); p.add(b2d); p.add(b2e); p.add(b3a1); p.add(b3a); p.add(b3b); p.add(b3c);
        p.add(b3d); p.add(b4a); p.add(b4b); p.add(b4c); p.add(b4d); p.add(b4e); p.add(b1);
        p.add(b2); p.add(b3); p.add(b4); p.add(b8); p.add(b5); p.add(b6); p.add(b7); p.add(b12);
        p.add(b16); p.add(b9); p.add(b10); p.add(b11); p.add(b13); p.add(b15); p.add(b14); p.add(b17);
        p.add(b18); p.add(b19); p.add(b20); 
        f1.add(p);
        f1.setSize(600, 600); f1.setBackground(Color.BLUE); f1.setForeground(Color.DARK_GRAY); f1.setVisible(true);
        p.setLayout(new GridLayout(8, 5, 10, 10));
    }
    public static void main(String[] args) {
        new ScientificCalculator();
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package calcapp;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class myJButton extends JFrame implements ActionListener{
    Container C1;
    boolean refresh=false;
    String num1="";
    String num2="";
    String opra="";
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");   
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton ba = new JButton("0");
    
    JButton sineButt = new JButton("sin()");
    JButton cosButt = new JButton("cos()");
    JButton tanButt = new JButton("tan()");
    
    JButton logButt = new JButton("log");
    JButton invButt = new JButton("Inv");
    JButton powButt = new JButton("pow");
    JButton factButt = new JButton("Fact");
    JButton modButt = new JButton("Mod");
    
    JButton plusMinusButt = new JButton("-x");
    
    JButton percentButt= new JButton("%");
    JButton dotButt= new JButton(".");
    JButton equalButt= new JButton("=");
    
    JButton addButt = new JButton("+");
    JButton subButt = new JButton("-");
    JButton mulButt = new JButton("*");
    JButton divButt = new JButton("/");
    
    JButton clearButt = new JButton("AC");
    JButton screenClear=new JButton("C");
    JButton delButt = new JButton("del");
    
    
    JLabel screen = new JLabel("");
    JLabel prevNum=new JLabel("");
    JLabel operatorScreen=new JLabel("");

    myJButton(){
        C1=this.getContentPane();
        C1.setLayout(null);
        C1.setBackground(Color.white);
        
        b1.setBounds(100,100,50,30);
        b1.setBackground(Color.gray);
        b1.setForeground(Color.white);
        b2.setBounds(160,100,50,30);
        b2.setBackground(Color.gray);
        b2.setForeground(Color.white);
        b3.setBounds(220,100,50,30);
        b3.setBackground(Color.gray);
        b3.setForeground(Color.white);
        b4.setBounds(100,150,50,30);
        b4.setBackground(Color.gray);
        b4.setForeground(Color.white);
        b5.setBounds(160,150,50,30);
        b5.setBackground(Color.gray);
        b5.setForeground(Color.white);
        b6.setBounds(220,150,50,30);
        b6.setBackground(Color.gray);
        b6.setForeground(Color.white);
        b7.setBounds(100,200,50,30);
        b7.setBackground(Color.gray);
        b7.setForeground(Color.white);
        b8.setBounds(160,200,50,30);
        b8.setBackground(Color.gray);
        b8.setForeground(Color.white);
        b9.setBounds(220,200,50,30);
        b9.setBackground(Color.gray);
        b9.setForeground(Color.white);
        ba.setBounds(100,250,50,30);
        ba.setBackground(Color.gray);
        ba.setForeground(Color.white);
        
        addButt.setBounds(280,100,50,30);
        addButt.setBackground(Color.DARK_GRAY);
        addButt.setForeground(Color.white);
        
        sineButt.setBounds(340,100,65,30);
        sineButt.setBackground(Color.darkGray);
        sineButt.setForeground(Color.ORANGE);
        
        cosButt.setBounds(340,150,65,30);
        cosButt.setBackground(Color.darkGray);
        cosButt.setForeground(Color.ORANGE);
        
        tanButt.setBounds(340,200,65,30);
        tanButt.setBackground(Color.darkGray);
        tanButt.setForeground(Color.ORANGE);
        
        logButt.setBounds(410, 100, 65, 30);
        logButt.setBackground(Color.darkGray);
        logButt.setForeground(Color.white);
        
        invButt.setBounds(410, 150, 65, 30);
        invButt.setBackground(Color.darkGray);
        invButt.setForeground(Color.orange);
        
        powButt.setBounds(410,200,65,30);
        powButt.setBackground(Color.darkGray);
        powButt.setForeground(Color.white);
        
        factButt.setBounds(410,250,65,30);
        factButt.setBackground(Color.darkGray);
        factButt.setForeground(Color.white);
        
        modButt.setBounds(410,300, 65,30);
        modButt.setBackground(Color.darkGray);
        modButt.setForeground(Color.white);
        
        plusMinusButt.setBounds(485,100,50,30);
        plusMinusButt.setBackground(Color.darkGray);
        plusMinusButt.setForeground(Color.white);
        
        screenClear.setBounds(340,250,65,30);
        screenClear.setBackground(Color.darkGray);
        screenClear.setForeground(Color.white);
        
        delButt.setBounds(340,300,65,30);
        delButt.setBackground(Color.DARK_GRAY);
        delButt.setForeground(Color.white);
        
        subButt.setBounds(280,150,50,30);
        subButt.setBackground(Color.DARK_GRAY);
        subButt.setForeground(Color.white);
        mulButt.setBounds(280,200,50,30);
        mulButt.setBackground(Color.DARK_GRAY);
        mulButt.setForeground(Color.white);
        dotButt.setBounds(160,250,50,30);
        dotButt.setBackground(Color.DARK_GRAY);
        dotButt.setForeground(Color.white);
        divButt.setBounds(220,250,50,30);
        divButt.setBackground(Color.DARK_GRAY);
        divButt.setForeground(Color.white);
        clearButt.setBounds(280,250,50,30);
        clearButt.setBackground(Color.DARK_GRAY);
        clearButt.setForeground(Color.white);
        equalButt.setBounds(100,300,170,30);
        equalButt.setBackground(Color.DARK_GRAY);
        equalButt.setForeground(Color.CYAN);
        percentButt.setBounds(280,300,50,30);
        percentButt.setBackground(Color.DARK_GRAY);
        percentButt.setForeground(Color.white);
        
        operatorScreen.setBounds(300,10,50,30);
        prevNum.setBounds(100,10,200,30);
        screen.setBounds(100,50,200,30);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);  
        b9.addActionListener(this);
        ba.addActionListener(this);
        
        
        equalButt.addActionListener(this);
        addButt.addActionListener(this);
        subButt.addActionListener(this);
        mulButt.addActionListener(this);
        divButt.addActionListener(this);
        clearButt.addActionListener(this);
        screenClear.addActionListener(this);
        dotButt.addActionListener(this);
        percentButt.addActionListener(this);
        
        logButt.addActionListener(this);
        invButt.addActionListener(this);
        powButt.addActionListener(this);
        factButt.addActionListener(this);
        modButt.addActionListener(this);
        
        plusMinusButt.addActionListener(this);
                
        sineButt.addActionListener(this);
        cosButt.addActionListener(this);
        tanButt.addActionListener(this);
        delButt.addActionListener(this);
        
        C1.add(b1);
        C1.add(b2);
        C1.add(b3);
        C1.add(b4);
        C1.add(b5);
        C1.add(b6); 
        C1.add(b7);
        C1.add(b8);
        C1.add(b9);
        C1.add(ba);
        
        C1.add(sineButt);
        C1.add(cosButt);
        C1.add(tanButt);
        C1.add(delButt);
        C1.add(invButt);
        
        C1.add(logButt);
        C1.add(powButt);
        C1.add(factButt);
        C1.add(modButt);
        
        C1.add(screenClear);
        C1.add(clearButt);
        C1.add(equalButt);
        C1.add(addButt);
        C1.add(subButt);
        C1.add(mulButt);
        C1.add(divButt);
        C1.add(dotButt);
        C1.add(percentButt);
        
        C1.add(plusMinusButt);
        
        C1.add(operatorScreen);
        C1.add(prevNum);
        C1.add(screen);


    }
    
        int inv_flag=0;
        public void changeTrigono(){
            if(inv_flag==0){
                sineButt.setText("asin");
                cosButt.setText("acos");
                tanButt.setText("atan");
                inv_flag=1;
            }else{
                sineButt.setText("sin()");
                cosButt.setText("cos()");
                tanButt.setText("tan()");
                inv_flag=0;
            }
        }
    
        public void showInScreen(JButton jButt){
            String result=screen.getText();
            if(jButt.getText().equals(".")){
                if(result.contains(".")){
                    return;
                }
            }
            screen.setText(result + jButt.getText());
        }
        
        public void handleEquals(){  
            String result=screen.getText();
            num2=screen.getText();
            if(num2.equals("")){
                num2="0";
            }
            String op=operatorScreen.getText();
            switch(op){
                case "+":
                    try{
                        result=Integer.toString(Integer.parseInt(num1)+Integer.parseInt(num2));
                    }catch(Exception e){
                        result=Double.toString(Double.parseDouble(num1)+Double.parseDouble(num2));
                    }
                    break;
                case "*":
                    try{
                        result=Integer.toString(Integer.parseInt(num1)*Integer.parseInt(num2));
                    }catch(Exception e){
                        result=Double.toString(Double.parseDouble(num1)*Double.parseDouble(num2));
                    }
                    break;
                case "-":
                    try{
                        result=Integer.toString(Integer.parseInt(num1)-Integer.parseInt(num2));
                    }catch(Exception e){
                        result=Double.toString(Double.parseDouble(num1)-Double.parseDouble(num2));
                    }
                    break;
                case "/":
                    try{
                        result=Integer.toString(Integer.parseInt(num1)/Integer.parseInt(num2));
                    }catch(Exception e){
                        result=Double.toString(Double.parseDouble(num1)/Double.parseDouble(num2));
                    }
                    break;
                case "%":
                    result=Double.toString((Double.parseDouble(num1)*Double.parseDouble(num2))/100);
                    break;
            }
            screen.setText(result);
            opra="";
            prevNum.setText("");
            operatorScreen.setText("");
            num1="";
            num2="";
            refresh=true;
        }
        
        public void handleScreenClear(){
            screen.setText("");
        }
        
        public void handleClear(){
            screen.setText("");
            opra="";
            prevNum.setText("");
            operatorScreen.setText("");
            num1="";
            num2="";
            refresh=true;
        }
        
        public void getFactorial(){
            int num1=Integer.parseInt(screen.getText());
            int fact=1;
            for(int i=2;i<=num1;i++){
                fact=fact*i;
            }
            screen.setText(Integer.toString(fact));
        }
        
        public void changeSign(){
            if(screen.getText().equals("")){
                return;
            }
            double num1=Double.parseDouble(screen.getText());
            if(num1>0){
                num1=-num1;
                plusMinusButt.setText("+x");
            }else{
                num1=abs(num1);
                plusMinusButt.setText("-x");
            }
            screen.setText(Double.toString(num1));
        }
        
        public void handleDelete(){
            String result=screen.getText();
            int len=result.length();
            screen.setText(result.substring(0, len-1));
        }
        
        public void handleTrigono(JButton jButt){
            double output=0;
            String prev=prevNum.getText();
            try{
            double result=Double.parseDouble(screen.getText());
            String op=operatorScreen.getText();
            String butt_text=jButt.getText();
            switch(butt_text){
                case "sin()":
                    output=sin(result);
                    break;
                case "cos()":
                    output=cos(result);
                    break;
                case "tan()":
                    output=tan(result);
                    break;
                case "asin":
                    output=asin(result);
                    break;
                case "acos":
                    output=acos(result);
                    break;
                case "atan":
                    output=atan(result);
                    break;
            }
            screen.setText(Double.toString(output));
            }
            catch(Exception e){
              return;  
            }
        }
    
        
        public void handleButton(JButton jButt){
            //to change the action when only one input is given
            if(screen.getText().equals("") && !operatorScreen.getText().equals("")){
                opra=jButt.getText();
                operatorScreen.setText(jButt.getText());
            }else if(screen.getText().equals("")){
                return;
            }
            String op=jButt.getText();
            if(op.equals("pow")){
                op="^";
            }
            String prevOp=operatorScreen.getText();
            int res=0;
            String result=screen.getText(); 
             if(prevOp.equals("")){ 
                opra=op;
                num1=screen.getText();
                prevNum.setText(num1);
                operatorScreen.setText(op);
                screen.setText("");
            }
             else if(screen.getText().equals("")){
                opra=jButt.getText();
                operatorScreen.setText(jButt.getText());
            }
            else {
                num2=screen.getText();
                switch(prevOp){
                case "+":
                    try{
                        result=Integer.toString(Integer.parseInt(num1)+Integer.parseInt(num2));
                    }catch(Exception e){
                        result=Double.toString(Double.parseDouble(num1)+Double.parseDouble(num2));
                    }
                    break;
                case "*":
                    try{
                        result=Integer.toString(Integer.parseInt(num1)*Integer.parseInt(num2));
                    }catch(Exception e){
                        result=Double.toString(Double.parseDouble(num1)*Double.parseDouble(num2));
                    }
                    break;
                case "-":
                    try{
                        result=Integer.toString(Integer.parseInt(num1)-Integer.parseInt(num2));
                    }catch(Exception e){
                        result=Double.toString(Double.parseDouble(num1)-Double.parseDouble(num2));
                    }
                    break;
                case "/":
                    try{
                        result=Integer.toString(Integer.parseInt(num1)/Integer.parseInt(num2));
                    }catch(Exception e){
                        result=Double.toString(Double.parseDouble(num1)/Double.parseDouble(num2));
                    }
                    break;
                case "%":
                    result=Double.toString((Double.parseDouble(num1)*Double.parseDouble(num2))/100);
                    break;
                case "^":
                    result=Double.toString(pow(Double.parseDouble(num1),Double.parseDouble(num2)));
                    break;
                case "Mod":
                    try{
                        result=Integer.toString(Integer.parseInt(num1)%Integer.parseInt(num2));
                    }catch(Exception e){
                        result=Double.toString(Double.parseDouble(num1)%Double.parseDouble(num2));
                    }
                    break;
            }
                screen.setText(result);
                num1=result;
                screen.setText("");
                operatorScreen.setText(op);
                prevNum.setText(result);
            }
        }
        
            public void actionPerformed(ActionEvent e){
                if(refresh==true){
                    screen.setText("");
                    refresh=false;
                }
                String result=screen.getText(); 
                if(e.getSource()==b1){
                    showInScreen(b1);
                }if(e.getSource()==b2){
                    showInScreen(b2);
                }if(e.getSource()==b3){
                    showInScreen(b3);
                }if(e.getSource()==b4){
                    showInScreen(b4);
                }if(e.getSource()==b5){
                    showInScreen(b5);
                }if(e.getSource()==b6){
                    showInScreen(b6);
                }if(e.getSource()==b7){
                    showInScreen(b7);
                }if(e.getSource()==b8){
                    showInScreen(b8);
                }if(e.getSource()==b9){
                    showInScreen(b9);
                }if(e.getSource()==ba){
                    showInScreen(ba);
                }if(e.getSource()==dotButt){
                    showInScreen(dotButt);
                }
                if(e.getSource()==addButt){
                    handleButton(addButt);
                }
                if(e.getSource()==subButt){
                    handleButton(subButt);
                }
                if(e.getSource()==mulButt){
                    handleButton(mulButt);
                }
                if(e.getSource()==divButt){
                    handleButton(divButt);
                }
                if(e.getSource()==percentButt){
                    handleButton(percentButt);
                }
                if(e.getSource()==equalButt){
                    handleEquals();
                };
                if(e.getSource()==clearButt){
                  handleClear();
                };
                if(e.getSource()==screenClear){
                    handleScreenClear();
                }
                if(e.getSource()==sineButt){
                    handleTrigono(sineButt);
                }
                if(e.getSource()==cosButt){
                    handleTrigono(cosButt);
                }
                if(e.getSource()==logButt){
                    handleTrigono(logButt);
                }
                if(e.getSource()==invButt){
                    changeTrigono();
                }
                if(e.getSource()==tanButt){
                    handleTrigono(tanButt);
                }if(e.getSource()==delButt){
                    handleDelete();
                }if(e.getSource()==powButt){
                    handleButton(powButt);
                }if(e.getSource()==modButt){
                    handleButton(modButt);
                }
                if(e.getSource()==factButt){
                    getFactorial();
                }if(e.getSource()==plusMinusButt){
                    changeSign();
                }
            }            
   
} 


/**
 
 * @author Binish125
 * @ui-design Benesha
 */

public class CalcApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          myJButton f1 = new myJButton();
        f1.setVisible(true);
        f1.setTitle("Calculator");
        f1.setBounds(200,150,700,500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

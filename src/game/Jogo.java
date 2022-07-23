package game;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Jogo extends JFrame{
   


    JButton[] bt =new JButton[9];
    


    
    int PX;
    int PO;
   


        JLabel placar =new JLabel("Placar    X    O");
        JLabel placarX=new JLabel();
        JLabel placarO=new JLabel();

    

    public Jogo(){
        setVisible(true);
        setTitle("jogo da Velha");
        setDefaultCloseOperation(3);
        setBackground(new Color(0, 0, 205));

        
        setLayout(null);
        setBounds(450, 100, 400, 500);

        	
		int cont=0;
        for(int i=0;i<3;i++){
               for(int j=0;j<3;j++){
                   bt[cont]=new JButton();
                   add(bt[cont]);
                   bt[cont].setBounds((100*i)+50, (100*j)+50, 95,95);
                   cont++;
               }
           }

        bt[0].setFont(new Font("Arial", Font.PLAIN, 40));
		bt[0].setForeground(new Color(0, 0, 0));
		bt[0].setBackground(new Color(34, 139, 34));
        bt[0].addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(bt[0].getText()=="") {
                    
                    marcar();
                    
                    arrayPosition[0]= getMarcarXO();
                    bt[0].setText(getMarcarXO());

                    ganhar();
            }
            }
        });
        
        bt[1].setFont(new Font("Arial", Font.PLAIN, 40));
		bt[1].setForeground(new Color(0, 0, 0));
		bt[1].setBackground(new Color(34, 139, 34));
        bt[1].addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(bt[1].getText()=="") {
                
                    marcar();
                    
                    arrayPosition[1]= getMarcarXO();
                    bt[1].setText(getMarcarXO());

                    ganhar();
            }
            }
        });

        bt[2].setFont(new Font("Arial", Font.PLAIN, 40));
		bt[2].setForeground(new Color(0, 0, 0));
		bt[2].setBackground(new Color(34, 139, 34));
        bt[2].addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(bt[2].getText()=="") {
                    
                   marcar();
                        
                    arrayPosition[2]= getMarcarXO();
                    bt[2].setText(getMarcarXO());
                    
                   ganhar();
            }
            }
        });

        bt[3].setFont(new Font("Arial", Font.PLAIN, 40));
		bt[3].setForeground(new Color(0, 0, 0));
		bt[3].setBackground(new Color(34, 139, 34));
        bt[3].addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(bt[3].getText()=="") {
                    
                   marcar();
                        
                   arrayPosition[3]= getMarcarXO();
                    bt[3].setText(getMarcarXO());

                    ganhar();
            }
            }
        });

        bt[4].setFont(new Font("Arial", Font.PLAIN, 40));
		bt[4].setForeground(new Color(0, 0, 0));
		bt[4].setBackground(new Color(34, 139, 34));
        bt[4].addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(bt[4].getText()=="") {
                    
                    marcar();
                        
                    arrayPosition[4]= getMarcarXO();
                    bt[4].setText(getMarcarXO());

                    ganhar();
            }
            }
        });

        bt[5].setFont(new Font("Arial", Font.PLAIN, 40));
		bt[5].setForeground(new Color(0, 0, 0));
		bt[5].setBackground(new Color(34, 139, 34));
        bt[5].addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(bt[5].getText()=="") {
                    
                    marcar();
                        
                    arrayPosition[5]= getMarcarXO();
                    bt[5].setText(getMarcarXO());

                    ganhar();
            }
            }
        });

        bt[6].setFont(new Font("Arial", Font.PLAIN, 40));
		bt[6].setForeground(new Color(0, 0, 0));
		bt[6].setBackground(new Color(34, 139, 34));
        bt[6].addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(bt[6].getText()=="") {
                    
                    marcar();
                        
                    arrayPosition[6]= getMarcarXO();
                    bt[6].setText(getMarcarXO());

                    ganhar();
            }
            }
        });

        bt[7].setFont(new Font("Arial", Font.PLAIN, 40));
		bt[7].setForeground(new Color(0, 0, 0));
		bt[7].setBackground(new Color(34, 139, 34));
        bt[7].addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(bt[7].getText()=="") {
                    
                    marcar();
                        
                    arrayPosition[7]= getMarcarXO();
                    bt[7].setText(getMarcarXO());

                    ganhar();
            }
            }
        });

        bt[8].setFont(new Font("Arial", Font.PLAIN, 40));
		bt[8].setForeground(new Color(0, 0, 0));
		bt[8].setBackground(new Color(34, 139, 34));
        bt[8].addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(bt[8].getText()=="") {
                    
                    marcar();
                        
                    arrayPosition[8]= getMarcarXO();
                    bt[8].setText(getMarcarXO());

                    ganhar();
                }
            }
        });

        JButton limpar = new JButton("Limpar");
        add(limpar);
        limpar.setBounds(50, 370, 100, 23);
        limpar.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                limpar();
    
            }
        });
        JButton novoJogo = new JButton("Novo Jogo");
        add(novoJogo);
        novoJogo.setBounds(50, 400, 100, 23);
        novoJogo.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                limpar();
                resetar();
            }
        });

        add(placar);
        placar.setBounds(250, 370, 100, 23);

        add(placarX);
        placarX.setBounds(300, 390, 100, 23);

        add(placarO);
        placarO.setBounds(320, 390, 100, 23);
    }

        protected boolean XO=true;
        
        protected String marcarXO="X";
        
        public String arrayPosition[]= new String[9];
        
        public boolean getXO() {
            return XO;
        }
        public void setXO(boolean XO) {
            this.XO = XO;
        }
        
        public String getMarcarXO() {
            return marcarXO;
        }
        public void setMarcarXO(String marcarXO) {
            this.marcarXO = marcarXO;
        }
        
        
            public void acaoXO() {
                if(XO==false) {
                XO=true;
                    
                }else {
                    XO=false;
                }
            }
            
            
            public void marcar() {
                acaoXO();
                    if(getXO()==false) {
                        
                        this.setMarcarXO("X");
                    }else {
                        this.setMarcarXO("O");
                    }
                
            }
            
            public void limpar(){
                
        
                for(int i=0; i<9;i++){
        
                    bt[i].setText("");
        
                    arrayPosition[i]="";
                }
                setXO(true);
            }

            public void resetar(){
                PO=0;
                PX=0;
                String PXs= Integer.toString(PX);
                String POs= Integer.toString(PO);
        
                placarX.setText(PXs);
                placarO.setText(POs);
            }

            public void atualizarPlacar(){
                String PXs= Integer.toString(PX);
                String POs= Integer.toString(PO);
        
                placarX.setText(PXs);
                placarO.setText(POs);
            }
            
            public void ganhar() {
              
                
                if(
                    arrayPosition[0]=="X" && arrayPosition[1]=="X" && arrayPosition[2]=="X" ||
                    arrayPosition[3]=="X" && arrayPosition[4]=="X" && arrayPosition[5]=="X" ||
                    arrayPosition[6]=="X" && arrayPosition[7]=="X" && arrayPosition[8]=="X" ||
                    arrayPosition[0]=="X" && arrayPosition[3]=="X" && arrayPosition[6]=="X" ||
                    arrayPosition[1]=="X" && arrayPosition[4]=="X" && arrayPosition[7]=="X" ||
                    arrayPosition[2]=="X" && arrayPosition[5]=="X" && arrayPosition[8]=="X" ||
                    arrayPosition[0]=="X" && arrayPosition[4]=="X" && arrayPosition[8]=="X" ||
                    arrayPosition[2]=="X" && arrayPosition[4]=="X" && arrayPosition[6]=="X" 
                ) {
                    PX++;
                    atualizarPlacar();
                        JOptionPane.showMessageDialog(null,"X Ganhou!","Ganhador",1);
                        
                        limpar();
                        
                        
                        
                }
                else if(
                    arrayPosition[0]=="O" && arrayPosition[1]=="O" && arrayPosition[2]=="O" ||
                    arrayPosition[3]=="O" && arrayPosition[4]=="O" && arrayPosition[5]=="O" ||
                    arrayPosition[6]=="O" && arrayPosition[7]=="O" && arrayPosition[8]=="O" ||
                    arrayPosition[0]=="O" && arrayPosition[3]=="O" && arrayPosition[6]=="O" ||
                    arrayPosition[1]=="O" && arrayPosition[4]=="O" && arrayPosition[7]=="O" ||
                    arrayPosition[2]=="O" && arrayPosition[5]=="O" && arrayPosition[8]=="O" ||
                    arrayPosition[0]=="O" && arrayPosition[4]=="O" && arrayPosition[8]=="O" ||
                    arrayPosition[2]=="O" && arrayPosition[4]=="O" && arrayPosition[6]=="O" 
                        ) {
                        PO++;
                        atualizarPlacar();
                        JOptionPane.showMessageDialog(null,"O Ganhou!","Ganhador",1);
                        
                        limpar();
        
                    }
                else if( 
                    bt[0].getText()!="" && bt[1].getText()!="" && bt[2].getText()!=""&&
                    bt[3].getText()!="" && bt[4].getText()!="" && bt[5].getText()!=""&&
                    bt[6].getText()!="" && bt[7].getText()!="" && bt[8].getText()!=""
                    ){
                       JOptionPane.showMessageDialog(null,"Deu Velha","Ganhador",1);
                       limpar();
                    }
                
            }
            
        
    public static void main(String[] args) {
        new Jogo();
    }
}


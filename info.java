import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SA implements ActionListener{

	JFrame frame;
	JPanel panel;
	JTextField tuser;
	JTextField tdoctor;
	JTextField tpmo;
	JTextField twt;
	JTextField tdob;
	JLabel ldoctor,lpatient,lpmo,lsym,lward,lcorona,lcity,lgender,lbloodg,lwt,ldob;
	JCheckBox positive,negative;
	JCheckBox cough,fever,tiredness,difficult_breathing;
	JButton blogin,bclear;
	JRadioButton male,female,transgender;
	JComboBox ward;
	JComboBox city;
    JComboBox Bloodgroup;
    SA()
    {
    	String arr[]= {"Pune","Mumbai","Parbhani","Nagpur","Nanded","Aurangabad","Solapur"};
    	String arr1[]= {"A","A+","A-","B","B+","B-","O+","O-"};
    	String arr2[]= {"1","2","3","4","5","6","7"};
  	    frame= new JFrame("Kasturba Hospital");
  	    panel=new JPanel();
	    tuser=new JTextField(10);
	    tdoctor=new JTextField(10);
	    tpmo=new JTextField(10);
	    twt=new JTextField(5);
	    tdob=new JTextField(7);
	    ldoctor=new JLabel("Doctor Name :");
  	    lpatient=new JLabel("Patient Name :");
  	    lpmo=new JLabel("Mobile of patient:");
  	    lsym=new JLabel("Symptoms :");
  	    lward=new JLabel("Ward No :");
  	    lcorona=new JLabel("Medical Report :");
  	    lcity=new JLabel("City :");
  	    lgender=new JLabel("Gender :");
  	    lbloodg=new JLabel("BloodGroup :");
  	    lwt=new JLabel("Weight(kg)");
  	    ldob=new JLabel("DOB");
  	    positive=new JCheckBox("Positive");
	    negative=new JCheckBox("Negative");
	    fever=new JCheckBox("Fever");
	    cough=new JCheckBox("Cough");
	    tiredness=new JCheckBox("Tiredness");
	    difficult_breathing=new JCheckBox("Difficult Breathing");
  	    blogin=new JButton("Sign Up");
	    bclear=new JButton("Clear choice");
	    male=new JRadioButton("Male");
  	    female=new JRadioButton("Female");
  	    transgender=new JRadioButton("Transgender");
  	    ButtonGroup bg=new ButtonGroup();
  	    bg.add(male);
  	    bg.add(female);
  	    bg.add(transgender);
  	    city=new JComboBox(arr);
	    Bloodgroup=new JComboBox(arr1);
	    ward=new JComboBox(arr2);
	    
	    blogin.addActionListener(this);
	    bclear.addActionListener(this);
	    
	    panel.add(lpatient);
	    panel.add(tuser);
	    
	    panel.add(ldoctor);
	    panel.add(tdoctor);
	    
	    panel.add(lpmo);
	    panel.add(tpmo);
	    
	    panel.add(lgender);
  	    panel.add(male);
  	    panel.add(female);
  	    panel.add(transgender);
  	    
  	    panel.add(lwt);
  	    panel.add(twt);
  	    
  	    panel.add(ldob);
  	    panel.add(tdob);
  	    
	    panel.add(lcity);
  	    panel.add(city);
  	    
  	    panel.add(lbloodg);
  	    panel.add(Bloodgroup);
  	    
  	    panel.add(lward);
  	    panel.add(ward);
  	    
  	    panel.add(lsym);
	    panel.add(cough);
	    panel.add(fever);
	    panel.add(tiredness);
	    panel.add(difficult_breathing);
	    
  	    panel.add(lcorona);
  	    panel.add(positive);
  	    panel.add(negative);
  	   
	    panel.add(blogin);
	    panel.add(bclear);
	    
	    frame.add(panel);
	    frame.setVisible(true);
	    frame.setSize(250,250);
  	    
  	     
    }
    public static void main(String[] args)
	  {
		  new SA();
	  }
	  public void actionPerformed(ActionEvent e) {
		  if(e.getSource()==bclear) {
			  tuser.setText("");
			  tdoctor.setText("");
			  tpmo.setText("");
			  twt.setText("");
			  tdob.setText("");
		  }
		  String patient=null,doctor=null,mobile=null,gender=null,wei=null,dob1=null,city_selected=null,bg=null,war=null,sym=null,corona=null;
		  if(e.getSource()==blogin) {
			  patient=tuser.getText();
			  doctor=tdoctor.getText();
			  mobile=tpmo.getText(); 
			  wei=twt.getText();
			  dob1=tdob.getText();
			  
		  }
		  if(positive.isSelected())
			  corona="Positive";
		  if(negative.isSelected())
			  corona="Negative";
		  
		  
		   if(cough.isSelected())
			  sym="Cough";
		   if(fever.isSelected())
			  sym="Fever";
		   if(tiredness.isSelected())
			  sym="Tiredness";
		   if(difficult_breathing.isSelected())
			  sym="Difficult Breathing";
		   if(cough.isSelected() && fever.isSelected())
			  sym="Cough and Fever";
		   if(cough.isSelected() && tiredness.isSelected())
			  sym="Cough and Tiredness";
		   if(cough.isSelected() && difficult_breathing.isSelected())
			  sym="Cough and Difficult breathing";
		   if(fever.isSelected() && tiredness.isSelected())
			  sym="Fever and Tiredness";
		   if(fever.isSelected() && difficult_breathing.isSelected())
			  sym="Fever and Difficult breathing";
		   if(tiredness.isSelected() && difficult_breathing.isSelected())
			  sym="Tiredness and Difficult breathing";
		   if(cough.isSelected() && fever.isSelected() && tiredness.isSelected())
			  sym="Cough Fever and Tiredness";
		   if(fever.isSelected() && tiredness.isSelected() && difficult_breathing.isSelected())
			  sym="Fever tiredness and Difficult breathing";
		   if(cough.isSelected() && tiredness.isSelected() && difficult_breathing.isSelected())
			  sym="Cough tiredness and Difficult breathing";
		   if(cough.isSelected() && fever.isSelected() && difficult_breathing.isSelected())
			  sym=" Cough Fever and Difficult breathing";
		   if( cough.isSelected() && fever.isSelected() && tiredness.isSelected() && difficult_breathing.isSelected())
			  sym=" Cough Fever tiredness and Difficult breathing";
		  
		   
		   
			  
		   
		  if(male.isSelected())
			  gender="male";
		  if(female.isSelected())
			  gender="female";
		  if(transgender.isSelected())
			  gender="Transgender";
		  city_selected=(String) city.getItemAt(city.getSelectedIndex());
		  bg=(String) Bloodgroup.getItemAt(Bloodgroup.getSelectedIndex());
		  war=(String)ward.getItemAt(Bloodgroup.getSelectedIndex());
		  System.out.println(patient+" "+doctor+" "+mobile+" "+gender+" "+wei+" "+dob1+" "+city_selected+" "+bg+" "+war+" "+sym+" "+corona);
		  
		  int a=JOptionPane.showConfirmDialog(frame, "Do you want to add personal data of more patients");
    	  if(a==JOptionPane.YES_OPTION) {
    		  JOptionPane.showMessageDialog(frame,"Personal Data Uploaded successfully!!!");
    		  frame.dispose();
    		  
	
}
}
}

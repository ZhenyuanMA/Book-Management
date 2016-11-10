import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class CreateGUI {

	// This list is to store all the added books
    private ArrayList<Books> st = new ArrayList<Books>();
    private static SetOfActions setOfActions = new SetOfActions();
	// These two strings may be useful for you to display messages on the screen.
    private String s1 = "The total number of all books is: ";
    private String s2 = "The total value of all books is: ";
	// These are the initial states of the Non-Fiction and Fiction Checkbox
	private boolean nfict = false;
	private boolean fict = false;

    public CreateGUI() {
        // Add your code here, and you can add some private helper methods for your convenience.
    	final JFrame gui = new JFrame("GUI");
    	gui.setSize(800, 220);
    	gui.setLocationRelativeTo(null);
    	
    	JPanel panel = new JPanel(new GridBagLayout());
    	GridBagConstraints constraints = new GridBagConstraints();
    	
    	JLabel Book_Name = createLabel("Book Name", 0, 0, panel, constraints);
    	
    	final JTextField Text_Name = createTextField(10, 1, 0, panel, constraints);
        
        JLabel Price = createLabel("Price", 0, 1, panel, constraints);
    	
        final JTextField Text_Price = createTextField(10, 1, 1, panel, constraints);
        
        final JLabel Total_Value = createLabel(s2 + "0", 2, 1, panel, constraints);

        JLabel Quantity = createLabel("Quantity", 0, 2, panel, constraints);
    	
        final JTextField Text_Quantity = createTextField(10, 1, 2, panel, constraints);
        
        final JLabel Total_Number = createLabel(s1 + "0", 2, 2, panel, constraints);
        
        JButton Biographies = new JButton("Biographies");
        Biographies.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			if(Text_Name.getText() == null || Text_Price.getText() == null || !CreateGUI.this.isDouble(Text_Price.getText()) || !CreateGUI.this.isInteger(Text_Quantity.getText())){
    				JOptionPane.showMessageDialog(gui, "Please make sure you have input name, price and quantity the price and quantity must be a number",  "Error Message", 0);
    			}
    			else{
    				SetOfActions.addBiographies(CreateGUI.this.st, Text_Name.getText(), Double.parseDouble(Text_Price.getText()), Integer.parseInt(Text_Quantity.getText()));
    				Text_Name.setText("");
    				Text_Price.setText("");
    				Text_Quantity.setText("");
    				Total_Value.setText(s2 + CreateGUI.this.setOfActions.getTotalPrice(CreateGUI.this.st));
    				Total_Number.setText(s1 + CreateGUI.this.st.size());
    			}
    		}
    	});
    	constraints.fill = 2;
        constraints.gridx = 0;
        constraints.gridy = 3;
    	panel.add(Biographies, constraints);
        
    	JButton History = new JButton("History");
    	History.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			if(Text_Name.getText() == null || Text_Price.getText() == null || !CreateGUI.this.isDouble(Text_Price.getText()) || !CreateGUI.this.isInteger(Text_Quantity.getText())){
    				JOptionPane.showMessageDialog(gui, "Please make sure you have input name, price and quantity the price and quantity must be a number",  "Error Message", 0);
    			}
    			else{
    				SetOfActions.addHistory(CreateGUI.this.st, Text_Name.getText(), Double.parseDouble(Text_Price.getText()), Integer.parseInt(Text_Quantity.getText()));
    				Text_Name.setText("");
    				Text_Price.setText("");
    				Text_Quantity.setText("");
    				Total_Value.setText(s2 + CreateGUI.this.setOfActions.getTotalPrice(CreateGUI.this.st));
    				Total_Number.setText(s1 + CreateGUI.this.st.size());
    			}
    		}
    	});
    	constraints.fill = 2;
        constraints.gridx = 1;
        constraints.gridy = 3;
    	panel.add(History, constraints);
    	
    	JButton Travel = new JButton("Travel");
    	Travel.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			if(Text_Name.getText() == null || Text_Price.getText() == null || !CreateGUI.this.isDouble(Text_Price.getText()) || !CreateGUI.this.isInteger(Text_Quantity.getText())){
    				JOptionPane.showMessageDialog(gui, "Please make sure you have input name, price and quantity the price and quantity must be a number",  "Error Message", 0);
    			}
    			else{
    				SetOfActions.addTravel(CreateGUI.this.st, Text_Name.getText(), Double.parseDouble(Text_Price.getText()), Integer.parseInt(Text_Quantity.getText()));
    				Text_Name.setText("");
    				Text_Price.setText("");
    				Text_Quantity.setText("");
    				Total_Value.setText(s2 + CreateGUI.this.setOfActions.getTotalPrice(CreateGUI.this.st));
    				Total_Number.setText(s1 + CreateGUI.this.st.size());
    			}
    		}
    	});
    	constraints.fill = 2;
        constraints.gridx = 2;
        constraints.gridy = 3;
    	panel.add(Travel, constraints);
    	
    	JButton Journals = new JButton("Journals");
    	Journals.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			if(Text_Name.getText() == null || Text_Price.getText() == null || !CreateGUI.this.isDouble(Text_Price.getText()) || !CreateGUI.this.isInteger(Text_Quantity.getText())){
    				JOptionPane.showMessageDialog(gui, "Please make sure you have input name, price and quantity the price and quantity must be a number",  "Error Message", 0);
    			}
    			else{
    				SetOfActions.addJournals(CreateGUI.this.st, Text_Name.getText(), Double.parseDouble(Text_Price.getText()), Integer.parseInt(Text_Quantity.getText()));
    				Text_Name.setText("");
    				Text_Price.setText("");
    				Text_Quantity.setText("");
    				Total_Value.setText(s2 + CreateGUI.this.setOfActions.getTotalPrice(CreateGUI.this.st));
    				Total_Number.setText(s1 + CreateGUI.this.st.size());
    			}
    		}
    	});
    	constraints.fill = 2;
        constraints.gridx = 3;
        constraints.gridy = 3;
    	panel.add(Journals, constraints);
    	
    	JButton Science_Fiction = new JButton("Science Fiction");
    	Science_Fiction.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			if(Text_Name.getText() == null || Text_Price.getText() == null || !CreateGUI.this.isDouble(Text_Price.getText()) || !CreateGUI.this.isInteger(Text_Quantity.getText())){
    				JOptionPane.showMessageDialog(gui, "Please make sure you have input name, price and quantity the price and quantity must be a number",  "Error Message", 0);
    			}
    			else{
    				SetOfActions.addScienceFiction(CreateGUI.this.st, Text_Name.getText(), Double.parseDouble(Text_Price.getText()), Integer.parseInt(Text_Quantity.getText()));
    				Text_Name.setText("");
    				Text_Price.setText("");
    				Text_Quantity.setText("");
    				Total_Value.setText(s2 + CreateGUI.this.setOfActions.getTotalPrice(CreateGUI.this.st));
    				Total_Number.setText(s1 + CreateGUI.this.st.size());
    			}
    		}
    	});
    	constraints.fill = 2;
        constraints.gridx = 0;
        constraints.gridy = 4;
    	panel.add(Science_Fiction, constraints);
    	
    	JButton Mystery = new JButton("Mystery");
    	Mystery.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			if(Text_Name.getText() == null || Text_Price.getText() == null || !CreateGUI.this.isDouble(Text_Price.getText()) || !CreateGUI.this.isInteger(Text_Quantity.getText())){
    				JOptionPane.showMessageDialog(gui, "Please make sure you have input name, price and quantity the price and quantity must be a number",  "Error Message", 0);
    			}
    			else{
    				SetOfActions.addMystery(CreateGUI.this.st, Text_Name.getText(), Double.parseDouble(Text_Price.getText()), Integer.parseInt(Text_Quantity.getText()));
    				Text_Name.setText("");
    				Text_Price.setText("");
    				Text_Quantity.setText("");
    				Total_Value.setText(s2 + CreateGUI.this.setOfActions.getTotalPrice(CreateGUI.this.st));
    				Total_Number.setText(s1 + CreateGUI.this.st.size());
    			}
    		}
    	});
    	constraints.fill = 2;
        constraints.gridx = 1;
        constraints.gridy = 4;
    	panel.add(Mystery, constraints);
    	
    	JButton Horror = new JButton("Horror");
    	Horror.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			if(Text_Name.getText() == null || Text_Price.getText() == null || !CreateGUI.this.isDouble(Text_Price.getText()) || !CreateGUI.this.isInteger(Text_Quantity.getText())){
    				JOptionPane.showMessageDialog(gui, "Please make sure you have input name, price and quantity the price and quantity must be a number",  "Error Message", 0);
    			}
    			else{
    				SetOfActions.addHorror(CreateGUI.this.st, Text_Name.getText(), Double.parseDouble(Text_Price.getText()), Integer.parseInt(Text_Quantity.getText()));
    				Text_Name.setText("");
    				Text_Price.setText("");
    				Text_Quantity.setText("");
    				Total_Value.setText(s2 + CreateGUI.this.setOfActions.getTotalPrice(CreateGUI.this.st));
    				Total_Number.setText(s1 + CreateGUI.this.st.size());
    			}
    		}
    	});
    	constraints.fill = 2;
        constraints.gridx = 2;
        constraints.gridy = 4;
    	panel.add(Horror, constraints);
    	
    	JButton Romance = new JButton("Romance");
    	Romance.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			if(Text_Name.getText() == null || Text_Price.getText() == null || !CreateGUI.this.isDouble(Text_Price.getText()) || !CreateGUI.this.isInteger(Text_Quantity.getText())){
    				JOptionPane.showMessageDialog(gui, "Please make sure you have input name, price and quantity the price and quantity must be a number",  "Error Message", 0);
    			}
    			else{
    				SetOfActions.addRomance(CreateGUI.this.st, Text_Name.getText(), Double.parseDouble(Text_Price.getText()), Integer.parseInt(Text_Quantity.getText()));
    				Text_Name.setText("");
    				Text_Price.setText("");
    				Text_Quantity.setText("");
    				Total_Value.setText(s2 + CreateGUI.this.setOfActions.getTotalPrice(CreateGUI.this.st));
    				Total_Number.setText(s1 + CreateGUI.this.st.size());
    			}
    		}
    	});
    	constraints.fill = 2;
        constraints.gridx = 3;
        constraints.gridy = 4;
    	panel.add(Romance, constraints);
       
        final JCheckBox N_Fiction = new JCheckBox("Non-fiction", false);
    	N_Fiction.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(N_Fiction.isSelected()){
					CreateGUI.this.nfict = true;
				}
				else{
					CreateGUI.this.nfict = false;
				}	
			}	
    	});
    	constraints.fill = 2;
    	constraints.gridx = 0;
        constraints.gridy = 5;
    	panel.add(N_Fiction, constraints);
        
    	final JCheckBox Fiction = new JCheckBox("Fiction", false);
    	Fiction.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(Fiction.isSelected()){
					CreateGUI.this.fict = true;
				}
				else{
					CreateGUI.this.fict = false;
				}	
			}	
    	});
    	constraints.fill = 2;
    	constraints.gridx = 1;
        constraints.gridy = 5;
    	panel.add(Fiction, constraints);
        
        JButton Increase_Price = new JButton("Increase Price");
        Increase_Price.setBackground(Color.GREEN);
        Increase_Price.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Text_Name.setText("");
				Text_Price.setText("");
				Text_Quantity.setText("");
				Total_Value.setText(s2 + CreateGUI.this.setOfActions.increaseTotalPrice(CreateGUI.this.st, CreateGUI.this.nfict, CreateGUI.this.fict));
				Total_Number.setText(s1 + CreateGUI.this.st.size());
        	}
        });
        constraints.fill = 2;
    	constraints.gridx = 0;
        constraints.gridy = 6;
    	panel.add(Increase_Price, constraints);
    	
        JButton Decrease_Price = new JButton("Decrease Price");
        Decrease_Price.setBackground(Color.RED);
        Decrease_Price.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Text_Name.setText("");
				Text_Price.setText("");
				Text_Quantity.setText("");
				Double price = CreateGUI.this.setOfActions.decreaseTotalPrice(CreateGUI.this.st, CreateGUI.this.nfict, CreateGUI.this.fict);
				if(price == -1.0){
					JOptionPane.showMessageDialog(gui, "The price of books cannot be lower than 0", "Error Message", 0);
				}
				else{
					Total_Value.setText(s2 + price);
				}
				Total_Number.setText(s1 + CreateGUI.this.st.size());
        	}
        });
        constraints.fill = 2;
    	constraints.gridx = 1;
        constraints.gridy = 6;
    	panel.add(Decrease_Price, constraints);
        
    	gui.setContentPane(panel);
    	gui.setVisible(true);
    	gui.setDefaultCloseOperation(3);
    }
    
    private JLabel createLabel(String name, int x, int y, JPanel panel, GridBagConstraints constraints){
    	JLabel label = new JLabel(name);
    	constraints.fill = 2;
        constraints.gridx = x;
        constraints.gridy = y;
    	panel.add(label, constraints);
    	return label;
    }
    
    private JTextField createTextField(int length, int x, int y, JPanel panel, GridBagConstraints constraints){
    	JTextField text = new JTextField(length);
    	constraints.fill = 2;
        constraints.gridx = x;
        constraints.gridy = y;
    	panel.add(text, constraints);
    	return text;
    }
    
	public boolean isInteger(String s){
		try{
			Integer.parseInt(s);
			return true;
		} 
		catch(NumberFormatException e){
		}
		return false;
	}
    
	public boolean isDouble(String s){
		try{
			Double.parseDouble(s);
			return true;
		} 
		catch(NumberFormatException e){
		}
		return false;
	}
    
    public static void main(String[] args){
    	CreateGUI ui = new CreateGUI();
    }
}

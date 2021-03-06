/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviebookings;
import java.sql.*;

/**
 *
 * @author dell
 */
public class Billing extends javax.swing.JInternalFrame {

    /**
     * Creates new form Billing
     */
    
    String date, row, bookingId, seat, seats[];
    int screen, slot, seatNo, cost;
    
    public Billing() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("DATE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 125, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jTextField1.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 60, 0, 99);
        getContentPane().add(jTextField1, gridBagConstraints);

        jLabel2.setText("SCREEN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 125, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jTextField2.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 60, 0, 99);
        getContentPane().add(jTextField2, gridBagConstraints);

        jLabel3.setText("SLOT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 125, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jTextField3.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 60, 0, 99);
        getContentPane().add(jTextField3, gridBagConstraints);

        jLabel4.setText("SEAT(S)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 125, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jTextField4.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 60, 0, 99);
        getContentPane().add(jTextField4, gridBagConstraints);

        jLabel5.setText("TOATAL COST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 125, 39, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jTextField5.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 60, 39, 99);
        getContentPane().add(jTextField5, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void generateBill()
    {
        String id;
        
        seat = "";
        cost = 0;
        
        Connection con = null;
        Statement stmt = null;
	PreparedStatement pst = null;	
        ResultSet rs = null;
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","kalam");
            
            System.out.println("Connected");
            
            stmt = con.createStatement();
            
            rs = stmt.executeQuery("Select bookingId from bill where status=0");
            
            while(rs.next())
            {
                id = rs.getString(1);
                
                decodeId(id);
                cost = cost + generateCost(row);
                seat = seat + row + String.valueOf(seatNo) + " , ";
            }
        }
        catch(ClassNotFoundException ex1)
        {
            System.out.println(ex1);
        }
	catch(SQLException ex2)
	{
            System.out.println(ex2);
	}
        seats = seat.split(" , ");
        
        updateBill();
    }
  
    
    public int generateCost(String ro)
    {  
        int cs = 0;
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","kalam");
            
            System.out.println("Connected");
            
            stmt = con.createStatement();
            
            rs = stmt.executeQuery("Select cost from seat where row='"+ro+"'");
            
            while(rs.next())
            {
                cs = rs.getInt(1);
            }
        }
        catch(ClassNotFoundException ex1)
        {
            System.out.println(ex1);
        }
	catch(SQLException ex2)
	{
            System.out.println(ex2);
	}
        return cs;
    }
    
    public void updateBill()
    {
        Connection con = null;
	PreparedStatement pst = null;	
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","kalam");
			
            System.out.println("Connected");
		
            for(String x : seats)
            {
                pst = con.prepareStatement("update bill set status=1 where bookingId="+x);

                pst.executeUpdate();
            }
            
            System.out.println("data updated");
            
        }
        catch(ClassNotFoundException ex1)
        {
            System.out.println(ex1);
        }
	catch(SQLException ex2)
	{
            System.out.println(ex2);
	}
    }
    
    public void decodeId(String bId)
    {
        String s[];
        s = bId.split(":");
        
        date = s[0];
        screen = Integer.parseInt(s[1]);
        slot = Integer.parseInt(s[2]);
        row = s[3];
        seatNo = Integer.parseInt(s[4]);
        
    }
    
    public void display()
    {
        jTextField1.setText(date+"-12-2016");
        jTextField2.setText(String.valueOf(screen));
        jTextField3.setText(String.valueOf(slot));
        jTextField4.setText(seat);
        jTextField5.setText(String.valueOf(cost));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}

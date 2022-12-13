/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HealthAuditor;

import LifeSaveMain.EcoSystem;
import LifeSave.Enterprises.Enterprise;
import LifeSave.Network.Network;
import LifeSave.Organizations.OrganSeekerOrg;
import LifeSave.Organizations.HealthCouncilCommittee;
import LifeSave.Organizations.Organization;
import LifeSave.Person.OrganSeeker;
import LifeSave.UserAccounts.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tejageetla
 */
public class HealthAuditorJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    private HealthCouncilCommittee healthAuditor;
    private HashMap<String,Integer> communitydetailsmap;
 //   private OrganSeekerOrg helpSeekerOrg;

    /**
     * Creates new form SupervisorWorkAreaJPanel
     */
    public HealthAuditorJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, EcoSystem ecoSystem ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.healthAuditor = (HealthCouncilCommittee)organization;
        
        populateWorkRequestTable();
        
        
    }
    
  
    public void populateWorkRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel)communityHealthTable.getModel();
        model.setRowCount(0);
        
        try
        {
        communitydetailsmap = getHelpSeekerData();
        }
        catch(NullPointerException npe)
        {
        npe.printStackTrace();
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        }
         if(communitydetailsmap.isEmpty() || communitydetailsmap == null)
         {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return;      
         }
    
         Object[] rowData = new Object[4];
         rowData[0] = communitydetailsmap.get("TotalNoOfOrganSeeker");
         rowData[1] = communitydetailsmap.get("AverageAge");
         rowData[2] = communitydetailsmap.get("SeniorswithheartProblem");
         rowData[3] = communitydetailsmap.get("SeniorswithNoheartProblem");
         
         model.addRow(rowData);
    }
    
    public OrganSeekerOrg getOrganSeekerOrg()
    {
        OrganSeekerOrg helpSeekerOrg = null;
        
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.OrganSeeker))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof OrganSeekerOrg)
             {
              helpSeekerOrg = (OrganSeekerOrg)organization; 
             }
            }
            }
          }
         }
        }
        return helpSeekerOrg;
    }
    
    public HashMap<String,Integer> getHelpSeekerData()
    {
        int seniorCardiacProb = 0;
        int seniorNoCardiacProb = 0;
        int avgAge = 0;
        int seniorsWithSensorDevice = 0;
        int seniorsShareVitalInfo = 0;
        int seniorsSendDataToDoctor = 0;
        int seniorsWithNoSensorDevice = 0;
        
        OrganSeekerOrg helpSeekerOrganization = getOrganSeekerOrg();
        if(helpSeekerOrganization == null)
        {
        JOptionPane.showMessageDialog(null, " Help Seeker Organization does not exist!","warning", JOptionPane.WARNING_MESSAGE);
        return null;     
        }
        if(helpSeekerOrganization.getPersonDirectory().getOrganSeekerLsit().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Help Seekers Registered!","warning", JOptionPane.WARNING_MESSAGE);
        return null; 
        }
        int totalSeniors = helpSeekerOrganization.getPersonDirectory().getOrganSeekerLsit().size();
      HashMap<String,Integer> seniorHeartPatientMap = new HashMap<>();
       for(OrganSeeker helpSeeker : helpSeekerOrganization.getPersonDirectory().getOrganSeekerLsit())
          {
           if(helpSeeker.isHasCardiacProb())     
           {
            seniorCardiacProb ++;  
           } 
           if(!helpSeeker.isHasCardiacProb())
           {
            seniorNoCardiacProb ++;   
           }
           if(helpSeeker.isHasSensorDevice())
           {
            seniorsWithSensorDevice ++;   
           } 
           if(!helpSeeker.isHasSensorDevice())
           {
            seniorsWithNoSensorDevice++;   
           }
           if(helpSeeker.isSendDataToDoctor())
           {
            seniorsSendDataToDoctor ++;   
           } 
           if(helpSeeker.isShareVitalInfo())
           {
            seniorsShareVitalInfo ++;   
           } 
           avgAge+=helpSeeker.getAge();
          } 
        
               
       seniorHeartPatientMap.put("SeniorswithheartProblem", seniorCardiacProb);
       seniorHeartPatientMap.put("SeniorswithNoheartProblem", seniorNoCardiacProb);
       seniorHeartPatientMap.put("TotalNoOfSeniorPeople", totalSeniors);
       seniorHeartPatientMap.put("AverageAge", avgAge/totalSeniors);
       seniorHeartPatientMap.put("seniorsSendDataToDoctor",seniorsSendDataToDoctor);
       seniorHeartPatientMap.put("seniorsShareVitalInfo",seniorsShareVitalInfo);
       seniorHeartPatientMap.put("seniorsWithSensorDevice",seniorsWithSensorDevice);
       seniorHeartPatientMap.put("seniorsWithNoSensorDevice",seniorsWithNoSensorDevice);
       
       return seniorHeartPatientMap;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        communityHealthTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 153, 255));

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel7.setText("Health Report:");

        communityHealthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Organ Seekers", "Average age ", "Seniors with Heart problem", "Seniors with no health problems"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(communityHealthTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable communityHealthTable;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

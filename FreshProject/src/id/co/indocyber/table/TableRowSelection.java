/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.table;

import id.co.indocyber.clas.ReloadNasabah;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.html.parser.DTDConstants;

/**
 *
 * @author user
 */
public class TableRowSelection extends javax.swing.JFrame {

ReloadNasabah nasabah;
List<Person> people;
    /**
     * Creates new form TableRowSelection
     */
    public TableRowSelection() throws IOException {
        people = ReloadNasabah.InputFileNasabah("C:/JAVA_LATIHAN/datanasabah.txt");
        initComponents();
        showPeople();
    }
    
    private void showPeople() throws IOException{
        DefaultTableModel model=(DefaultTableModel)PersonTable.getModel();
                List<Person> people= ReloadNasabah.InputFileNasabah("C:/JAVA_LATIHAN/datanasabah.txt");
                
        Object[] row=new Object[4];
        for (Person person : people) {
            row[0]=person.getNama();
            row[1]=person.getGender();
            row[2]=person.isMarried();
            row[3]=person.getUmur();
            
            model.addRow(row);
            
        }
    
        ListSelectionModel rowSelModel=  PersonTable.getSelectionModel();
        rowSelModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()){
                    int i=PersonTable.getSelectedRow();
                    String nama=(String)model.getValueAt(i, 0);
                    namaReloadTextField.setText(nama);
                    String gender=(String)model.getValueAt(i, 1);
                    genderReloadCombox.setSelectedItem(gender);
                    String married=(String)model.getValueAt(i, 2).toString();
                    System.out.println(married);
                    
                    if(married.equalsIgnoreCase("married")) {
                        statusReloadBox.setSelected(true);
                        statusNasTextField.setText(married);
                    }else if (married.equalsIgnoreCase("Single")){
                        statusReloadBox.setSelected(false);
                        statusNasTextField.setText(married);
                    }
                    int umur=(int)model.getValueAt(i, 3);
                    String age=String.valueOf(umur);
                    umurReloadTextField.setText(age);
                    namaNasTextField.setText(nama);
                    genderNasTextField.setText(gender);
                    umurNasTextField.setText(age);
                    alamatNasTextField.setText(people.get(i).getAlamat());
                    tanggunganNasTextField.setText(String.valueOf(people.get(i).getTanggungan()));
                    bungaNasTextField.setText(Double.toString(people.get(i).getBunga()));
                    dpTextField.setText(Double.toString(people.get(i).getDp()));
                    penghasilanNasTextField.setText(Double.toString(people.get(i).getJumlahPenghasilan()));
                    lamaPinNasTextField.setText(String.valueOf(people.get(i).getLamaPinjaman()));
                    pinjamanNasTextField.setText(String.format("%,.2f",people.get(i).getPinjaman()));
                    
                    cicilanNasTextField.setText(String.format("%.2f",people.get(i).cicilanperBulan()));
                    
                    
                    
           
                    
                 
                    
                    
                        
                    }
             
            
            }
        });
    }
    
    
    
    
   private List<Person> getPeople(){
       List<Person> people= new ArrayList<>();
//       people.add(new Person("Tarno","Male",false,23));
//       people.add(new Person("Tarno","Male",false,23));
//       people.add(new Person("Tarno","Male",false,23));
//       people.add(new Person("Tarno","Male",false,23));
//       people.add(new Person("Tarno","Male",false,23));

return people;       
   }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PersonTable = new javax.swing.JTable();
        reloadButton = new javax.swing.JButton();
        namaReloadLabel = new javax.swing.JLabel();
        genderReloadLabel = new javax.swing.JLabel();
        namaReloadTextField = new javax.swing.JTextField();
        umurReloadLabel = new javax.swing.JLabel();
        umurReloadTextField = new javax.swing.JTextField();
        genderReloadCombox = new javax.swing.JComboBox<>();
        statusReloadBox = new javax.swing.JCheckBox();
        filterLabel = new javax.swing.JLabel();
        filterTextField = new javax.swing.JTextField();
        dataNasabahPanel = new javax.swing.JPanel();
        namaNasabahLabel = new javax.swing.JLabel();
        genderNasabahLabel = new javax.swing.JLabel();
        statusNasabahLabel = new javax.swing.JLabel();
        umurNasabahLabel = new javax.swing.JLabel();
        penghasilanNasabahLabel = new javax.swing.JLabel();
        jmlTanggunganLabel = new javax.swing.JLabel();
        jmlhTagihanLabel = new javax.swing.JLabel();
        lamaPinjamanLabel = new javax.swing.JLabel();
        namaNasTextField = new javax.swing.JTextField();
        genderNasTextField = new javax.swing.JTextField();
        statusNasTextField = new javax.swing.JTextField();
        umurNasTextField = new javax.swing.JTextField();
        tanggunganNasTextField = new javax.swing.JTextField();
        penghasilanNasTextField = new javax.swing.JTextField();
        lamaPinNasTextField = new javax.swing.JTextField();
        pinjamanNasTextField = new javax.swing.JTextField();
        sukuNasabahLabel = new javax.swing.JLabel();
        cicilanNasabahLabel = new javax.swing.JLabel();
        bungaNasTextField = new javax.swing.JTextField();
        cicilanNasTextField = new javax.swing.JTextField();
        penghasilanNasabahLabel1 = new javax.swing.JLabel();
        alamatNasTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dpTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PersonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nama", "gender", "married", "umur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PersonTable);

        reloadButton.setText("Reload Data");

        namaReloadLabel.setText("Nama:");

        genderReloadLabel.setText("Gender");

        umurReloadLabel.setText("Umur");

        genderReloadCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        statusReloadBox.setText("Married");

        filterLabel.setText("Filter :");

        filterTextField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                filterTextFieldCaretUpdate(evt);
            }
        });

        dataNasabahPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Nasabah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        namaNasabahLabel.setText("Nama :");

        genderNasabahLabel.setText("Gender:");

        statusNasabahLabel.setText("Status:");

        umurNasabahLabel.setText("Umur:");

        penghasilanNasabahLabel.setText("Salary:");

        jmlTanggunganLabel.setText("Jumlah Tanggungan:");

        jmlhTagihanLabel.setText("Jumlah Pinjaman:");

        lamaPinjamanLabel.setText("Lama Pinjaman:");

        sukuNasabahLabel.setText("Suku Bunga:");

        cicilanNasabahLabel.setText("Cicilan Perbulan:");

        penghasilanNasabahLabel1.setText("Alamat:");

        jLabel1.setText("Dp:");

        jLabel2.setText("%");

        jLabel3.setText("Rp.");

        jLabel4.setText("Rp.");

        jLabel5.setText("Rp.");

        jLabel6.setText("Rp.");

        jLabel7.setText("Bulan");

        javax.swing.GroupLayout dataNasabahPanelLayout = new javax.swing.GroupLayout(dataNasabahPanel);
        dataNasabahPanel.setLayout(dataNasabahPanelLayout);
        dataNasabahPanelLayout.setHorizontalGroup(
            dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataNasabahPanelLayout.createSequentialGroup()
                .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                        .addComponent(penghasilanNasabahLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(penghasilanNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                                .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaNasabahLabel)
                                    .addComponent(genderNasabahLabel)
                                    .addComponent(statusNasabahLabel)
                                    .addComponent(umurNasabahLabel))
                                .addGap(80, 80, 80)
                                .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(statusNasTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(genderNasTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaNasTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(umurNasTextField)))
                            .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                                .addComponent(penghasilanNasabahLabel1)
                                .addGap(81, 81, 81)
                                .addComponent(alamatNasTextField)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                        .addComponent(jmlhTagihanLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addComponent(lamaPinjamanLabel)
                    .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                        .addComponent(cicilanNasabahLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(sukuNasabahLabel)
                    .addComponent(jmlTanggunganLabel)
                    .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pinjamanNasTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cicilanNasTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tanggunganNasTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dataNasabahPanelLayout.createSequentialGroup()
                        .addComponent(bungaNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dataNasabahPanelLayout.createSequentialGroup()
                        .addComponent(lamaPinNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dataNasabahPanelLayout.setVerticalGroup(
            dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaNasabahLabel)
                            .addComponent(namaNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderNasabahLabel)
                            .addComponent(genderNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusNasabahLabel)
                            .addComponent(statusNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jmlTanggunganLabel)
                            .addComponent(tanggunganNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sukuNasabahLabel)
                            .addComponent(bungaNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cicilanNasabahLabel)
                            .addComponent(cicilanNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jmlhTagihanLabel)
                            .addComponent(pinjamanNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(umurNasabahLabel)
                            .addComponent(umurNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(penghasilanNasabahLabel1)
                            .addComponent(alamatNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(penghasilanNasabahLabel))
                            .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(penghasilanNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(dataNasabahPanelLayout.createSequentialGroup()
                        .addGroup(dataNasabahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lamaPinjamanLabel)
                            .addComponent(lamaPinNasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(filterLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(namaReloadLabel)
                                            .addComponent(genderReloadLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(genderReloadCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(96, 96, 96))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(namaReloadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(umurReloadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(umurReloadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(statusReloadBox)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(reloadButton)))
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dataNasabahPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reloadButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterLabel)
                    .addComponent(filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaReloadLabel)
                    .addComponent(namaReloadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(umurReloadLabel)
                    .addComponent(umurReloadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderReloadLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(statusReloadBox)
                        .addComponent(genderReloadCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataNasabahPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
       
//            
//            String search =filterTextField.getName();
//            TableRowSelection model ;
//           
//            DefaultTableModel dtm = (DefaultTableModel) PersonTable.getModel();
//
//            dtm.setRowCount(0);
//            String [] data = new String[4];
//            int i = 1;
//
//            try {
//                while(dtm.equals(people))
//                {
//                    Object[] row=new Object[4];
//                    for (Person person : people) {
//                        row[0]=person.getNama();
//                        row[1]=person.getGender();
//                        row[2]=person.isMarried();
//                        row[3]=person.getUmur();
//                        
//                        dtm.addRow(p);
//                        i++;
//                    }
//                    filterTextField.setText("");
//                }   }
//        catch(Exception ex)  {
//            JOptionPane.showMessageDialog(null,"Data yang Anda cari Tidak dapat Ditemukan");
//            System.err.println("error (search) : " +ex);
//        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void filterTextFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_filterTextFieldCaretUpdate
        // TODO add your handling code here:
        TableRowSorter<DefaultTableModel> filter=new TableRowSorter<>();
        String query=filterTextField.getText();
        PersonTable.setRowSorter(filter);
        filter.setRowFilter(RowFilter.regexFilter("(?i)" + filterTextField.getText(), 0,1,2,3));
    }//GEN-LAST:event_filterTextFieldCaretUpdate

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
            java.util.logging.Logger.getLogger(TableRowSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableRowSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableRowSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableRowSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TableRowSelection().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TableRowSelection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PersonTable;
    private javax.swing.JTextField alamatNasTextField;
    private javax.swing.JTextField bungaNasTextField;
    private javax.swing.JTextField cicilanNasTextField;
    private javax.swing.JLabel cicilanNasabahLabel;
    private javax.swing.JPanel dataNasabahPanel;
    private javax.swing.JTextField dpTextField;
    private javax.swing.JLabel filterLabel;
    private javax.swing.JTextField filterTextField;
    private javax.swing.JTextField genderNasTextField;
    private javax.swing.JLabel genderNasabahLabel;
    private javax.swing.JComboBox<String> genderReloadCombox;
    private javax.swing.JLabel genderReloadLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jmlTanggunganLabel;
    private javax.swing.JLabel jmlhTagihanLabel;
    private javax.swing.JTextField lamaPinNasTextField;
    private javax.swing.JLabel lamaPinjamanLabel;
    private javax.swing.JTextField namaNasTextField;
    private javax.swing.JLabel namaNasabahLabel;
    private javax.swing.JLabel namaReloadLabel;
    private javax.swing.JTextField namaReloadTextField;
    private javax.swing.JTextField penghasilanNasTextField;
    private javax.swing.JLabel penghasilanNasabahLabel;
    private javax.swing.JLabel penghasilanNasabahLabel1;
    private javax.swing.JTextField pinjamanNasTextField;
    private javax.swing.JButton reloadButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField statusNasTextField;
    private javax.swing.JLabel statusNasabahLabel;
    private javax.swing.JCheckBox statusReloadBox;
    private javax.swing.JLabel sukuNasabahLabel;
    private javax.swing.JTextField tanggunganNasTextField;
    private javax.swing.JTextField umurNasTextField;
    private javax.swing.JLabel umurNasabahLabel;
    private javax.swing.JLabel umurReloadLabel;
    private javax.swing.JTextField umurReloadTextField;
    // End of variables declaration//GEN-END:variables
}

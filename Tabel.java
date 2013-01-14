import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public final class Tabel extends javax.swing.JFrame {

    public Connection con;
    public Statement stt;
    private PreparedStatement pst;
    private ResultSet rs;
    public Login login;
    
    public Tabel() {
                initComponents();
                koneksi();
                update_data();
    } 
 
    public void koneksi(){
    try {
            Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cab_adventure","root","");
              stt = con.createStatement();
              JOptionPane.showMessageDialog(null, "Koneksi Berhasil ke Database");
        }catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Koneksi ke Database Tidak Berhasil");
        }
    }
   
   public void update_data(){
    try{
        koneksi();
        String query = "select*from traveling";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        tabel.setModel(DbUtils.resultSetToTableModel(rs));
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }finally
    {
        try{
            rs.close();
            pst.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
  }   
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nama_pulau = new javax.swing.JTextField();
        alamat_pulau = new javax.swing.JTextField();
        nama_tourguide = new javax.swing.JTextField();
        OK = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        keterangan = new javax.swing.JTextArea();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("CAB Adventure");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Nama Pulau ");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Alamat Pulau");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Keterangan");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Nama Tourguide");

        OK.setBackground(new java.awt.Color(255, 255, 255));
        OK.setText("Save");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        tabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        tabel.setForeground(new java.awt.Color(0, 102, 204));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "nama_pulau", "alamat_pulau", "keterangan", "nama_tourguide"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setText("Delete");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keterangan.setColumns(20);
        keterangan.setRows(5);
        jScrollPane1.setViewportView(keterangan);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alamat_pulau, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama_pulau, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama_tourguide, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama_pulau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(alamat_pulau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_tourguide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
       try{
                String sql ="delete from traveling where nama_pulau=?";
                pst=con.prepareStatement(sql);
                pst.setString(1, nama_pulau.getText());
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
         update_data();      
    }//GEN-LAST:event_hapusActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
       try {
          String sql = "Insert into traveling (nama_pulau,alamat_pulau,keterangan,nama_tourguide) values (?,?,?,?)";
          pst = con.prepareStatement(sql);
          pst.setString(1, nama_pulau.getText());
          pst.setString(2, alamat_pulau.getText());
          pst.setString(3, keterangan.getText());
          pst.setString(4, nama_tourguide.getText());
          
         pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");      
     }
     catch(Exception e)
     {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan");
     }
        update_data();
    }//GEN-LAST:event_OKActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
     try {
         
          String nama = nama_pulau.getText();
          String alamat = alamat_pulau.getText();
          String ket = keterangan.getText();
          String guide = nama_tourguide.getText();
          
          String sqlEdit = "update traveling set nama_pulau='"+nama+"', alamat_pulau='"+alamat+"', keterangan='"+ket+"', nama_tourguide='"+guide+"' where nama_pulau= '"+nama+"'" ;
          pst = con.prepareStatement(sqlEdit);
          pst.execute();
          JOptionPane.showMessageDialog(null, "Data Telah Di Edit");
          
          nama_pulau.setText("");
          nama_pulau.requestFocus();
          alamat_pulau.setText("");
          alamat_pulau.requestFocus();
          keterangan.setText("");
          keterangan.requestFocus();
          nama_tourguide.setText("");
          nama_tourguide.requestFocus();
          nama_pulau.setText("");
          nama_pulau.requestFocus();
        }catch(Exception e)
     
     {
       JOptionPane.showMessageDialog(null, "Gagal Menyimpan");
     }
            update_data();   
    }//GEN-LAST:event_editActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
          
       int row = tabel.getSelectedRow();
       nama_pulau.setText(tabel.getModel().getValueAt(row, 0).toString()) ;
       alamat_pulau.setText(tabel.getModel().getValueAt(row, 1).toString()) ;
       keterangan.setText(tabel.getModel().getValueAt(row, 2).toString()) ;
       nama_tourguide.setText(tabel.getModel().getValueAt(row, 3).toString()) ;
    }//GEN-LAST:event_tabelMouseClicked

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        nama_pulau.setText("");
        nama_pulau.requestFocus();
        alamat_pulau.setText("");
        alamat_pulau.requestFocus();
        keterangan.setText("");
        keterangan.requestFocus();
        nama_tourguide.setText("");
        nama_tourguide.requestFocus();
    }//GEN-LAST:event_CancelActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    try {
                login = new Login();
                login.setVisible(true);
                this.dispose();
            
       }catch (Exception e){
             JOptionPane.showMessageDialog(null,"Anda salah" );
        }
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            
            public void run() {
                new Tabel().setVisible(true);
            }
        });
    }
         public void setTampil(boolean y){
        new Tabel().setVisible(y);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton OK;
    private javax.swing.JTextField alamat_pulau;
    private javax.swing.JButton back;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea keterangan;
    private javax.swing.JTextField nama_pulau;
    private javax.swing.JTextField nama_tourguide;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}

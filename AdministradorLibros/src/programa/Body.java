
package programa;

import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import programa.OperacionesDB.bibliotecario;
import programa.OperacionesDB.libro;
import programa.OperacionesDB.usuario;
import programa.OperacionesDB.prestarLibro;

public class Body extends javax.swing.JFrame {
    
    public static bibliotecario Administrador;
    Color gris = new Color(238,238,238);
    Color naranja = new Color(255,204,0);
    int codigoLibroPrestado = 0;
    

    public Body() {
        initComponents();
        llenarTablaLibros();
        MostrarBibliotecarios.setBackground(gris);
        MostrarDisponibles.setBackground(gris);
        MostrarLibros.setBackground(naranja);
        MostrarPrestados.setBackground(gris);
        MostrarUsuarios.setBackground(gris);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MensajeAgregarUsr = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BotonAgregarUsuario = new javax.swing.JButton();
        FieldAgregarUsuarioNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FieldAgregarUsuarioCC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        FieldAgregarUsuarioTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        FieldAgregarUsuarioTipo = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        MensajeAgregarLibro = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ButtonAgregarLibro = new javax.swing.JButton();
        FieldAgregarLibroNombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        FieldAgregarLibroAutor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        FieldAgregarLibroEdicion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        FieldAgregarLibroGenero = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        FieldAgregarLibroPaginas = new javax.swing.JTextField();
        FieldAgregarLibroCodigo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        MensajeAgregarBibliotecario = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BtnAgregarBibli = new javax.swing.JButton();
        FieldAgregarBibliNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        FieldAgregarBibliId = new javax.swing.JTextField();
        FieldAgregarBibliTel = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        FieldAgregarBibliClave = new javax.swing.JTextField();
        MensajePrestarLibro = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        PrestarLibroFechaLLegada = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        PrestarLibroTiempoMax = new javax.swing.JComboBox<>();
        PrestarLibroFecha = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SeleccionarLibro = new javax.swing.JList<>();
        NoIdPrestarLibro = new javax.swing.JTextField();
        PrestarLibroNombre = new javax.swing.JLabel();
        PrestarLibroTelefono = new javax.swing.JLabel();
        BtnPrestarLibroAgregarUsuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        PrestarLibroBuscar = new javax.swing.JButton();
        EntregarLibro = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EntregarLibroCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        EntregaLibroNombreLibro = new javax.swing.JLabel();
        EntregaLibroNombreUsuario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ConfirmarEntrega = new javax.swing.JButton();
        BarraMenu = new javax.swing.JPanel();
        TextAgregarLibro = new javax.swing.JLabel();
        BtnAgregarLibro = new javax.swing.JButton();
        TextAgregarUsr = new javax.swing.JLabel();
        BtnAgrergarUsr = new javax.swing.JButton();
        TextAgregarBiblio = new javax.swing.JLabel();
        BtnAgregarBiblio = new javax.swing.JButton();
        TextPrestarLibro = new javax.swing.JLabel();
        BtnPrestarLibro = new javax.swing.JButton();
        TextListaNegra = new javax.swing.JLabel();
        BtnListaNegra = new javax.swing.JButton();
        BarraLateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MostrarLibros = new javax.swing.JButton();
        MostrarPrestados = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        MostrarUsuarios = new javax.swing.JButton();
        MostrarBibliotecarios = new javax.swing.JButton();
        MostrarDisponibles = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPrincipal = new javax.swing.JTable();

        MensajeAgregarUsr.setTitle("Agregar");
        MensajeAgregarUsr.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel9.setText("Añadir Nuevo Usuario");

        BotonAgregarUsuario.setBackground(new java.awt.Color(255, 204, 0));
        BotonAgregarUsuario.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        BotonAgregarUsuario.setText("Agregar");
        BotonAgregarUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotonAgregarUsuario.setBorderPainted(false);
        BotonAgregarUsuario.setFocusPainted(false);
        BotonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarUsuarioActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre");

        jLabel11.setText("Tipo de Id");

        jLabel12.setText("Teléfono");

        FieldAgregarUsuarioTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "Nit", "Item 3", "Item 4" }));

        jLabel21.setText("Numero de Identificación");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FieldAgregarUsuarioTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FieldAgregarUsuarioCC, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(FieldAgregarUsuarioTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldAgregarUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldAgregarUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldAgregarUsuarioCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldAgregarUsuarioTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldAgregarUsuarioTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonAgregarUsuario)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MensajeAgregarUsrLayout = new javax.swing.GroupLayout(MensajeAgregarUsr.getContentPane());
        MensajeAgregarUsr.getContentPane().setLayout(MensajeAgregarUsrLayout);
        MensajeAgregarUsrLayout.setHorizontalGroup(
            MensajeAgregarUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MensajeAgregarUsrLayout.setVerticalGroup(
            MensajeAgregarUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MensajeAgregarLibro.setTitle("Agregar");
        MensajeAgregarLibro.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel15.setText("Añadir Nuevo Libro");

        ButtonAgregarLibro.setBackground(new java.awt.Color(255, 204, 0));
        ButtonAgregarLibro.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ButtonAgregarLibro.setText("Agregar");
        ButtonAgregarLibro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ButtonAgregarLibro.setBorderPainted(false);
        ButtonAgregarLibro.setFocusPainted(false);
        ButtonAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarLibroActionPerformed(evt);
            }
        });

        jLabel16.setText("Nombre");

        jLabel17.setText("Autor");

        jLabel18.setText("Edición");

        jLabel19.setText("Genero");

        jLabel20.setText("No Páginas");

        jLabel25.setText("Código");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(FieldAgregarLibroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FieldAgregarLibroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FieldAgregarLibroEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(FieldAgregarLibroGenero))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(FieldAgregarLibroPaginas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                            .addComponent(FieldAgregarLibroCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(19, 19, 19)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldAgregarLibroCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldAgregarLibroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldAgregarLibroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldAgregarLibroEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldAgregarLibroGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldAgregarLibroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(ButtonAgregarLibro)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MensajeAgregarLibroLayout = new javax.swing.GroupLayout(MensajeAgregarLibro.getContentPane());
        MensajeAgregarLibro.getContentPane().setLayout(MensajeAgregarLibroLayout);
        MensajeAgregarLibroLayout.setHorizontalGroup(
            MensajeAgregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MensajeAgregarLibroLayout.setVerticalGroup(
            MensajeAgregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MensajeAgregarBibliotecario.setTitle("Agregar");
        MensajeAgregarBibliotecario.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel13.setText("Añadir Nuevo Bibliotecari@");

        BtnAgregarBibli.setBackground(new java.awt.Color(255, 204, 0));
        BtnAgregarBibli.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        BtnAgregarBibli.setText("Agregar");
        BtnAgregarBibli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnAgregarBibli.setBorderPainted(false);
        BtnAgregarBibli.setFocusPainted(false);
        BtnAgregarBibli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarBibliActionPerformed(evt);
            }
        });

        jLabel14.setText("Nombre");

        jLabel23.setText("Teléfono");

        jLabel24.setText("Numero de Identificación");

        jLabel26.setText("Clave");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(FieldAgregarBibliTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldAgregarBibliClave, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FieldAgregarBibliId, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnAgregarBibli, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FieldAgregarBibliNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldAgregarBibliNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldAgregarBibliId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldAgregarBibliTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldAgregarBibliClave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAgregarBibli)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MensajeAgregarBibliotecarioLayout = new javax.swing.GroupLayout(MensajeAgregarBibliotecario.getContentPane());
        MensajeAgregarBibliotecario.getContentPane().setLayout(MensajeAgregarBibliotecarioLayout);
        MensajeAgregarBibliotecarioLayout.setHorizontalGroup(
            MensajeAgregarBibliotecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MensajeAgregarBibliotecarioLayout.setVerticalGroup(
            MensajeAgregarBibliotecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeAgregarBibliotecarioLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MensajePrestarLibro.setTitle("Agregar");
        MensajePrestarLibro.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel22.setText("Prestar Libro");

        jButton17.setBackground(new java.awt.Color(255, 204, 0));
        jButton17.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton17.setText("Agregar");
        jButton17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton17.setBorderPainted(false);
        jButton17.setFocusPainted(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        jLabel29.setText("No Registro: 0000001");

        jLabel30.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        jLabel30.setText("Bibliotecario: Nombre del bibliotecario que presto");

        PrestarLibroFechaLLegada.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        PrestarLibroFechaLLegada.setText("Fecha: 00/00/0000");

        jLabel32.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        jLabel32.setText("Tiempo Maximo de entrega");

        PrestarLibroTiempoMax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2 Meses", "4 Meses", "6 Meses", " " }));
        PrestarLibroTiempoMax.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PrestarLibroTiempoMaxItemStateChanged(evt);
            }
        });
        PrestarLibroTiempoMax.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                PrestarLibroTiempoMaxPropertyChange(evt);
            }
        });

        PrestarLibroFecha.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        PrestarLibroFecha.setText("Fecha: 00/00/0000");

        jLabel34.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        jLabel34.setText("Usuario");

        jLabel35.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        jLabel35.setText("Libro");

        SeleccionarLibro.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cien años de soledad", "El gran Gatsby", "1984", "Matar a un ruiseñor", "Orgullo y prejuicio", "La metamorfosis", "El señor de los anillos", "Crimen y castigo", "El nombre de la rosa", "El viejo y el mar", "Las aventuras de Huckleberry Finn", "Guerra y paz", "Fahrenheit 451", "El proceso", "La insoportable levedad del ser", "El extraño caso del doctor Jekyll y Mr. Hyde", "Don Quijote de la Mancha", "Los hermanos Karamazov", "Ana Karenina", "La naranja mecánica" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(SeleccionarLibro);

        NoIdPrestarLibro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                NoIdPrestarLibroPropertyChange(evt);
            }
        });
        NoIdPrestarLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NoIdPrestarLibroKeyPressed(evt);
            }
        });

        PrestarLibroNombre.setText("Nombre: ");

        PrestarLibroTelefono.setText("Teléfono:");

        BtnPrestarLibroAgregarUsuario.setBackground(new java.awt.Color(255, 204, 0));
        BtnPrestarLibroAgregarUsuario.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        BtnPrestarLibroAgregarUsuario.setText("Usuario Nuevo");
        BtnPrestarLibroAgregarUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnPrestarLibroAgregarUsuario.setBorderPainted(false);
        BtnPrestarLibroAgregarUsuario.setFocusPainted(false);
        BtnPrestarLibroAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrestarLibroAgregarUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("No Identificación:");

        PrestarLibroBuscar.setBackground(new java.awt.Color(255, 204, 0));
        PrestarLibroBuscar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        PrestarLibroBuscar.setText("Buscar");
        PrestarLibroBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PrestarLibroBuscar.setBorderPainted(false);
        PrestarLibroBuscar.setFocusPainted(false);
        PrestarLibroBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestarLibroBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(NoIdPrestarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrestarLibroBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PrestarLibroTelefono)
                    .addComponent(PrestarLibroNombre)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrestarLibroFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel35)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(PrestarLibroTiempoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PrestarLibroFechaLLegada, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnPrestarLibroAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrestarLibroFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrestarLibroTiempoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrestarLibroFechaLLegada, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnPrestarLibroAgregarUsuario))
                .addGap(4, 4, 4)
                .addComponent(PrestarLibroNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrestarLibroTelefono)
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NoIdPrestarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrestarLibroBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout MensajePrestarLibroLayout = new javax.swing.GroupLayout(MensajePrestarLibro.getContentPane());
        MensajePrestarLibro.getContentPane().setLayout(MensajePrestarLibroLayout);
        MensajePrestarLibroLayout.setHorizontalGroup(
            MensajePrestarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MensajePrestarLibroLayout.setVerticalGroup(
            MensajePrestarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Entregar Libro");

        jLabel3.setText("Codigo del Libro");

        EntregaLibroNombreLibro.setText("Libro:");

        EntregaLibroNombreUsuario.setText("Usuario:");

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setText("Buscar");
        jButton1.setActionCommand("k");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ConfirmarEntrega.setBackground(new java.awt.Color(255, 204, 0));
        ConfirmarEntrega.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ConfirmarEntrega.setText("Confirmar");
        ConfirmarEntrega.setActionCommand("k");
        ConfirmarEntrega.setBorderPainted(false);
        ConfirmarEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarEntregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator6)
                    .addComponent(EntregaLibroNombreLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EntregaLibroNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EntregarLibroCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(ConfirmarEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntregarLibroCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntregaLibroNombreLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntregaLibroNombreUsuario)
                .addGap(33, 33, 33)
                .addComponent(ConfirmarEntrega)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EntregarLibroLayout = new javax.swing.GroupLayout(EntregarLibro.getContentPane());
        EntregarLibro.getContentPane().setLayout(EntregarLibroLayout);
        EntregarLibroLayout.setHorizontalGroup(
            EntregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EntregarLibroLayout.setVerticalGroup(
            EntregarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BarraMenu.setBackground(new java.awt.Color(255, 255, 255));

        TextAgregarLibro.setText("Añadir Libro");

        BtnAgregarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/AddBook.png"))); // NOI18N
        BtnAgregarLibro.setBorder(null);
        BtnAgregarLibro.setBorderPainted(false);
        BtnAgregarLibro.setContentAreaFilled(false);
        BtnAgregarLibro.setFocusPainted(false);
        BtnAgregarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAgregarLibroMouseClicked(evt);
            }
        });
        BtnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarLibroActionPerformed(evt);
            }
        });

        TextAgregarUsr.setText("Añadir Usuario");

        BtnAgrergarUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/AddUser.png"))); // NOI18N
        BtnAgrergarUsr.setBorder(null);
        BtnAgrergarUsr.setBorderPainted(false);
        BtnAgrergarUsr.setContentAreaFilled(false);
        BtnAgrergarUsr.setFocusPainted(false);
        BtnAgrergarUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgrergarUsrActionPerformed(evt);
            }
        });

        TextAgregarBiblio.setText("Añadir Bibliotecario");

        BtnAgregarBiblio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/addBibliotecario.png"))); // NOI18N
        BtnAgregarBiblio.setBorder(null);
        BtnAgregarBiblio.setBorderPainted(false);
        BtnAgregarBiblio.setContentAreaFilled(false);
        BtnAgregarBiblio.setFocusPainted(false);
        BtnAgregarBiblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarBiblioActionPerformed(evt);
            }
        });

        TextPrestarLibro.setText("Prestar Libro");

        BtnPrestarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/diary.png"))); // NOI18N
        BtnPrestarLibro.setBorder(null);
        BtnPrestarLibro.setBorderPainted(false);
        BtnPrestarLibro.setContentAreaFilled(false);
        BtnPrestarLibro.setFocusPainted(false);
        BtnPrestarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrestarLibroActionPerformed(evt);
            }
        });

        TextListaNegra.setText("Lista Negra");

        BtnListaNegra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/ListBlack.png"))); // NOI18N
        BtnListaNegra.setBorder(null);
        BtnListaNegra.setBorderPainted(false);
        BtnListaNegra.setContentAreaFilled(false);
        BtnListaNegra.setFocusPainted(false);
        BtnListaNegra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListaNegraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarraMenuLayout = new javax.swing.GroupLayout(BarraMenu);
        BarraMenu.setLayout(BarraMenuLayout);
        BarraMenuLayout.setHorizontalGroup(
            BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextAgregarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAgregarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextAgregarUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAgrergarUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextAgregarBiblio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAgregarBiblio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 314, Short.MAX_VALUE)
                .addGroup(BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextPrestarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnPrestarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextListaNegra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnListaNegra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BarraMenuLayout.setVerticalGroup(
            BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarraMenuLayout.createSequentialGroup()
                        .addComponent(BtnListaNegra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextListaNegra))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraMenuLayout.createSequentialGroup()
                        .addComponent(BtnPrestarLibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextPrestarLibro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(BarraMenuLayout.createSequentialGroup()
                                .addComponent(BtnAgregarBiblio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextAgregarBiblio))
                            .addGroup(BarraMenuLayout.createSequentialGroup()
                                .addComponent(BtnAgrergarUsr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextAgregarUsr))
                            .addGroup(BarraMenuLayout.createSequentialGroup()
                                .addComponent(BtnAgregarLibro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextAgregarLibro)))))
                .addContainerGap())
        );

        BarraLateral.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IcoLibros.png"))); // NOI18N
        jLabel1.setText("Libros");

        MostrarLibros.setText("Libros");
        MostrarLibros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MostrarLibros.setBorderPainted(false);
        MostrarLibros.setFocusPainted(false);
        MostrarLibros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MostrarLibros.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MostrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarLibrosActionPerformed(evt);
            }
        });

        MostrarPrestados.setText("Prestados");
        MostrarPrestados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MostrarPrestados.setBorderPainted(false);
        MostrarPrestados.setFocusPainted(false);
        MostrarPrestados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MostrarPrestados.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MostrarPrestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPrestadosActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 0));
        jButton4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton4.setText("Entrega");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("Listas");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IcoLibros.png"))); // NOI18N
        jLabel8.setText("Personas");

        MostrarUsuarios.setText("Usuarios");
        MostrarUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MostrarUsuarios.setBorderPainted(false);
        MostrarUsuarios.setFocusPainted(false);
        MostrarUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MostrarUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarUsuariosActionPerformed(evt);
            }
        });

        MostrarBibliotecarios.setBackground(new java.awt.Color(255, 204, 0));
        MostrarBibliotecarios.setText("Bibliotecarios");
        MostrarBibliotecarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MostrarBibliotecarios.setBorderPainted(false);
        MostrarBibliotecarios.setFocusPainted(false);
        MostrarBibliotecarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MostrarBibliotecarios.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MostrarBibliotecarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarBibliotecariosActionPerformed(evt);
            }
        });

        MostrarDisponibles.setText("Disponibles");
        MostrarDisponibles.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MostrarDisponibles.setBorderPainted(false);
        MostrarDisponibles.setFocusPainted(false);
        MostrarDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MostrarDisponibles.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MostrarDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarDisponiblesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarraLateralLayout = new javax.swing.GroupLayout(BarraLateral);
        BarraLateral.setLayout(BarraLateralLayout);
        BarraLateralLayout.setHorizontalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MostrarPrestados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MostrarLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MostrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MostrarBibliotecarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MostrarDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BarraLateralLayout.createSequentialGroup()
                        .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BarraLateralLayout.setVerticalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MostrarLibros)
                .addGap(4, 4, 4)
                .addComponent(MostrarDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MostrarPrestados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MostrarUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MostrarBibliotecarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        TablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Autor", "Nombre", "Edición", "Páginas", "Generos"
            }
        ));
        jScrollPane1.setViewportView(TablaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(BarraMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BarraLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EntregarLibro.setVisible(true);
        EntregarLibro.setLocationRelativeTo(this);
        EntregarLibro.setSize(400,300);
        ConfirmarEntrega.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BtnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarLibroActionPerformed
        //Accion cuando se presiona agregar nuevo Usuario
        //Mostrar mensaje Emergente
        MensajeAgregarLibro.setSize(390, 420);
        MensajeAgregarLibro.setLocationRelativeTo(this);
        MensajeAgregarLibro.setModal(true);
        MensajeAgregarLibro.setVisible(true);
        //-------------------------       
    }//GEN-LAST:event_BtnAgregarLibroActionPerformed

    private void BtnAgrergarUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgrergarUsrActionPerformed
        //Accion cuando se presiona agregar nuevo Libro
        //Mostrar mensaje Emergente
        MensajeAgregarUsr.setSize(390, 340);
        MensajeAgregarUsr.setLocationRelativeTo(this);
        MensajeAgregarUsr.setModal(true);
        MensajeAgregarUsr.setVisible(true);
        //-------------------------
    }//GEN-LAST:event_BtnAgrergarUsrActionPerformed

    private void BtnAgregarBiblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarBiblioActionPerformed
        //Accion cuando se presiona agregar nuevo Libro
        //Mostrar mensaje Emergente
        MensajeAgregarBibliotecario.setSize(390, 390);
        MensajeAgregarBibliotecario.setLocationRelativeTo(this);
        MensajeAgregarBibliotecario.setModal(true);
        MensajeAgregarBibliotecario.setVisible(true);
        //-------------------------
    }//GEN-LAST:event_BtnAgregarBiblioActionPerformed

    private void BtnPrestarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrestarLibroActionPerformed
        //Accion cuando se presiona agregar nuevo Libro
        //Mostrar mensaje Emergente
        LocalDate fecha = LocalDate.now();
        PrestarLibroFecha.setText("Fecha: "+fecha.toString());
        PrestarLibroFechaLLegada.setText(fecha.toString());
        MensajePrestarLibro.setSize(360, 550);
        MensajePrestarLibro.setLocationRelativeTo(this);
        MensajePrestarLibro.setModal(true);
        libro consultaLibro = new libro();
        SeleccionarLibro.setListData(consultaLibro.librosDisponibles());
        MensajePrestarLibro.setVisible(true);
        //-------------------------
    }//GEN-LAST:event_BtnPrestarLibroActionPerformed

    private void BtnListaNegraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListaNegraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnListaNegraActionPerformed

    private void BotonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarUsuarioActionPerformed
        
        usuario agregar = new usuario(FieldAgregarUsuarioCC.getText(), FieldAgregarUsuarioNombre.getText(), FieldAgregarUsuarioTipo.getSelectedItem().toString(), FieldAgregarUsuarioTelefono.getText());
        agregar.agregarUsuario();
        llenarTablaUsuarios();
        FieldAgregarUsuarioCC.setText("");
        FieldAgregarUsuarioNombre.setText("");
        FieldAgregarUsuarioTelefono.setText("");
        FieldAgregarUsuarioTipo.setSelectedIndex(0);
        MensajeAgregarUsr.setVisible(false);
        
    }//GEN-LAST:event_BotonAgregarUsuarioActionPerformed

    private void BtnAgregarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarLibroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarLibroMouseClicked

    private void ButtonAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarLibroActionPerformed
        
        libro nlibro = new libro(numeroLibroSolo(),FieldAgregarLibroAutor.getText(),FieldAgregarLibroNombre.getText(),FieldAgregarLibroEdicion.getText(),FieldAgregarLibroPaginas.getText(),FieldAgregarLibroGenero.getText());
        nlibro.agregarlibro();
        llenarTablaLibros();
        FieldAgregarLibroAutor.setText("");
        FieldAgregarLibroCodigo.setText("");
        FieldAgregarLibroEdicion.setText("");
        FieldAgregarLibroGenero.setText("");
        FieldAgregarLibroNombre.setText("");
        FieldAgregarLibroPaginas.setText("");
        MensajeAgregarLibro.setVisible(false);
        
    }//GEN-LAST:event_ButtonAgregarLibroActionPerformed

    private void BtnAgregarBibliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarBibliActionPerformed
        
        bibliotecario nbibli;
        nbibli = new bibliotecario(FieldAgregarBibliId.getText(),FieldAgregarBibliNombre.getText(),FieldAgregarBibliTel.getText(),FieldAgregarBibliClave.getText());
        nbibli.agregar();
        llenarTablaBibliotecarios();
        FieldAgregarBibliClave.setText("");
        FieldAgregarBibliId.setText("");
        FieldAgregarBibliNombre.setText("");
        FieldAgregarBibliTel.setText("");
        MensajeAgregarBibliotecario.setVisible(false);
    }//GEN-LAST:event_BtnAgregarBibliActionPerformed
    
    int obtenerCodigoLibro(){
        try{
            String valor = SeleccionarLibro.getSelectedValue();
            System.out.println(valor);
            String valornS = "";

            for(int i = 0; i < valor.length() && (valor.charAt(i) != '.');i++){
                valornS += valor.charAt(i) + "";
                System.out.println(valornS);
            }
            return Integer.parseInt(valornS);
        }catch(Exception e){
            System.out.print("Error al obtener codigo: "+e);
            return 0;
        
        }
    }
    
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
        prestarLibro nuevoPrestar = new prestarLibro(
            PrestarLibroFecha.getText(),
            PrestarLibroFechaLLegada.getText(),
            Administrador.getId(),
            NoIdPrestarLibro.getText(),
            obtenerCodigoLibro(),
            0
        );
        
        nuevoPrestar.realizar();
        LocalDate fecha = LocalDate.now();
        PrestarLibroFecha.setText("Fecha: "+fecha.toString());
        PrestarLibroFechaLLegada.setText(fecha.toString());
        libro consultaLibro = new libro();
        SeleccionarLibro.setListData(consultaLibro.librosDisponibles());
        NoIdPrestarLibro.setText("");
        MensajePrestarLibro.setVisible(false);
        
        
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void BtnPrestarLibroAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrestarLibroAgregarUsuarioActionPerformed
        //Accion cuando se presiona agregar nuevo Libro
        //Mostrar mensaje Emergente
        MensajeAgregarUsr.setSize(390, 340);
        MensajeAgregarUsr.setLocationRelativeTo(this);
        MensajeAgregarUsr.setModal(true);
        MensajeAgregarUsr.setVisible(true);
        //-------------------------
    }//GEN-LAST:event_BtnPrestarLibroAgregarUsuarioActionPerformed

    private void PrestarLibroTiempoMaxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_PrestarLibroTiempoMaxPropertyChange
        
    }//GEN-LAST:event_PrestarLibroTiempoMaxPropertyChange

    private void PrestarLibroTiempoMaxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PrestarLibroTiempoMaxItemStateChanged
        //Aumentar los meses a la fecha
        int mesSeleccion = 0;
        LocalDate nueva = LocalDate.now();
        
        switch (PrestarLibroTiempoMax.getSelectedIndex()) {
            case 0:mesSeleccion = 0;break;
            case 1:mesSeleccion = 2;break;
            case 2:mesSeleccion = 4;break;
            case 3:mesSeleccion = 6;break;
            default:mesSeleccion = 0;break;
        }        
        PrestarLibroFechaLLegada.setText(nueva.of(nueva.getYear(), nueva.getMonthValue()+mesSeleccion, nueva.getDayOfMonth()).toString());    
    }//GEN-LAST:event_PrestarLibroTiempoMaxItemStateChanged

    public void llenarTablaUsuarios(){
        usuario listUsr = new usuario();
        DefaultTableModel modelo= (DefaultTableModel) TablaPrincipal.getModel();
        
        modelo.setColumnIdentifiers(new String[] {"Identificación","Nombre","Tipo ID","Teléfono"});

        for(int i = modelo.getRowCount()-1; i >= 0; i--){
            modelo.removeRow(i);
        }

        listUsr.LLenarDatos(modelo);
    }
    
    private void MostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarUsuariosActionPerformed
        MostrarBibliotecarios.setBackground(gris);
        MostrarDisponibles.setBackground(gris);
        MostrarLibros.setBackground(gris);
        MostrarPrestados.setBackground(gris);
        MostrarUsuarios.setBackground(naranja);
        llenarTablaUsuarios();
        
    }//GEN-LAST:event_MostrarUsuariosActionPerformed
    
    int numeroLibroSolo(){
        if (FieldAgregarLibroCodigo.getText().isEmpty()){
            return 0;
        }else{
            try {
                int n = Integer.parseInt(FieldAgregarLibroCodigo.getText());
                return n;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Parece que no ingreso un número en código");
                return 0;
            }
        }
    }
    
    public void llenarTablaLibros(){
        libro listLib = new libro(numeroLibroSolo(),FieldAgregarLibroAutor.getText(),FieldAgregarLibroNombre.getText(),FieldAgregarLibroEdicion.getText(),FieldAgregarLibroPaginas.getText(),FieldAgregarLibroGenero.getText());
        DefaultTableModel modelo= (DefaultTableModel) TablaPrincipal.getModel();
        
        modelo.setColumnIdentifiers(new String[] {"Id","Autor","Nombre","Edición","Páginas","Género"});

        for(int i = modelo.getRowCount()-1; i >= 0; i--){
            modelo.removeRow(i);
        }

        listLib.LLenarDatos(modelo);
    }
    
    private void MostrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarLibrosActionPerformed
        
        MostrarBibliotecarios.setBackground(gris);
        MostrarDisponibles.setBackground(gris);
        MostrarLibros.setBackground(naranja);
        MostrarPrestados.setBackground(gris);
        MostrarUsuarios.setBackground(gris);
        llenarTablaLibros();
    }//GEN-LAST:event_MostrarLibrosActionPerformed

    public void llenarTablaBibliotecarios(){
        bibliotecario listBibli = new bibliotecario();
        DefaultTableModel modelo= (DefaultTableModel) TablaPrincipal.getModel();
        
        modelo.setColumnIdentifiers(new String[] {"Id","Nombre","Teléfono","Clave"});

        for(int i = modelo.getRowCount()-1; i >= 0; i--){
            modelo.removeRow(i);
        }

        listBibli.LLenarDatos(modelo);
    }
    
    private void MostrarBibliotecariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarBibliotecariosActionPerformed
        MostrarBibliotecarios.setBackground(naranja);
        MostrarDisponibles.setBackground(gris);
        MostrarLibros.setBackground(gris);
        MostrarPrestados.setBackground(gris);
        MostrarUsuarios.setBackground(gris);
        llenarTablaBibliotecarios();
    }//GEN-LAST:event_MostrarBibliotecariosActionPerformed

    private void NoIdPrestarLibroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_NoIdPrestarLibroPropertyChange

    }//GEN-LAST:event_NoIdPrestarLibroPropertyChange

    private void NoIdPrestarLibroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoIdPrestarLibroKeyPressed
        
    }//GEN-LAST:event_NoIdPrestarLibroKeyPressed

    private void PrestarLibroBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestarLibroBuscarActionPerformed
        usuario consulta = new usuario();
        String valores[] =consulta.consultar(NoIdPrestarLibro.getText());
        
        PrestarLibroNombre.setText("Nombre: "+valores[0]);
        PrestarLibroTelefono.setText("Teléfono: "+valores[1]);
        
        
    }//GEN-LAST:event_PrestarLibroBuscarActionPerformed

    
    
    public void llenarTablaPrestados(){
        libro listLibro = new libro();
        DefaultTableModel modelo= (DefaultTableModel) TablaPrincipal.getModel();
        
        modelo.setColumnIdentifiers(new String[] {"Fecha\nSalida","Fecha Max\nEntrega","Usuario","Libro","Bibliotecario"});

        for(int i = modelo.getRowCount()-1; i >= 0; i--){
            modelo.removeRow(i);
        }

        listLibro.libroPrestado(modelo);
    }
    
    private void MostrarPrestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPrestadosActionPerformed
        MostrarBibliotecarios.setBackground(gris);
        MostrarDisponibles.setBackground(gris);
        MostrarLibros.setBackground(gris);
        MostrarPrestados.setBackground(naranja);
        MostrarUsuarios.setBackground(gris);
        llenarTablaPrestados();
    }//GEN-LAST:event_MostrarPrestadosActionPerformed

    
    
    
    public void llenarTablaDisponibles(){
        libro listLibro = new libro();
        DefaultTableModel modelo= (DefaultTableModel) TablaPrincipal.getModel();
        
        modelo.setColumnIdentifiers(new String[] {"Nombre","Autor","Código","Edición","Páginas","Genero"});

        for(int i = modelo.getRowCount()-1; i >= 0; i--){
            modelo.removeRow(i);
        }

        listLibro.libroDisponible(modelo);
    }
    
    private void MostrarDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarDisponiblesActionPerformed
        MostrarBibliotecarios.setBackground(gris);
        MostrarDisponibles.setBackground(naranja);
        MostrarLibros.setBackground(gris);
        MostrarPrestados.setBackground(gris);
        MostrarUsuarios.setBackground(gris);
        //----------------------------------------
        llenarTablaDisponibles();
        
        
    }//GEN-LAST:event_MostrarDisponiblesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        prestarLibro consulta = new prestarLibro();
        int codigoLibro = 0;
        try {
            codigoLibro = Integer.parseInt(EntregarLibroCodigo.getText());
            String val[] = consulta.recibirDatos(codigoLibro);
            if(val[0] != null){
                EntregaLibroNombreLibro.setText("Libro: "+val[0]);
                EntregaLibroNombreUsuario.setText("Usuario: "+val[1]);
                codigoLibroPrestado = Integer.parseInt(val[2]);
                ConfirmarEntrega.setEnabled(true);
            }else{
                ConfirmarEntrega.setEnabled(false);
                JOptionPane.showMessageDialog(EntregarLibro, "No se encontro el libro prestado");
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(EntregarLibro, "El código no es un valor numérico");
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ConfirmarEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarEntregaActionPerformed
        prestarLibro consulta = new prestarLibro();
        consulta.entregar(codigoLibroPrestado);
        EntregarLibro.setVisible(false);
        EntregaLibroNombreLibro.setText("Fecha: ");
        EntregaLibroNombreUsuario.setText("Nombre: ");
    }//GEN-LAST:event_ConfirmarEntregaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Body().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JPanel BarraMenu;
    private javax.swing.JButton BotonAgregarUsuario;
    private javax.swing.JButton BtnAgregarBibli;
    private javax.swing.JButton BtnAgregarBiblio;
    private javax.swing.JButton BtnAgregarLibro;
    private javax.swing.JButton BtnAgrergarUsr;
    private javax.swing.JButton BtnListaNegra;
    private javax.swing.JButton BtnPrestarLibro;
    private javax.swing.JButton BtnPrestarLibroAgregarUsuario;
    private javax.swing.JButton ButtonAgregarLibro;
    private javax.swing.JButton ConfirmarEntrega;
    private javax.swing.JLabel EntregaLibroNombreLibro;
    private javax.swing.JLabel EntregaLibroNombreUsuario;
    private javax.swing.JDialog EntregarLibro;
    private javax.swing.JTextField EntregarLibroCodigo;
    private javax.swing.JTextField FieldAgregarBibliClave;
    private javax.swing.JTextField FieldAgregarBibliId;
    private javax.swing.JTextField FieldAgregarBibliNombre;
    private javax.swing.JTextField FieldAgregarBibliTel;
    private javax.swing.JTextField FieldAgregarLibroAutor;
    private javax.swing.JTextField FieldAgregarLibroCodigo;
    private javax.swing.JTextField FieldAgregarLibroEdicion;
    private javax.swing.JTextField FieldAgregarLibroGenero;
    private javax.swing.JTextField FieldAgregarLibroNombre;
    private javax.swing.JTextField FieldAgregarLibroPaginas;
    private javax.swing.JTextField FieldAgregarUsuarioCC;
    private javax.swing.JTextField FieldAgregarUsuarioNombre;
    private javax.swing.JTextField FieldAgregarUsuarioTelefono;
    private javax.swing.JComboBox<String> FieldAgregarUsuarioTipo;
    private javax.swing.JDialog MensajeAgregarBibliotecario;
    private javax.swing.JDialog MensajeAgregarLibro;
    private javax.swing.JDialog MensajeAgregarUsr;
    private javax.swing.JDialog MensajePrestarLibro;
    private javax.swing.JButton MostrarBibliotecarios;
    private javax.swing.JButton MostrarDisponibles;
    private javax.swing.JButton MostrarLibros;
    private javax.swing.JButton MostrarPrestados;
    private javax.swing.JButton MostrarUsuarios;
    private javax.swing.JTextField NoIdPrestarLibro;
    private javax.swing.JButton PrestarLibroBuscar;
    private javax.swing.JLabel PrestarLibroFecha;
    private javax.swing.JLabel PrestarLibroFechaLLegada;
    private javax.swing.JLabel PrestarLibroNombre;
    private javax.swing.JLabel PrestarLibroTelefono;
    private javax.swing.JComboBox<String> PrestarLibroTiempoMax;
    private javax.swing.JList<String> SeleccionarLibro;
    private javax.swing.JTable TablaPrincipal;
    private javax.swing.JLabel TextAgregarBiblio;
    private javax.swing.JLabel TextAgregarLibro;
    private javax.swing.JLabel TextAgregarUsr;
    private javax.swing.JLabel TextListaNegra;
    private javax.swing.JLabel TextPrestarLibro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}

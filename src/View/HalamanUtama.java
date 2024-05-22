package View;

import View.Dosen.ViewDataDosen;
import View.Mahasiswa.ViewDataMahasiswa;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HalamanUtama extends JFrame implements ActionListener{
    
    JLabel header = new JLabel("Selamat Datang Di Database UPNVY");
    JLabel subHeader = new JLabel("Dikelola Oleh Ryan Kana Nyola");
    JLabel label1 = new JLabel("Silahkan Pilih Database :");
    JLabel label2 = new JLabel("Database Mahasiswa");
    JLabel label3 = new JLabel("Database Dosen");
    JLabel footer = new JLabel("follow ig @ryankananyola");
            
    JButton tombolMahasiswa = new JButton("Mahasiswa");
    JButton tombolDosen = new JButton("Dosen");
    JButton tombolKeluar = new JButton("Keluar");
    
    public HalamanUtama(){
        setVisible(true);
        setSize(560, 500);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);
        
        getContentPane().setBackground(new Color(25, 150, 150));
               
        add(header);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        header.setBounds(25,25,330,35);
        add(subHeader);
        subHeader.setFont(new Font("Arial", Font.PLAIN, 11));
        subHeader.setBounds(25, 50, 330, 35);
        
        add(label1);
        label1.setBounds(25, 95, 330, 35);
        add(label2);
        label2.setBounds(208 , 155, 330, 35);
        add(label3);
        label3.setBounds(222, 235, 330, 35);
        
        add(footer);
        footer.setFont(new Font("Arial", Font.PLAIN, 11));
        footer.setBounds(208, 420, 330, 35);
        
        add(tombolMahasiswa);
        tombolMahasiswa.setBounds(25, 190, 490, 35);
        add(tombolDosen);
        tombolDosen.setBounds(25, 265, 490, 35);
        add(tombolKeluar);
        tombolKeluar.setBounds(25, 350, 490, 35);
        
        tombolMahasiswa.addActionListener(this);
        tombolDosen.addActionListener(this);
        tombolKeluar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==tombolMahasiswa){
                dispose();
                new ViewDataMahasiswa();
            } else if(e.getSource()==tombolDosen){
                dispose();
                new ViewDataDosen();
            } else if(e.getSource()==tombolKeluar){
                System.exit(0);
            }
        } catch(Exception error){
            //error handling ketika xampp belum dinyalakan, jadi tidak bisa mengakses halaman selanjutnya
            JOptionPane.showMessageDialog(null,"Database belum terhubung, \n tolong nyalakan XAMPP");
            System.exit(0);
        }
    }
}

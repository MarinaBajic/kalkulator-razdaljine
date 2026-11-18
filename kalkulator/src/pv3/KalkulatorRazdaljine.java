package pv3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorRazdaljine extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField textField1;

    public KalkulatorRazdaljine() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public static void main(String[] args) {
        KalkulatorRazdaljine dialog = new KalkulatorRazdaljine();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}

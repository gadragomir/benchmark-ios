import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    private JPanel mainPanel;
    private JButton mibButton;
    private JButton gibButton;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private float cpuInput;
    private float memoryInput;

    public Buttons() {
        mibButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mebibyteButton();
            }
        });


        gibButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gibibyteButton();
            }
        });
    }

    public static void main(String[] args) {
        frameSettings();
    }


    public static void frameSettings() {
        JFrame frame = new JFrame("Benchmark iOS");
        frame.setContentPane(new Buttons().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 150);
    }

    public float cpuInput() {
        try {
            this.cpuInput = Float.parseFloat(JOptionPane.showInputDialog("Insert CPU value"));
            if (this.cpuInput <= 0) {
                JOptionPane.showMessageDialog(null, "Please enter a valid input", "Invalid input", JOptionPane.WARNING_MESSAGE);
                cpuInput();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid input", "Invalid input", JOptionPane.WARNING_MESSAGE);
            cpuInput();
        }
        return this.cpuInput;
    }

    public float memoryInput() {
        try {
            if (this.cpuInput > 0) {
                this.memoryInput = Float.parseFloat(JOptionPane.showInputDialog("Insert Memory value"));
                if (this.memoryInput <= 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid input", "Invalid input", JOptionPane.WARNING_MESSAGE);
                    memoryInput();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid input", "Invalid input", JOptionPane.WARNING_MESSAGE);
            memoryInput();
        }

        return this.memoryInput;


    }

    public String comboBoxAction1() {
        return (String) comboBox1.getSelectedItem();
    }

    public String comboBoxAction2() {
        return (String) comboBox2.getSelectedItem();
    }

    public void mebibyteButton() {

        while (true) {
            try {
                if (comboBoxAction1().equals("Select a device") && comboBoxAction2().equals("Select a device")) {
                    JOptionPane.showMessageDialog(null, "Please select a device", "Warning", JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (comboBox1.getSelectedIndex() > 0 && comboBox2.getSelectedIndex() > 0) {
                    JOptionPane.showMessageDialog(null, "Please select only one device", "Warning", JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (comboBox1.getSelectedIndex() > 0 && comboBox2.getSelectedIndex() == 0) {
                    phonesMethod(cpuInput(), memoryInput(), 1.048576F);
                } else if (comboBox2.getSelectedIndex() > 0 && comboBox1.getSelectedIndex() == 0) {
                    tabletsMethod(cpuInput(), memoryInput(), 1.048576F);
                } else {
                    JOptionPane.showMessageDialog(null, "Unexpected error", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NullPointerException e) {
                break;
            }
        }

    }

    public void gibibyteButton() {
        while (true) {
            try {
                if (comboBoxAction1().equals("Select a device") && comboBoxAction2().equals("Select a device")) {
                    JOptionPane.showMessageDialog(null, "Please select a device", "WARNING", JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (comboBox1.getSelectedIndex() > 0 && comboBox2.getSelectedIndex() > 0) {
                    JOptionPane.showMessageDialog(null, "Please select only one device", "WARNING", JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (comboBox1.getSelectedIndex() > 0 && comboBox2.getSelectedIndex() == 0) {
                    phonesMethod(cpuInput(), memoryInput(), 1073.7418F);
                } else if (comboBox2.getSelectedIndex() > 0 && comboBox1.getSelectedIndex() == 0) {
                    tabletsMethod(cpuInput(), memoryInput(), 1073.7418F);
                } else {
                    JOptionPane.showMessageDialog(null, "An unexpected error has occurred", "Unexpected error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NullPointerException e) {
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid input", "Invalid input", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void phonesMethod(float cpuInput, float memoryInput, float calcFormula) {
        String chosenPhone = comboBoxAction1();
        String dualCore = ("CPU = " + Math.round(cpuInput / 2F) + "%" + "\nRAM = " + Math.round(memoryInput * calcFormula) + "MB");
        String quadCore = ("CPU = " + Math.round(cpuInput / 4F) + "%" + "\nRAM = " + Math.round(memoryInput * calcFormula) + "MB");
        String hexaCore = ("CPU = " + Math.round(cpuInput / 6F) + "%" + "\nRAM = " + Math.round(memoryInput * calcFormula) + "MB");
        switch (chosenPhone) {
            case "iPhone 5", "iPhone 5c", "iPhone 5s", "iPhone 6", "iPhone 6 Plus", "iPhone 6s",
                    "iPhone 6s Plus",
                    "iPhone SE" -> JOptionPane.showMessageDialog(null, dualCore);
            case "iPhone 7", "iPhone 7 Plus" -> JOptionPane.showMessageDialog(null, quadCore);
            case "iPhone 8", "iPhone 8 Plus", "iPhone X", "iPhone XR", "iPhone XS", "iPhone XS Max",
                    "iPhone SE 2020", "iPhone 11", "iPhone 11 Pro", "iPhone 11 Pro Max", "iPhone 12 Mini",
                    "iPhone 12", "iPhone 12 Pro", "iPhone 12 Pro Max" -> JOptionPane.showMessageDialog
                    (null, hexaCore);
            default -> {
            }
        }
    }

    public void tabletsMethod(float cpuInput, float memoryInput, float calcFormula) {
        String chosenTablet = comboBoxAction2();
        String dualCore = ("CPU = " + Math.round(cpuInput / 2F) + "%" + "\nRAM = " + Math.round(memoryInput * calcFormula) + "MB");
        String tripleCore = ("CPU = " + Math.round(cpuInput / 3F) + "%" + "\nRAM = " + Math.round(memoryInput * calcFormula) + "MB");
        String quadCore = ("CPU = " + Math.round(cpuInput / 4F) + "%" + "\nRAM = " + Math.round(memoryInput * calcFormula) + "MB");
        String hexaCore = ("CPU = " + Math.round(cpuInput / 6F) + "%" + "\nRAM = " + Math.round(memoryInput * calcFormula) + "MB");
        String octaCore = ("CPU = " + Math.round(cpuInput / 8F) + "%" + "\nRAM = " + Math.round(memoryInput * calcFormula) + "MB");
        switch (chosenTablet) {
            case "iPad 4", "iPad Mini", "iPad Mini 2", "iPad Mini 3", "iPad Mini 4", "iPad Air", "iPad 9.7 (2016)",
                    "iPad 9.7 (2017)", "iPad Pro 9.7 (2016)", "iPad Pro 12.9 (2015)" -> JOptionPane.showMessageDialog(null, dualCore);
            case "iPad Air 2" -> JOptionPane.showMessageDialog(null, tripleCore);
            case "iPad 9.7 (2018)", "iPad 2019 (10.2 inch)" -> JOptionPane.showMessageDialog(null, quadCore);
            case "iPad Mini 5", "iPad Air 3", "iPad Air 4", "iPad Pro 10.5 (2017)", "iPad Pro 12.9 (2017)",
                    "iPad 2020 (10.2 inch)" -> JOptionPane.showMessageDialog(null, hexaCore);
            case "iPad Pro 2018 (11 inch)", "iPad Pro 2018 (12.9 inch)", "iPad Pro 2020 (11 inch)",
                    "iPad Pro 2020 (12.9 inch)" -> JOptionPane.showMessageDialog(null, octaCore);
            default -> {
            }
        }
    }
}
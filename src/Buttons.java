import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Buttons {
    private JPanel panelTitle;
    private JButton button1;
    private JButton button2;
    private JPanel mainPanel;

    public Buttons() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public static void main(String[] args) {
        JButton button1 = new JButton ();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mebibyteConversion();
            }
        });
    }

    public static void mebibyteConversion() {
        Scanner userInput = new Scanner(System.in);
        float mebibyteFormula = 1.048576F;

        while (true) {
            System.out.println("Choose device: \n 1. iPhone 6s/6s Plus \n 2. iPhone 7/7 Plus \n 3. iPhone X \n 4. iPhone 8 > iPhone 12 Pro Max \n 5. iPad Air 2 \n 0. Back");
            int deviceOption = userInput.nextInt();
            if (deviceOption == 0) {
                break;
            } else {
                System.out.println("CPU: ");
                int cpuInput = userInput.nextInt();
                System.out.println("RAM: ");
                int memoryInput = userInput.nextInt();


                switch (deviceOption) {
                    case 1 -> System.out.println("CPU = " + cpuInput / 2 + "%" + "\nRAM = " + memoryInput * mebibyteFormula + "MB");
                    case 2 -> System.out.println("CPU = " + cpuInput / 4 + "%" + "\nRAM = " + memoryInput * mebibyteFormula + "MB");
                    case 3 -> System.out.println("CPU = " + cpuInput / 6 + "%" + "\nRAM = " + memoryInput * mebibyteFormula + "MB");
                    case 4 -> System.out.println("CPU = " + cpuInput / 3 + "%" + "\nRAM = " + memoryInput * mebibyteFormula + "MB");
                    default -> {
                        System.out.println("Returning to previous menu");
                        return;
                    }
                }
            }

        }
    }
}
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

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

    public static void gibibyteConversion() {
        Scanner userInput = new Scanner(System.in);
        float gibibyteFormula = 1073.7418F;

        while (true) {
            System.out.println("Choose device: \n 1. iPhone 6s/6s Plus \n 2. iPhone 7/7 Plus \n 3. iPhone X \n 4. iPhone 8 > iPhone 12 Pro Max \n 5. iPad Air 2 \n 0. Back");
            int deviceOption = userInput.nextInt();

            if (deviceOption == 0) {
                break;
            } else {
                System.out.println("CPU: ");
                int cpuInput = userInput.nextInt();
                System.out.println("RAM: ");
                float memoryInput = userInput.nextFloat();

                switch (deviceOption) {
                    case 1 -> System.out.println("CPU = " + cpuInput / 2 + "%" + "\nRAM = " + memoryInput * gibibyteFormula + "MB");
                    case 2 -> System.out.println("CPU = " + cpuInput / 4 + "%" + "\nRAM = " + memoryInput * gibibyteFormula + "MB");
                    case 3 -> System.out.println("CPU = " + cpuInput / 6 + "%" + "\nRAM = " + memoryInput * gibibyteFormula + "MB");
                    case 4 -> System.out.println("CPU = " + cpuInput / 3 + "%" + "\nRAM = " + memoryInput * gibibyteFormula + "MB");
                    default -> {
                        System.out.println("Returning to previous menu");
                        return;
                    }
                }
            }
        }
    }

    public static void chooseMeasurementUnit() {
        Scanner option = new Scanner(System.in);

        while (true) {
            System.out.println("Choose option: \n 1. MiB > MB \n 2. GiB > MB \n 0. Close program");
            System.out.println("INPUT: ");
            int chooseOption = option.nextInt();
            switch (chooseOption) {
                case 1 -> mebibyteConversion();
                case 2 -> gibibyteConversion();
                default -> {
                    System.out.println("Exiting");
                    return;
                }
            }
        }
    }
}

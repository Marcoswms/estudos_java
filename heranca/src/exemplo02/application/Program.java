package exemplo02.application;

import exemplo02.entities.Employee;
import exemplo02.entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberEmployees = scan.nextInt();
        scan.nextLine();

        for (int index = 1; index <= numberEmployees; index++) {
            System.out.println("\nEmployeer #" + index + " data:");

            System.out.print("Outsourced (y/n)? ");
            char outsourced = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Hours: ");
            int hours = scan.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();

            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scan.nextDouble();
                //Instanciando o objeto diretamente na lista com o mesmo tipo:
                list.add(new OutSourcedEmployee(name, hours,valuePerHour,additionalCharge));
            }
            else {
                //Instanciando o objeto diretamente na lista com o mesmo tipo:
                list.add(new Employee(name, hours,valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        scan.close();
    }
}
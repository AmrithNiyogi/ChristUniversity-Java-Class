package ArrayListCollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        System.out.println("Enter number of records to input: ");
        int num = Integer.parseInt(br.readLine());

        for (int i=0; i<num; i++) {
            Student student = new Student();
            System.out.println("Enter Student Name: ");
            student.setName(br.readLine());
            System.out.println("Enter Student Id: ");
            student.setId(br.readLine());
            System.out.println("Enter Student Department: ");
            student.setDepartment(br.readLine());
            students.add(student);

        }

        for (Student student: students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Id: " + student.getId());
            System.out.println("Department: " + student.getDepartment());
        }

    }

}

package Sekolah;

import java.util.Scanner;

public class Inputan {
    public static void main(String[] args) {
        Scanner kemil = new Scanner(System.in);
        System.out.println("Login Sekolah (Masukkan Angka Saja) \n__________ \n1. Student \n__________ \n2. Teacher \n_____________ \nPilihan Anda: ");
        int pilihan = kemil.nextInt();
        if (pilihan == 1) {
            System.out.println("Anda Login Sebagai Siswa, Masukkan Data Diri Anda");
            System.out.println("___________");
            System.out.print("Nama Anda: ");
            String name = kemil.next();
            kemil.nextLine();
            System.out.println("______________");
            System.out.println("Jurusan Anda: ");
            String major = kemil.nextLine();
            System.out.println("___________");
            System.out.println("Umur Anda: ");
            int age = kemil.nextInt();
            System.out.println("__________________");
            System.out.println("Nomor Siswa Anda: ");
            int studentNumber = kemil.nextInt();
            System.out.println("____________");
            System.out.println("Nilai Anda: ");
            int score = kemil.nextInt();
            System.out.println("____________");
            Student student1 = new Student(name, major, age, studentNumber, score); 
            student1.print();
        } else if (pilihan == 2) {
            System.out.println("_________________________________________________________");
            System.out.println("Anda Login Sebagai Guru, Masukkan Beberapa Data Diri Anda");
            System.out.println("_______________________________________________________________");
            System.out.println("Apakah Anda Guru (Masukkan Angka) \n____________ \n1. Full Time \n____________ \n2. Part Time");
            int pilihanWaktu = kemil.nextInt();
            switch (pilihanWaktu) {
                case 1:
                    System.out.println("\nAnda Adalah Guru Full Time");
                    System.out.println("___________");
                    System.out.println("Nama Anda: ");
                    String name = kemil.next();
                    kemil.nextLine();
                    System.out.println("___________");
                    System.out.println("Umur Anda: ");
                    int age = kemil.nextInt();
                    System.out.println("______________________");
                    System.out.println("Mapel Yang Anda Ajar: ");
                    String subject = kemil.next();
                    kemil.nextLine();
                    System.out.println("___________");
                    System.out.println("Gaji Anda: ");
                    int salary = kemil.nextInt();
                    System.out.println("________________________");
                    System.out.println("Unit: (Masukkan Kalimat)");
                    String unit = kemil.next();
                    kemil.nextLine();
                    System.out.println("________");
                    FullTime fullTime1 = new FullTime(name, subject, unit, age, salary);
                    fullTime1.print();
                    break;

                case 2:
                    System.out.println("\nAnda Adalah Guru Part Time");
                    System.out.println("___________");
                    System.out.println("Nama Anda: ");
                    name = kemil.next();
                    kemil.nextLine();
                    System.out.println("___________");
                    System.out.println("Umur Anda: ");
                    age = kemil.nextInt();
                    System.out.println("______________________");
                    System.out.println("Mapel Yang Anda Ajar: ");
                    subject = kemil.next();
                    kemil.nextLine();
                    System.out.println("Berapa Jam Mengajar Anda: ");
                    int hoursworked = kemil.nextInt();
                    PartTime partTime1 = new PartTime(name, age, subject, hoursworked);
                    partTime1.print();
                
                default:

                    break;
                
            }

        }else{
            System.out.println("Input Salah");
        }

        kemil.close();
    }
   
}

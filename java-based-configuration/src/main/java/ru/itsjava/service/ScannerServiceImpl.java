package ru.itsjava.service;

import java.util.Scanner;

public class ScannerServiceImpl implements ScannerService {

    @Override
    public void read(double price) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите цену");
    }
}

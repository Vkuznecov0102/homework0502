package ru.itsjava.service;

import java.util.Scanner;

public class ScannerServiceImpl implements ScannerService{

    @Override
    public Scanner wakeUpScanner() {
        System.out.println();
        System.out.println("Введите цену");
        return new Scanner(System.in);
    }
}

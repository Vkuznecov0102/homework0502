package ru.itsjava.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ScannerServiceImpl implements ScannerService{

    @Override
    public Scanner wakeUpScanner() {
        System.out.println();
        System.out.println("Введите цену");
        return new Scanner(System.in);
    }
}

package ru.itsjava.service;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderServiceImpl implements BufferedReaderService {

    @Override
    @SneakyThrows
    public void menuReader(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

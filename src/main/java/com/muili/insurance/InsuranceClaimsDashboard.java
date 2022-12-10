package com.muili.insurance;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class InsuranceClaimsDashboard {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/Users/omuili/Documents/claims.csv");

        List<ClaimsData>ClaimsDataList = Files.lines(path)
                .skip(1)
                .map(InsuranceClaimsDashboard::getClaimsData)
                .collect(Collectors.toList());
        System.out.println(ClaimsDataList);
    }
    private static ClaimsData getClaimsData(String line){
        String[] data = line.split(",");
        try (Scanner scanner = new Scanner(new File("/Users/omuili/Documents/claims.csv"))) {
            while (scanner.hasNext()){
                String claim = scanner.nextLine();
            }
            } catch (IOException e) {
            }
        return new ClaimsData(data[0], data[1], data[2], Integer.parseInt(data[3]), data[4],
                data[5], Double.parseDouble(data[6]), data[7]);
        }
    }








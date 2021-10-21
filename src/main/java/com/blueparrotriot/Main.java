package com.blueparrotriot;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Parquet parquetData = ParquetReaderUtils.getParquetData(args[0]);

            System.out.println("Schema:");
            parquetData.getSchema().forEach(System.out::println);

            System.out.println("Total rows: "+parquetData.getData().size());
            System.out.println("Data:");
            parquetData.getData().forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("There was a problem reading the parquet file:");
            e.printStackTrace();
        }
    }
}

package org.example;


import java.io.*;

public class EmployeeIdGenerator {
        private static final String COUNTER_FILE = "id_counter.txt";
        private static int counter = loadCounter();

        private static int loadCounter() {
            try (BufferedReader reader = new BufferedReader(new FileReader(COUNTER_FILE))) {
                return Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                return 1; // если файл не найден или поврежден — начать с 1
            }
        }

        private static void saveCounter() {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(COUNTER_FILE))) {
                writer.write(String.valueOf(counter));
            } catch (IOException e) {
                System.err.println("Ошибка сохранения счётчика: " + e.getMessage());
            }
        }

        public static int getNextId() {
            int id = counter++;
            saveCounter();
            return id;
        }
    }


package practice.hospital;

import java.util.Random;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float [] temperatures = new float[patientsCount];
        Random random = new Random();
        for (int i = 0; i < patientsCount; i++) {
            float temperature = 32 + random.nextFloat() * 8; // случайная температура от 32 до 40 градусов
            temperatures[i] = temperature;
        }
        return temperatures;
    }

    public static String getReport(float[] temperatureData) {
        float sum = 0;
        int healthyCount = 0;
        StringBuilder reportBuilder = new StringBuilder();
        for (float temperature : temperatureData) {
            reportBuilder.append(String.format("%.1f", temperature)).append(" ");
            sum += temperature;
            if (temperature >= 36.2 && temperature <= 36.9) {
                healthyCount++;
            }
        }
        float average = sum / temperatureData.length;
        String averageFormatted = String.format("%.2f", average);
        String report =
            "Температуры пациентов: " + reportBuilder +
            "\nСредняя температура: " + averageFormatted +
            "\nКоличество здоровых: " + healthyCount;

        return report;
    }
}

//Напишите код метода generatePatientsTemperatures(),
// который должен сгенерировать массив float,
// содержащий значения температур пациентов от 32 до 40 градусов.
//
//
// В методе getReport()вам требуется составить строку
// с отчётом по значениям температур в массиве с пациентами:
//Соберите в строку список температур пациентов.
//Рассчитайте среднее арифметическое значение температуры.
//Посчитайте количество здоровых пациентов с температурой от 36,2 до 36,9 градусов.
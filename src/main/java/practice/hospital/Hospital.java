package practice.hospital;


public class Hospital {
    static int max = 40;
    static int min = 32;
    static float minN = 36.2F;
    static float maxN = 36.9F;
    static String patientsTemperaturesAll = "";



    public static float[] generatePatientsTemperatures(int patientsCount) {
        float [] patientTemperatures = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            float temperatureRandom = (float) ((Math.random() * (max -min))+ min);
            patientTemperatures[i] = (float) Math.ceil(temperatureRandom * 10) / 10;
        }
        return patientTemperatures;
    }

    public static String getReport(float[] temperatureData) {

        float average = 0;
        if (temperatureData.length > 0) {
            float sum = 0;
            for (int i = 0; i < temperatureData.length; i++) {
                sum += temperatureData[i];
                patientsTemperaturesAll += temperatureData[i] + " ";
            }
            average = (float) (Math.floor((sum / (temperatureData.length)) * 100) / 100);
        }

        int healthyCount = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            if (temperatureData[i] > minN && temperatureData[i] <= maxN) {
                healthyCount++;
            }
        }

        String report =
            "Температуры пациентов: " + patientsTemperaturesAll.trim() +
            "\nСредняя температура: " + average +
            "\nКоличество здоровых: " + healthyCount;

        return report;
    }
}

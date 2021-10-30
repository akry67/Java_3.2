public class BmiService {
    public double calculate(int weight, int height) {
        double BodyMassIndex = weight / Math.pow(height, 2);

        return (double) BodyMassIndex;
    }
}
// Индекс массы тела это отношение массы тела в килограммах к квадрату роста в метрах
// и рассчитывается по формуле: I = m/h 2 где: m – масса тела в килограммах h – рост в метрах, измеряется в кг/м 2.

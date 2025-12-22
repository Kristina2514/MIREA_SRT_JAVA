package lab24.Task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicanChair();
    FunctialChair createFunctialChair();
}
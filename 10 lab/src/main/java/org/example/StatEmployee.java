package org.example;

public class StatEmployee extends Employee {
    private double premiya;

    public StatEmployee(String fio, String dolzhnost, double oklad, double premiya) throws OkladException {
        super(fio, dolzhnost, oklad);
        this.premiya = premiya;
    }

    public double getPremiya() {
        return premiya;
    }
    public void setPremiya(double premiya) {
        this.premiya = premiya;
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            if (premiya < 0)
                throw new PremiyaException("Ошибка: премия не может быть отрицательной!");
            return getOklad() + premiya;
        } catch (PremiyaException e) {
            System.err.println(e.getMessage());
            return getOklad();
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты: " + e.getMessage());
            return 0;
        }
    }
}

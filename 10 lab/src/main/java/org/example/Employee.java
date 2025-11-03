package org.example;

public class Employee {
    private String fio;
    private String dolzhnost;
    private double oklad;

    public Employee(String fio, String dolzhnost, double oklad) throws OkladException {
        setOklad(oklad);
        this.fio = fio;
        this.dolzhnost = dolzhnost;

    }

    public String getFio() {

        return fio;
    }

    public String getDolzhnost() {
        return dolzhnost;
    }

    public double getOklad() {
        return oklad;
    }

    public void setOklad(double oklad) throws OkladException {
        if (oklad < 0)
            throw new OkladException(oklad) ;
        this.oklad = oklad;
    }

    public double rasschitatZarplatu() {
        return oklad;
    }

    @Override
    public String toString() {
        return fio + " (" + dolzhnost + "), оклад: " + oklad;
    }
}

package h_you.demo;

public class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }
    public double getTax() {
        return income * 0.1;
    }

    public static void main(String[] args) {
        var incomes = new Income[] {
                new Income(4500),
                new Salary(10000),
                new StateCouncilSpecialAllowance(8000)
        };
        double totalTax = totalTax(incomes);
        System.out.println(totalTax);

        var incomes2 = new Income[] {
                new Salary(5000),
                new Royalties(100000)
        };
        double totalTax2 = totalTax(incomes2);
        System.out.println(totalTax2);
    }

    public static double totalTax(Income... incomes) {
        double totalTax = 0;
        for (Income income: incomes) {
            totalTax += income.getTax();
        }
        return totalTax;
    }
}

class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income-5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }
    @Override
    public double getTax() {
        return 0;
    }
}

class Royalties extends Income {
    public Royalties (double income) {
        super(income);
    }
    @Override
    public double getTax() {
        return income * 0.7 * 0.8 * 0.2;
    }
}
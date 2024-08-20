import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      
        int percobaan = 2;
        double rentExpense = 0; // Simpan rent expense di luar perulangan
        double marketingExpense = 0; // Simpan marketing expense di luar perulangan
        double otherOpexExpense = 0; // Simpan other operational expense di luar perulangan
        for (int i = 0; i < percobaan; i++) {
           
            if (i == 0) {
                 // Input total sales
            System.out.print("Enter total sales: ");
            double totalSales = input.nextInt();

            // Input persentase COGS (dalam persen, bukan dalam desimal)
            System.out.print("Enter COGS percentage: ");
            double cogsPercentage = input.nextInt();

            // Hitung cost of goods sold (COGS) berdasarkan persentase
            double cogs = totalSales / 100 * cogsPercentage;
            System.out.println("Total Sales: $" + totalSales);
            System.out.println("Cost of Goods Sold (COGS): $" + cogs);
            // Gross profit

            double grossProfit = totalSales - cogs;
            System.out.println("Gross Profit: Rp." + grossProfit);
            double grossProfitP = 100 - cogsPercentage;
                rentExpense = grossProfit / grossProfitP * 20; // Simpan rent expense pada iterasi pertama
                System.out.println("Rent Expense: Rp." + rentExpense);
                marketingExpense = grossProfit / grossProfitP * 10; // Simpan marketing expense pada iterasi pertama
                System.out.println("Marketing Expense: Rp." + marketingExpense);

                otherOpexExpense = grossProfit / grossProfitP * 3; // Simpan other opex expense pada iterasi pertama
                System.out.println("Other Opex Expense: Rp." + otherOpexExpense);

                grossProfit = grossProfit - rentExpense - marketingExpense - otherOpexExpense;

                // Hitung net income
                double netIncome = grossProfit;
                System.out.println("Net Income: Rp." + netIncome);

                System.out.println("COGS Percentage                = " + cogsPercentage + "%");
                System.out.println("Gross Profit Percentage        = " + grossProfitP + "%");
                System.out.println("Rent Expense                   = " + rentExpense / totalSales * 100 + "%");
                System.out.println("Marketing Expense              = " + marketingExpense / totalSales * 100 + "%");
                System.out.println("Other Operational Expense      = " + otherOpexExpense / totalSales * 100 + "%");
                System.out.println("Net Income                     = " + netIncome / totalSales * 100 + "%");
            } else {
                 // Input total sales
            System.out.print("Enter total sales: ");
            double totalSales = input.nextInt();

            // Input persentase COGS (dalam persen, bukan dalam desimal)
            System.out.print("Enter COGS percentage: ");
            double cogsPercentage = input.nextInt();

            // Hitung cost of goods sold (COGS) berdasarkan persentase
            double cogs = totalSales / 100 * cogsPercentage;
            System.out.println("Total Sales: $" + totalSales);
            System.out.println("Cost of Goods Sold (COGS): $" + cogs);
            // Gross profit

            double grossProfit = totalSales - cogs;
            System.out.println("Gross Profit: Rp." + grossProfit);
            double grossProfitP = 100 - cogsPercentage;
                // // Gunakan marketing expense yang sudah disimpan sebelumnya
                System.out.println("Marketing Expense: Rp." + marketingExpense);

                // // Gunakan other opex expense yang sudah disimpan sebelumnya
                System.out.println("Other Opex Expense: Rp." + otherOpexExpense);

                // // Gunakan rent expense yang sudah disimpan sebelumnya
                System.out.println("Rent Expense: Rp." + rentExpense);

                grossProfit = grossProfit - rentExpense - marketingExpense - otherOpexExpense;

                // Hitung net income
                double netIncome = grossProfit;
                System.out.println("Net Income: Rp." + netIncome);

                System.out.println("COGS Percentage                = " + cogsPercentage + "%");
                System.out.println("Gross Profit Percentage        = " + grossProfitP + "%");
                System.out.println("Rent Expense                   = " + rentExpense / totalSales * 100 + "%");
                System.out.println("Marketing Expense              = " + marketingExpense / totalSales * 100 + "%");
                System.out.println("Other Operational Expense      = " + otherOpexExpense / totalSales * 100 + "%");
                System.out.println("Net Income                     = " + netIncome / totalSales * 100 + "%");
                // Tampilkan hasil
            }

        }

        input.close();
    }
}

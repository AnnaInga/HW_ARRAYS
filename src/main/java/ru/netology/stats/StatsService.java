package ru.netology.stats;

public class StatsService {

    public int getSumSales(int[] sales) {      //Сумма годовых продаж
        int sum = 0;  //подсчитанная на данный момент сумма

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];   //к подсчитанной на данный момент сумме прибавляем значение месяца i
        }
        return sum; //сумма всех месяцев
    }

    public int getAverageSale(int[] sales) {  //Средняя сумма продаж
        int sum = 0;   //подсчитанная на данный момент сумма
        int averuge = 0;  //средняя сумма продаж

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i]; //к подсчитанной на данный момент сумме прибавляем значение месяца i

        }
        return averuge = sum / sales.length;   //сумму всех месяцев делим на количество месяцев
    }


    public int getMaxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getQntMonthLowerAverageSale(int[] sales) {  //количество месяцев, в которых продажи были ниже среднего
        int averageSales = getAverageSale(sales); //берем результаты вычисления метода GetAverageSale
        int qntMonthLower = 0; //количество месяцев со значениме ниже среднего

        for (int s : sales) { //проходимся по всему массиву
            if (s < averageSales) { //меньше ли, чем среднее
                qntMonthLower = qntMonthLower + 1; //если меньше, увеличиваем счетчик месяцев на 1
            }
        }
        return qntMonthLower;
    }


    public int getQntMonthMoreAverageSale(int[] sales) {  //количество месяцев, в которых продажи были выше среднего
        int averageSales = getAverageSale(sales); //берем результаты вычисления метода GetAverageSale
        int qntMonthMore = 0; //количество месяцев со значениме выше среднего

        for (int s : sales) { //проходимся по всему массиву
            if (s > averageSales) { //больше ли, чем среднее
                qntMonthMore = qntMonthMore + 1; //если больше, увеличиваем счетчик месяцев на 1
            }
        }
        return qntMonthMore;
    }

}

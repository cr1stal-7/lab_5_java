import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int opt = 0, i = 0;
        swim[] set_one = new swim[20];
        swim[][] set_double = new swim[20][20];
        while(opt != 5){
            System.out.println("Введите:");
            System.out.println("1 - Ввести комплект");
            System.out.println("2 - Вывести комплект");
            System.out.println("3 - Ввести двумерный массив");
            System.out.println("4 - Вывести двумерный массив");
            System.out.println("5 - Завершить работу программы");
            Scanner in = new Scanner(System.in);
            try{    //TRY блок
                opt = in.nextInt();
                if (opt > 5 || opt < 1)
                    throw new OptException("invalid range");
            } catch (InputMismatchException e) {
                System.err.println("Нужно вводить цифру");
            } catch (OptException e) {
                System.err.println("Диапазон 1-5");
            }
            func sum = new func();
            switch (opt) {
                case 1:     //Одномерный массив
                    glasses _glasses = new glasses();
                    cap _cap = new cap();
                    shorts _shorts = new shorts();
                    slippers _slippers = new slippers();
                    set_one[i] = new swim(_glasses, _cap, _shorts, _slippers);
                    set_one[i].input();
                    set_one[i].res(sum);
                    set_one[i].color();
                    i++;
                    swim.counter_one++;
                    break;
                case 2:
                    for (int j = 0; j < swim.counter_one; j++) {
                        set_one[j].output();
                        set_one[j].res(sum);
                        System.out.println("\n");
                    }
                    break;
                case 3:     //Двумерный массив
                    for (int k = 0; k < 1; k++)
                        for (int j = 0; j < 1; j++){
                            _glasses = new glasses();
                            _cap = new cap();
                            _shorts = new shorts();
                            _slippers = new slippers();
                            set_double[i][j] = new swim(_glasses, _cap, _shorts, _slippers);
                            set_double[i][j].input();
                            set_double[i][j].res(sum);
                            set_double[i][j].color();
                            swim.counter_double++;
                        }
                    break;
                case 4:
                    for (int k = 0; k < swim.counter_double; k++)
                        for (int j = 0; j < swim.counter_double; j++) {
                            set_double[i][j].output();
                            set_double[i][j].res(sum);
                            System.out.println("\n");
                        }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
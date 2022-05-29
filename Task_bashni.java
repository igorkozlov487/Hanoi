import java.util.Scanner;
public class Task_bashni {
    /*int d = 4;
    int st = 3;
    public static void main(String[] args) {
        while () {
            
        }
    }*/

    public static void main(String[] args) {
        String with = "1";
        String on = "3";
        String some = "2";
        int count = 3;
        Tower(with, on, some, count);
    }
    public static void Tower(String with, String on, String some, int count) {
      if (count > 1) Tower(with, on, some, count - 1);
      System.out.printf("[%s] >> [%s] \n", with, on);
      if (count > 1) Tower(some, on, with, count-1);
    }

    /*public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество дисков:");
        if (input.hasNextInt()) {
            n = input.nextInt();
            Hanoi(n);
        } else {
            System.out.println("Вы ввели не целое число");
        }
        input.close();
      }
   static void Hanoi(int number) {
   int countDisk, counter = 1, count;
   //System.out.printf("Введите количество дисков: "); // Ханойская башня
   //scanf("%d", &number);

   while (counter <= (int)Math.pow(2, number) - 1) {  // Запускаем цикл повторений
      if (counter % 2 != 0) {                         // На нечетном ходу мы будем трогать только самый маленький диск
        System.out.printf("Номер хода: %3d Размер диска: %d ", counter, 1);
         Tower(number, counter, 1);                   // С помощью этой функции определяем для данного диска перемещение
      }
      else {                                          // Определяем диск который нужно переместить на четном ходу
         count = counter;
         countDisk = 0;
         while (count % 2 == 0) {                     // Диск который нужно переместить
            countDisk++;                              // будет числом деления номера хода на 2 без остатка
            count = count / 2;
         }
         System.out.printf("Номер хода: %3d Размер диска: %d ", counter, countDisk + 1);
         Tower(number, counter, countDisk + 1);
      }
      counter++;
   }
}
   // Функция определения перемещения дисков
   public static void Tower(int n ,int i, int k) {
   int t, axisX, axisY, axisZ;
   if (n % 2 == 0) {                                  // Определяем порядок осей в зависимости от четности
      axisX = 1;                                      // и не четности количества дисков
      axisY = 2;
      axisZ = 3;
   }
   else {
      axisX = 1;
      axisY = 3;
      axisZ = 2;
   }
   //Номер хода можно представить единственным образом
   // как произведение некоего нечетного числа на степень двойки
   // k будет номером диска который мы перемещаем
   t = ((i / (int)Math.pow(2, k - 1)) - 1) / 2;
   if (k % 2 != 0) {                                  // Определяем перемещение дисков  для нечетного хода
      switch (t % 3) {                                // Выбираем перемещение в зависимости от данного условия
         case 0:               
         System.out.printf("Перемещаем диск с %d на %d\n", axisX, axisY);
            break;
         case 1:
         System.out.printf("Перемещаем диск с %d на %d\n", axisY, axisZ);
            break;
         case 2:
         System.out.printf("Перемещаем диск с %d на %d\n", axisZ, axisX);
            break;
      }
   }
   else {                                             // Определяем перемещение дисков  для чётного хода
      switch (t % 3) {
         case 0:
         System.out.printf("Перемещаем диск с %d на %d\n", axisX, axisZ);
            break;
         case 1:
         System.out.printf("Перемещаем диск с %d на %d\n", axisZ, axisY);
            break;
         case 2:
         System.out.printf("Перемещаем диск с %d на %d\n", axisY, axisX);
            break;
         }
      }
   }*/
}
/* public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
} */



/* В строке abc[3] = 9; возникает ошибка ArrayIndexOutOfBoundsException, так как индекс массива abc выходит за пределы его размера. В Java индексация массивов начинается с 0, поэтому доступными индексами для массива abc являются 0 и 1 1.

В методе main отсутствует обработка исключения FileNotFoundException, которое может возникнуть при вызове метода printSum. Чтобы исправить это, вы можете добавить оператор throws FileNotFoundException к объявлению метода main или обернуть вызов printSum в блок try-catch и обработать исключение 1.

В блоке catch в методе main исключение Throwable перехватывается перед исключениями NullPointerException и IndexOutOfBoundsException. Поскольку Throwable является родительским классом для всех исключений, исключения NullPointerException и IndexOutOfBoundsException никогда не будут перехвачены, так как Throwable уже перехватывает все исключения. Чтобы исправить это, вы можете переместить блок catch (Throwable ex) в конец списка блоков catch 
 */
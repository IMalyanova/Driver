import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;


public class Driver {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap <String,String> numberName = new TreeMap <>();

        for (; ; ) {

            System.out.println("Введите номер автомобиля или команду: ");
            String command = reader.readLine().trim();
            String name;

            if(command.equals("exit")) {
                System.out.println("До новых встреч!");
                break;
            }else if (command.equals("LIST")) {
                for (String element: numberName.keySet()){
                   System.out.println(element + " " + numberName.get(element));
                }
            }else if ((numberName.get(command)) == (null)){
                System.out.println("Таких данных нет. Для сохранения новых данных ведите имя к этому номеру: ");
                name = reader.readLine().trim();
                numberName.put(command, name);
            }else {
                System.out.println(command + " " + numberName.get(command));
            }



        }



    }
}

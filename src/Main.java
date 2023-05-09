import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Student student=new Student("Зулкумар",20);
        Student student1=new Student("Айгерим" ,24);

        try{
            ArrayList<Student>arrayList=new ArrayList<>();
            arrayList.add(student);
            arrayList.add(student1);
            arrayList.add(null);
            System.out.println(arrayList);
            System.out.println(arrayList.get(6));
        }catch (MyException | IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("buttu");
        }

        Random ran = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> takSan = new ArrayList<>();
        ArrayList<Integer> jupSan = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add(ran.nextInt(100));
            if (arrayList.get(i) % 2 != 0) {
                takSan.add(arrayList.get(i));
            } else {
                jupSan.add(arrayList.get(i));
            }
        }
        System.out.println(arrayList);
        System.out.println("Так сандар:"+takSan);
        System.out.println("Жуп сан:"+jupSan);

    }

}
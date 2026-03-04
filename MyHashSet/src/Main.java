import java.util.ArrayList;

//Собственное мультимножество
public class Main {

    static int setsize = 10;
    static ArrayList<Integer>[] myset;

    static {
        myset = new ArrayList[setsize];
        for (int i = 0; i < setsize; i++) {
            myset[i] = new ArrayList<>();
        }
    }

    public static  void add(int x) {
        int index = x % setsize;
        myset[index].add(x);
    }

    public static boolean find(int x) {
        int index = x % setsize;

        for (int now : myset[index]) {
            if (now == x) {
                return true;
            }
        }
        return false;
    }

    public static void delete(int x) {
        int index = x % setsize;
        ArrayList<Integer> xlist = myset[index];

        for (int i = 0; i < xlist.size(); i++) {
            if(xlist.get(i) == x) {
                int lastIndex = xlist.size() - 1;
                xlist.set(i, xlist.get(lastIndex));
                xlist.remove(lastIndex);
                return;
            }
        }
    }
    public static void main(String[] args) {
        add(15);
        add(25);
        add(35);

        System.out.println(find(25)); // true
        delete(25);
        System.out.println(find(25)); // false

    }
}
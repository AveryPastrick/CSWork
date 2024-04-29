import java.util.ArrayList;

public class TestArrayListDemo {
    public static void main(String[] args) {
        StringArrayList stringArrayList = new StringArrayList();
        stringArrayList.addString("Apple");
        stringArrayList.addString("Banana");
        stringArrayList.addString("Orange");
        stringArrayList.addString("Grapes");

        System.out.println("Size of ArrayList: " + stringArrayList.getSize());
        System.out.println("Element at index 2: " + stringArrayList.getElementByIndex(2));

        System.out.println("Displaying list using for-each loop:");
        stringArrayList.displayListUsingForEach();

        System.out.println("Displaying list using regular for loop:");
        stringArrayList.displayListUsingRegularFor();
    }
}
class StringArrayList {
    private ArrayList<String> arrayList;

    public StringArrayList() {
        this.arrayList = new ArrayList<>();
    }

    public void addString(String str) {
        arrayList.add(str);
    }

    public void removeString(String str) {
        arrayList.remove(str);
    }

    public int getSize() {
        return arrayList.size();
    }

    public String getElementByIndex(int index) {
        return arrayList.get(index);
    }

    public void displayListUsingForEach() {
        for (String str : arrayList) {
            System.out.println(str);
        }
    }
    public void displayListUsingRegularFor() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

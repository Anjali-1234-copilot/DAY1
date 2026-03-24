class DemoObject {
    private int id;

    DemoObject(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("DemoObject with id " + id + " is being garbage collected.");
        super.finalize();
    }
}

public class M4Q7 {
    public static void main(String[] args) {
        DemoObject obj1 = new DemoObject(1);
        DemoObject obj2 = new DemoObject(2);

        obj1 = null;
        obj2 = null;

        System.out.println("Requesting garbage collection...");
        System.gc();

        System.out.println("End of main method.");
    }
}

import com.journaldev.singleton.*;

public class Main {
    public static void main(String[] args) {
//        // Lấy instance của Singleton
//        EagerInitializedSingleton instance = EagerInitializedSingleton.getInstance();
//
//        // Gọi phương thức từ Singleton
//        instance.showMessage();
//        StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
//        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
//
//        System.out.println(instance1 == instance2);

//        LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
//        LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
//
//        System.out.println(instance1 == instance2);
        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}

public interface DefaultMethod {
        default void say(){
            System.out.println("Hello, this is default method");
        }
        void sayMore(String msg);
    }

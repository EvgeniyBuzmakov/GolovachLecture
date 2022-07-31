package MemoryInJava;

/*
Переполнения хипа НЕ будет. В данном примере мы сохраняем в переменную ref ссылку на голову односвязного списка, а не на хвост.
 */
public class OutOfMemoryErrorExample5 {

    public static void main(String[] args) {
        Object[] ref = new Object[1];

        while (true) {
            ref[0] = new Object[1];
            ref = (Object[]) ref[0];
        }
    }
}

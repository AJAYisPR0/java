public class StringBufferStringBuilderDemo {
    public static void main(String[] args) {
        
        // StringBuffer example
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("StringBuffer value: " + stringBuffer);
        stringBuffer.append(" World!");
        System.out.println("StringBuffer value after appending: " + stringBuffer);
        
        // StringBuilder example
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("StringBuilder value: " + stringBuilder);
        stringBuilder.append(" World!");
        System.out.println("StringBuilder value after appending: " + stringBuilder);
    }
}

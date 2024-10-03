//Write a program to print the size and range of all the premitive data types.
public class PrimitiveDataTypesSizeAndRange {
    public static void main(String[] args) {
        System.out.println("Size and Range of Primitive Data Types:");

        System.out.println("byte: Size = " + Byte.SIZE / 8 + " bytes, Range = " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: Size = " + Short.SIZE / 8 + " bytes, Range = " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: Size = " + Integer.SIZE / 8 + " bytes, Range = " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: Size = " + Long.SIZE / 8 + " bytes, Range = " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float: Size = " + Float.SIZE / 8 + " bytes, Range = " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: Size = " + Double.SIZE / 8 + " bytes, Range = " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char: Size = " + Character.SIZE / 8 + " bytes, Range = " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("boolean: Size not defined, Range = " + Boolean.TRUE + " to " + Boolean.FALSE);
    }
}

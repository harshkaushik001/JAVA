//WAP to assugn binary, octal and hexadecimal value to an int 
class jav {
    public static void main(String args[]){

        // Assigning binary value to an int variable
        int binaryValue = 0b11; // Binary literal starts with 0b
        System.out.println("Binary value (0b11) assigned to int variable: " + binaryValue);

        // Assigning octal value to an int variable
        int octalValue = 05; // Octal literal starts with 0
        System.out.println("Octal value (05) assigned to int variable: " + octalValue);

        // Assigning hexadecimal value to an int variable
        int hexadecimalValue = 0XF; // Hexadecimal literal starts with 0x
        System.out.println("Hexadecimal value (0xF) assigned to int variable: " + hexadecimalValue);
    }
}

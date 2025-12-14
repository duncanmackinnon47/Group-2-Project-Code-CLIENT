import java.util.*;   // for scan
public class learning{

//error check for 8 bit binary input
 public static void error_check(String x){
         if (x.length() != 8) {
                System.out.println("Error: The binary numbers must have 8bit length.");
                    return;
        } else {
            for (int i = 0; i < 8; i++) {
                if (x.charAt(i) != '0' && x.charAt(i) != '1') {
                System.out.println("Error: The input must be binary number");
                return;
        }
        }
    }
    }

//error check for 2 bit binary input

public static void error_check_2(String z){
    if (z.length() != 2) {
        System.out.println("Error: Select must be 2-bit binary.");
        return;
    } else{
        for(int i=0; i<2;i++){
            if(z.charAt(i)!='0'&& z.charAt(i)!='1'){
                System.out.println("Error: The input must be binary number");
                return;
            }
        }
    }   
} 

//error check for 1 bit binary input
public static void error_check_1(String z){
    if (z.length() != 1) {
        System.out.println("Error: Select must be 1-bit binary.");
        return;
    } else{
            if(z.charAt(0)!='0'&& z.charAt(0)!='1'){
                System.out.println("Error: The input must be binary number");
                return;
        }
    }    
}


//1. basic logic gates

    //and gate
    public static void unit1(Scanner scan){
        System.out.println("===============UNIT 1 : AND gate===============\n");
        System.out.println("AND gate: Produce high output(1) only when all of its inputs are high(1)");
        System.out.println("If even one input is low (0), the output becomes low (0).");
        System.out.println("In other words, it behaves like a logical 'multiplication' of the inputs.");
        System.out.println("   Truth table   ");
        System.out.println("  A B | A AND B");
        System.out.println("  0 0 |   0");
        System.out.println("  0 1 |   0");
        System.out.println("  1 0 |   0");
        System.out.println("  1 1 |   1");


        System.out.print("Enter binary number 1(8bit): ");
        String x = scan.nextLine();  
        System.out.print("Enter binary number 2(8bit): ");
        String y = scan.nextLine();  
      
        error_check(x);
        error_check(y);
    
        StringBuilder result = new StringBuilder();
        
        // bitwise and 
        for (int i = 0; i < x.length(); i++) {
            char bit1 = x.charAt(i);
            char bit2 = y.charAt(i);
            char andBit = (bit1 == '1' && bit2 == '1') ? '1' : '0';
            result.append(andBit);
        }

       
        System.out.println("Result (binary): " + result.toString());
    }  

    //or gate
    public static void unit2(Scanner scan){

        System.out.println("===============UNIT 2 : OR gate===============\n");
        System.out.println("OR gate:Produce high output(1) when at least one input is high(1)");
        System.out.println("If even one input is low (1), the output becomes low (1).");
        System.out.println("In other words, it behaves like a logical 'addition' of the inputs.");
        System.out.println("   Truth table   ");
        System.out.println("  A B | A OR B");
        System.out.println("  0 0 |   0");
        System.out.println("  0 1 |   1");
        System.out.println("  1 0 |   1");
        System.out.println("  1 1 |   1");

        System.out.print("Enter binary number 1(8bit): ");
        String x = scan.nextLine();  
        System.out.print("Enter binary number 2(8bit): ");
        String y = scan.nextLine();  
        
        error_check(x);
        error_check(y);
        
        // Saving result StringBuilder
        StringBuilder result = new StringBuilder();

        // bitwise or 
        for (int i = 0; i < x.length(); i++) {
            char bit1 = x.charAt(i);
            char bit2 = y.charAt(i);
            char orBit = (bit1 == '1' || bit2 == '1') ? '1' : '0';
            result.append(orBit);
        }

        System.out.println("Result (binary): " + result.toString());

    }
    
    //not gate
    public static void unit3(Scanner scan){

        System.out.println("===============UNIT 3 : NOT gate===============\n");
        System.out.println("NOT gate: SIngle input and a single output produces the opposite of the input");
        System.out.println("If even one input is high (1), the output becomes low (0).");
        System.out.println("In other words, it behaves like a logical 'negation' of the inputs.");
        System.out.println("Truth table");
        System.out.println("  A  | NOT A");
        System.out.println("  0  |   1  ");
        System.out.println("  1  |   0  ");


        System.out.print("Enter 8 bit binary number: ");
         String x = scan.nextLine();  

        error_check(x);
    
        // Saving result StringBuilder
        StringBuilder result = new StringBuilder();

        // bitwise not 
         for (int i = 0; i < x.length(); i++) {
            char bit = x.charAt(i);
            char notBit = (bit == '0') ? '1' : '0';  
            result.append(notBit);
        }

        System.out.println("Result (binary): " + result.toString());
        System.out.println("BONUS INFO: If and gate and or gate is in series it works as NOR gate");
         System.out.println("Truth table");
        System.out.println("  A B | A NOR B");
        System.out.println("  0 0 |   1");
        System.out.println("  0 1 |   0");
        System.out.println("  1 0 |   0");
        System.out.println("  1 1 |   0");
        System.out.println("BONUS INFO: If and gate and not gate is in series it works as NAND gate");
         System.out.println("Truth table");
        System.out.println("  A B | A NAND B");
        System.out.println("  0 0 |   1");
        System.out.println("  0 1 |   1");
        System.out.println("  1 0 |   1");
        System.out.println("  1 1 |   0");
    }
   
    //xor gate
    public static void unit4(Scanner scan){
        
        System.out.println("===============UNIT 4 : XOR gate===============\n");
        System.out.println("XOR gate: Outputs a high signal(1) only when its inputs are different");
        System.out.println("If even one input is low (0) and the other input is high(1), the output becomes high (1).");
        System.out.println("In other words, it behaves like a logical 'exclusive difference' of the inputs.");
        System.out.println("Truth table");
        System.out.println("  A B | A XOR B");
        System.out.println("  0 0 |   0");
        System.out.println("  0 1 |   1");
        System.out.println("  1 0 |   1");
        System.out.println("  1 1 |   0");
        System.out.print("Enter 8 bit binary number 1: ");
        String x = scan.next();  
        System.out.print("Enter 8 bit binary number 2: ");
        String y = scan.next();  

        error_check(x);
        error_check(y);

        // Saving result StringBuilder
        StringBuilder result = new StringBuilder();

        // bitwise or 
        for (int i = 0; i < x.length(); i++) {
            char bit1 = x.charAt(i);
            char bit2 = y.charAt(i);
            char orBit = (bit1 == '1' ^ bit2 == '1') ? '1' : '0';
            result.append(orBit);
        }

        System.out.println("Result (binary): " + result.toString());
    }

   
    //2. combinational logic
    //4 to 1 mux
    public static void unit5(Scanner scan) {
    System.out.println("===============UNIT 5 : 4-1 MUX===============\n");
    System.out.println("A multiplexer(MUX) is a digital circuit that selects one input from multiple inputs and sends it to the output, based on the value of select signals.");
    System.out.println("4-1 MUX: 4-1 Mux has 4 inputs(I) and only the selected input(S) is allowed to be routed to the output.");
    System.out.println("   Function table   ");
    System.out.println("  S0 S1 |  Output");
    System.out.println("   0  0 |   I0   ");
    System.out.println("   0  1 |   I1   ");
    System.out.println("   1  0 |   I2   ");
    System.out.println("   1  1 |   I3   ");

    
    System.out.print("Enter 8 bit binary number 1(I0): ");
    String v = scan.next();
    System.out.print("Enter 8 bit binary number 2(I1): ");
    String w = scan.next();
    System.out.print("Enter 8 bit binary number 3(I2): ");
    String x = scan.next();
    System.out.print("Enter 8 bit binary number 4(I3): ");
    String y = scan.next();
    System.out.print("Enter 2 bit binary select: ");
    String z = scan.next();

    error_check(v);
    error_check(w);
    error_check(x);
    error_check(y);
    

    //select bit error check
    error_check_2(z);

    //initialize
    String selected="0000";

    switch (z) {
        case "00":
            selected = v;
            break;
        case "01":
            selected = w;
            break;
        case "10":
            selected = x;
            break;
        case "11":
            selected = y;
            break;
    }

    System.out.println("Result (binary): " + selected);
}
   
    //1 -4 DEMUX 
    public static void unit6(Scanner scan) {
    System.out.println("===============UNIT 6 : 1-4 DEMUX===============\n");
    System.out.println("A demultiplexer is a digital circuit that takes one input and sends it to one of many outputs based on the value of select signal");
    System.out.println("It is the opposite of a multiplexer");
    System.out.println("1-4 DEMUX: 1-4 Demux has 1 data input(D), 2 select lines(S) and 4 outputs(O)");
    System.out.println( "   Function table   ");
    System.out.println("  S0 S1 |  Output ");
    System.out.println("   0  0 |  D 0 0 0");
    System.out.println("   0  1 |  0 D 0 0");
    System.out.println("   1  0 |  0 0 D 0");
    System.out.println("   1  1 |  0 0 0 D");

    System.out.print("Enter 1-bit binary input data(D): ");
    String d = scan.next();

    System.out.print("Enter 2-bit select(S): ");
    String s = scan.next();

    error_check_1(d);
    error_check_2(s);

    
    char D = d.charAt(0);

    //inintialize 
    char[] outputs = {'0', '0', '0', '0'};

    switch (s) {
        case "00":
            outputs[0] = D;
            break;
        case "01":
            outputs[1] = D;
            break;
        case "10":
            outputs[2] = D;
            break;
        case "11":
            outputs[3] = D;
            break;
    }

    System.out.println("Outputs Y0~Y3: " + outputs[0] + " " + outputs[1] + " " + outputs[2] + " " + outputs[3]);
}
    

    // 4 to 2 Encoder
    public static void unit7(Scanner scan) {

    System.out.println("=============== UNIT 7 : Encoder ===============\n");
    System.out.println( "Encoder: A digital circuit that converts multiple input lines into a smaller number of output lines.");
    System.out.println(
    "4-to-2 Encoder: A 4-to-2 encoder has 4 input lines (D3, D2, D1, D0) " +
    "and 2 output lines (Y1, Y0)." +
    "If multiple inputs are active at the same time, the encoder outputs the binary code of the highest priority active input."
    );

    // Function Table
    System.out.println("Function Table");
    System.out.println(" D3 D2 D1 D0 | Y1 Y0");
    System.out.println("  0  0  0  1 | 0  0 "); 
    System.out.println("  0  0  1  0 | 0  1"); 
    System.out.println("  0  1  0  0 | 1  0");  
    System.out.println("  1  0  0  0 | 1  1"); 
    System.out.println("  0  0  0  0 | X  X");

    System.out.println("Enter 4-bit input D: ");
    String d = scan.next();
    
    if (d.length() != 4) {
        System.out.println("Error: Select must be 4-bit binary.");
        return;
    } else{
        boolean b = d.equals("0001") || d.equals("0010")
         || d.equals("0100") || d.equals("1000");
        if(!b)
        {
            System.out.println("The data input should be either one of '0001', '0010', '0100','1000' ");
        }
    }
    
    
    //inintialize 
    char[] op={'0','0'};
    char[] output0={'0','0'};
    char[] output1={'0','1'};
    char[] output2={'1','0'};
    char[] output3={'1','1'};
    
    switch (d) {
        case "0001":
            op = output0;
            break;
        case "0010":
            op = output1;
            break;
        case "0100":
            op = output2;
            break;
        case "1000":
            op = output3;
            break;
    }

    System.out.println("Outputs [Y0,Y1]: " + Arrays.toString(op));
    }

    // 2 to 4 Decoder
    public static void unit8(Scanner scan) {
    System.out.println("=============== UNIT 8 : Decoder ===============\n");


System.out.println("Decoder: A decoder is a digital logic circuit that takes an n-bit binary input " +
    "and activates exactly one of 2^n output lines based on that input value."
);


System.out.println("2-to-4 Decoder: This decoder has 2 input lines (I1, I0) and 4 output lines (O0, O1, O2, O3)." +
    "Only the output corresponding to the binary value of the input is activated (set to 1)."
);

// Function Table
System.out.println("Function Table");
System.out.println(" I1 I0 | O0 O1 O2 O3");
System.out.println("  0  0 |  1  0  0  0"); 
System.out.println("  0  1 |  0  1  0  0"); 
System.out.println("  1  0 |  0  0  1  0"); 
System.out.println("  1  1 |  0  0  0  1"); 

    System.out.print("Enter 2-bit binary input I: ");
    String s = scan.next();

    error_check_2(s);


    char [] op={'0','0','0','0'};
    //inintialize 
    char[] output0 = {'1', '0', '0', '0'};
    char[] output1 = {'0', '1', '0', '0'};
    char[] output2 = {'0', '0', '1', '0'};
    char[] output3 = {'0', '0', '0', '1'};

    switch (s) {
        case "00":
            op=output0;
            break;
        case "01":
            op=output1;
            break;
        case "10":
            op=output2;
            break;
        case "11":
            op=output3;
            break;
    }

    System.out.println("Outputs Y0~Y3: " + Arrays.toString(op));
}
    

    //3. Arithmetic Units, Shifter
    //full adder 

    // 1-bit Full Adder
public static int[] fullAdder(int a, int b, int cin) {
    int sum = a ^ b ^ cin;                   
    int cout = (a & b) | (cin & (a ^ b));   
    return new int[]{sum, cout};    //[sum,cout]
}

    // 8-bit Ripple Carry Adder
public static String rippleAdder8(String a, String b) {
    int carry = 0;
    StringBuilder result = new StringBuilder();

    // LSB to MSB
    for (int i = 7; i >= 0; i--) {
        int bitA = a.charAt(i) - '0';
        int bitB = b.charAt(i) - '0';

        int[] out = fullAdder(bitA, bitB, carry);
        int sum = out[0];
        carry = out[1];

        result.insert(0, sum);
    }

    //last carry
    result.insert(0, carry);

    return result.toString();
}
   
public static void unit9(Scanner scan){
   System.out.println("=============== UNIT 9 : Adder ===============\n");
System.out.println(
    "Adder: An adder is a combinational digital circuit that adds binary numbers " +
    "and produces a sum output and a carry output."
);
System.out.println(
    "8-bit Ripple Carry Adder:nAn 8-bit ripple carry adder (RCA) is a combinational digital circuit that adds two 8-bit binary numbers by cascading eight full adders."
);
System.out.println(
    "The carry-out of one stage ripples to the next stage, " +
    "from the LSB (Least Significant Bit) to the MSB (Most Significant Bit)."
);
System.out.println("For instance, the table below shows the addition of 2-bit inputs.");
System.out.println("Function Table");
System.out.println(" A0 A1 | S C");
System.out.println("  0  0 | 0 0");
System.out.println("  0  1 | 1 0");
System.out.println("  1  0 | 1 0");
System.out.println("  1  1 | 0 1");


    System.out.print("Enter 8-bit binary number A: ");
    String a = scan.next();
    System.out.print("Enter 8-bit binary number B: ");
    String b = scan.next();

    error_check(a);
    error_check(b);

    String result = rippleAdder8(a, b);
    System.out.println("Result (9-bit with carry): " + result);
}

    // 8bit Comparator

public static void unit10(Scanner scan){
    System.out.println("===============UNIT 10 : Comparator===============\n");
    System.out.println("8-bit Comparator:8-bit comparator is a combinational digital circuit that compares two 8 bit binary numbers");
    System.out.println("It used in CPUs and FSMs to make decisions(branch if equal, branch if greater)");
    System.out.println("How an 8 bit comparator works:");
    System.out.println("1. Start from the MSB(Most Signifiant Bit)");
    System.out.println("2. If equal, move to the next bit");
    System.out.println("3. If all bits are equal, A=B\n");

    System.out.print("Enter 8-bit binary number A: ");
    String a = scan.next();
    System.out.print("Enter 8-bit binary number B: ");
    String b = scan.next();
    //long startTime= System.nanoTime();
    error_check(a);
    error_check(b);


    if(Integer.parseInt(a)>Integer.parseInt(b)){
        System.out.println("Result : A>B");
    }
    if(Integer.parseInt(a)==Integer.parseInt(b)){
        System.out.println("Result : A=B");
    }
    if(Integer.parseInt(a)<Integer.parseInt(b)){
        System.out.println("Result : A<B");
    }

    //optimization test code
    // long endTime=System.nanoTime();
//long duration= endTime-startTime;
//System.out.println("Time: "+ duration);
/* 
    //long startTime= System.currentTimeMillis();  

    for (int i = 0; i < a.length(); i++) {
        boolean A = a.charAt(i) == '1';
        boolean B = b.charAt(i) == '1';

        boolean C = (!A) && B;     // a<b
        boolean E = A && (!B);     // a>b
        boolean D = !(C || E);     // a==b

        if (C) { System.out.println("A < B"); break; }
        if (E) { System.out.println("A > B");  break; }
        if (D) { System.out.println("A == B"); break; }
    }
    long endTime=System.nanoTime();
long duration= endTime-startTime;
System.out.println("Time: "+ duration);*/
 
}   

    // Shifter
public static void unit11(Scanner scan){
    System.out.println("===============UNIT 11 : Shifter===============\n");
    System.out.println("8-bit Shifter:A shifter is a digital circuit that shifts the bits of a binary number left or right");
    System.out.println("Left shift multiply bt 2,4,8,...");
    System.out.println("Right shift divide by 2,4,8,...");
    System.out.println("This operation is much faster than a full multiplier/divider circuit\n");
    System.out.print("Enter 8-bit binary number A: ");
    String a = scan.next();
    System.out.print("Enter 8-bit binary number B: ");
    String b = scan.next();

    error_check(a);
    error_check(b);

    //long startTime= System.currentTimeMillis();
    int i_a=Integer.parseInt(a,2);
    int i_b=Integer.parseInt(b,2);
    
    i_a=i_a<<2;
    i_b=i_b<<2;

    if(i_a > 1024){
        i_a -= 1024;
    }
    if(i_a > 512){
        i_a -= 512;
    }
    if(i_a > 256){
        i_a -= 256;
    }
    
    if(i_b > 1024){
        i_b -= 1024;
    }
    if(i_b > 512){
        i_b -= 512;
    }
    if(i_b > 256){
        i_b -= 256;
    }
     
    //Optimization Trial
/*  int cut_a = i_a%1000000;
    int cut_b = i_b%1000000;
    i_a = (i_a << 2) & 0xFF;
    i_b = (i_b << 2) & 0xFF;

    Convert back to 8-bit binary string with zero-padding
    String sA = String.format("%8s", Integer.toBinaryString(i_a)).replace(' ', '0');
    String sB = String.format("%8s", Integer.toBinaryString(i_b)).replace(' ', '0');

    System.out.println("Result A: " + sA);

    String s_a= Integer.toBinaryString(i_a);
    String s_b= Integer.toBinaryString(i_b);

    String sub_a= s_a.substring(2,9);
    String sub_b= s_b.substring(2,9);  */

    String s_a= Integer.toBinaryString(i_a);
    String s_b= Integer.toBinaryString(i_b);

    System.out.println("result:   " + s_a);
    System.out.println("result:   " + s_b);
  // long endTime=System.currentTimeMillis();
//long duration= endTime-startTime;
//System.out.println("Time: "+ duration);

}
    
    // 4. Sequential Logic

    // SR Latch
public static void unit12(Scanner scan){
        int S=0, R=0, Q = 0;
        String input;
        System.out.println("===============UNIT 12 : SR Latch===============\n");
        System.out.println("SR Latch: SR latch(Set-Reset latch) is a basic memory circuit in digital circuits.");
        System.out.println("It has two inputs, S(Set) and R(Reset), and two outputs, Q and not Q.");
        System.out.println("The circuit stores a binary state until the inputs change in a way that modifies it.");
        System.out.println("For instance, Q=1 when set is 1 and it remains it's value unless R is equal to 1\n\n");

        System.out.println("Initial state: Q=0");

        while (true) {
            System.out.println("Enter S (0 or 1), R (0 or 1), or 'q' to quit:");
            System.out.print("S: ");
            input = scan.next();
            if(input.equalsIgnoreCase("q")) break;
            S = Integer.parseInt(input);

            System.out.print("R: ");
            input = scan.next();
            if(input.equalsIgnoreCase("q")) break;
            R = Integer.parseInt(input);

            if(S == 1 && R == 1) {
                System.out.println("Warning! Undefined state");
            }


            if(S == 1 && R == 0) Q = 1;      // Set
            else if(S == 0 && R == 1) Q = 0; // Reset
            else if(S == 0 && R == 0) Q = Q; // Remain

            System.out.println("Output Q: " + Q);
        }
    System.out.println("S=1 & R=1 is undefined state since flipflop is trying to reset and set at once ");

}

    //D Flip-flop
public static void unit13(Scanner scan) throws InterruptedException {
    System.out.println("===============UNIT 13 : D Flip Flop===============\n");
    System.out.println("D Flip-Flop is a sequential digital circuit that stores a single bit of data");
    System.out.println("It has a data input(D), a clock input(Clk), and outputs Q and Qbar");
    System.out.println("On a specific clock edge ,it captures the value of D and hold it until the next clock edge.");
    System.out.println("Multiple D flip-flops connected in series form shift register and counters\n");
    System.out.println("D Flip-Flop Simulation (Clock-Edge Based):");
    System.out.println("");
    System.out.print("Enter 4-bit input (D): ");
    String c = scan.next();

    char[] bits = c.toCharArray();
    int Q = 0; // initial state

    for (int i = 0; i < bits.length; i++) {
        System.out.println("Clock = 0 | D = " + bits[i] + " | Q = " + Q);
        Thread.sleep(500);

        // Rising edge
        Q = bits[i] - '0';
        System.out.println("Clock ↑  | D = " + bits[i] + " | Q = " + Q);
        Thread.sleep(800);
    }
}

    // 5. Register/Counter/Memeory

    //4-bit Shift Register
public static void unit14(Scanner scan) throws InterruptedException{
    System.out.println("===============UNIT 14 : Register===============\n");
    System.out.println( "Register is made of multiple flipflops with the number of flip-flops determining the number of bits the register can store");
    System.out.println("4-bit Shift Register: A sequential digital circuit that can store multiple bits of data and shift them left or right on each clock pulse");
    System.out.println("It temporary stores data and it introduces controlled delays in circuits");
    System.out.println("Enter the input (4-bit): ");
    String c=scan.next();
    String reg = "0000";
    char c1 = c.charAt(0),c2 = c.charAt(1),c3 = c.charAt(2),c4 = c.charAt(3);
    System.out.println("Clock cycles every 1 second for demo");
    Thread.sleep(1000);
    reg = "000" + c1;
    System.out.println(reg);
    Thread.sleep(1000);
    reg = "00" + c1 + c2;
    System.out.println(reg);
    Thread.sleep(1000);
    reg = "0" + c1 + c2 + c3;
    System.out.println(reg);
    Thread.sleep(1000);
    reg = "" + c1 +  c2 + c3 + c4;
    System.out.println(reg);


}
    
    //4-bit binary Counter
public static void unit15(Scanner scan) throws InterruptedException{
     System.out.println("===============UNIT 15 : Counter===============\n");
     System.out.println("Counter is a digital logic circuit that counts and stores the number of clock pulse, using a series of flip-flops");
     System.out.println("It keep track of events or time, act as a frequency divider and generate addresses or indices\n\n");

     System.out.println("Clock cycles every 1 second for demo");

    for (int i=0; i<16;i++){
        Thread.sleep(1000);
    
        String binary= Integer.toBinaryString(i);
        String formatted = String.format("%4s", binary).replace(' ', '0');

        System.out.println(formatted);
    }
    
}

    //Memory (RAM)
public static void unit16(Scanner scan){
    System.out.println("===============UNIT 16 : RAM===============\n");
    System.out.println("RAM stands for random access memory. It is an integrated circuit that stores data in memory cells and allows data to be read from or written to any location with equal speed");
    System.out.println("It provides temporary workspace for the CPU and stores running programs and data.");
    System.out.println("It is usually volatile, meaning it loses all stored data when power is turned off");
    System.out.println("Similary, ROM (Read Only Memory) uses random access and stores firmware and data that must persist.");
    System.out.println("CPU Registers also hold immediate values used in calculations and instructions. It store data temporarily but it is extremely small");
    int Q;
   String[] ram = new String[14];  

do {
    System.out.println("Enter the integer location you want to store the value in(0~13): ");
    int address = scan.nextInt();
    //String address_b=Integer.toBinaryString(address);
        
    System.out.println("Enter the binary data you want to store(8bit): ");
    String data = scan.next();
     if (data.length() != 8) {
        System.out.println("Error: The binary numbers must have 8bit length.");
        return;
            } else {
        for (int i = 0; i < 8; i++) {
        if (data.charAt(i) != '0' && data.charAt(i) != '1') {
            System.out.println("Error: The input must be binary number");
            return;
        }
         }
        }
    //int data_i=Integer.parseInt(data);
    ram[address]=data;
    if (!data.isEmpty()) {
        System.out.println("Adress UPDATED!");
    }
    System.out.println("Enter 1 if you want to quit, 0 to continue: ");
    Q = scan.nextInt();

} while (Q == 0);


//If saving more than 14 times->> reflects error


       for (int i = 0; i < ram.length; i++)
        System.out.println("Address " + i + ": " + ram[i]);

}
}
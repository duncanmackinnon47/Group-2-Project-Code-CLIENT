import java.util.*;   // for scan
public class learning{
    //1. basic logic gates
    //and gate

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
    
    public static void unit1(Scanner scan){
        
        System.out.println("AND gate: Outputs high(1) only when all of its inputs are high(1)");
        System.out.println("Ex> 1&1 = 1 (& is symbol of operation)");
        System.out.println("AND gate: Outputs high (1) only when ALL of its inputs are high (1).");
        System.out.println("If even one input is low (0), the output becomes low (0).");
        System.out.println("In other words, it behaves like a logical 'multiplication' of the inputs.");
        System.out.println("Truth table");
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
       //  long endTime = System.nanoTime();
       // long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        
       // System.out.println(duration);
    }  

    //or gate
    public static void unit2(Scanner scan){

        System.out.println("===============UNIT 2 : OR gate===============");
        System.out.println("OR gate:Produce high output(1) when all inputs are high and a low output(0) when all inputs are low");
        System.out.println("If even one input is low (1), the output becomes low (1).");
        System.out.println("In other words, it behaves like a logical 'addition' of the inputs.");
        System.out.println("Truth table");
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
       
        // length check
        if (x.length() != y.length()) {
            System.out.println("Error: The binary numbers must have the same length.");
            return;
        }
        

        long startTime = System.nanoTime();
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
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime); 
        System.out.println(duration);

    }
    //not gate
    public static void unit3(Scanner scan){

        System.out.println("===============UNIT 3 : NOT gate===============");
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
        System.out.println("If and gate and or gate is in series it works as NOR gate");
         System.out.println("Truth table");
        System.out.println("  A B | A NOR B");
        System.out.println("  0 0 |   1");
        System.out.println("  0 1 |   0");
        System.out.println("  1 0 |   0");
        System.out.println("  1 1 |   0");
        System.out.println("If and gate and not gate is in series it works as NAND gate");
         System.out.println("Truth table");
        System.out.println("  A B | A NAND B");
        System.out.println("  0 0 |   1");
        System.out.println("  0 1 |   1");
        System.out.println("  1 0 |   1");
        System.out.println("  1 1 |   0");
    }
    //xor gate
    public static void unit4(Scanner scan){
        

        System.out.println("===============UNIT 2 : XOR gate===============");
        System.out.println("XOR gate: Outputs a high signal only when its inputs are different");
        System.out.println("If even one input is low (0) and the other input is high(1), the output becomes high (1).");
        System.out.println("In other words, it behaves like a logical 'exclusive difference' of the inputs.");
        System.out.println("Truth table");
        System.out.println("  A B | A XOR B");
        System.out.println("  0 0 |   0");
        System.out.println("  0 1 |   1");
        System.out.println("  1 0 |   1");
        System.out.println("  1 1 |   0");
        System.out.print("Enter binary number 1: ");
        String x = scan.next();  
        System.out.print("Enter binary number 2: ");
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
    
    public static int quiz1(Scanner scan){
        //quiz
        int point=0;
        System.out.println("====Quiz1====");
        System.out.println("1. What would be the result? (00001111) and (11110000) ");
        System.out.println("1. 00000000 2. 11111111 3. 11110000 4. 00001111 ");
        int x = scan.nextInt(); 
        if(x==1){
            point=point+1;
        }
        System.out.println("2. ");
        int y = scan.nextInt(); 
        if(y==1){
            point=point+1;
        }
        System.out.println("3. ");
        int z = scan.nextInt(); 
        if(z==1){
            point=point+1;
        }
        System.out.println("4. ");
        int w = scan.nextInt(); 
        if(w==1){
            point=point+1;
        } 
        System.out.println("5. ");
        int q = scan.nextInt(); 
        if(q==1){
            point=point+1;
        }

        System.out.println("Total point:  " + point);

        return point;

        // long endTime = System.nanoTime();
        //long duration = (endTime - startTime); 
       // System.out.println(duration);

    }
   
    //2. combinational logic
    //4 to 1 mux
    public static void unit5(Scanner scan) {

    System.out.println("4to1 MUX:Mux has 4 inputs and only the selected input is allowed to be routed to the output.  ");
    System.out.println(" Function table ");
    System.out.println("  S0 S1 |  Output");
    System.out.println("   0  0 |   I0");
    System.out.println("   0  1 |   I1");
    System.out.println("   1  0 |   I2");
    System.out.println("   1  0 |   I3");

    
    System.out.print("Enter 8 bit binary number 1(I0): ");
    String v = scan.next();
    System.out.print("Enter 8 bit binary number 2(I1): ");
    String w = scan.next();
    System.out.print("Enter 8 bit binary number 3(I2): ");
    String x = scan.next();
    System.out.print("Enter 8 bit binary number 4(I3): ");
    String y = scan.next();
    System.out.print("Enter select (2-bit binary): ");
    String z = scan.next();

    error_check(v);
    error_check(w);
    error_check(x);
    error_check(y);
    

    // select must be 2 bits
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

    System.out.println("4-to-1 DEMUX: Demux is acting like the opposite of MUX");
    System.out.println("It ");
    System.out.print("Enter 1-bit input D(data): ");
    String d = scan.next();

    System.out.print("Enter 2-bit select S: ");
    String s = scan.next();

    if (d.length() != 1) {
        System.out.println("Error: Input D must be 1-bit binary.");
        return;
    }

    if (s.length() != 2) {
        System.out.println("Error: Select must be 2-bit binary.");
        return;
    }
    
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

    System.out.println("Encoder: ");
    System.out.print("Enter 4-bit input D(data): ");
    String d = scan.next();

    if (d.length() != 4) {
        System.out.println("Error: Input D must be 1-bit binary.");
        return;
    }
    
    
    //inintialize 
    char [] op={'0','0'};
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

    System.out.println("Outputs Y0~Y3: " + Arrays.toString(op));
    }

    // 2 to 4 Decoder
    public static void unit8(Scanner scan) {

    System.out.println("2-4 DECODER: ");
    System.out.println("Function table");
    System.out.println("  I0 I1 I2 I3 | O0 O1");
    System.out.println("   1  0 |   0");
    System.out.println("  0 1 |   1");
    System.out.println("  1 0 |   1");
    System.out.println("  1 1 |   0");

    System.out.print("Enter 2-bit input I: ");
    String s = scan.next();

    if (s.length() != 2) {
        System.out.println("Error: Input D must be 2-bit binary.");
        return;
    }
    char [] op={'0','0','0','0'};
    //inintialize 
    char[] output0 = {'0', '0', '0', '1'};
    char[] output1 = {'0', '0', '1', '0'};
    char[] output2 = {'0', '1', '0', '0'};
    char[] output3 = {'1', '0', '0', '0'};

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
    
public static int quiz2(Scanner scan){
        //quiz
        int point=0;
        System.out.println("1. ");
        int x = scan.nextInt(); 
        if(x==1){
            point=point+1;
        }
        System.out.println("2. ");
        int y = scan.nextInt(); 
        if(y==1){
            point=point+1;
        }
        System.out.println("3. ");
        int z = scan.nextInt(); 
        if(z==1){
            point=point+1;
        }
        System.out.println("4. ");
        int w = scan.nextInt(); 
        if(w==1){
            point=point+1;
        } 

        System.out.println("Total point:  " + point);

        return point;

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


public static void unit9(Scanner scan) {

    System.out.println("8-bit Ripple Carry Adder");
    System.out.print("Enter 8-bit binary number A: ");
    String a = scan.next();
    System.out.print("Enter 8-bit binary number B: ");
    String b = scan.next();

    error_check(a);
    error_check(b);

    String result = rippleAdder8(a, b);
    System.out.println("Result (9-bit with carry): " + result);
}

    // 2bit Comparator

public static void unit10(Scanner scan){
    System.out.println("8-bit Comparator");
    System.out.println("comparator work:");
    System.out.print("Enter 8-bit binary number A: ");
    String a = scan.next();
    System.out.print("Enter 8-bit binary number B: ");
    String b = scan.next();
    long startTime= System.nanoTime();
    error_check(a);
    error_check(b);


   /* if(Integer.parseInt(a)>Integer.parseInt(b)){
        System.out.println("A>B");
    }
    if(Integer.parseInt(a)==Integer.parseInt(b)){
        System.out.println("A=B");
    }
    if(Integer.parseInt(a)<Integer.parseInt(b)){
        System.out.println("A<B");
    }
     long endTime=System.nanoTime();
long duration= endTime-startTime;
System.out.println("Time: "+ duration);

    //long startTime= System.currentTimeMillis();  */

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
System.out.println("Time: "+ duration);
 
}   

    // Shifter
public static void unit11(Scanner scan){
     System.out.println("8-bit Shifter");
    System.out.print("Enter 8-bit binary number A: ");
    String a = scan.next();
    System.out.print("Enter 8-bit binary number B: ");
    String b = scan.next();

    error_check(a);
    error_check(b);

    long startTime= System.currentTimeMillis();
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

    //int cut_a = i_a%1000000;
   // int cut_b = i_b%1000000;
  // i_a = (i_a << 2) & 0xFF;
  //  i_b = (i_b << 2) & 0xFF;

    // Convert back to 8-bit binary string with zero-padding
   // String sA = String.format("%8s", Integer.toBinaryString(i_a)).replace(' ', '0');
 //   String sB = String.format("%8s", Integer.toBinaryString(i_b)).replace(' ', '0');

    //System.out.println("Result A: " + sA);

    String s_a= Integer.toBinaryString(i_a);
    String s_b= Integer.toBinaryString(i_b);

   /// String sub_a= s_a.substring(2,9);
   // String sub_b= s_b.substring(2,9);

    System.out.println("result:   " + s_a);
    System.out.println("result:   " + s_b);
   long endTime=System.currentTimeMillis();
long duration= endTime-startTime;
System.out.println("Time: "+ duration);

}
    
public static int quiz3(Scanner scan){
        //quiz
        int point=0;
        System.out.println("1. ");
        int x = scan.nextInt(); 
        if(x==1){
            point=point+1;
        }
        System.out.println("2. ");
        int y = scan.nextInt(); 
        if(y==1){
            point=point+1;
        }
        System.out.println("3. ");
        int z = scan.nextInt(); 
        if(z==1){
            point=point+1;
        }
        System.out.println("4. ");
        int w = scan.nextInt(); 
        if(w==1){
            point=point+1;
        } 

        System.out.println("Total point:  " + point);

        return point;



    }
    
    // 4. Sequential Logic

    // SR Latch
public static void unit12(Scanner scan){
        int S=0, R=0, Q = 0;
        String input;

        System.out.println("SR Latch");
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

}

    //D Flip-flop
public static void unit13(Scanner scan) throws InterruptedException {
    System.out.println("D Flip-Flop Simulation (Clock-Edge Based)");
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

/*public static void unit13(Scanner scan) throws InterruptedException{
    System.out.println("D flipflop makes output follows the input");
    System.out.println("Enter 4- bit input(D): ");
    String c=scan.next();
    char c1=c.charAt(0), c2=c.charAt(1), c3=c.charAt(2), c4=c.charAt(3);

    System.out.println("Previous state(Q(t)): "+ 0 + "->" + "Next state(Q(t+1)): "+ c1);
    Thread.sleep(1000);
    System.out.println("Previous state(Q(t)): "+ 0 + "->" + "Next state(Q(t+1)): "+ c2);
    Thread.sleep(1000);
    System.out.println("Previous state(Q(t)): "+ 0 + "->" + "Next state(Q(t+1)): "+ c3);
    Thread.sleep(1000);
    System.out.println("Previous state(Q(t)): "+ 0 + "->" + "Next state(Q(t+1)): "+ c4);
    
}*/

public static int quiz4(Scanner scan){
        //quiz
        int point=0;
        System.out.println("1. ");
        int x = scan.nextInt(); 
        if(x==1){
            point=point+1;
        }
        System.out.println("2. ");
        int y = scan.nextInt(); 
        if(y==1){
            point=point+1;
        }
        System.out.println("3. ");
        int z = scan.nextInt(); 
        if(z==1){
            point=point+1;
        }
        System.out.println("4. ");
        int w = scan.nextInt(); 
        if(w==1){
            point=point+1;
        } 

        System.out.println("Total point:  " + point);
        
        return point;


    }
    // 5. Register/Counter/Memeory

    //4-bit Shift Register
public static void unit14(Scanner scan) throws InterruptedException{
    System.out.println( "Register is made of multiple flipflops with the number of flip-flops determining the number of bits the register can store");
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

     System.out.println("Counter is a digital logic circuit that counts and stores the number of clock pulse, using a series of flip-flops");

    //String reg = "0000";
    System.out.println("Clock cycles every 1 second for demo");

    for (int i=0; i<16;i++){
        Thread.sleep(1000);
    
        String k= Integer.toBinaryString(i);
        System.out.println(String.format("%04d", k));
    }

    
}

    //Memory (RAM)
public static void unit16(Scanner scan){
    System.out.println("RAM stands for random access memory. It is an integrated circuit that stores data in memory cells and allows data to be read from or written to any location with equal speed");
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

public static int quiz5(Scanner scan){
        //quiz
        int point=0;
        System.out.println("1. ");
        int x = scan.nextInt(); 
        if(x==1){
            point=point+1;
        }
        System.out.println("2. ");
        int y = scan.nextInt(); 
        if(y==1){
            point=point+1;
        }
        System.out.println("3. ");
        int z = scan.nextInt(); 
        if(z==1){
            point=point+1;
        }
        System.out.println("4. ");
        int w = scan.nextInt(); 
        if(w==1){
            point=point+1;
        } 

        System.out.println("Total point:  " + point);

        return point;



    }


 
    

}
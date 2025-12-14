import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Client {
    
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Digital Circuits learning tool!!");
        String username;
        String password;
        ArrayList<String> unitscompleted;

        //log in first
        while(true){
            System.out.println("New user (N) or returning (R)?  ");
            String input = (scan.nextLine());
            if(input.length()>1){
                System.out.println("Invalid input, try again.");
                continue;
            }
            if(input.equals("N")||input.equals("n")){
                System.out.println("A new user! Please create an account.");
                System.out.println("Username: ");
                String un = scan.nextLine();
                System.out.println("Password: ");
                String pw = scan.nextLine();
                String fileoutName = "NEWUSER";
                String fileoutContent = un + "\n" + pw + "\n";
                String response = request(fileoutName,fileoutContent);
                String line[] = response.split("\n");
                if(line[0].equals("SUCCESS")){
                    System.out.println(response);
                    //define user data for new user
                    username = un;
                    password = pw;
                    unitscompleted = new ArrayList<>();

                    System.out.println("How would you describe your knowledge level in Digital Circuits?");

                    while(true){
                        System.out.println("Beginner - No prior knowledge (B)");
                        System.out.println("Intermediate - Basic gates (I)");
                        System.out.println("Advanced - Flip-Flops, basic combinational logic (A)");
                        String in = scan.nextLine();
                        switch(in){
                            case "B":
                                System.out.println("A begineer, we'll start learning at the basics");
                                break;
                            case "I":
                                System.out.println("Since your knowledge is intermediate, we'll skip the basic knowledge");
                                //mark off first four units
                                unitscompleted.add("1");
                                unitscompleted.add("2");
                                unitscompleted.add("3");
                                unitscompleted.add("4");
                                break;
                            case "A":
                                System.out.println("Since your knowledge is advanced, we'll skip past basic combinational logic");
                                //mark off first 8 units
                                unitscompleted.add("1");
                                unitscompleted.add("2");
                                unitscompleted.add("3");
                                unitscompleted.add("4");
                                unitscompleted.add("5");
                                unitscompleted.add("6");
                                unitscompleted.add("7");
                                unitscompleted.add("8");
                                break;
                            default:
                                System.out.println("Invalid user input, try again");
                                Thread.sleep(1000);
                                break;
                        }
                        if(in.equals("B") || in.equals("I") || in.equals("A")){
                            break;
                        }
                    }

                    break;
                }else if(line[0].equals("FAILURE")){
                    System.out.println("Either the username or password was incorrect. Please try again.");
                }else{
                    System.out.println("There was an error at the server, please try again.");
                    continue;
                }
            }else if(input.equals("R")||input.equals("r")){
                System.out.println("A returning user! Please enter your credentials.");
                System.out.println("Username: ");
                String un = scan.nextLine();
                System.out.println("Password: ");
                String pw = scan.nextLine();
                String fileoutName = "LOGIN";
                String fileoutContent = un + "\n" + pw + "\n";
                String response = request(fileoutName,fileoutContent);
                String line[] = response.split("\n");
                if(line[0].equals("SEARCHSUCCESS")){
                    System.out.println("Logged in successfully!");
                    //define user data
                    username = un;
                    password = pw;
                    //copy history into arraylist
                    unitscompleted = new ArrayList<>(Arrays.asList(line));
                    //get rid of success message from arraylist
                    unitscompleted.remove(0);
                    break;
                }else{
                    System.out.println("There was an error at the server, please try again.");
                    continue;
                }
            }else{
                System.out.println("Invalid input, please try again.");
            }
        }

        Thread.sleep(1000);

        

        System.out.println("Time to learn! ");
        while(true){
            System.out.println("The next unit for you to learn is...");
            int currentunit;
            //finds lowest uncompleted unit
            for(currentunit = 1;currentunit<18;currentunit++){
                if(!unitscompleted.contains(Integer.toString(currentunit))){
                    break;
                }
            }

            //print next unit
            switch(currentunit){
                case 1:
                    System.out.println("Unit 1!");
                    break;
                 case 2:
                    System.out.println("Unit 2!");
                    break;
                 case 3:
                    System.out.println("Unit 3!");
                    break;
                 case 4:
                    System.out.println("Unit 4!");
                    break;
                 case 5:
                    System.out.println("Unit 5!");
                    break;
                 case 6:
                    System.out.println("Unit 6!");
                    break;
                 case 7:
                    System.out.println("Unit 7!");
                    break;
                 case 8:
                    System.out.println("Unit 8!");
                    break;
                 case 9:
                    System.out.println("Unit 9!");
                    break;
                 case 10:
                    System.out.println("Unit 10!");
                    break;
                 case 11:
                    System.out.println("Unit 11!");
                    break;
                 case 12:
                    System.out.println("Unit 12!");
                    break;
                 case 13:
                    System.out.println("Unit 13!");
                    break;
                 case 14:
                    System.out.println("Unit 14!");
                    break;
                 case 15:
                    System.out.println("Unit 15!");
                    break;
                 case 16:
                    System.out.println("Unit 16!");
                    break;
            }
            //delay for time to read
            Thread.sleep(1000);

            //display options
            System.out.println("What unit would you like to view?");
            System.out.println("Unit 1 (1) AND gate");
            System.out.println("Unit 2 (2) OR gate");
            System.out.println("Unit 3 (3) NOT gate");
            System.out.println("Unit 4 (4) XOR gate");
            System.out.println("Unit 5 (5) 4-1 MUX");
            System.out.println("Unit 6 (6) 1-4 DEMUX");
            System.out.println("Unit 7 (7) 4-2 Encoder");
            System.out.println("Unit 8 (8) 2-4 Decoder");
            System.out.println("Unit 9 (9) Full Adder");
            System.out.println("Unit 10 (10) Comparator");
            System.out.println("Unit 11 (11) Shifter");
            System.out.println("Unit 12 (12) SR Latch");
            System.out.println("Unit 13 (13) D Flip-Flop");
            System.out.println("Unit 14 (14) Register");
            System.out.println("Unit 15 (15) Counter");
            System.out.println("Unit 16 (16) RAM");
            System.out.println("Log Out (X)");

            //scan input
            String input = scan.nextLine();
            switch(input){
                case "1":
                    learning.unit1(scan);
                    unitscompleted.add(input);
                    break;
                case "2":
                    learning.unit2(scan);
                    unitscompleted.add(input);
                    break;
                case "3":
                    learning.unit3(scan);
                    unitscompleted.add(input);
                    break;
                case "4":
                    learning.unit4(scan);
                    unitscompleted.add(input);
                    break;
                case "5":
                    learning.unit5(scan);
                    unitscompleted.add(input);
                    break;
                case "6":
                    learning.unit6(scan);
                    unitscompleted.add(input);
                    break;
                case "7":
                    learning.unit7(scan);
                    unitscompleted.add(input);
                    break;
                case "8":
                    learning.unit8(scan);
                    unitscompleted.add(input);
                    break;
                case "9":
                    learning.unit9(scan);
                    unitscompleted.add(input);
                    break;
                case "10":
                    learning.unit10(scan);
                    unitscompleted.add(input);
                    break;
                case "11":
                    learning.unit11(scan);
                    unitscompleted.add(input);
                    break;
                case "12":
                    learning.unit12(scan);
                    unitscompleted.add(input);
                    break;
                case "13":
                    learning.unit13(scan);
                    unitscompleted.add(input);
                    break;
                case "14":
                    learning.unit14(scan);
                    unitscompleted.add(input);
                    break;
                case "15":
                    learning.unit15(scan);
                    unitscompleted.add(input);
                    break;
                case "16":
                    learning.unit16(scan);
                    unitscompleted.add(input);
                    break;
                case "X":
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid input, try again.");
            }
            

            //log off condition
            if(input.equals("X")){
                break;
            }else{
                scan.nextLine();
            }
        }
        //declare user data
        String ud = username + "\n" + password + "\n";
        for(int i = 0;i<unitscompleted.size();i++){
            ud += (unitscompleted.get(i) + "\n");
        }

        request("UPDATEHISTORY",ud);
        
        System.out.println("Thanks for using the Digital Circuits Learning Tool, you can return at any time and continue where you left off with your credentials.");
        System.out.println("If you encountered any bugs or other issues while using the program, or you have suggestions for features you want changed or added, you can submit a bug report/feature suggestion with this link: https://docs.google.com/forms/d/e/1FAIpQLSe2aHKTP2CViL8FHam79qfL34I5cBk6EJhxhIJByKDd5mzUyw/viewform?usp=dialog");
        System.out.println("To create your own digital circuits to test your knowledge, you can use Quartus, Logisim, or download this python digital circuits library: https://github.com/olooney/circuit.git");

        scan.close();
    }

    //method sends a request to the server and takes a response
    private static String request(String fileoutName,String fileoutContent){
        //default response is error, if no other response is detected
        String response = "ERROR";
        try{
            //create a connection between this socket and serversocket
            Socket socket = new Socket("localhost", 1234);
            //create data output stream object to hold the outputstream of the socket connection
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            //convert file into byte arrays, everything will be sent in bytes
            byte[] fileoutNameBytes = fileoutName.getBytes();
            byte[] fileoutContentBytes = fileoutContent.getBytes();
            //first send length of file name so server knows how many bytes to read, then send name bytes
            dataOutputStream.writeInt(fileoutNameBytes.length);
            dataOutputStream.write(fileoutNameBytes);
            //first send length of file content so server knows how many bytes to read, then send content bytes
            dataOutputStream.writeInt(fileoutContentBytes.length);
            dataOutputStream.write(fileoutContentBytes);

            //loop waits to receive response
            while(true){

                try{
                    //create input stream
                    DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                    //read the length of the name of the response, then if the name exists i.e. a file was sent, read everything else
                    int fileinnamelength = dataInputStream.readInt();

                    if(fileinnamelength > 0){
                        //create empty byte array
                        byte[] fileinNameBytes = new byte[fileinnamelength];
                        //read name into array
                        dataInputStream.readFully(fileinNameBytes, 0, fileinNameBytes.length);
                        //parse to string
                        String fileinName = new String(fileinNameBytes);
                        
                        //read length of content
                        int fileinContentLength = dataInputStream.readInt();
                        //if content exists, create byte array, read into it, parse it to a string
                        if(fileinContentLength > 0){
                            byte[] fileinContentBytes = new byte[fileinContentLength];
                            dataInputStream.readFully(fileinContentBytes, 0, fileinContentLength);          
                            String fileinContents = new String(fileinContentBytes);

                            //convert the name and content to one string to be returned
                            response = fileinName + "\n" + fileinContents;
                            break;
                        }
                    }
                }catch(IOException error){
                    error.printStackTrace();
                }

            }
            //terminate the connection
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return response;
    }
}



import java.io.*;
import java.util.*;

public class assm {

  public static void main(String[] args) throws IOException {

    /*
     * //---------------------------------------------------------------------------
     * ---------------
     * 
     * //tokenization of code
     * 
     * FileReader fr=new FileReader("program.asm"); //this is used to read file
     * BufferedReader br = new BufferedReader(fr); //this is used to read the file
     * line by line StringTokenizer token1; //it is used to divide the line into
     * tokens String line; //tokens are temporary stored here int n=1;
     * while((line=br.readLine())!=null) //readline is used to read new lines {
     * token1 = new StringTokenizer(line); while(token1.hasMoreTokens()) { String
     * str = token1.nextToken(); System.out.println("Line Number "+n+":"+ str);
     * }n++; }
     * 
     */

    FileReader fr = new FileReader("n.asm"); // this is used to read file
    BufferedReader br = new BufferedReader(fr); // this is used to read the file line by line
    int num = 1;
    StringTokenizer st; // it is used to divide the line into tokens

    ArrayList<String>[] alp = new ArrayList[12];
    for (int i = 0; i < 12; i++) {
      alp[i] = new ArrayList<String>();
    }

    for (String line = br.readLine(); line != null; line = br.readLine()) {

      System.out.println("\nLine " + num + " ");

      st = new StringTokenizer(line);

      while (st.hasMoreTokens()) {
        alp[num].add(st.nextToken());
        // System.out.println(st.nextToken());
      }

      num++;

    }
    System.out.println("n.asm has " + num + " lines");
    br.close();

    // ------------------------------------------------------------------------------------------------
    // CREATING OPERAND TABLE
    System.out.println("\n\t\t OPTAB \t\t ");
    System.out.println("Mnemonic opcode\tm/c code\tClass");

    /*
     * ArrayList<String> Mnemonic = new ArrayList<String>(); ArrayList<String>
     * Classes = new ArrayList<String>(); ArrayList<Integer> Mach_code = new
     * ArrayList<Integer>();
     * 
     * 
     * List<String> mn = Arrays.asList("STOP" ,"ADD" ,"SUB" ,"MULT" ,"MOVER"
     * ,"MOVEM" ,"COMP" ,"BC" ,"DIV" ,"READ" ,"PRINT"
     * ,"DC","DS","START","END","ORIGIN","EQU","LTORG"); Mnemonic.addAll(mn);
     * List<String> class1 = Arrays.asList("IS" ,"IS" ,"IS" ,"IS" ,"IS" ,"IS" ,"IS"
     * ,"IS" ,"IS" ,"IS" ,"IS" ,"DL","DL","AD","AD","AD","AD","AD");
     * Classes.addAll(class1); List<Integer> M_C = Arrays.asList(0 ,1 ,2 ,3 ,4 ,5 ,6
     * ,7 ,8 , 9 ,10, 0, 1, 0, 1, 2, 3, 4 ); Mach_code.addAll(M_C);
     * 
     * for (int i=0; i<mn.size(); i++) { System.out.print(mn.get(i)+" \t\t\t");
     * System.out.print(M_C.get(i)+" \t\t"); System.out.print(class1.get(i)+" \n");
     * 
     * 
     * }
     */

    int n = 19;
    ArrayList<String>[] optab = new ArrayList[n];

    // initializing
    for (int i = 0; i < n; i++) {
      optab[i] = new ArrayList<String>();
    }

    // We can add any number of columns to each
    // rows as per our wish
    optab[0].add("STOP");
    optab[0].add("IS");
    optab[0].add("0");
    optab[1].add("ADD");
    optab[1].add("IS");
    optab[1].add("1");
    optab[2].add("SUB");
    optab[2].add("IS");
    optab[2].add("2");
    optab[3].add("MULT");
    optab[3].add("IS");
    optab[3].add("3");
    optab[4].add("MOVER");
    optab[4].add("IS");
    optab[4].add("4");
    optab[5].add("MOVEM");
    optab[5].add("IS");
    optab[5].add("5");
    optab[6].add("COMP");
    optab[6].add("IS");
    optab[6].add("6");
    optab[7].add("BC");
    optab[7].add("IS");
    optab[7].add("7");
    optab[8].add("DIV");
    optab[8].add("IS");
    optab[8].add("8");
    optab[9].add("READ");
    optab[9].add("IS");
    optab[9].add("9");
    optab[10].add("PRINT");
    optab[10].add("IS");
    optab[10].add("10");
    optab[11].add("DC");
    optab[11].add("DL");
    optab[11].add("0");
    optab[12].add("DS");
    optab[12].add("DL");
    optab[12].add("1");
    optab[13].add("START");
    optab[13].add("AD");
    optab[13].add("0");
    optab[14].add("END");
    optab[14].add("AD");
    optab[14].add("1");
    optab[15].add("ORIGIN");
    optab[15].add("AD");
    optab[15].add("2");
    optab[16].add("EQU");
    optab[16].add("AD");
    optab[16].add("3");
    optab[17].add("LTORG");
    optab[17].add("AD");
    optab[17].add("4");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < optab[i].size(); j++) {
        System.out.print(optab[i].get(j) + " \t\t");
      }
      System.out.println();
    }

    // ------------------------------------------------------------------------------------------------
    // CREATING REGISTER TABLE
    System.out.println("\n\t\t REGISTER TABLE \t\t ");
    System.out.println("Register name\tmachine code");

    int n1 = 4;
    ArrayList<String>[] regtab = new ArrayList[n1];

    // initializing
    for (int i = 0; i < n1; i++) {
      regtab[i] = new ArrayList<String>();
    }

    // We can add any number of columns to each
    // rows as per our wish
    regtab[0].add("AREG");
    regtab[0].add("00");
    regtab[1].add("BREG");
    regtab[1].add("01");
    regtab[2].add("CREG");
    regtab[2].add("02");
    regtab[3].add("DREG");
    regtab[3].add("03");

    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < regtab[i].size(); j++) {
        System.out.print(regtab[i].get(j) + " \t\t");
      }
      System.out.println();
    }

    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < alp[i].size(); j++) {

        System.out.println("Original:" + alp[i].get(j));

        for (int x = 0; x < n; x++) {
          for (int y = 0; y < optab[x].size(); y++) {
            System.out.println(optab[x].get(y));

            if (optab[x].get(y) == alp[i].get(j)) {
              System.out.println("Need to change with " + optab[x].get(y + 1));
            }

          }
          System.out.println("-------------------\n");
        }

        System.out.println("Changed:" + alp[i].get(j));

      }

    }
    // ------------------------------------------------------------------------------------------------
  }
}

// ------------------------------------------------------------------------------------------------
// Intermediate Code Display

class clearBit{
  public static void main(String args[]){
    int n=15;
    int pos=2;
     int bitMarks= 1<<pos;
    int notbitMarks= ~(bitMarks);
    int clear=notbitMarks & n;
    System.out.println(clear);
  }
}
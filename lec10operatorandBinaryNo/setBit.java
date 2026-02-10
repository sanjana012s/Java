class setBit{
  public static void main(String args[]){
    int n=5;
    int pos=1;
    int bitMarks=1<<pos;
    int newNo=bitMarks | n;
    System.out.println(newNo);
  }
}